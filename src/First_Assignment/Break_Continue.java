package First_Assignment;

public class Break_Continue {


void Break_Continue_Function(){
    for (int i=1;i<=5;i++)
    {
        if(i==2) break;
        System.out.println(" break block value :"+i);
    }
    for (int j=1;j<=5;j++)
    {
        if(j==2) continue;
        System.out.println(" continue block value :"+j);
    }

}

    public static void main(String[] args) {
        Break_Continue myobect =new Break_Continue();
        myobect.Break_Continue_Function();
    }
}
