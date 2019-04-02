package java1;
public class boss extends employee {
    private double level;
    public boss(String fname , String lname , double lvl){
        super(fname , lname);
        level = lvl;
    }
    @Override
    public double earns(){
        return level * getBalance();
    }
    public void print(){
        System.out.println(getFirstname() + getLastname() + getBalance());
    }
}
