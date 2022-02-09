public class admin extends Bank_Account {
    Bank_Account bAccount[];
    int cnt;
    admin(int CId,String cName,String accType,Long balance,Bank_Account[] bAccount,int cnt){
        super(CId,cName,accType,balance);
        this.bAccount=bAccount;
        this.cnt=cnt;
    }
    
    void total_amount(){
        long sum = Long.valueOf(0);
        for(int i=0;i<cnt;i++){
            sum+=bAccount[i].balance;
        }
        System.out.println("***************************************************");
        System.out.println("Total amount in bank is: Rs."+sum);
        System.out.println("***************************************************");
    }
    
    void cust_transaction(int id){
        if(cnt==0){
            System.out.println("No data found...");
            return ;
        }
        System.out.println("Time \t\tAmout_Transfered");
        System.out.println("***************************************************");
        for (pair p : bAccount[id].prev_transcation) {
            System.out.println(p.f+" "+p.s);
        }
        System.out.println("***************************************************");
        System.out.println("Balance for "+bAccount[id].CId+" "+bAccount[id].cName+" is "+bAccount[id].balance);
        System.out.println("***************************************************");
    }

    void all_transaction(){
        if(cnt==0){
            System.out.println("No data found...");
            return ;
        }
        for(int id=0;id<cnt;id++){
            cust_transaction(id);
        }
        total_amount();
    }
    
}
