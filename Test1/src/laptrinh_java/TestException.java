package laptrinh_java;

public class TestException {
    public static void ageValid(int age){
        if(age<18){
            throw new ArithmeticException("Age not valid!");
        }else{
            System.out.println("Welcome!");
        }
    }    
    public static void main(String[] args) {
        ageValid(17);
        System.out.println("------");
        ageValid(17);
    }
    
}
