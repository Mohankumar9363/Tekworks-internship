class test
    {
        public static void main(String args[])
        {
String x="743456";
String str="";
for(int i=0;i<x.length();i++)
    {
        if(x.charAt(i)=='0')
            str=str+"zero";
        else if(x.charAt(i)=='1')
            str=str+"one";
        else if(x.charAt(i)=='2')
            str=str+"two";
        else if(x.charAt(i)=='3')
            str=str+"three";
        else if(x.charAt(i)=='4')
            str=str+"four";
        else if(x.charAt(i)=='5')
            str=str+"five";
        else if(x.charAt(i)=='6')
            str=str+"six";
        else if(x.charAt(i)=='7')
            str=str+"seven";
        else if(x.charAt(i)=='8')
            str=str+"zero";
        else if(x.charAt(i)=='9')
            str=str+"nine";
    }
System.out.println(str);
}}