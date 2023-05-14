package laptrinh_java;

public class Student {
    int stt;
    String name;
    String city;
    
    Student(int stt,String name,String city){
        this.stt=stt;
        this.name=name;
        this.city=city;
    }
    void display(){
        System.out.println(+stt+" "+name+" "+city);
    }
    public static void main(String []args) {
        Student s1= new Student(101, "tu", "nghe an");
        s1.display();
        
    }
    
}
