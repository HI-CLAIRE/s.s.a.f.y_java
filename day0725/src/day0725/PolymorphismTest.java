package day0725;

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objs = new Object[10];
		objs[0] = new Animal();
		objs[1] = new Person();
		objs[2] = new Student();
		
		Animal a = new Animal();
		Person p = new Person();
		Student s = new Student();
		
		Student s2 = new Student();
		Person s3 = new Person();
		
		Student s4 = (Student) s2;
		s4.study();
		Student s5 = (Student) s2;
		s5.study();
	}

}
