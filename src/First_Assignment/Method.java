package First_Assignment;

public class Method {
    int a,b;

    Method( String k)
    {
       System.out.println("inside constructor=" +k);
    }


    public void Sumation( int i ,int j)
    {
        this.a=i;
        this.b=j;
        int sum= a+b;
        System.out.println("sumation of a&b "+ sum);

    }
 public static void main (String[] args){

      Method myobject= new Method("sayedur");


     myobject.Sumation(10,20);
 }
}
