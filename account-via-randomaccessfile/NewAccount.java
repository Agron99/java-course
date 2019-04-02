import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class NewAccount extends Account {
    public NewAccount(String name, String familyname, int accnum, double balance) {
        super(name, familyname, accnum, balance);
    }

    public NewAccount() {

    }

     public void write (String filename) throws IOException {
        RandomAccessFile file=new RandomAccessFile(filename,"rw");
         file.writeInt(super.getAccnum());
         file.writeChars(fixname(super.getName()));
         file.writeChars(fixname(super.getFamilyname()));
         file.writeDouble(super.getBalance());
         file.seek(0);
        }

    public static String fixname(String w) {

     if (w.length()>20)
         w=w.substring(0,20);
     else
         for (int i = 0; i <20-w.length() ; i++) {
             w+=" ";
         }
         return w;
        /*   String a = w;
        if (w.length() > 20) {
            a = w.substring(0, 20);
        } else {
            for (int i = 0; i < 20 - w.length(); i++) {
                a += " ";
            }
        }
        return a;*/
    }
    public void readrandom(String filename) throws IOException {


        RandomAccessFile fil=new RandomAccessFile( filename ,"rw");

        int b=fil.readInt();
        super.setAccnum(b);
        String a=gefromfile(fil);
        super.setName(a);
        String e=gefromfile(fil);
        super.setFamilyname(e);
        double q=fil.readDouble();
        super.setBalance(q);

    }
    public static String gefromfile(RandomAccessFile f) throws IOException{
        String h="";

        for (int i = 0; i <20 ; i++) {
            h += f.readChar();

        }
        return h;
    }





}
