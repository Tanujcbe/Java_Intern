import java.util.*;
import java.io.*;

public class Main {
     
    public static int get_id(int cnt){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your id: ");
        int id = sc.nextInt();
        if(id>=cnt){
            System.out.println("Invalid Id");
            id=-1;
        }
        return id;
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Bank_Account[] bAccount = new Bank_Account[20];
        int loop = 1;
        Integer cnt=0;
        Integer n;
        while(loop==1){
            {
                System.out.println("***************************************************");
                System.out.println("1.Create Accout\n2.Deposit\n3.Withdraw\n4.Print Details");
                System.out.println("5.Transfer Amount\n6.Admin\n7.Edit\n8.Deactivate");
                System.out.println("***************************************************");
                n=sc.nextInt();
            }

            // Create Account
            if(n==1){
                System.out.println("Enter your name: ");
                String name = "Tj";
                // String name=sc.next();
                // System.out.println(name);

                System.out.println("Choose you bank type 1.Savings or 2.Current:");
                int type=sc.nextInt();
                String accType;
                if(type==1){ accType = "Savings";}

                else if(type==2){ accType = "Current"; }
                
                else{
                    System.out.println("Please enter valid number...");
                    continue;
                }

                System.out.println("Enter your deposited amount:");
                long amount= sc.nextLong();

                bAccount[cnt] = new Bank_Account(cnt,name,accType,amount);
                // bAccount[cnt].pin_number();
                bAccount[cnt].print_balance();
                cnt++;
            }

            // Deposit
            else if(n==2){
                int id = get_id(cnt);
                if(id==-1)
                    continue;

                if(!bAccount[id].activate){
                    System.out.println("Your account in deactivated");
                    continue;
                }

                if(bAccount[id].accType=="Current"){
                    System.out.println("You cannot deposit in Current Account");
                    continue;
                }

                System.out.println("Enter your deposited amount: ");
                long amount= sc.nextLong();
                bAccount[id].deposit(amount);
            }

            // Withdraw
            else if(n==3){
                int id = get_id(cnt);
                if(id==-1)
                    continue;

                if(!bAccount[id].activate){
                    System.out.println("Your account in deactivated");
                    continue;
                }

                // System.out.println("Enter your pin");
                // Integer n_pin=sc.nextInt();

                // if(n_pin==bAccount[id].pin){ 
                //     System.out.println("Wrong pin!!!!");
                //     continue;
                // }
                
                System.out.println("Enter your amount to withdraw: ");
                long amount= sc.nextLong();

                bAccount[id].withdraw(amount);
            }

            // Print Details
            else if(n==4){
                int id = get_id(cnt);
                if(id==-1)
                    continue;

                bAccount[id].print_balance();
            }

            // Transfer
            else if(n==5){
                int id = get_id(cnt);
                if(id==-1)
                    continue;
                
                if(!bAccount[id].activate){
                    System.out.println("Your account in deactivated");
                    continue;
                }
                
                System.out.println("Enter amount to transfer");
                Long tAmount = sc.nextLong();
                if(bAccount[id].balance<tAmount){
                    System.out.println("No Sufficient balance");
                }

                System.out.println("Enter reciever's id: ");
                int t_id = sc.nextInt();
                if(t_id>=cnt){
                    System.out.println("Invalid Id");
                    t_id=-1;
                }
                if(t_id==-1)
                    continue;
                
                if(!bAccount[id].activate){
                    System.out.println("The given account in deactivated");
                    continue;
                }
                
                bAccount[id].withdraw(tAmount);
                bAccount[t_id].deposit(tAmount);
            }

            // Admin
            else if(n==6){
                Long am = Long.valueOf(2000);
                admin ad =new admin(20,"Admin", "Admin", am,bAccount,cnt);
                System.out.println("1.Print Total Amount\n2.Print Customer Transactions\n3.Print all Transactions");
                int x=sc.nextInt();

                if(x==1){
                    ad.total_amount();
                }

                if(x==2){
                    int id=get_id(cnt);

                    if(id==-1)
                        continue;

                    ad.cust_transaction(id);
                }

                if(x==3){
                    ad.all_transaction();
                }
            }

            // Edit
            else if(n==7){
                int id=get_id(cnt);
                if(id==-1)
                    continue;
                System.out.println("Edit 1.Name\n2.Account Type");
                int x=sc.nextInt();
                if(x==1){
                    System.out.println("Enter your name");
                    String s=sc.next();
                    bAccount[id].cName=s;
                }
                else if(x==2){
                    System.out.println("Choose you bank type 1.Savings or 2.Current:");
                    int type=sc.nextInt();

                    if(type==1)
                        bAccount[id].accType = "Savings";

                    else if(type==2)
                        bAccount[id].accType = "Current";

                    else{
                        System.out.println("Please enter valid number...");
                        continue;
                    }
                }
            }

            // Deactivate account
            else if(n==8){
                int id=get_id(cnt);
                if(id==-1)
                    return ;
                    
                bAccount[id].activate=false;
            }
         
            // Exit
            else{
                loop=0;
            }

        }
    }

}
