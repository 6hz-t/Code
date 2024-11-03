package PackageDemo;

public class Account {

    private String username;
    private String password;
    private double money=0;


    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void getoutmoney(double m)
    {
        if(m<=money)
        {
            money -= m;
            System.out.println("You have withdrew "+m);
        }
        else
            System.out.println("Error");
    }
    public void getinmoney(double m)
    {
        money += m;
        System.out.println("You have deposited "+m);
    }
    public void  refermoney()
    {

        System.out.println("Your balance is "+money);
    }



}