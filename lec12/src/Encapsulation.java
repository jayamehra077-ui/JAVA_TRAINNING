public class Encapsulation {
    //SINGLE UNIT ME DATA KO BIND KARNA HI ENCAPSULATION KEHLATA H
    public static void main(String[] args)
    {
        atm s1=new atm();
        s1.getBalance();
        s1.setBalance(2000000000);
    }
}
class atm
{
    private int totalBalance=100000;
    public void getData()
    {

    }
    public void getBalance()
    {
        System.out.println(totalBalance);
    }
    public void setBalance(int amount)
    {
        if(amount>0&&totalBalance>=amount)
        {
            totalBalance-=amount;
            System.out.print("after withdraw amount="+totalBalance);
        }
       else
        if(amount>0&&totalBalance<amount)
        {
            totalBalance+=amount;
            System.out.print("after deposit="+totalBalance);
        }
    }
}
