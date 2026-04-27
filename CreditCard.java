public class CreditCard{
    private String owner;
    private String number;
    private double balance;
    private double limit;

    public CreditCard(String owner, String number, String balance, double limit){
        this.owner=owner;
        this.number=number;
        this.balance=0;
        this.limit=limit;
    }

    public boolean charge(double price){
        if (price+balance>limit){
            return false;}
            balance+=price;
            return true;
    }

    public void makePayment(double amount){
        balance-=amount;
    }

    public double getBalance(){
        return balance;
    }
    public double getLimit(){
        return limit;
    }
    public String getOwner(){
        return owner;
    }
    public String getNumber(){
        return number;
    }

    public static void main(String[] args){
        CreditCard card=new CreditCard("Rakesh","1234 5678 9012 3456","0",5000);
        System.out.println("Owner: "+card.getOwner());
        System.out.println("Number: "+card.getNumber());
        System.out.println("Limit: "+card.getLimit());

        System.out.println("\n -- Chargin $200 --");
        boolean success=card.charge(200);
        System.out.println("Charge successful: "+success);
        System.out.println("Balance: "+card.getBalance());

        System.out.println("\n -- Charging $900(over limit) --");
        success=card.charge(900);
        System.out.println("Charge successful: "+success);
        System.out.println("Balance: "+card.getBalance());

        System.out.println("\n -- Making payment of $150 --");
        card.makePayment(150);
        System.out.println("Balance: "+card.getBalance());
    }
}