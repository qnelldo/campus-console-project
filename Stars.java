import java.util.Scanner;
 
public class Stars {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How long is the line? : ");
        line = input.nextInt();
        
        for(int i=line, add=0; i>0; i--, add++) {
            for(int j=0; j<i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<line-(i-1)+add; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}