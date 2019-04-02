package java1;

import java1.bigboss;

public class test {
    public static void main(String[] args){
        employee[] a = new employee[2];
        a[0] = new boss("ali" , "mahmoodi" , 10);
        a[1] = new bigboss("javad" , "rajaie" , 6);
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof bigboss){
                bigboss b = (bigboss) a[i];
                b.print();
            }
        }
    }
}
