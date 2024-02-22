// Find the is on gmail
// find username and domain name from email
public class studentChallengeI {
    public static void main(String[] args) {
        String email="programmer@gmail.com";
        // Find the is an gmail.
        if(email.matches(".*@gmail.*")) System.out.println("Its The Appropiate Gmail");
        else System.out.println( "Not An Appropriate Gmail Account" );
        // find username from email
        // used a string method
        var i=email.indexOf("@");
        String userName=email.substring(0,i); 
        System.out.println("Username : "+userName);
        // find the domain from email
        String domain=email.substring(i+1 , email.length());
        System.out.println("Domain Name : "+domain);
        // To check email or not
        int j=domain.indexOf(".");
        String name=domain.substring(0, j);
        System.out.println(name);
        System.out.println(name.equals("gmail"));

    }    
}
