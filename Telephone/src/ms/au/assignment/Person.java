package ms.au.assignment;

import java.util.*;

//import sun.tools.tree.ThisExpression;

public class Person extends Database implements Telephone{
	private String telNo;
	private String operatorName;
	private String imei;
	Person(){
		
	}
	Person(String telNo, String operatorName, String imei){
		this.imei=imei;
		this.operatorName=operatorName;
		this.telNo=telNo;
	}
	
	
	public static void main(String args[]) {
		
		CallHistory callHistory = new CallHistory();
		Database database = new Database();
		
		//int c;
		String b,a,c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the operator name");
		b=input.nextLine();
		System.out.println("Enter the telephone no");
		a=input.nextLine();
		System.out.println("Enter the imei no");
		c=input.nextLine();
		Person p = new Person(a,b,c);
		
		while(true){
			System.out.println("Enter 1 to call\nEnter 2 to create Contact\nEnter 3 to view Contacts\nEnter 4 to view call history\nEnter 5 to view telephone details\nEnter 6 to exit");
			
			int choice=input.nextInt();
			switch(choice) {
			case 1:
				
				
				System.out.println("Enter the no to call");
				input.nextLine();
				String no=input.nextLine();
				System.out.println("Calling "+ no +" ...");
				System.out.println("Enter end to end call");
				
				long callStart=System.currentTimeMillis();
			
				String ip=input.nextLine();
				if(ip=="end" || ip=="End" || ip=="END") {
					System.out.println("Call ended successfully");
					
				}
				long callEnd = callEnd=System.currentTimeMillis();
				callHistory.caller=p.getTelNo();
				callHistory.receiver=no;
				callHistory.callStart=callStart;
				callHistory.callEnd=callEnd;
				database.history.add(callHistory);
				
				break;
				
			case 2:
				input.nextLine();
				System.out.println("Enter contact name");
				String contactName=input.nextLine();
				System.out.println("Enter contact no");
				no=input.nextLine();
				database.contacts.put(contactName,no);
				System.out.println("Contact added successfully");
				break;
				
			case 3:
				for(Map.Entry m:database.contacts.entrySet()){    
				       System.out.println(m.getKey()+" "+m.getValue());    
				} 
				System.out.println();
				
				break;
				
			case 4:
				
				for(CallHistory h : database.history) {
					System.out.println("caller :"+h.caller+" receiver :"+h.receiver+" callStart :"+h.callStart+" callEnd :"+h.callEnd);
				}
				
				break;
				
				
			case 5:
				System.out.println("My telephone no is "+p.getTelNo());
				System.out.println("My operator name is "+p.operatorName);
				System.out.println("My imei no is "+p.imei);
				break;
				
			case 6:
				
				System.exit(0);
			
				
				
			}
		}
		
		
		
		
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	@Override
	public boolean call() {
		// TODO Auto-generated method stub
		return false;
	}

}
