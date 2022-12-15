

/***
 <Allan Villegas Jr.>
 DataStruct 21 -  06973
 Parenthesis Checker
 - a program that will the correct pairing of parenthesis
 <>[](){}

 **/
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ParenthesisChecker{

    public static boolean isBalance(String str){
        String closings = ">}])";
        MyStackLinked myStack = new MyStackLinked();
        for(int i = 0; i < str.length(); i++){
            char ch  = str.charAt(i);
            if(closings.indexOf(ch) != -1) {
                if(i==0 || !isPair(myStack.peek(), ch))
                    return false;
                myStack.pop();
            }else
                myStack.push(ch);
        }
        return myStack.isEmpty();
    }
    public static boolean isPair(Object x, Object y) {
        if(x == null)
            return false;

        String pair = x.toString() + y.toString();
        return pair.equals("<>") || pair.equals("()") || pair.equals("{}") || pair.equals("[]");
    }
    static public void main(String ...args){
        try {
            Scanner reader = new Scanner(new File("file.txt"));
            while(reader.hasNextLine()){
                String str = reader.nextLine().trim();
                if(str != "")
                    System.out.printf("%s -> %s\n",str,isBalance(str) ? "Balanced" : "UnBalanced");

            }
        }catch(FileNotFoundException e){
            System.out.print("File not Found");
        }

    } // end of main method
} // end of class
