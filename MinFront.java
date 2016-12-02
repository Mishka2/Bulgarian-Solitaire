import java.util.ArrayList;

public class MinFront {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(4);
		numbers.add(6);
		numbers.add(1);
		numbers.add(-1);
		numbers.add(80);
		numbers.add(7);
		numbers.add(2);
		
		minimum(numbers);
	}
		public static void minimum(ArrayList<Integer> numbers){
			int min = 100;
			
			for(int i = 1; i < numbers.size(); i++){
				if(numbers.get(i) < min){
					min = numbers.get(i);
					
				}
				
			}	
			for(int i = 1; i < numbers.size(); i++){
				if(numbers.get(i) == min){
					numbers.remove(i);
				}
			}
			numbers.add(0,min);
			System.out.println(numbers);
	}

}
