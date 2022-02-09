import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.time.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;


public class Bank_Account{
    boolean activate=true;
    int CId;
    long balance;
    String  accType;
    String cName;
    protected Integer pin;
    protected List<pair> prev_transcation = new ArrayList<pair>();

    Bank_Account(int CId,String cName,String accType,Long balance){
        this.CId=CId;
        this.cName = cName;
        this.accType = accType;
        this.balance = balance;
        find_time(balance);
    }

    void print_balance(){
        System.out.println(cName+"("+"id : "+CId+") has "+accType+" account balance : Rs."+balance);
    }

    void find_time(Long amount){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String s = ldt.format(dtf);
        pair p = new pair(s, amount);
        prev_transcation.add(p);
    }

    public void pin_number(int pin){
        System.out.println("Your pin is : +"+pin);
    }

    void deposit(Long amount){
        balance+=amount;
        find_time(amount);
        System.out.println(cName+"("+"id : "+CId+") has "+accType+" account has been credited of Rs."+amount);
    }

    void withdraw(Long amount){
        if(amount>balance){
            System.out.println("Funds not sufficient...");
            return;
        }

        else{
            balance-=amount;
            find_time(-1*amount);
            System.out.println(cName+"("+"id : "+CId+") has "+accType+" account has been debedited of Rs."+amount);
        }
    }


}