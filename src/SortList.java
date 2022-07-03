import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortList {
// Method for returning list elements
public List<String> getListElements() {
List<String> list = new ArrayList<String>();
list.add("Ram");
list.add("Sohan");
list.add("Ashok");
list.add("Ajay");
list.add("Prasanna");
return list;
}
public static void main(String[] args) {
SortList sortList = new SortList();
// Stored the list element into new List variable
List<String> asendingList = 
sortList.getListElements();
// Sort the list in ascending order
Collections.sort(asendingList);

System.out.println("List in ascending order>>" + 
asendingList);
// Print the list in ascending order
System.out.print("List in descending order>>");
for (int i = asendingList.size() - 1; i >= 0; i--) 
{
System.out.print(asendingList.get(i) + " ");
}



}
}