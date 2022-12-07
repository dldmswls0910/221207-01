import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		Random random = new Random();
		
		while (lotto.size() < 6) {
			int number = random.nextInt(45) + 1;
			lotto.add(number);
		}
		System.out.println("랜덤번호: "+ lotto);
		
		
		
		System.out.println("추가");
		
		
		Set<Integer> lotto1 = new TreeSet<>();
		lotto1.add(8);
		lotto1.add(13);
		lotto1.add(25);
		lotto1.add(29);
		lotto1.add(34);
		lotto1.add(1);
		System.out.println("추첨번호:"+ lotto1);
		       
		 
		
		
		
	}
}
