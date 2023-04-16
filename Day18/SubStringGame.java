import java.util.*;

 class SubStringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter the string");
        String str = sc.next();
         System.out.println("enter the num");
        int len = sc.nextInt();
         displaySubStringGame(str, len);  
    }
    
    public static void displaySubStringGame(String str, int len) { 
      int n=0;
      while(n==0){
        n=1;
      String str1="";
      int count=1;
            for (int i = 0; i <str.length(); i++) {
              for (int j = i+1; j <str.length(); j++){
                if( str.charAt(j) == str.charAt(i)) {
                   count++; 
                }
                if (count >= len) {
                  String str2="";
                  for(int k=0;k<len;k++)
                    str2=str2+str.charAt(i);
                    str1=str.replace(str2,""); 
                  str=str1;
                  n=0;
                }       
        }}}
        System.out.println(str);
    }
      
    }
         

 