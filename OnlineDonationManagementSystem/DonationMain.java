import java.util.*;
class DonationMain
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            char ch;
           int choice; 
            DonationImp obj=new DonationImp();
            System.out.println("1.Donate for child");
            System.out.println("2.Donate for Oldage People");
            System.out.println("3.Donate for Orphans");
            System.out.println("4.Donate for Preganants");
            System.out.println("5.Conduct Activities");
            System.out.println("6.view Donars for child");
            System.out.println("7.view Donars for Oldage People");
            System.out.println("8.view Donars for Orphans");
            System.out.println("9.view Donars for Preganants");
            System.out.println("10.view Donar Details By Id");
            System.out.println("11.view All Donars");
            System.out.println("12.view Total No of Benificiaries");
            System.out.println("13.view total No of  Donars");
            System.out.println("14.view Conducted Activities");
            
            
            do{
                System.out.println("Enter your choice");
                choice=sc.nextInt();
                switch(choice)
                    {
                        case 1:obj.donateForChild();
                            break;
                        case 2:obj.donateForOldAgePeople();
                            break;
                        case 3:obj.donateForOrphans();
                            break;
                        case 4:obj.donateForPregnants();
                            break;
                        case 5:obj.addActivitiesConducted();
                            break;
                        case 6:obj.viewDonorsForChild();
                            break;
                        case 7:obj.viewDonorsForOldAgePeople();
                            break;
                        case 8:obj.viewDonorsForOrphans();
                            break;
                        case 9:obj.viewDonorsForPregnants();
                            break;
                        case 10:obj.getDonorDetails();
                            break;
                        case 11:obj.viewAllDonors();
                            break;
                        case 12:obj.NoOfBenificiaries();
                            break;
                        case 13:obj.NoOfDonors();
                            break;
                        case 14:obj.viewActivitiesConducted();
                            break;  
                        default :System.out.println("Invalid Option");
                            break;
                    }
                System.out.println("Do tou want to continue one more Operation(y/n)");
                ch=sc.next().charAt(0);
            }while(ch!='n');
        }
    }
