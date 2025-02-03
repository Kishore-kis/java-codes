// import java.util.Scanner;

public class function {
    int value;
    String name;
    function(){
        System.out.println("goof");
    }
    void myrope(String a){
        name=a;
        System.out.println(name);
    }
}
    //int multiply(){
        //    int a=7;
      //      return a*a;

    //}
     //int addition(int a,int b){
       // return a+b;
    //}
    //String passorfail(int marks){
       // if(marks>35){
           // return  "pass";
       // }
       // else{
//return "fail";
       // }
   // }

    public static void main(String[] args){
        //Scanner s=new  Scanner(System.in);
        //int marks=s.nextInt();
        //function obj=new function();
        //String result=obj.passorfail(marks);
        //System.out.println(result);
        
        function obj=new function();
        System.out.println(obj.value);
        obj.myrope("mark");
        System.out.println(obj.name);
    }
     



    //function f= new function();
    //System.out.println(f.multiply());
    //System.out.println(f.addition(5,10));
