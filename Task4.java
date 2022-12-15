import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {

    String model;

    /*
    public Txt(String model){
        this.model = model;
    }
    */

    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        Scanner scn = new Scanner(System.in);
        String tmpWord = new String();
        int num = 0;
        int tmpNum = 0;
        String[] tmpArray = new String[2];
        
        LinkedList<Task4> txt = new LinkedList<>();
        
        while (true){
            String tmpStr = scn.nextLine();
            
            tmpArray = tmpStr.split("~");
            tmpNum = Integer.parseInt(tmpArray[1]);
            tmpWord = tmpArray[0];
            
            if (tmpWord == "print") {
                System.out.println(words.get(tmpNum));
                words.remove(tmpNum);
            }

            else if (tmpNum == (-1)) {
                break;
            }

            else {
                words.add(tmpNum, tmpWord);
            }
        }
    }
}