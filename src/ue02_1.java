import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) 
         {
        System.out.println("Bitte geben sie 3 ganze Zahlen ein");

        int first = In.readInt();
        int second = In.readInt();
        int third = In.readInt();

            int Maximum = (first + second + third);
            System.out.println("Hier das Maximum der 3 eingegebenen Werte: "+ Maximum);
                
            }
    }

