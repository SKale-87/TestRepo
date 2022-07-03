import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
public static void main(String[] args) {
	ArrayList<String> arl=new ArrayList<String>();
	//String[] arl1;
	arl.add("Pune");
	arl.add("Solapur");
	arl.add("Bangalore");
	arl.add("Nashik");
	arl.add("Nagpur");

	Collections.sort(arl);
	System.out.println("Sorting elements in ascending order:"+arl);
	
	Collections.sort(arl,Collections.reverseOrder());
	
	//mannually also possible
	/*for(int i=(arl.size()-1);i>=0;i--)
	{
		System.out.println(arl.get(i));
	}*/
	System.out.println("Sorting elements in descending order:"+arl);
}
}
