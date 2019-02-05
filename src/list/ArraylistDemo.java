package list;

import java.util.ArrayList;;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList= new ArrayList();
		arrayList.add(2);
		arrayList.add(2.66);
		arrayList.add('c');
		arrayList.add("abcd");
		arrayList.add(null);
		arrayList.add("");
		System.out.println(arrayList);
		
		System.out.println(arrayList.toString());

	}

}
