import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Run {
    public static void main(String [] args) throws IOException {

        NewAccount ac1=new NewAccount();
        //ac1.write("rrr.dat");
        //ac1.readrandom("rrr.dat");
       ac1.readrandom("M:\\rrr.dat");
        NewAccount ac2=new NewAccount(ac1.getFamilyname(),ac1.getName(),ac1.getAccnum(),ac1.getBalance());
        System.out.printf("%d\t%s\t%s\t%f",ac2.getAccnum(),ac2.getName(),ac2.getFamilyname(),ac2.getBalance());
    }
}
