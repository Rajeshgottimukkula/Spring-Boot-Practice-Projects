package com.user.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.user.Entity.userDetails;
import com.user.user.Service.userService;
import com.user.user.VO.ResponseTemplateVO;

@RestController
public class userController {
@Autowired
private userService us;


@PostMapping("/users")
public userDetails saveUserDetails(@RequestBody userDetails ud) {
	return us.saveUser(ud);
}

@GetMapping("/users")
public List<userDetails> getUsersFromDB() {
	return us.getUsersFromDb();
}

@GetMapping("/users/{id}")
public ResponseTemplateVO getUserWithDept(@PathVariable("id") Long id) {
	return us.getUserWithDept(id);
}
}
