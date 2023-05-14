package laptrinh_java;

import java.util.Scanner;

public class Bai2 {
    //viết số nguyên in ra dạng chữ
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("nhap n ");   
    int n= sc.nextInt();
    switch (n) {
        case 0:
            System.out.println("khong");
            break;
        case 1:
            System.out.println("mot");
            break;
        case 2:
            System.out.println("hai");
            break;
        default:
            System.out.println("minh hoa 0 den 2 la duoc ");
            break;
    }
    sc.close();
    }
    
}
