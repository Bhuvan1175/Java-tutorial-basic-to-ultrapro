class product {
    private String ItemNo;
    private String Name;
    private int Price;
    private int Quantity;

    public product(String iN, String Name) {
        this.ItemNo = iN;
        this.Name = Name;
    }

    public String getItemNo() {
        return ItemNo;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setPrice(int p) {
        Price = p;
    }

    public void setQuantity(int q) {
        Quantity = q;
    }

    public void displaceProductDetail() {
        System.out.println("-------------Product Details----------------");
        System.out.println(
                "Item Number : " + ItemNo + "\nName        : " + Name + "\nPrice       : " + Price + "\nQuantity    : "
                        + Quantity);
    }
}

public class shopConstructor {
    public static void main(String[] args) {
        product P1 = new product("I001", "Product 1");
        P1.setPrice(110);
        P1.setQuantity(5);
        P1.displaceProductDetail();
    }
}
// You can make it same as a example on Custo9mer whose properties is customer
// id, address,name,phone.