
/*
*
*   Use a class to define a variable with the key word new
*
*   And the variable defined by this class is called instance variable of this class
*
*
*   Constrcutor is the instace method to initiate a value to instace variable
*
* every class has a defalut constructor that does nothing
*
*
*
* */

public class AddTwoInts {
    int a;
    int b;

    public AddTwoInts(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

}
