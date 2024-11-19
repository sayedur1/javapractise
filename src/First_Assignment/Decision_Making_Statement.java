package First_Assignment;

public class Decision_Making_Statement {

    //if statement
    int a = 10, b = 15, c = 20;

    public void Comparision() {
        //if statement
        if (a > b)
            System.out.println(" a is bigger then b");
        // if   else statement
        if (a > b & c <= 10)
            System.out.println(" two condition true");
        else
            System.out.println("two condition false");
        // if , else if,   Statement
        if (a < b)
            System.out.println("b is bigger ");
        else if (a < 12)
            System.out.println(" this will not be exicuted as b is bigger ");

        // nested if
        if (b > a) {
            if (c > b)
                System.out.println(" enter nested if block");

        }

        // switch statement
        switch (a)
        {
            case 10: System.out.println("condition matched");
                   break;

            case 12: System.out.println("not matched ");

            default:System.out.println(("if any case not matched"));
        }
    }
        public static void main (String[]args){


            Decision_Making_Statement objcreation = new Decision_Making_Statement();
            objcreation.Comparision();

        }

    }
