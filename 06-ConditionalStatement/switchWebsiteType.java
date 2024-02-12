import java.util.Scanner;

public class switchWebsiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website URL:");
        String website = sc.nextLine();

        // Extract extension
        String extension = website.substring(website.lastIndexOf(".") + 1);

        System.out.println("Extension: " + extension);
        switch (extension) {
            case "com":
                System.out.println("Commercial Website");
                break;
            case "org":
                System.out.println("Organisation Website");
                break;
            case "net":
                System.out.println("Tutorial Website");
                break;
            case "in":
                System.out.println("Indian Website");
                break;
            default:
                break;
        }
        sc.close();
    }
}
