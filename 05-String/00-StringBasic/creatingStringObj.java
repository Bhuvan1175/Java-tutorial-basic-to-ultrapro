public class creatingStringObj {
    public static void main(String arg[]){
        String str1="Java Programm";
        System.out.println(str1);
        //creating object of the string class
        String str2=new String("Java");
        System.out.println(str2);
        // Above Example Shows That the  Same Value Can Be Assigned To Different Objects Of The String Class.
        // Used of "new" is to string created a object in heap.
        // str2 is gives refrence to the that  particular object which is present in the heap memory.
        // String name is similar in class and constructor while creating.

        //Methods
        //1) The Method used to convert chracter array in single string.
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        System.out.println(str3);

        //2)  Another method is used to convert int value into string using Byte [] function.
        byte b[]={65,66,67,68,69,70};
        String str5=new String(b);
        System.out.println(str5);
        // That byte value is converted in ASCII value in string form.

    }
}
// String created in heap