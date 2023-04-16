interface  mobile{
  void incommingCall();
  String outgoingCall();
 void incommingMessage();
   String outgoingMessage();
   void games();
   String socialMediaApps();
   void camera();
   String files();
}
class mobileImp implements mobile{
  public  void incommingCall(){
    System.out.println("receiving call");
  }
  public String outgoingCall(){
    return "initiating the call";
  }
  public void incommingMessage(){
    System.out.println("receiving message");
  }
  public String outgoingMessage(){
    return "sending message";
  }
  public void games(){
    System.out.println("play games");
  }
  public String socialMediaApps(){
    return "use SocialMedia Apps";
  }
  public void camera(){
    System.out.println("Take pictures");
  }
  public String files(){
    return "search files";
  }
}

class DigitalDevice{
  public static void main(String args[]){
    mobileImp m=new mobileImp();
    m.incommingCall();
    System.out.println(m.outgoingCall());
    m.incommingMessage();
    System.out.println(m.outgoingMessage());
    m.games();
    System.out.println(m.socialMediaApps());
    m.camera();
    System.out.println(m.files());
  }
}