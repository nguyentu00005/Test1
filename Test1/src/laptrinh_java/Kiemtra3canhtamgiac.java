package laptrinh_java;
import java.util.*;
public class Kiemtra3canhtamgiac {
    public static void main(String[] args) {
        
    
        float a, b, c;
        System.out.println("nhap a,b,c");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if(a+b>c && b+c>a && c+a>b)
            System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
        else
            System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
        sc.close();
    }
    
}
