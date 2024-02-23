class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getaccNo() {
        return accNo;
    }

    public String getname() {
        return name;
    }

    public String getaddress() {
        return address;
    }

    public String getphno() {
        return phno;
    }

    public String getdob() {
        return dob;
    }

    public long getbalance() {
        return balance;
    }

    public void setaddress(String add) {
        address = add;
    }

    public void setphno(String phno) {
        this.phno = phno;
    }

}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposite(long amt) {
        balance = balance + amt;
    }

    public void withdraw(long amt) {
        balance = balance - amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt) {
        balance = balance - amt;
    }

    public void repay(long amt) {
        if (amt<=balance) {
            balance = balance - amt;
        }else{
            balance=0;
        }
    }
}

public class SLAccount {
    public static void main(String[] args) {
        SavingsAccount SA = new SavingsAccount("2133142987564", "Bhuvaneshwar Bagde", "Kalmeshwar,Nagpur", "7083623156",
                "27/05/2003");
        SA.deposite(1000);
        SA.withdraw(200);
        System.out.println("------------------Saving Accounts Detail-----------------");
        System.out.println("Account Number     : " + SA.getaccNo());
        System.out.println("Name               : " + SA.getname());
        System.out.println("Address            : " + SA.getaddress());
        System.out.println("Phone number       : " + SA.getphno());
        System.out.println("Date of birth      : " + SA.getdob());
        System.out.println("Balance            : " + SA.getbalance());
        System.out.println("------------------Saving Accounts Ends-----------------");

        LoanAccount LA = new LoanAccount("2133142987564", "Bhuvaneshwar Bagde", "Kalmeshwar,Nagpur", "7083623156",
                "27/05/2003");
        LA.payEMI(500);
        LA.repay(500);
        System.out.println("------------------Loan Accounts Detail-----------------");
        System.out.println("Account Number     : " + LA.getaccNo());
        System.out.println("Name               : " + LA.getname());
        System.out.println("Address            : " + LA.getaddress());
        System.out.println("Phone number       : " + LA.getphno());
        System.out.println("Date of birth      : " + LA.getdob());
        System.out.println("Balance            : " + LA.getbalance());
        System.out.println("------------------Loan Accounts Ends-----------------");
    }
}
