public class Account {
    protected String name;
    protected String familyname;
    protected int accnum;
    protected double balance;

    public Account() {

    }

    public Account(String name, String familyname, int accnum, double balance) {
        this.name = name;
        this.familyname = familyname;
        this.accnum = accnum;
        this.balance = balance;
    }

    public int getAccnum() {
        return accnum;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }
}
