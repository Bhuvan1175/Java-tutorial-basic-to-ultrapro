public class variable {
    public static void main(String arg[]){
        int age=40;
        // This is how we are declare a variable and assign value to same..
        // Some rules follows in  declaring variables. 
        //1) Variable name should start with alphabet or underscore(_).
        //2) Variable  can contain letters, digits,$,_;
        //3) Avoid using keywords as a variable name. Keywords are reserved words used by  Java for built-in function calls.
        //4) Variable name will not start with digit.
        //5) Space between variable will not allowed.
        //6) As per latest practice variable name should in camale case.
        //7) Give meaningfull name.

        System.out.println("My age is "+age);

        byte b=101;
        short s=300;
        char c='A';
        float f=4.98f;
        int i=66;

        System.out.println("Byte Value      :"+b);       
        System.out.println("Short Value     :"+s);
        System.out.println("Character Value :"+c);
        System.out.println("Floating Value  :"+f);
        System.out.println("Integer Value   :"+i);
    }   
}
