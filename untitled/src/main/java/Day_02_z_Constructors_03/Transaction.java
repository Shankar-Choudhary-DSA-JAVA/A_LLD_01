package Day_02_z_Constructors_03;

class Transaction {
    private final String transactionId;
    private final double amount;
    //If we remove constructor → compile error. due to final variables
    public Transaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public String getTransactionId() {
        return transactionId;
    } public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        Transaction t = new Transaction("TXN1001", 5000);
      //  t.amount = 10000;   ❌ Not allowed

    }
}