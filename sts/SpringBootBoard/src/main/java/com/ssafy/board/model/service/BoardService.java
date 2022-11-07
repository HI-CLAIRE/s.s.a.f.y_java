package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {
	//��� �Խñ� ��ȸ
	List<Board> getBoardList();
	
	//���� ���� (�󼼱� ��ȸ)
	Board readBoard(int id);
	
	//���� �ۼ�����.
	void writeBoard(Board board);
	
	//���� ��������.
	void modifyBoard(Board board);
	
	//���� ��������.
	void removeBoard(int id);
	
	//�� �ϳ��� �����´�.
	Board getBoard(int id);
	
}
