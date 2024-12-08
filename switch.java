/*  switch (variable) {
case 1: sit 1;
break;
}
*/
import java.util.*;

public class switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(Syatem.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("invalid button");1
        }
    }
}