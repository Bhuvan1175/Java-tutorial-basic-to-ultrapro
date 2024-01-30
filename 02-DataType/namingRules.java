public class namingRules {
    public static void main(String[] args) {
        // Case Sensetive
        int age = 89;
        int Age = 77;
        System.out.println("Small a "+age);
        System.out.println("Big A "+Age);

        //Contains Alphabets , Numbers _ or $
        String name="bhuvi";
        String Name$Numbers_123= "Bhuvnesh_123$";
        System.out.println(name);
        System.out.println(Name$Numbers_123);

        // Starts with Alphabet , _ ,or $
        int _temp=37;
        int $cost=300;
        System.out.println("Temperature :"+_temp);
        System.out.println("Cost :" +$cost);
        
        // Should not be keyword
        // int for=90;
        // it shows red line below the word .. so this is a reserved keyword , we cant used it as a variable.

        // Follows camel casing
        String firstName ="Bhuvnesh";
        System.out.println("Welcome "+firstName);
    }
}
