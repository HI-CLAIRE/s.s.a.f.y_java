package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao;
	
	//Dao�� Autowired �����Ͽ���.
	@Autowired
	public void setBaordDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public List<Board> getBoardList() {
		System.out.println("��� �Խñ��� �����´�.");
		return boardDao.selectAll();
	}

	@Transactional
	@Override
	public Board readBoard(int id) {
		System.out.println(id+"�� ���� �н��ϴ�.");
		boardDao.updateViewCnt(id);
		return boardDao.selectOne(id);
	}

	@Transactional
	@Override
	public void writeBoard(Board board) {
		System.out.println("�Խñ��� �ۼ��մϴ�.");
		boardDao.insertBoard(board);
	}

	@Transactional
	@Override
	public void modifyBoard(Board board) {
		System.out.println("�Խñ� �����մϴ�.");
		boardDao.updateBoard(board);
	}

	@Transactional
	@Override
	public void removeBoard(int id) {
		System.out.println("�Խñ� �����մϴ�.");
		boardDao.deleteBoard(id);
	}

	@Override
	public Board getBoard(int id) {
		return boardDao.selectOne(id);
	}

}
