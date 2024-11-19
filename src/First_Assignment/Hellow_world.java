package First_Assignment;

public class Hellow_world {

    public static void main(String[] args) {
        //First_class myobj=new First_class(); cannot i create object of "First_class" to call function "method"
       //myobj.method();
         class First_class{ // identifier=First_class
           int i;      //variable name=i also called identifier
           float j;    //variable

             First_class()     //constructor declaration
             {
                 System.out.println("sayedur 1"); //not showing output why?
             }


          public void method()   //method declaration
          {
              System.out.println("sayedur2"); // not showing output why?
           }
        }
        System.out.println("sayedur3");

    }




}
