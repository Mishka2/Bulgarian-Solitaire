import java.util.ArrayList;

public class FilterRange {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(4);
		numbers.add(7);
		numbers.add(9);
		numbers.add(2);
		numbers.add(7);
		numbers.add(7);
		numbers.add(5);
		numbers.add(3);
		numbers.add(5);
		numbers.add(1);
		numbers.add(7);
		numbers.add(8);
		numbers.add(6);
		numbers.add(7);
		
		int min = 5;
		int max = 7;
		
		filterRange(numbers, min, max);
	}
	
		public static void filterRange(ArrayList<Integer> numbers, int min, int max){
			
			for(int i= 0; i < numbers.size(); i++){
				if(numbers.get(i) >= min && numbers.get(i) <= max){
					numbers.remove(i);
					i--;
				}
			}
			print(numbers);
		}
		
		public static void print(ArrayList<Integer> numbers){
			System.out.println(numbers);
		}
}
