package PackageDemo;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public String  bankname;
    public ArrayList<Account> acclist=new ArrayList<Account>();


    public Bank(String bankname) {
        this.bankname=bankname;
    }

    public void showmenu()
    {
        System.out.println("1. open acccount");
        System.out.println("2. deposite money");
        System.out.println("3. withdraw money");
        System.out.println("4. check the balance");
        System.out.println("5. Exit System");
    }

    public int login()
    {
        String user,pass;
        Scanner scbank=new Scanner(System.in);
        System.out.println("Please Login");
        System.out.println("Enter the username");
        user = scbank.next();
        System.out.println("Enter the password");
        pass = scbank.next();
        int t=-1;
        for(int i=0;i<acclist.size();i++ )
        {
            Account a=acclist.get(i);
            if(a.getUsername().equals(user) && a.getPassword().equals(pass))
            {
                t=i;
                break;
            }
        }
       return t;
    }

}
