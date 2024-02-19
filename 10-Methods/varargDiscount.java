public class varargDiscount {

    static double discount(double... Price) {
        double totalAmount = 0;
        for (int i = 0; i < Price.length; i++) {
            totalAmount = totalAmount + Price[i];
        }
        double discountAmount = 0;
        if (totalAmount >= 500) {
            discountAmount = totalAmount * 0.15;
        } else if (totalAmount >= 200 && totalAmount < 500) {
            discountAmount = totalAmount * 0.1;
        }
        double discountPrice = totalAmount - discountAmount;
        if (discountAmount > 0) {
            System.out.println("Total Amount: Rs " + totalAmount);
            System.out.println("Discount Applied: Rs " + discountAmount);
            System.out.println("Amount To be paid after Discount: Rs " + discountPrice);
        } else {
            System.out.println("No discount Applied");
            System.out.println("Amount to be paid is: Rs " + totalAmount);
        }
        return discountPrice;
    }

    public static void main(String[] args) {
        discount(50, 20, 50, 50, 40, 10);
    }
}
