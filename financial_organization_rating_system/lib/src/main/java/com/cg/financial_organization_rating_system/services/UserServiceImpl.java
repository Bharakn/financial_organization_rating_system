package com.cg.financial_organization_rating_system.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.exceptions.OrganizationRepEntityNotFoundException;
import com.cg.financial_organization_rating_system.model.UserDto;
import com.cg.financial_organization_rating_system.repository.AddressRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.repository.UserDao;
import com.cg.financial_organization_rating_system.repository.UsersRepository;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {
	
	@Autowired
	UsersRepository userrepo;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	AddressRepository adrsrepo;
	
	@Autowired
	OrganizationRepRepository orgreprepo;
	

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
     Users user;
    
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 user=userrepo.findByUserName(username);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority(this.user.getRole()));
	}

	public List<Users> findAll() {
		List<Users> list = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
		userDao.deleteById(id);
	}

	@Override
	public Users findOne(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public Users findById(int id) {
		Optional<Users> optionalUser = userDao.findById(id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

    @Override
    public UserDto update(UserDto userDto) {
        Users user = findById(userDto.getId());
        if(user != null) {
            BeanUtils.copyProperties(userDto, user, "password");
        	
            
            userDao.save(user);
        }
        return userDto;
    }

    @Override
    public Users save(UsersRegistrationDto user) {
	    Users newUser = new Users();
	    newUser.setUserName(user.getUserName());
	    newUser.setRole("USER");
	    newUser.setUserContactDetails(user.getUserContactDetails());
		newUser.setAddress(user.getAddress());
	
	    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		
        return userDao.save(newUser);
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
}

