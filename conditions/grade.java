import java.util.Scanner;
public class grade
  {
    public static void main(String[] args)
    {
      int phy,che,math,bio,comp;
      Scanner s = new Scanner(System.in);
      phy=s.nextInt();
      che=s.nextInt();
      math=s.nextInt();
      bio=s.nextInt();
      comp=s.nextInt();
      float per=((float)(phy+che+math+bio+comp)/500)*100;
      if(per>=90)
        System.out.println("Grade A");
      else if(per>=80 && per<90)
        System.out.println("Grade B");
      else if(per>=70 && per<80)
        System.out.println("Grade C");
      else if(per>=50 && per<70)
        System.out.println("Grade D");
      else
        System.out.println("Grade F");
    }}
      
      