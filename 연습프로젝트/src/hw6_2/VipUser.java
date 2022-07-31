package hw6_2;

public class VipUser extends User{
	private String grade;
	private int point;
	public VipUser() {
		super();
	}
	public VipUser(String id, String password, String name, String email, int age, String grade, int point) {
		super(id, password, name, email, age);
		this.grade = grade;
		this.point = point;
	}
	@Override
	public String toString() {
		return "VipUser [name=" + getName() + "grade=" + grade + ", point=" + point + "]";
	}
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
