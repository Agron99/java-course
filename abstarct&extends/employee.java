package java1;
public abstract class employee {
    private String firstname;
    private String lastname;
    private double balance;
    public employee(String fname , String lname){
        firstname = fname;
        lastname = lname;
        balance = 100000;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract double earns();
}
