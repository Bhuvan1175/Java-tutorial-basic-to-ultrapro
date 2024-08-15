public class stringCheck {
    public static void main(String[] args) {
        String email="bhuvan1175@gmail.com";
        int at=email.indexOf('@');
        int dot=email.indexOf('.');
        String domain=email.substring(at+1, dot);
        System.out.println("Domain : "+domain);
        String userName=email.substring(0,at);
        System.out.println("Username :"+userName);
        boolean isGmail=domain.equals("gmail");
        System.out.println("isGamil :"+isGmail);
    }
}
