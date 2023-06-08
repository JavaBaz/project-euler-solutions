package problem;

public class P001 {
    public static void main(String[] args) {
        P001 file = new P001();
        file.run();
    }

    public void run() {
        int sum = 0;
        for (int i = 2; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println("sum is : " + sum);
    }
}
