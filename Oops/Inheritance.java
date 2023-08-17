public class Inheritance {
    public static void main(String[] args) {
     
     
    }
}
//Parent class
class Animal{
    String color;
     void eat(){
        System.out.println("eat");
     }
     void breath(){
        System.out.println("breath");
     }
}
//child class
// class Fish extends Animal{
//     int fin;
//     void swim(){
//         System.out.println("swim in the water");
//     }
// }
// class mamals extends Animal{
//     int legs;
// }
// class dogs extends mamals{
//     String breeds;
// }
class mamals extends Animal{
     int legs;
 }
class Birds extends Animal{
     void fly(){
        System.out.println(  "fly");};
 }
 class Fish extends Animal{
     void fly(){
        System.out.println("fly");
     }
 }