import java.util.Scanner;

public class DrawSquare {
    class GFG {


        static void print_rectangle(int k, int l) {
            int a, b;


            for (a = 1; a <= k; a++) {

                for (b = 1; b <= l; b++) {

                    if (a == 1 || a == k || b == 1 || b == l)


                        System.out.print("*");
                    else


                        System.out.print(" ");
                }


                System.out.println();
            }
        }


        public static void main(String args[]) {

            int rows = 0, columns =0;
            Scanner n=new Scanner(System.in);
            System.out.println("Add meg az első számot:");
            rows=n.nextInt();
            System.out.println("add meg a második számot:");
            rows=n.nextInt();


            print_rectangle(rows, columns);
        }
    }
}