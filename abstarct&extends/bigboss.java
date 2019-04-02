package java1;

public class bigboss extends employee implements payable {
    private double rate;
    public bigboss(String fname , String lname , double v){
        super(fname , lname);
        rate = v;
    }
    @Override
    public double earns(){
        return rate * getBalance() + 100000;
    }
    public void print(){
        System.out.printf("%s %s %f" , getFirstname() , getLastname() , earns());
    }
}
