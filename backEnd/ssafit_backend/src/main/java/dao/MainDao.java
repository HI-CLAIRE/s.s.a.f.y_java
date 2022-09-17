package dao;

import java.util.List;

import dto.Video;

public interface MainDao {
	public List<Video> selectPartFitVideo(String part);
	public void viewCnt(String id);
	public List<Video> selectMostViewVideo();
	
}