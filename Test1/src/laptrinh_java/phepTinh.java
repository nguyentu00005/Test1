package laptrinh_java;
import java.util.Scanner;

public class phepTinh {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("nhap a ,b");
            int a= input.nextInt();
            
            int b=input.nextInt();
            

            int ketqua;
            System.out.println("phep tinh");
            char pheptoan= (char) System.in.read();
            switch (pheptoan) {
                case '+':
                    ketqua=a+b;
                    System.out.println("ket qua ="+ketqua);
                    break;
                case'-':
                    ketqua=a-b;
                    System.out.println("ket qua ="+ketqua);
                    break;
                case'*':
                    ketqua=a*b;
                    System.out.println("ket qua ="+ketqua);
                    break;    
                
            
                default:
                    System.out.println("nhap sai phep tinh");
                    break;
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("loi:"+e.toString());

        }
        
    }


    
}
