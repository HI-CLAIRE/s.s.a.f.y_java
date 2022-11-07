package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping("/")
	public String showIndex() {
		return "redirect:list";
	}
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Board> list = boardService.getBoardList();
		model.addAttribute("list", list);
		return "/board/list";
	}
	
	@RequestMapping("list2")
	public String list2(Model model) {
		return "/board/list2";
	}
	
	@RequestMapping("writeform")
	public String writeform() {
		return "/board/writeform";
	}
	
	@RequestMapping("write")
	public String write(Board board) {
		System.out.println("�벑濡앹쟾 : "+board);
		boardService.writeBoard(board);
		System.out.println("�벑濡앺썑 : "+board);
//		return "redirect:list";  //키값을 몰라서 상세화면으로 사실 보낼수가 없었어...  
		return "redirect:detail?id="+board.getVin();
	}
	
//	@RequestMapping( value = "detail", method = RequestMethod.GET)
//	@GetMapping("detail")
	@RequestMapping("detail")
	public String detail(Model model, int id) {
		Board board = boardService.readBoard(id);
		model.addAttribute("board", board);
		return "/board/detail";
	}
	
	@RequestMapping("delete")
	public String delete(int id) {
		boardService.removeBoard(id);
		return "redirect:list";
	}
	
	@RequestMapping("updateform")
	public String updateform(Model model, int id) {
		model.addAttribute("board", boardService.getBoard(id));
		return "/board/updateform";
	}
	
	@RequestMapping("update")
	public String update(Board board) {
		boardService.modifyBoard(board);
		return "redirect:detail?id=" + board.getVin();
	}
	
	
	
}
