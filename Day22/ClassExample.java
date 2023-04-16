class ClassExample {
  int var1 = 10; //instance variable
  //private int var2 = 20;
  static int  var2=20;  //static variable

  void displayOne() {
    int var3=100;
    System.out.println(var1 + " " + var2+" "+var3);
  }
  /*void show(){
    System.out.println(var1 + " " + var2+" "+var3);
}*/
  void inc(){
    var1=var1+1;
    var2=var2+1;
  }
}


class MainClass {
  public static void main(String ar[]) {
    ClassExample ce = new ClassExample();
    ClassExample c=new ClassExample();
   System.out.println(ce.var1 + " " + ClassExample.var2);
    ce.inc();
    c.inc();
    ce.displayOne();
    c.displayOne();
  }
}