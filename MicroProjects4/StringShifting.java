import java.util.*;

class StringShifting {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the data to String");
    String str = new String(sc.nextLine());
    char stringarray[] = str.toCharArray();
    System.out.println("enter no of positions for shifting");
    int n = sc.nextInt();
    displayRightShift(stringarray, n);
    displayLeftShift(stringarray, n);
  }

  static void displayRightShift(char stringarray[], int n) {
    for (int k = 1; k <= n; k++) {
      char temp = stringarray[stringarray.length - 1];
      for (int l = stringarray.length - 2; l >=0 ; l--){
        stringarray[l+1] = stringarray[l];
      }
      stringarray[0] = temp;
    }
    String s = new String(stringarray);
    System.out.println("after Right shift:"+s);
  }
     static void displayLeftShift(char arr[],int n){
     for (int k = 1; k <= n; k++) {
      char temp = arr[0];
      for (int l=1 ;l<arr.length; l++){
        arr[l-1] =arr[l];
      }
      arr[arr.length - 1] = temp;
    }
    String s = new String(arr);
    System.out.println("after left shift:"+s);
  }
}
    