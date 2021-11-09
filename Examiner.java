public class Examiner {
    private int examinerID[]; //รหัสผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก
	private String examinerName[]; //ชื่อผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก
	private String examninerTel[]; //เบอร์โทรผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก


    public Examiner(int examinerID[], String examinerName[], String examninerTel[]) {
        this.examinerID = examinerID ;
        this.examinerName = examinerName ;
        this.examninerTel = examninerTel ;
    }
    
    public boolean getExaminerID(int id) { //เช็คการเข้าสู่ระบบของผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก
		boolean check = false;
		for(int i=0;i<examinerID.length;i++) {
			if(id == examinerID[i]) {
				check = true;
			}
		}
		return check;
	}

    public String getExaminerName(int id) { //แสดงชื่อของผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก
		String name = "";
		for(int i=0; i<examinerID.length; i++) {
			if(id == examinerID[i]) {
				name = examinerName[i];
			}
		}
		return name;
	}

    public String getDetailExaminer(int id) { //แสดงรายละเอียดของผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก
		String detailExaminer = "";
		for(int i=0;i<examinerID.length;i++) {
			if(id == examinerID[i]) {
				detailExaminer = "รหัสพนักงาน: "+ examinerID[i] +"\nชื่อ-นามสกุล: "+ examinerName[i] +"\nเบอร์โทร: "+ examninerTel[i];
			}
		}
		return detailExaminer;
	}
}
