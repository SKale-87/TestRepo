
public class ReverseStringBuilder {
public static void main(String[] args) {
String str2=" Shil pa ";
str2=str2.trim();
StringBuilder str1=new StringBuilder("India");
StringBuffer str3=new StringBuffer("Maharashtra");
str3.append(" Pune");
str1.append(" is my country");
str1.reverse();
System.out.println(str2);
System.out.println(str1);
System.out.println(str3);
}
}
