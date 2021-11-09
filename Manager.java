public class Manager {
    private int managerID[] ; // รหัสผู้จัดการ
    private String managerName[] ; // ชื่อผู้จัดการ
    private String managerTel[] ; // เบอร์โทรผู้จัดการ

    public Manager(int managerID[], String managerName[], String managerTel[]) {
        this.managerID = managerID ;
        this.managerName = managerName ;
        this.managerTel = managerTel ;
    }

    public boolean getManagerID(int id) {
        boolean check = false;
        for(int i=0; i<managerID.length; i++) {
            if(id == managerID[i]) {
                check = true ;
            }
        }
        return check ;
    }

    public String getManagerName(int id) {
        String name = "" ;
        for(int i=0; i<managerID.length; i++) {
            if(id == managerID[i]) {
                name = managerName[i];
            }
        }
        return name ;
    }

    public String getDetailManager(int id) {
        String detailManager = "";
        for(int i = 0 ; i<managerID.length; i++) {
            if(id == managerID[i]) {
                detailManager = "รหัสพนักงาน: "+ managerID[i] +"\nชื่อ-นามสกุล: "+ managerName[i] +"\nเบอร์โทร: "+ managerTel[i];
            }
        }
        return detailManager;
    }
}