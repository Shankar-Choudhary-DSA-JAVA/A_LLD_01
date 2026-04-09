package Day_02_z_Constructors_03;

class TransactionMutable {

    private String transactionId;
    private double amount;

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
    public static void main(String[] args) {

        TransactionMutable t = new TransactionMutable();

        t.setTransactionId("TXN2001");
        t.setAmount(7000);

        System.out.println(t.getTransactionId());
        System.out.println(t.getAmount());

        // value can change again
        t.setAmount(9000);

        System.out.println(t.getAmount());
    }
}