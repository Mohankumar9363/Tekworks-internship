class display{
  static int x=10;
  int y=20;
  static void  display1(){
    x=x+1;
    System.out.println(x);
  }
  void display2(){
    y=y-1;
    System.out.println(x+" "+y);
  }
}
class StaticExample{
public static void main(String args[]){
  display ob=new display();
  System.out.println(ob.y +" "+display.x);
  display.display1();
  ob.display2();
}
}