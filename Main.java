import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int managerID[] = {1,2};
        String managerName[] = {"ลองยัง มาลองดิ", "ลองเเล้ว จะติดใจ"};
        String managerTel[] = {"099-9999999", "088-7569842"};
        Manager manager = new Manager(managerID, managerName, managerTel);

        int employeeSaleID[] = {1,2};
        String employeeSaleName[] = {"กฤษกร ทิพย์ลุ้ย", "แซลม่อน แคนนาบิช"};
        String employeeSaleTel[] = {"088-8888888", "081-2345678"};
        EmployeeSale employeeSale = new EmployeeSale(employeeSaleID, employeeSaleName, employeeSaleTel);

        int employeeDoID[] = {1,2};
        String employeeDoName[] = {"มะพร้าว ทิพย์", "สัญญา เมคเซนต์"};
        String employeeDoTel[] = {"099-5556686", "098-8944587"};
        EmployeeDo employeeDo = new EmployeeDo(employeeDoID, employeeDoName, employeeDoTel);

        int examinerID[] = {1,2};
        String examinerName[] = {"ศิรา เมคเซนต์", "ไอรา เมคนิดนึง"};
        String examninerTel[] = {"065-8459787", "074-8859632"};
        Examiner examiner = new Examiner(examinerID, examinerName, examninerTel);

        int cupID[] = {1,2,3};
        String cupSize[] = {"แก้ว S ขนาด 16 ออนซ์", "แก้ว M ขนาด 18 ออนซ์", "แก้ว L ขนาด 22 ออนซ์"};
        int cupNumber[] = {51,23,97};
        Cup cup = new Cup(cupID, cupSize, cupNumber);

        int rawID[] = {1,2,3,4};
        String rawName[] = {"นมจืด", "นมสด", "ไข่มุก", "กาแฟ"};
        int rawNumber[] = {80, 10, 98, 50};
        Rawmaterial raw = new Rawmaterial(rawID, rawName, rawNumber);

        int productID[] = {1,2,3,4,5};
        String productName[] = {"โกโก้นมสด", "ชาเขียวนมสด", "ชาไทยนมสด", "ลาเต้", "เอสเปรสโซ่"};
        double productPrice[] = {35.00, 35.00, 35.00, 35.00, 35.00};
        String productSize[] = {"S", "S", "S", "S", "S"};
        Product product = new Product(productID, productName, productPrice, productSize);

        Order order = new Order(1, "กำลังดำเนินการ", "01/10/2564", "13:00", 1, employeeSale, product);

        Receipt receipt = new Receipt(1, "01/10/2564", "13:45", 150);

        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("******************** ระบบจัดการร้านชานมไข่มุก ********************");
            System.out.println("   (1) ผุ้จัดการ");
            System.out.println("   (2) ผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก");
            System.out.println("   (3) พนักงานขาย");
            System.out.println("   (4) พนักงานทำ");
            System.out.println("   (0) ออกจากเมนู");
            System.out.print("เลือกเมนู: ");
            select = sc.nextInt();
            if(select == 3) { // ------------------- พนักงานขาย -------------------
                System.out.print("ใส่ ID ของคุณ: ");
                int id = sc.nextInt();
                if(employeeSale.getEmployeeSaleID(id) == true);
                int selectMenu;
                String listIdProduct = ""; //เก็บรหัสอาหารหรือเครื่องดื่มที่ลูกค้าสั่ง
                do {
                    System.out.println("******************** ระบบจัดการร้านชานมไข่มุก ********************");
                    System.out.println("สวัสดีคุณ " + employeeSale.getEmployeeSaleName(id));
                    System.out.println("ตำแหน่ง: พนักงานขาย");
                    System.out.println("   (1) ดูออเดอร์สินค้า");
                    System.out.println("   (2) รับออเดอร์");
                    System.out.println("   (0) ออกจากระบบ");
                    System.out.print("เลือกเมนู: ");
                    selectMenu = sc.nextInt();
                    if(selectMenu == 2) {
                        String selectProduct ;
                            do {
                                System.out.println("===================== รายการเครื่องดื่ม =====================");
								System.out.println("1. โกโก้นมสด     (Fresh Milk Cocoa)       ราคา 35.00 บาท");
                                System.out.println("2. ชาเขียวนมสด   (Fresh Milk Green Tea)   ราคา 35.00 บาท");
                                System.out.println("3. ชาไทยนมสด    (Fresh Milk Cocoa)       ราคา 35.00 บาท");
                                System.out.println("4. ลาเต้          (Latte)                  ราคา 35.00 บาท");
                                System.out.println("5. เอสเปรสโซ่     (Espresso)               ราคา 35.00 บาท");
                                System.out.println("========================================================" + "\n");
								System.out.println("เลือกเมนูเครื่องดื่ม (ใส่ y เสร็จสิ้น,  n ยกเลิก)");
								System.out.print("ใส่หมายเลขเครื่องดื่ม: ");
								selectProduct = sc.nextLine();
                                if(selectProduct.equals("y")) {
                                    String confirm;
                                    do {
                                        int numR ;
                                        System.out.println("========================================");
										System.out.println("           รายการเครื่องดื่มที่สั่ง         ");
                                        System.out.println("========================================");
                                        for(int i=0;i<listIdProduct.length();i++) {
                                            char IdProduct = listIdProduct.charAt(i);
                                            int idProduct = Integer.parseInt(String.valueOf(IdProduct));
                                            System.out.println(" No." + product.getProductID(idProduct) + " " + product.getProductName(idProduct) + "   ราคา " + product.getProductPrice(idProduct) + " บาท");
                                        }
                                        System.out.println("========================================" + "\n");
                                        System.out.println("ใส่ y ยืนยัน,  n ยกเลิก");
										confirm = sc.nextLine();
                                        if(confirm.equals("y")) {
                                            order.setOrder(listIdProduct, id);
                                            System.out.println("******************** ใบเสร็จ ********************");
                                            System.out.println(receipt.getReceiptDetails());
                                            System.out.println(order.getOrderDetails());
                                            System.out.println("เงินสด : " + receipt.getReceiptCash());
                                            System.out.println("*******************************************************");
                                            break;
                                        }
                                    } while(!confirm.equals("n"));
                                    break;
                                }
                                else {
                                    listIdProduct += selectProduct;
                                }
                            } while(!selectProduct.equals("n"));
                    }
                    else if(selectMenu == 1) {
                        System.out.println("==================== ออเดอร์อาหาร ====================");
                        System.out.println(order.getShowOrderDetails());
                        System.out.println("==================================================" + "\n");
                    }
                } while(selectMenu != 0);
            }
            else if(select == 4) { // ------------------- พนักงานทำ -------------------
                System.out.print("ใส่ ID ของคุณ: ");
                int idDo = sc.nextInt();
                if(employeeDo.getEmployeeDoID(idDo) == true);
                int selectMD;
                do {
                    System.out.println("******************** ระบบจัดการร้านชานมไข่มุก ********************");
                    System.out.println("สวัสดีคุณ " + employeeDo.getEmployeeDoName(idDo));
                    System.out.println("ตำแหน่ง: พนักงานทำ");
                    System.out.println("   (1) ออเดอร์ลูกค้า");
                    System.out.println("   (0) ออกจากระบบ");
                    System.out.print("เลือกเมนู: ");
                    selectMD = sc.nextInt();
                    if ( selectMD == 1) {
                        int menuN ;
                        System.out.println("==================== ออเดอร์เครื่องดื่ม ====================");
                        System.out.println(order.getShowOrderDetails());
                        System.out.println("พนักงานทำ " + employeeDo.getEmployeeDoName(idDo));
                        System.out.println("==================================================" + "\n");
                        System.out.println("ใส่ 1 ยืนยันว่าเสร็จสิ้น,  2 ยกเลิก");
                        menuN = sc.nextInt();
                        if(menuN == 1 ) {
                            System.out.println("==================== ออเดอร์เครื่องดื่ม ====================");
                            System.out.println(order.getOrderComplet());
                            System.out.println("พนักงานทำ " + employeeDo.getEmployeeDoName(idDo));
                            System.out.println("==================================================" + "\n");
                        }
                        break;
                    }
                } while(selectMD != 0);
            }
            else if(select == 2) { // ผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก
                System.out.print("ใส่ ID ของคุณ: ");
                int idEx = sc.nextInt();
                if(examiner.getExaminerID(idEx) == true);
                int selectEx;
                do {
                    // แก้ว
                    int cupS = cup.getCupNumber(1);
                    int cupM = cup.getCupNumber(2);
                    int cupL = cup.getCupNumber(3);
                    // วัตถุดิบ
                    int milkJ = raw.getRawNumber(1);
                    int milkS = raw.getRawNumber(2);
                    int kaimuk = raw.getRawNumber(3);
                    int coffee = raw.getRawNumber(4);
                    System.out.println("******************** ระบบจัดการร้านชานมไข่มุก ********************");
                    System.out.println("สวัสดีคุณ " + examiner.getExaminerName(idEx));
                    System.out.println("ตำแหน่ง: ผู้ตรวจสอบและรับวัตถุดิบเข้าสต็อก");
                    System.out.println("   (1) เช็คสต็อก");
                    System.out.println("   (2) เพิ่ม");
                    System.out.println("   (0) ออกจากระบบ");
                    System.out.print("เลือกเมนู: ");
                    selectEx = sc.nextInt();
                    if ( selectEx == 1 ) {
                        System.out.println("==================== เช็คสต็อก ====================");
                        System.out.println("       รายการ                        จำนวน   ");
                        System.out.println("อุปกรณ์");
                        System.out.println("     1. แก้ว S ขนาด 16 ออนซ์        " + cupS + " ใบ");
                        System.out.println("     2. แก้ว M ขนาด 18 ออนซ์        " + cupM + " ใบ");
                        System.out.println("     3. แก้ว L ขนาด 22 ออนซ์        " + cupL + " ใบ");
                        System.out.println("                  ");
                        System.out.println("วัตถุดิบ");
                        System.out.println("     1. นมจืด                      " + milkJ + " ถุง");
                        System.out.println("     2. นมสด                      " + milkS + " ถุง");
                        System.out.println("     3. ไข่มุก                      " + kaimuk + " ถุง");
                        System.out.println("     4. กาแฟ                      " + coffee + " ถุง");
                        System.out.println("=================================================");
                    } 
                    else if( selectEx == 2) {
                        int Stock ;
                        do {
                            System.out.println("========= เพิ่มเข้าสต็อก =========");
                            System.out.println("   (1) วัตถุดิบ");
                            System.out.println("   (2) อุปกรณ์");
                            System.out.println("   (0) ย้อนกลับ");
                            System.out.print("เลือกรายการที่ : ");
                            Stock = sc.nextInt();
                            if (Stock == 2) {
                                System.out.println("==================== เพิ่มสต็อก ====================");
                                System.out.println("       รายการ                        จำนวน   ");
                                System.out.println("อุปกรณ์");
                                System.out.println("     1. แก้ว S ขนาด 16 ออนซ์        " + cupS + " ใบ");
                                System.out.println("     2. แก้ว M ขนาด 18 ออนซ์        " + cupM + " ใบ");
                                System.out.println("     3. แก้ว L ขนาด 22 ออนซ์        " + cupL + " ใบ");
                                System.out.println("=================================================");
                                System.out.print("เลือกชนิด : ");
                                int plusRaw = sc.nextInt();
                                    if (plusRaw == 1) {
                                        System.out.print("เพิ่ม แก้ว S จำนวน : ");
                                        cupS += sc.nextInt();
                                    }else if (plusRaw == 2) {
                                        System.out.print("เพิ่ม แก้ว M จำนวน : ");
                                        cupM += sc.nextInt();
                                    }else if (plusRaw == 3) {
                                        System.out.print("เพิ่ม แก้ว L จำนวน : ");
                                        cupL += sc.nextInt(); 
                                    }
                            }
                            else if (Stock == 1) {
                                System.out.println("==================== เพิ่มสต็อก ====================");
                                System.out.println("       รายการ                        จำนวน   ");
                                System.out.println("วัตถุดิบ");
                                System.out.println("     1. นมจืด                      " + milkJ + " ถุง");
                                System.out.println("     2. นมสด                      " + milkS + " ถุง");
                                System.out.println("     3. ไข่มุก                      " + kaimuk + " ถุง");
                                System.out.println("     4. กาแฟ                      " + coffee + " ถุง");
                                System.out.println("=================================================");
                                System.out.print("เลือกชนิด : ");
                                int plusCup = sc.nextInt();
                                    if (plusCup == 1) {
                                        System.out.print(" เพิ่ม นมจืด จำนวน : ");
                                        milkJ += sc.nextInt();
                                    }else if (plusCup == 2) {
                                        System.out.print(" เพิ่ม นมสด จำนวน : ");
                                        milkS += sc.nextInt();
                                    }else if (plusCup == 3) {
                                        System.out.print(" เพิ่ม ไข่มุก จำนวน : ");
                                        kaimuk += sc.nextInt();
                                    }else if (plusCup == 4) {
                                        System.out.print(" เพิ่ม กาแฟ จำนวน : ");
                                        coffee += sc.nextInt();
                                    }
                            }       
                        } while(Stock != 0);
                    }
                } while(selectEx != 0);
            }
            else if ( select == 1) {
                System.out.print("ใส่ ID ของคุณ: ");
                int idM = sc.nextInt();
                if(manager.getManagerID(idM) == true);
                int selectMana;
                do {
                    System.out.println("******************** ระบบจัดการร้านชานมไข่มุก ********************");
                    System.out.println("สวัสดีคุณ " + manager.getManagerName(idM));
                    System.out.println("ตำแหน่ง: ผู้จัดการ");
                    System.out.println("   (1) ดูออเดอร์ทั้งหมด");
                    System.out.println("   (2) เช็คสต็อก");
                    System.out.println("   (0) ออกจากระบบ");
                    System.out.print("เลือกเมนู: ");
                    selectMana = sc.nextInt();
                    if (selectMana == 1) {
                        System.out.println("==================== ออเดอร์เครื่องดื่ม ====================");
                        System.out.println(order.getShowOrderDetails());
                        System.out.println("==================================================" + "\n");
                    }else if ( selectMana == 2) {
                        // แก้ว
                        int cupS = cup.getCupNumber(1);
                        int cupM = cup.getCupNumber(2);
                        int cupL = cup.getCupNumber(3);
                        // วัตถุดิบ
                        int milkJ = raw.getRawNumber(1);
                        int milkS = raw.getRawNumber(2);
                        int kaimuk = raw.getRawNumber(3);
                        int coffee = raw.getRawNumber(4);
                        System.out.println("==================== เช็คสต็อก ====================");
                        System.out.println("       รายการ                        จำนวน   ");
                        System.out.println("อุปกรณ์");
                        System.out.println("     1. แก้ว S ขนาด 16 ออนซ์        " + cupS + " ใบ");
                        System.out.println("     2. แก้ว M ขนาด 18 ออนซ์        " + cupM + " ใบ");
                        System.out.println("     3. แก้ว L ขนาด 22 ออนซ์        " + cupL + " ใบ");
                        System.out.println("                  ");
                        System.out.println("วัตถุดิบ");
                        System.out.println("     1. นมจืด                      " + milkJ + " ถุง");
                        System.out.println("     2. นมสด                      " + milkS + " ถุง");
                        System.out.println("     3. ไข่มุก                      " + kaimuk + " ถุง");
                        System.out.println("     4. กาแฟ                      " + coffee + " ถุง");
                        System.out.println("=================================================");
                        int Mp ;
                        do {
                            System.out.println("   (1) เพิ่มวัตถุดิบ");
                            System.out.println("   (2) เพิ่มอุปกรณ์");
                            System.out.println("   (0) ย้อนกลับ");
                            System.out.print("เลือกเมนู: ");
                            Mp = sc.nextInt();
                            if (Mp == 2) {
                                System.out.println("==================== เพิ่มสต็อก ====================");
                                System.out.println("       รายการ                        จำนวน   ");
                                System.out.println("อุปกรณ์");
                                System.out.println("     1. แก้ว S ขนาด 16 ออนซ์        " + cupS + " ใบ");
                                System.out.println("     2. แก้ว M ขนาด 18 ออนซ์        " + cupM + " ใบ");
                                System.out.println("     3. แก้ว L ขนาด 22 ออนซ์        " + cupL + " ใบ");
                                System.out.println("=================================================");
                                System.out.print("เลือกชนิด : ");
                                int plusRaw = sc.nextInt();
                                    if (plusRaw == 1) {
                                        System.out.print("เพิ่ม แก้ว S จำนวน : ");
                                        cupS += sc.nextInt();
                                    }else if (plusRaw == 2) {
                                        System.out.print("เพิ่ม แก้ว M จำนวน : ");
                                        cupM += sc.nextInt();
                                    }else if (plusRaw == 3) {
                                        System.out.print("เพิ่ม แก้ว L จำนวน : ");
                                        cupL += sc.nextInt(); 
                                    }
                            }
                            else if (Mp == 1) {
                                System.out.println("==================== เพิ่มสต็อก ====================");
                                System.out.println("       รายการ                        จำนวน   ");
                                System.out.println("วัตถุดิบ");
                                System.out.println("     1. นมจืด                      " + milkJ + " ถุง");
                                System.out.println("     2. นมสด                      " + milkS + " ถุง");
                                System.out.println("     3. ไข่มุก                      " + kaimuk + " ถุง");
                                System.out.println("     4. กาแฟ                      " + coffee + " ถุง");
                                System.out.println("=================================================");
                                System.out.print("เลือกชนิด : ");
                                int plusCup = sc.nextInt();
                                    if (plusCup == 1) {
                                        System.out.print(" เพิ่ม นมจืด จำนวน : ");
                                        milkJ += sc.nextInt();
                                    }else if (plusCup == 2) {
                                        System.out.print(" เพิ่ม นมสด จำนวน : ");
                                        milkS += sc.nextInt();
                                    }else if (plusCup == 3) {
                                        System.out.print(" เพิ่ม ไข่มุก จำนวน : ");
                                        kaimuk += sc.nextInt();
                                    }else if (plusCup == 4) {
                                        System.out.print(" เพิ่ม กาแฟ จำนวน : ");
                                        coffee += sc.nextInt();
                                    }
                            }       
                        } while(Mp != 0);
                    }
                } while(selectMana != 0);
            }
        }  while(select != 0);
    }
}