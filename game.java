import java.util.*;

public class game {

    public int check(int[][] a) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Diagonal check
        if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[0][0] != ' ') {
            return 1;
        } else {
            // cross Diagoanl check
            if (a[2][0] == a[1][1] && a[1][1] == a[0][2] && a[2][0] != ' ') {
                return 1;
            } else {
                // 1st row check
                if (a[0][0] == a[0][1] && a[0][1] == a[0][2] && a[0][0] != ' ') {
                    return 1;
                } else {
                    // 2nd row check
                    if (a[1][0] == a[1][1] && a[1][1] == a[1][2] && a[1][0] != ' ') {
                        return 1;
                    } else {
                        // 3rd row check
                        if (a[2][0] == a[2][1] && a[2][1] == a[2][2] && a[2][0] != ' ') {
                            return 1;
                        } else {
                            // 1st column
                            if (a[0][0] == a[1][0] && a[1][0] == a[2][0] && a[0][0] != ' ')
                                return 1;
                            else {
                                // 2nd column
                                if (a[0][1] == a[1][1] && a[1][1] == a[2][1] && a[0][1] != ' ')
                                    return 1;
                                else {
                                    // 3rd column
                                    if (a[0][2] == a[1][2] && a[1][2] == a[2][2] && a[0][2] != ' ') {
                                        return 1;
                                    } else
                                        return 0;
                                }
                            }

                        }
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = ' ';
            }
        }

        game obj = new game();
        int result = 0;

        // H1 - 0
        // H2 - 1
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("H1 input");
                int r = in.nextInt();
                int c = in.nextInt();
                a[r][c] = 0;

                 result = obj.check(a);
                if (result == 1) {
                    System.out.println("H1 Win");
                    break;
                }
            }

            else {
                System.out.println("H2 input");
                int r = in.nextInt();
                int c = in.nextInt();
                a[r][c] = 1;

                 result = obj.check(a);
                if (result == 1) {
                    System.out.println("H2 Win");
                    break;
                }
            }

        }
        if(result==0){
            System.out.println("No one Win"); 
        }
    }

}