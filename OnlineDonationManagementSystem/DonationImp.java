import java.util.*;
class DonationImp implements DonotionInterface
{
    Scanner sc=new Scanner(System.in);
    HashMap<String,Donordetails> child=new HashMap<>();
    HashMap<String,Donordetails> old=new HashMap<>();
    HashMap<String,Donordetails> orph=new HashMap<>();
    HashMap<String,Donordetails> preg=new HashMap<>();
    ArrayList activities=new ArrayList();
    int NumBenf1;
    int NumBenf2;
    int NumBenf3;
    int NumBenf4;
    int checkAge()
    {
    	String age=sc.nextLine();
    	int count=0;
    	if(age.length()==2||age.length()==1)
    	{
    	for(int i=0;i<age.length();i++)
    	{
    		if(age.charAt(i)>='0'&&age.charAt(i)<='9')
    		{
    			count++;
    		}
    	}
    	}
    	if(count==age.length())
    	{
    		int a=Integer.parseInt(age);
    		return a;
    	}
    	else
    	{
    		System.out.println("Enter Donor age in 1 or 2 digits only Please enter Age again");
    		checkAge();
    		return 0;
    	}
    }
    long checkContactNum()
    {
    	String contactNum=sc.nextLine();
    	int count=0;
    	if(contactNum.length()==10)
    	{
    	for(int i=0;i<contactNum.length();i++)
    	{
    		if(contactNum.charAt(i)>='0'&&contactNum.charAt(i)<='9')
    		{
    			count++;
    		}
    	}
    	}
    	if(count==contactNum.length())
    	{
    		long contactnum=Long.parseLong(contactNum);
    		return contactnum;
    	}
    	else
    	{
    		System.out.println("Enter  Contact number in 10 digits only Please enter again");
    		checkContactNum();
    		return 0;
    	}
    }
    public void donateForChild()
    {
    System.out.println("Enter Details for Donating to Child");
    System.out.println("Enter Donor Id");
    String donarId=sc.nextLine();
    System.out.println("Enter Donor Name");
	String donarName=sc.nextLine();
    System.out.println("Enter Donor Age");
	int donarAge=checkAge();
    System.out.println("Enter Donor Phone Number");
	long donarPhoneNum=checkContactNum();
    System.out.println("Enter Donor City");
    String donarCity=sc.nextLine();
    System.out.println("Enter Donor Address");
	String donarAddress=sc.nextLine();
    System.out.println("Enter Donation Type");
    String donationType=sc.nextLine();
    System.out.println("Enter No of benificiaries");
     String n=sc.nextLine();
     NumBenf1=Integer.parseInt(n);
    child.put(donarId,(new Donordetails( donarId,donarName,donarAge, donarPhoneNum,donarCity,donarAddress,donationType)));
    }
    public void donateForOldAgePeople()
    {
    System.out.println("Enter Details for Donating to Child");
    System.out.println("Enter Donor Id");
    String donarId=sc.nextLine();
    System.out.println("Enter Donor Name");
	String donarName=sc.nextLine();
    System.out.println("Enter Donor Age");
	int donarAge=checkAge();
    System.out.println("Enter Donor Phone Number");
	long donarPhoneNum=checkContactNum();
    System.out.println("Enter Donor City");
    String donarCity=sc.nextLine();
    System.out.println("Enter Donor Address");
	String donarAddress=sc.nextLine();
    System.out.println("Enter Donation Type");
    String donationType=sc.nextLine();
    System.out.println("Enter No of benificiaries");
    String n=sc.nextLine();
     NumBenf2=Integer.parseInt(n);
    old.put(donarId,(new Donordetails( donarId,donarName,donarAge, donarPhoneNum,donarCity,donarAddress,donationType)));
    }
    public void donateForOrphans()
    {
    System.out.println("Enter Details for Donating to Child");
    System.out.println("Enter Donor Id");
    String donarId=sc.nextLine();
    System.out.println("Enter Donor Name");
	String donarName=sc.nextLine();
    System.out.println("Enter Donor Age");
	int donarAge=checkAge();
    System.out.println("Enter Donor Phone Number");
	long donarPhoneNum=checkContactNum();
    System.out.println("Enter Donor City");
    String donarCity=sc.nextLine();
    System.out.println("Enter Donor Address");
	String donarAddress=sc.nextLine();
    System.out.println("Enter Donation Type");
    String donationType=sc.nextLine();
    System.out.println("Enter No of benificiaries");
    String n=sc.nextLine();
     NumBenf3=Integer.parseInt(n);
    orph.put(donarId,(new Donordetails( donarId,donarName,donarAge, donarPhoneNum,donarCity,donarAddress,donationType)));
    }
    public void donateForPregnants()
    {
    System.out.println("Enter Details for Donating to Child");
    System.out.println("Enter Donor Id");
    String donarId=sc.nextLine();
    System.out.println("Enter Donor Name");
	String donarName=sc.nextLine();
    System.out.println("Enter Donor Age");
	int donarAge=checkAge();
    System.out.println("Enter Donor Phone Number");
	long donarPhoneNum=checkContactNum();
    System.out.println("Enter Donor City");
    String donarCity=sc.nextLine();
    System.out.println("Enter Donor Address");
	String donarAddress=sc.nextLine();
    System.out.println("Enter Donation Type");
    String donationType=sc.nextLine();
    System.out.println("Enter No of benificiaries");
    String n=sc.nextLine();
     NumBenf4=Integer.parseInt(n);
    preg.put(donarId,(new Donordetails( donarId,donarName,donarAge, donarPhoneNum,donarCity,donarAddress,donationType))); 
    }
    public void addActivitiesConducted()
    {
        
        System.out.println("Enter Activity");
        String activity=sc.nextLine();
        activities.add(activity);
        
    }
    public void viewDonorsForChild()
    {
        for ( Donordetails u: child.values())
        {
            System.out.println (u);
        }
    }
    public void viewDonorsForOldAgePeople()
    {
    for ( Donordetails u: old.values())
        {
            System.out.println (u);
        }
    }
    public void viewDonorsForOrphans()
    {
    for ( Donordetails u: orph.values())
        {
            System.out.println (u);
        }
    }
    public void viewDonorsForPregnants()
    {
    for ( Donordetails u: preg.values())
        {
            System.out.println (u);
        }
    }
    public  void getDonorDetails()
    {
        System.out.println("enter Donor Id");
        String id=sc.nextLine();
        int verify=0;
        Set<String> key1=child.keySet();
	for(String itr1:key1)
    {
    	if(id.equals(itr1))
    	{
    		System.out.println(child.get(id));
            verify++;
    		break;
    	}
    }
        Set<String> key2=old.keySet();
	for(String itr2:key2)
    {
    	if(id.equals(itr2))
    	{
    		System.out.println(old.get(id));
            verify++;
    		break;
    	}
    }
    Set<String> key3=orph.keySet();
	for(String itr3:key3)
    {
    	if(id.equals(itr3))
    	{
    		System.out.println(orph.get(id));
            verify++;
    		break;
    	}
    }
    Set<String> key4=preg.keySet();
	for(String itr4:key4)
    {
    	if(id.equals(itr4))
    	{
    		System.out.println(preg.get(id));
            verify++;
    		break;
    	}
    }
        if(verify==0)
            System.out.println("Not Found");
    }
    public void viewAllDonors()
    {
        for (Map.Entry u: child.entrySet())
        {
            System.out.println (u.getKey()+ "  " +u.getValue());
        }
        for (Map.Entry u: old.entrySet())
        {
            System.out.println (u.getKey()+ "  " +u.getValue());
        }
        for (Map.Entry u: orph.entrySet())
        {
            System.out.println (u.getKey()+ "  " +u.getValue());
        }
        for (Map.Entry u: preg.entrySet())
        {
            System.out.println (u.getKey()+ "  " +u.getValue());
        }  
    }
    public void NoOfBenificiaries()
    {
        System.out.print("Total No of Benificiaries are: ");
        System.out.println(NumBenf1+NumBenf2+NumBenf3+NumBenf4);
    }
    public void NoOfDonors()
    {
        System.out.print("Total No of Donors are: ");
        System.out.println(child.size()+old.size()+orph.size()+preg.size());
    }
    public void viewActivitiesConducted()
    {
        if(activities.size()!=0)
        {
        Iterator itr=activities.iterator();
        while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
        else System.out.println("No Events To Display");
    }
    
}