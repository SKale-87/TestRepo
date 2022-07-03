import java.util.Arrays;
public class StringMethods {
	public static void main(String[] args) 
	{	
	String str = "velocity";
	String address="Flat No-401, Gajanan Arcade, Opp. Ghadge Hospital, Chikhali, Pune";
	String[] result=address.split("\\,");
	System.out.println(str.length());
	System.out.println(str.charAt(4));
	System.out.println(str.compareTo("pune"));
	System.out.println(str.concat("pune"));
	System.out.println(str.hashCode());
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println("result="+Arrays.toString(result));
	}
	
}
