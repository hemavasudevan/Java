public class student2{
int rollno;
String name;
void insertRecord(int r,String n){
    rollno=r;
    name=n;
}
void displayInformation(){System.out.println(rollno+""+name);}
     public static void main(String args[]){
        student2 s1=new student2();
        student2 s2=new student2();
        s1.insertRecord(111,"karan");
        s2.insertRecord(222,"aryan");
        s1.displayInformation();
        s2.displayInformation();
     }
}
