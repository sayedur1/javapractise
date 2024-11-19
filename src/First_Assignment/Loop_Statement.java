package First_Assignment;

public class Loop_Statement
{

    // foor loop
    String[] name = {"karim", "rahim", "jodu", "modu"};
     int a=18,b=20;
    void Looping_Function() {
        for (int k = 1; k <= 5; k++)
            System.out.println(" value :" + k);
    }
// for each loop
    void For_Each() {

        for (String index : name)
            System.out.println("for_each_loop: " + index);
    }
    // while loop
    void While_Loop(){
        while(a<b){
            System.out.println("while loop executed");
            a++;
        }
    }
    void Do_While(){
        do{
            System.out.println("enter inside do while ");
    } while(a<b);


}

    public static void main(String[] args) {
        Loop_Statement myobj=new Loop_Statement();
        myobj.Looping_Function();
        myobj.For_Each();
        myobj.While_Loop();
        myobj.Do_While();
    }
}