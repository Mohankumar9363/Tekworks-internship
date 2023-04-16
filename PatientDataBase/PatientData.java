import java.util.*;
class PatientData
 {
    String name;
    int age;
    String problem;
    PatientData(String name,int age,String problem)
     {
         this.name=name;
         this.age=age;
         this.problem=problem;
     }
    
    public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getProblem() {
		return problem;
	}

public String toString()
    {
    return "Name: "+ " "+ getName()+ " Age: "+ getAge()+" "+" Problem: "+" "+getProblem();
    }
 }