package com.ssafy.hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.hw.model.dto.SearchCondition;
import com.ssafy.hw.model.dto.User;
import com.ssafy.hw.model.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/userapi")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public ResponseEntity<?> selectAll() {
		List<User> users = userService.selectAll();
		if(users != null && users.size() > 0) {
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/user/search")
	public ResponseEntity<?> selech(SearchCondition con) {
		List<User> users = userService.searchByCondition(con);
		if(users != null && users.size() > 0) {
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> insert(@RequestBody User user) {
		int result = userService.insert(user);
		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}
}
