package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.service.BoardService;

@RestController
@RequestMapping("/api")
//@CrossOrigin("http://127.0.0.1:5500")
//@CrossOrigin("*")
public class BoardRestController {
	
	@Autowired
	private BoardService boardSevice;
	
	
//	모든 리스트를 반환하겠다.!!!!!
	@GetMapping("/board")
	public ResponseEntity<List<Board>> list(){
		return new ResponseEntity<List<Board>>(boardSevice.getBoardList(), HttpStatus.OK);
	}
}
