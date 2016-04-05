import java.util.*;

public class ArrayListArray {
	
	public static void main(String[] args) {
		ArrayList<String[]> strlist = new ArrayList<String[]>();
		
		for (int i = 0; i < strlist.size(); i++) {
			for (int j = 0; j < strlist.get(i).length; j++) {
				String s = strlist.get(i)[j];
				System.out.println("String " + j + " in array " + i + ": " + s);
			}
		}
		
		// Adding a new array to the ArrayList
		String[] t = new String[3];
		t[0] = "Adding an array";
		t[1] = "to";
		t[2] = "an ArrayList of arrays";
		strlist.add(t);
	}
}
