import java.util.*;
public class Policy {
	
	int policyID;
	int premiumAmount;
	String policyName, policyType;
	
	
	@Override
	public String toString() {
		return "Policy [policyID=" + policyID + ", premiumAmount=" + premiumAmount + ", policyName=" + policyName
				+ ", policyType=" + policyType + "]";
	}
	
	public Policy()
	{
		
	}
	
	public Policy(int id,String name,String type,int amt)
	{
		this.policyID=id;
		this.policyName=name;
		this.policyType=type;
		this.premiumAmount=amt;			
	}
	
	
	public Policy getPolicyDetails(int id,String name,String type,int amt)
	{
		Policy pc=new Policy();
		return new Policy(id,name,type,amt);		
	}
	
	public void setPolicyDetails()
	{
		Scanner sc=new Scanner(System.in);
		Policy pc=new Policy();
		Policy pc1=new Policy();
		System.out.println("Enter Policy ID:");
		int id=sc.nextInt();
		System.out.println("Enter Policy Name:");
		String name=sc.next();
		System.out.println("Enter Policy Type:");
		String type=sc.next();
		System.out.println("Enter Policy Amount:");
		int amt=sc.nextInt();
		pc1=pc.getPolicyDetails(id,name,type,amt);
		System.out.println(pc1);		
	}
	
	public static void main(String[] args) {
		Policy pc1=new Policy();
		pc1.setPolicyDetails();
	}
	

}
