package com.user.user.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.user.Entity.userDetails;
import com.user.user.Repository.userRepo;
import com.user.user.VO.DeptEntity;
import com.user.user.VO.ResponseTemplateVO;

@Service
public class userService {

	@Autowired
	private userRepo ur;
	
	@Autowired
	private RestTemplate rt;
	
	
	

	public userDetails saveUser(userDetails ud) {
		return ur.save(ud);
	}




	public ResponseTemplateVO getUserWithDept(Long id) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo=new ResponseTemplateVO();
		userDetails user=ur.findByUserId(id);
		
		DeptEntity dept=rt.getForObject("http://localhost:8082/department/"+user.getDeptId(), DeptEntity.class);
		vo.setUd(user);
		vo.setDe(dept);
		return vo;
	}




	public List<userDetails> getUsersFromDb() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}
	
	
}
