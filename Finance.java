public abstract class Finance{
    protected double amount;
    protected String date;
    abstract double applyPayment(double paymentAmount);
    public void displayDetails(){
        System.out.println("Amount: "+amount+ ".\nDate: "+date);
    }
   Finance(double amount,String date){
    this.amount=amount;
    this.date=date;
   }
}
class Helbloan extends Finance{
    String disbursementStatus;
    double balance;
    Helbloan(double amount,String date,String disbursementStatus){
      super(amount,date);
      this.disbursementStatus=disbursementStatus;
      this.balance=amount;
    }
    @Override
double applyPayment(double paymentAmount) {
    if (paymentAmount <= 0) {
        System.out.println("Invalid payment amount.");
        return balance;
    }

    balance -= paymentAmount;
    if (balance < 0) {
        System.out.println("Loan overpaid! Refund due: " + Math.abs(balance));
        balance = 0;
    }

    return balance;
}
void displayLoan(){
    displayDetails();
    System.out.println("Status: "+disbursementStatus+".\nBalance:Ksh. "+balance+".");
}
}
