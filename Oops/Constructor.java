public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=100;

        Student s2=new Student(s1);
        for(int i=0;i<=3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    int marks[];
    Student(String name){
        marks=new int [3];
this.name=name;

    }
    Student(int roll){
        this.roll=roll;
         marks=new int [3];
    }
    Student(){
 marks=new int [3];
    }
   
//     Student(Student s1 ){
// this.name=s1.name;
// this.roll=s1.roll;
//  this.marks=s1.marks;
//     }

 Student(Student s1 ){
 this.name=s1.name;
 this.roll=s1.roll;
  for(int i=0;i<marks.length;i++){
   this. marks[i]=s1.marks[i];
  }

     }
}
