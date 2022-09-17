package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dto.Video;

public class MainDaoImpl implements MainDao{
    private List<Video> videoList;
    
    private List<Video> partList;
    
    private static MainDaoImpl instance = new MainDaoImpl();
    
    
    private MainDaoImpl() {
        videoList = new ArrayList<Video>();
        videoList.add(new Video("gMaB-fG4u4g", "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", "전신", "ThankyouBUBU", 0, "https://www.youtube.com/embed/gMaB-fG4u4g"));
        videoList.add(new Video("swRNeYw1JkY", "하루 15분! 전신 칼로리 불태우는 다이어트 운동", "전신", "ThankyouBUBU", 0, "https://www.youtube.com/embed/swRNeYw1JkY"));
        videoList.add(new Video("54tTYO-vU2E", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]", "상체", "ThankyouBUBU", 0, "https://www.youtube.com/embed/54tTYO-vU2E"));
        videoList.add(new Video("QqqZH3j_vH0", "상체비만 다이어트 최고의 운동 [상체 핵매운맛]", "상체", "ThankyouBUBU", 0, "https://www.youtube.com/embed/QqqZH3j_vH0"));
        videoList.add(new Video("tzN6ypk6Sps", "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]", "하체", "김강민", 0, "https://www.youtube.com/embed/tzN6ypk6Sps"));
        videoList.add(new Video("u5OgcZdNbMo", "저는 하체 식주의자 입니다", "하체", "GYM종국", 0, "https://www.youtube.com/embed/u5OgcZdNbMo"));
        videoList.add(new Video("PjGcOP-TQPE", "11자복근 복부 최고의 운동 [복근 핵매운맛]", "복부", "ThankyouBUBU", 0, "https://www.youtube.com/embed/PjGcOP-TQPE"));
        videoList.add(new Video("7TLk7pscICk", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)", "복부", "SomiFit", 0, "https://www.youtube.com/embed/7TLk7pscICk"));
    }
    
    public static MainDaoImpl getInstance() {
        return instance;
    }
    
    @Override
    public void viewCnt(String id) {
        for(int i=0; i<videoList.size(); i++) {
            Video tmp = videoList.get(i);
            if(tmp.getId().equals(id)) {
                tmp.setViewCnt(tmp.getViewCnt()+1);
            }
        }
    }   

    @Override
    public List<Video> selectPartFitVideo(String part) {
    	partList = new ArrayList<>();
        for(int i=0; i<videoList.size(); i++) {
            Video tmp = videoList.get(i);
            if(tmp.getPart().equals(part)) {
                partList.add(tmp);
            }
        }
        return partList;
    }
    
    @Override
    public List<Video> selectMostViewVideo() {
        Collections.sort(videoList, Collections.reverseOrder());
        List<Video> mostVideo = new ArrayList<>();
        for(int i=0; i<4; i++) {
            Video tmp = videoList.get(i);
            mostVideo.add(tmp);
        }
        return mostVideo;
    }


}