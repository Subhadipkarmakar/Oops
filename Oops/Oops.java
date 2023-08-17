public class Oops{
public static void main(String[] args) {
    pen p1=new pen();
    p1.setcolour("green");
    System.out.println(p1.getcolour());
    p1.settip(5);
System.out.println(p1.gettip());
Bank_account myacc=new Bank_account();
myacc.setpassword("shcasd");



}
} 
class pen{
    private String colour;
   private  int tip;
    void  setcolour(String newcolour){
        colour=newcolour;
    }
    String getcolour(){
        return this.colour;
    }
    void settip(int newtip){
        tip=newtip;
    }
    int gettip(){
        return this.tip;
    }
}
class Bank_account{
    public String username;
    private String password;
    public void setpassword(String psw){
        password=psw;
    }
}