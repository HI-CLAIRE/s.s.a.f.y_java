package hw5_2;

public class VipUser extends User { //슈퍼클래스
	private String grade;
	private int point;
	
	public VipUser(String id, String password, String name, String email, int age, String grade, int point)
	{
		super(id, password, name, email, age);
		this.grade = grade;
		this.point = point;
	}

	public VipUser(String grade, int point) {
		super();
		this.grade = grade;
		this.point = point;
	}
	//toString
	@Override
	public String toString() {
		return "VipUser [id=" + this.getId() + ", age=" + this.getAge() + ", name=" + this.getName() + ", grade=" + grade + ", point=" + point + "]";
	}
	
	//게터 세터
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
