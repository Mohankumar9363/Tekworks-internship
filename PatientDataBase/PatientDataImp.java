import java.util.*;

class PatientDataImp implements PatientInterface {
  ArrayList<PatientData> parr = new ArrayList<>();

  public void insert() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Patient Details");
    System.out.println("Enter Patient Name");
    String name = sc.nextLine();
    System.out.println("Enter Patient Problem");
    String problem = sc.nextLine();
    System.out.println("Enter Patient age");
    int age = sc.nextInt();

    parr.add(new PatientData(name, age, problem));
  }

  public void delete() {
    Scanner sc = new Scanner(System.in);
    if (parr.size() == 0)
      System.out.println("No Data Is Available to Delete");
    else {
      String verify = null;
      System.out.println("Enter Patient name to Delete Data");
      String pname = sc.nextLine();
      for (PatientData e : parr) {
        if (e.getName().equals(pname)) {
          parr.remove(e);
          verify = "found";
          break;
        }
      }
      if (verify == null) {
        System.out.println("Not Found");
      }
    }
  }

  public void search() {
    Scanner sc = new Scanner(System.in);
    if (parr.size() == 0)
      System.out.println("No Data Is Available to Delete");
    else {
      String verify = null;
      System.out.println("Enter Patient name to search Data");
      String pname = sc.nextLine();
      for (PatientData e : parr) {
        if (e.getName().equals(pname)) {
          System.out.println(e.toString());
          verify = "found";
          break;
        }
      }
      if (verify == null) {
        System.out.println("Not Found");
      }
    }
  }

  public void display() {
    if (parr.size() == 0)
      System.out.println("No Data Is Available");
    else {
      Iterator it = parr.iterator();
      while (it.hasNext()) {
        System.out.println(it.next());
      }
    }
  }
}