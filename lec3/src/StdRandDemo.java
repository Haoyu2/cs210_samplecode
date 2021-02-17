import stdlib.StdRandom;

public class StdRandDemo {
    public static void main(String[] args) {
//        i++ is equalvent to i += 1 or i = i + 1
        for (int i = 0; i < 10; i += 1){

            System.out.println(StdRandom.uniform());
//            System.out.println(StdRandom.bernoulli());
            if (StdRandom.bernoulli()) {
                System.out.println("hello");
            }

        }
    }
}
