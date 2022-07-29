package step10_2;

public class TitleNotFoundException extends Exception {
	private String title;

	public TitleNotFoundException(String title) {
		super(title + "을 포함하는 영화가 존재하지 않습니다.");
		this.title = title;
	}



	public String getTitle() {
		return title;
	}
	
}
