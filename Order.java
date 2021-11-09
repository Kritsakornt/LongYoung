public class Order {
    private int orderID; //รหัสออเดอร์
	private String orderStatus; //สถานะออเดอร์
	private String orderDate; //วันที่บันทึกออเดอร์
	private String orderTime; //เวลาที่บันทึกออเดอร์
	private int orderTakeOrder; //รหัสพนักงานขายที่รับออเดอร์
	private String orderProduct; //รายการเครื่องดื่มทั้งหมด
	private int orderNumber; //จำนวนเครื่องดื่ม
	private EmployeeSale employeeSale; //พนักงานขาย
	private Product product; //สินค้า

    public Order(int orderID, String orderStatus, String orderDate, String orderTime, int orderNumber,EmployeeSale employeeSale, Product product) {
		this.orderID = orderID;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderNumber = orderNumber;
		this.employeeSale = employeeSale;
		this.product = product;
	}

    public void setOrder(String orderProduct, int orderTakeOrder) { //รับข้อมูลเครื่องดื่ม, รหัสพนักงานขายที่รับออเดอร์
		this.orderProduct = orderProduct;
		this.orderTakeOrder = orderTakeOrder;
	}

    public int getOrderID() { //แสดงรหัสออเดอร์
		return orderID;
	}

    public int getNameTakeOrder() { //แสดงรหัสพนักงานขายที่รับออเดอร์ 
		return orderTakeOrder;
	}

    public String getOrderStatus() { //แสดงสถานะการทำอาหารของออเดอร์
		return orderStatus;
	}
	
	public String getOrderProduct() { //แสดงครื่องดื่มในออเดอร์
		return orderProduct;
	}
	
	public int getOrderNumber() { //แสดงจำนวนเครื่องดื่ม
		return orderNumber;
	}
    public String getShowOrderDetails() { //แสดงรายละเอียดออเดอร์
		return "เลขออเดอร์: "+ orderID +"\nสถานะ: "+ orderStatus +"\nวัน/เดือน/ปี ที่บันทึกออเดอร์: "+ orderDate +"  เวลาที่บันทึกออเดอร์:  "+ orderTime + " น." +"\nพนักงานรับออเดอร์: "+ employeeSale.getEmployeeSaleName(orderTakeOrder) +"\n-------------------- รายการเครื่องดื่่มที่สั่ง --------------------\n"+ product.getDetailProduct(orderProduct, orderNumber);
	}

	public String getOrderComplet() { // แสดงรายละเอียดออเดอร์ที่เสร็จสิ้น
		return "เลขออเดอร์: "+ orderID +"\nสถานะ: เสร็จสิ้น"+"\nวัน/เดือน/ปี ที่บันทึกออเดอร์: "+ orderDate +"  เวลาที่บันทึกออเดอร์:  "+ orderTime + " น." +"\nพนักงานรับออเดอร์: "+ employeeSale.getEmployeeSaleName(orderTakeOrder) +"\n-------------------- รายการเครื่องดื่่มที่สั่ง --------------------\n"+ product.getDetailProduct(orderProduct, orderNumber);
	}

	public String getOrderDetails() { // แสดงรายละเอียดออเดอร์ที่เสร็จสิ้น
		return "พนักงานรับออเดอร์: "+ employeeSale.getEmployeeSaleName(orderTakeOrder) +"\n-------------------- รายการเครื่องดื่่มที่สั่ง --------------------\n"+ product.getDetailProduct(orderProduct, orderNumber);
	}
}
