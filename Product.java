public class Product {
    private int productID[]; //รหัสเครื่องดื่ม
	private String productName[]; //ชื่อเครื่องดื่ม
	private double productPrice[]; //ราคาเครื่องดื่ม
	private String productSize[]; //ขนาดของเครื่องดื่ม

    public Product(int productID[], String productName[], double productPrice[], String productSize[]) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productSize = productSize;
    }

    public int getProductID(int id) { //แสดงรหัสเครื่องดื่ม
		int idProduct = 0;
		for(int i=0; i<productID.length; i++) {
			if(id == productID[i]) {
				idProduct = productID[i];
			}
		}
		return idProduct;
	}
	
	public String getProductName(int id) { //แสดงชื่อเครื่องดื่ม
		String nameProduct = "";
		for(int i=0; i<productID.length; i++) {
			if(id == productID[i]) {
				nameProduct = productName[i];
			}
		}
		return nameProduct;
	}
	
	public double getProductPrice(int id) { //แสดงราคาเครื่องดื่ม
		double priceProduct = 0.0;
		for(int i=0; i<productID.length; i++) {
			if(id == productID[i]) {
				priceProduct = productPrice[i];
			}
		}
		return priceProduct;
	}

    public String getProductSize(int id) { // แสดงขนาดของเครื่องดื่ม
        String  sizeProduct = "";
        for(int i=0; i<productID.length; i++) {
            if(id == productID[i]) {
                sizeProduct = productSize[i];
            }
        }
        return sizeProduct;
    }
	
	public String getDetailProduct(String listIdProduct, int orderNumber) { //แสดงรายละเอียดเครื่องดื่ม
		String detailProduct = "";
		for(int i=0;i<listIdProduct.length();i++) {
			char IdProduct = listIdProduct.charAt(i);
			int idProduct = Integer.parseInt(String.valueOf(IdProduct));
			detailProduct += " No." + getProductID(idProduct) + " " + getProductName(idProduct) + "   จำนวน " + orderNumber + "   ราคา " + getProductPrice(idProduct) + " บาท\n";
		}
		return detailProduct;
	}
}
