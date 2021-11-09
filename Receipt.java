public class Receipt {
    private int receiptID ; // หมายเลขใบเสร็จ
    private String receiptDate ; // วันที่
    private String receiptTime ; // เวลา
    private int receiptCash ; // เงินที่รับมา

    public Receipt(int receiptID, String receiptDate, String receiptTime, int receiptCash) {
        this.receiptID = receiptID ;
        this.receiptDate = receiptDate ;
        this.receiptTime = receiptTime ;
        this.receiptCash = receiptCash ;
    }

    protected int getReceiptID() {
        return receiptID ;
    }
    protected String getReceiptDate() {
        return receiptDate ;
    }

    protected String getReceiptTime() {
        return receiptTime ;
    }

    protected int getReceiptCash() {
        return receiptCash ;
    }

    public String  getReceiptDetails() { // แสดงใบเสร็จที่มีรายละเอียดออเดอร์
        return "ใบเสร็จ" + "\nออเดอร์ที่ : " + receiptID + "\nวันที่ : " + receiptDate + " - เวลา :" + receiptTime + " น." ;
    }


}
