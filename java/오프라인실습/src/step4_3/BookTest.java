package step4_3;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Book b2 = new Book("111-11-11111", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
		Book b3 = new Book();
		b3.setIsbn("222-22-22222");
		b3.setTitle("하버드 불면증 수업");
		b3.setAuthor("그랙 제이콥스");
		b3.setPublisher("예문사");
		b3.setPrice(17800);
		b3.setDesc("약 없이 푹 잠드는 하버드 의대 6즈 수면 프로그램");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
