package laptrinh_java;
import java.util.*;
public class Tamgiacvuong {
    public static void main(String[] args) {
        
    
        float a, b, c;
        System.out.println("nhap a,b,c");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if((Math.pow(a, 2)+Math.pow(b,2))== (Math.pow(c, 2))|| (Math.pow(b, 2)+Math.pow(c,2))== (Math.pow(a, 2))||  (Math.pow(a, 2)+Math.pow(c,2))== (Math.pow(b, 2)))
            System.out.println("tam giac vuong");
        else
            System.out.println("khong phai tam giac vuong");
        sc.close();
    }
    
}
