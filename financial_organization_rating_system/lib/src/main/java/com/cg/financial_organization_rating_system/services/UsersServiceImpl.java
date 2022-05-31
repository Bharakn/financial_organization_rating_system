package com.cg.financial_organization_rating_system.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.Address;
import com.cg.financial_organization_rating_system.entities.LoginDetails;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.exceptions.InvalidContactDetailsException;
import com.cg.financial_organization_rating_system.exceptions.InvalidPasswordException;
import com.cg.financial_organization_rating_system.exceptions.InvalidUserNameException;
import com.cg.financial_organization_rating_system.exceptions.OrganizationRepEntityNotFoundException;
import com.cg.financial_organization_rating_system.exceptions.OrganizationRepNotFoundException;
import com.cg.financial_organization_rating_system.exceptions.UserAddressNotFoundException;
import com.cg.financial_organization_rating_system.exceptions.UserNotFoundException;
import com.cg.financial_organization_rating_system.repository.AddressRepository;
import com.cg.financial_organization_rating_system.repository.LoginRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.repository.UsersRepository;
import com.cg.financial_organization_rating_system.utils.PasswordManagement;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersRepository userrepo;

	@Autowired
	AddressRepository adrsrepo;

	@Autowired
	OrganizationRepRepository orgreprepo;

	@Autowired
	LoginRepository loginrepo;

	@Override
	public int userRegistration(UsersRegistrationDto userdto) {
        
		Address address = adrsrepo.getAdrsById(userdto.getPincode());
		Users usr = new Users();
		if (userdto.getUserName() == null || userdto.getUserName() == "")
			throw new InvalidUserNameException("User name is invalid");
		usr.setUserName(userdto.getUserName());

		if (userdto.getUserContactDetails() == 0)
			throw new InvalidContactDetailsException("Entered UserContactDetail is Invalid...");

		usr.setUserContactDetails(userdto.getUserContactDetails());
		if (userdto.getPassword().length() != 6 || userdto.getPassword() == null) {
			throw new InvalidPasswordException("Entered password is invalid please re-enter valid password");
		}
		usr.setPassword(PasswordManagement.encryptedPassword(userdto.getPassword()));
		if (address == null)
			throw new UserAddressNotFoundException("User Address is not found.....");
		usr.setAddress(address);
		
		userrepo.save(usr);

		LoginDetails login = new LoginDetails();
		login.setPassword(PasswordManagement.encryptedPassword(userdto.getPassword()));
		login.setLoginId(usr.getUserId());
		login.setRole("Users");
		loginrepo.save(login);

		return usr.getUserId();
	}

	@Override
	public List<OrganizationRep> browseByEntity() {
		List<OrganizationRep>orgrepList = orgreprepo.findAll();
		if(orgrepList.isEmpty())
		{
			throw new OrganizationRepEntityNotFoundException("No Organization to display...");
		}
		return orgrepList;
	}

	@Override
	public List<Users> getUserDetails() {
		List<Users>userList=userrepo.findAll();
		if(userList.isEmpty())
		{
			throw new UserNotFoundException("User Not Found.....");
		}
		return userList;
	}

	@Override
	public OrganizationRep browseByEntityId(int orgId) {
		OrganizationRep orgrep = orgreprepo.getOrgRepById(orgId);
		if (orgrep == null)
			throw new OrganizationRepNotFoundException("Entered OrgId is not present ....");
		return orgrep;

	}

	@Override
	public void deleteUser(int userId) {
		Users user = userrepo.getUserById(userId);
		if (user == null)
			throw new UserNotFoundException("Invalid User Id....");
		userrepo.deleteById(userId);
	}

}
