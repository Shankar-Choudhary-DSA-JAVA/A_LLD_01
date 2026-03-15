package z_Constructors_03;

class TransactionImmutable {

    private final String transactionId;
    private final double amount;

    // Constructor required
    public TransactionImmutable(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
    public static void main(String[] args) {

        TransactionImmutable t = new TransactionImmutable("TXN1001", 5000);

        System.out.println(t.getTransactionId());
        System.out.println(t.getAmount());

        // Not allowed
        // t.amount = 10000; ❌
    }
}