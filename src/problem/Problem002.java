package problem;

public class Problem002 {

    public static void main(String[] args) {
        Problem002 file = new Problem002();
        file.run();
    }



    public void run(){
        int n1 = 1, n2 = 2, n3, i;
        System.out.print(n1 + " " + n2);
        i = 2;
        n3 = 0;
        long sum = 2;
        while (n3 < 3_000_000) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            i++;
            if (n3 % 2 != 0) {
                sum += n3;
            }
        }
        System.out.println();
        System.out.println("sum is : " + sum);
    }
}
