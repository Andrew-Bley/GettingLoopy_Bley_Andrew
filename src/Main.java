public class Main {
    public static void main(String[] args) {
        for (int x = 0; x <= 30; x++) {
            System.out.println(x);
        }
        for (int l = 0; l < 3; l++)
            System.out.println();


        for (int x = 30; x >= 0; x--) {
            System.out.println(x);
        }
        for (int l = 0; l < 3; l++)
            System.out.println();

        for (int x = 0; x <= 18; x += 3) {
            System.out.println(x);
        }
        for (int l = 0; l < 3; l++)
            System.out.println();

        for (int x = 10; x >= 0; x -= 2) {
            System.out.println(x);
        }


        int rows = 5;


        for (int y = 1; y <= rows; ++y) {


            for (int z = 1; z <= y; ++z) {
                System.out.print("*");
            }
            System.out.println("");
        }

        {
        for (int x = 5; x >= 1; x-- )
        {

            for (int y = 1; y <= x; ++y)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        }


        int row = 6;
        int col = 6;
        String str = "*";

        for (int x = 2; x <= row; ++x) {


            for (int y = 2; y <= col; ++y) {
                System.out.print(str);
            }

            System.out.println("");
        }
    }
}


















