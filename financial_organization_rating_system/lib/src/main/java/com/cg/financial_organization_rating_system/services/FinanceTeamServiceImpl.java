package com.cg.financial_organization_rating_system.services;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.repository.FinanceTeamRepository;

@Service
public class FinanceTeamServiceImpl implements FinanceTeamService {
	
	@Autowired
	FinanceTeamRepository financerepo;
	//@Autowired
	FinanceTeam finance1;
@Override
	public int addMem(FinanceTeam finance) {
		FinanceTeam financef=new FinanceTeam();
		financef.setAdminId(finance.getAdminId());
		financef.setPassword(finance.getPassword());
		financerepo.save(financef);
		return finance.getSlno();
	}
List<FinanceTeam> list;
@Override

public List<FinanceTeam> getDetailsById() {
list=financerepo.findAll();

	return list;
}
@Override
public List<FinanceTeam> getAllDetails(String id) {
	
List<FinanceTeam>list1=list.stream().filter(team->team.getAdminId()==id).collect(Collectors.toList());

return list1;


}
	

}
