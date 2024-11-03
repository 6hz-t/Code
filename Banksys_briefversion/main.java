package PackageDemo;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int m=0;
        double n=0;
        Bank bk = new Bank("China Bank");
        Account temp;
        Scanner sc = new Scanner(System.in);
        int choice;
        for (choice = 4; choice != 0; )
        {
            bk.showmenu();
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the username");
                    String userstr = sc.next();
                    System.out.println("Enter the password");
                    String passstr = sc.next();
                    temp = new Account(userstr, passstr);
                    bk.acclist.add(temp);
                    System.out.println("Sussess");
                    break;
                case 2:
                    m= bk.login();
                    if(m==-1)
                        System.exit(0);
                    System.out.println("how much do you want to add?");
                    n = sc.nextDouble();
                    temp=bk.acclist.get(m);
                    temp.getinmoney(n);
                    bk.acclist.set(m,temp);
                    break;
                case 3:
                    m= bk.login();
                    if(m==-1) {
                        System.out.println("Invalid username");
                        System.exit(0);

                    }
                    System.out.println("how much do you want to withdraw?");
                    n = sc.nextDouble();
                    temp=bk.acclist.get(m);
                    temp.getoutmoney(n);
                    bk.acclist.set(m,temp);
                    break;
                case 4:
                    m= bk.login();
                    if(m==-1) {
                        System.out.println("Invalid username");
                        System.exit(0);
                    }
                    temp=bk.acclist.get(m);
                    temp.refermoney();
                    break;
                case 5:
                    System.exit(0);

            }
            System.out.println("————————————————————————————————————————————————————————");
        }
    }
}
