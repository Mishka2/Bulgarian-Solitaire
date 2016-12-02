import java.util.ArrayList;


public class EvenLength {

	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Kyle");
		strings.add("Jae");
		strings.add("Marki");
		strings.add("Jake");
		strings.add("Markuss");
		strings.add("Kylee");
		strings.add("Kylu");
		
		for(int i = 0; i < strings.size(); i++){
			String eachStr = strings.get(i);
			if(eachStr.length() % 2 == 0){
				strings.remove(i);
				i--;
			}
		
		}
		System.out.println(strings);
	}

}
