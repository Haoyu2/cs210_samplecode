package lec3.array;

public class SelfAvoidingWalker {
    public static void main(String[] args) {
        for (int i=10; i<110; i+=10)
            selfAvoidingWalker(i,100000);

    }

    static void selfAvoidingWalker(int N, int trials){
        int deadEnds = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[N][N];
            int x = N / 2, y = N / 2;
            while (x > 0 && x < N - 1 && y > 0 && y < N - 1) {
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnds++;
                    break;
                }
                a[x][y] = true;
                double r = Math.random();
                if (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                } else if (r < 0.50) {
                    if (!a[x - 1][y]) x--;
                } else if (r < 0.75) {
                    if (!a[x][y + 1]) y++;
                } else if (r < 1.00) {
                    if (!a[x][y - 1]) y--;
                }
            }
        }
        System.out.println(100 * deadEnds / trials + "% dead ends" + " for a board size of " + N);
    }

}