package laptrinh_java;
import java.util.*;
public class Baitap1 {
    // nhap 1 so nguyên in ra so âm nếu nhỏ hơn 0 và ngược lại
    public static void main(String[] args) {
        try{
            Scanner input =new Scanner(System.in);
            System.out.println("nhap n");
            int n =input.nextInt();
            input.close();
            if(n>=0){
                System.out.println("day la so duong");
            }else
                System.out.println("day la so am");
        }
        catch(Exception e){
            System.out.println("loi:"+e.getMessage());
        }
    }
    
}
