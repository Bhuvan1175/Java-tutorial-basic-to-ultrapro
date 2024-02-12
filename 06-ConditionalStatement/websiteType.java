import java.util.Scanner;
public class websiteType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter The website:");
        String website=sc.nextLine();
        String url=website.substring(0,website.indexOf(":"));
        if(url.equals("http")|| url.equals("https")) System.out.println("Hypertext transfer protocol");
        else if(url.equals("ftp")) System.out.println("File Transfer Protocol");
        else System.out.println("Invalid Protocol");
        String urlEnd=website.substring(website.lastIndexOf(".")+1);
        if(urlEnd.equals("com"))System.out.println("Commercial Website");
        else if(urlEnd.equals("org"))System.out.println( "Organization Website");
        else if(urlEnd.equals("edu"))System.out.println("Educational Website");
        else if(urlEnd.equals("net"))System.out.println("Network Website");
        else if(urlEnd.equals("in"))System.out.println("Indin Website");
        else System.out.println("Other Type of Website");
        sc.close();
    }
}
