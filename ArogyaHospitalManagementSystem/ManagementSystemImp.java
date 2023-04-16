import java.util.*;
public class ManagementSystemImp implements ManagementSystemInterface{
HashMap<String,PatientDetails>patients=new HashMap<>();
Scanner sc=new Scanner(System.in);
public void addPatient()
{
	System.out.println("Enter Patient Details");
	System.out.println("Enter Patient Id");
	String patientId=sc.nextLine();
	System.out.println("Enter Patient name");
	String patientName=sc.nextLine();
	System.out.println("Enter Patient age");
	int patientAge=checkAge();
	System.out.println("Enter Patient gender");
	String patientGender=sc.nextLine();
	System.out.println("Enter Patient Aadhar number");
	long patientAadharCardNumber=checkAadharNum();
	System.out.println("Enter Patient contact Number");
	long patientContactNumber=checkContactNum();
	System.out.println("Enter Patient City name");
	String patientCity=sc.nextLine();
	System.out.println("Enter Patient address");
	String patientAddress=sc.nextLine();
	System.out.println("Enter Patient Date Of Admission");
	String patientDateOfAdmission=sc.nextLine();
	System.out.println("Enter guardians name");
	String guardiansName=sc.nextLine();
	System.out.println("Enter guardians Address");
	String guardiansAddress=sc.nextLine();
	System.out.println("Enter guardians Contact Number");
	long guardiansContactNumber=checkContactNum();
	patients.put(patientId,(new PatientDetails(patientId,patientName,patientAge,patientGender,patientAadharCardNumber,patientContactNumber,patientCity,patientAddress,patientDateOfAdmission,guardiansName,guardiansAddress,guardiansContactNumber) ));
}
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
		System.out.println("Enter Patient age in 1 or 2 digits only Please enter Age again");
		checkAge();
		return 0;
	}
}
long checkAadharNum()
{
	String aadharNum=sc.nextLine();
	int count=0;
	if(aadharNum.length()==12)
	{
	for(int i=0;i<aadharNum.length();i++)
	{
		if(aadharNum.charAt(i)>='0'&&aadharNum.charAt(i)<='9')
		{
			count++;
		}
	}
	}
	if(count==aadharNum.length())
	{
		long aadharnum=Long.parseLong(aadharNum);
		return aadharnum;
	}
	else
	{
		System.out.println("Enter Patient Aadhar number in 12 digits only Please enter again");
		checkAadharNum();
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
public void view()
{
	System.out.println("Total Patient's Detail's");
	for (Map.Entry u: patients.entrySet())
        {
            System.out.println (u.getKey()+ "  " +u.getValue());
        }
}
public void searchById()
{
	System.out.println("Enter Patient Id for details ");
	String id=sc.nextLine();
	String verify=null;
	Set<String> key=patients.keySet();
	for(String itr:key)
    {
    	if(id.equals(itr))
    	{
    		verify="found";
    		System.out.println(patients.get(id));
    		break;
    	}
    }
	try
	{
	if(verify==null)
		throw new NullPointerException();
	}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException: Given Id is Not found");
	}
		
}
public void searchByName()
{
	System.out.println("Enter Patient name");
	String pname=sc.nextLine();
	String verify=null;
	ArrayList<PatientDetails> al = new ArrayList<>();
	for(PatientDetails itr:patients.values())
	{
		if(pname.equals(itr.getPatientName()))
		{
			al.add(itr);
			verify="found";
		}
	}
	if(verify!=null)
    {
        for(PatientDetails itr:al)
            System.out.println(itr);
    }
	else
	{
		try
		{
		if(verify==null)
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException: Given Name is Not found");
		}
}
}
public void searchByCity()
{
	System.out.println("Enter Patient City");
	String pcity=sc.nextLine();
	String verify=null;
	ArrayList<PatientDetails> al = new ArrayList<>();
	for(PatientDetails itr:patients.values())
	{
		if(pcity.equals(itr.getPatientCity()))
		{
			al.add(itr);
			verify="found";
		}
	}
	if(verify!=null)
		{
        for(PatientDetails itr:al)
            System.out.println(itr);
    }
	else
	{
		try
		{
		if(verify==null)
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException: Given City is Not found");
		}
}
}
public void searchByAge()
{
	System.out.println("Enter Minimum Age");
	String minAge1=sc.nextLine();
	System.out.println("Enter Maximum Age");
	String maxAge1=sc.nextLine();
	int minAge=Integer.parseInt(minAge1);
	int maxAge=Integer.parseInt(maxAge1);
	String verify=null;
	ArrayList<PatientDetails> al = new ArrayList<>();
	for(PatientDetails itr:patients.values())
	{
		if(itr.getPatientAge()>=minAge && itr.getPatientAge()<=maxAge)
		{
			al.add(itr);
			verify="found";
		}
	}
	if(verify!=null)
		{
        for(PatientDetails itr:al)
            System.out.println(itr);
    }
	else
	{
		try
		{
		if(verify==null)
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException: Given Age range is Not found for any patient");
		}
}
}
public void recovery()
{
	System.out.println("Enter Patient Id to mark as Recovered");
	String id=sc.nextLine();
	String verify=null;
	Set<String> key=patients.keySet();
	for(String itr:key)
    {
    	if(id.equals(itr))
    	{
    		verify="found";
    		patients.remove(id);
    		break;
    	}
    }
	try
	{
	if(verify==null)
		throw new NullPointerException();
	}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException: Given Id is Not found");
	}
}
}