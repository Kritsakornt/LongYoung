public class EmployeeSale {
    private int employeeSaleID[]; //รหัสพนักงานขาย
	private String employeeSaleName[]; //ชื่อพนักงานขาย
	private String employeeSaleTel[]; //เบอร์โทรพนักงานขาย

    public EmployeeSale(int employeeSaleID[], String employeeSaleName[], String employeeSaleTel[]) {
		this.employeeSaleID = employeeSaleID;
		this.employeeSaleName = employeeSaleName;
		this.employeeSaleTel = employeeSaleTel;
	}
    
    public boolean getEmployeeSaleID(int id) { //เช็คการเข้าสู่ระบบของพนักงงาน
		boolean check = false;
		for(int i=0;i<employeeSaleID.length;i++) {
			if(id == employeeSaleID[i]) {
				check = true;
			}
		}
		return check;
	}
	
	public String getEmployeeSaleName(int id) { //แสดงชื่อของพนักงาน
		String name = "";
		for(int i=0; i<employeeSaleID.length; i++) {
			if(id == employeeSaleID[i]) {
				name = employeeSaleName[i];
			}
		}
		return name;
	}
	
	public String getDetailEmployeeSale(int id) { //แสดงรายละเอียดของพนักงาน
		String detailEmployeeSale = "";
		for(int i=0;i<employeeSaleID.length;i++) {
			if(id == employeeSaleID[i]) {
				detailEmployeeSale = "รหัสพนักงาน: "+ employeeSaleID[i] +"\nชื่อ-นามสกุล: "+ employeeSaleName[i] +"\nเบอร์โทร: "+ employeeSaleTel[i];
			}
		}
		return detailEmployeeSale;
	}
}