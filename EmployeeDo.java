public class EmployeeDo {
    private int employeeDoID[]; //รหัสพนักงานทำ
	private String employeeDoName[]; //ชื่อพนักงานทำ
	private String employeeDoTel[]; //เบอร์โทรพนักงานทำ

    public EmployeeDo(int employeeDoID[], String employeeDoName[], String employeeDoTel[]) {
		this.employeeDoID = employeeDoID;
		this.employeeDoName = employeeDoName;
		this.employeeDoTel = employeeDoTel;
	}
    
    public boolean getEmployeeDoID(int id) { //เช็คการเข้าสู่ระบบของพนักงงาน
		boolean check = false;
		for(int i=0;i<employeeDoID.length;i++) {
			if(id == employeeDoID[i]) {
				check = true;
			}
		}
		return check;
	}
	
	public String getEmployeeDoName(int id) { //แสดงชื่อของพนักงาน
		String name = "";
		for(int i=0; i<employeeDoID.length; i++) {
			if(id == employeeDoID[i]) {
				name = employeeDoName[i];
			}
		}
		return name;
	}
	
	/*public String getDetailEmployeeDo(int id) { //แสดงรายละเอียดของพนักงาน
		String detailEmployeeDo = "";
		for(int i=0;i<employeeDoID.length;i++) {
			if(id == employeeDoID[i]) {
				detailEmployeeDo = "รหัสพนักงาน: "+ employeeDoID[i] +"\nชื่อ-นามสกุล: "+ employeeDoName[i] +"\nเบอร์โทร: "+ employeeDoTel[i];
			}
		}
		return detailEmployeeDo;
	} */
}