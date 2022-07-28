import java.util.HashMap;
import java.util.Map;

public class map연습 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("111", "이상훈");
		map.put("222", "김동현");
		map.put("333", "오윤식");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
