package dto;

public class Video implements Comparable<Video> {
    private String id;
    private String part;
    private String title;
    private String channelName;
    private String url;
    private int viewCnt;
    
        
    public Video() {
        super();
    }

    public Video(String id, String title, String part, String channelName, int viewCnt, String url) {
        super();
        this.id = id;
        this.part = part;
        this.title = title;
        this.channelName = channelName;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }
    
    @Override
    public int compareTo(Video video) {
        if(video.getViewCnt() < viewCnt) return 1;
        else if(video.getViewCnt() > viewCnt) return -1;
        return 0;
    }
    
    
}