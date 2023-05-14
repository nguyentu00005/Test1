package laptrinh_java;
import java.util.*;
public class UCLN {
    static int a,b;
    public static void nhap() {
        try {
            Scanner input =new Scanner(System.in);
            System.out.println("nhap a ");
             a =input.nextInt();
            System.out.println("nhap b");
             b=input.nextInt();
            input.close();
        } catch (Exception e) {
            System.out.println("loi: "+e.getMessage());
        }
    
        
    }
    public static void ucln() {
        int u=0;
        for ( int i = 1; i <= a && i <= b; i++) {
            
            if (a % i == 0 && b % i == 0) {
                
                u=i;
            }
            
        }

        System.out.println("ucln cua"+a+"va"+b+"la:"+u);
    }
    public static void main(String[] args) {
        nhap();
        ucln();
    }
}   
 
    

   