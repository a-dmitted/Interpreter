import java.util.Scanner;

public class InterpreterDriver {
    public Conversion originatingContent = new Conversion();
    public Expression theExpression = null;
    

    public void interpret(String tString){
        theExpression = new MapIntToCharacters(tString);
        theExpression.interpret(originatingContent);
    }

    public static void main(String[] args){
        System.out.println("\n\nCODE INTERPRETER\n");
        System.out.println("Enter your code: ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        System.out.println("Your code is: " + userInput);
        InterpreterDriver userCode = new InterpreterDriver();
        userCode.interpret(userInput);
        System.out.println("\n\n");
    }
}
