package problem;

public class P005 {
    public static void main(String[] args) {
        System.out.println(new P005().run());
    }


    private boolean isEvenlyDivisible(int number) {
        boolean result = true;
        for (int i = 2; i <= 20; i++) {
            if (number % i != 0) {
                result = false;
                break;
            }
        }
        return result;
    }


    private int run() {
        int answer = 2520;
        while (!isEvenlyDivisible(answer)){
            answer++;
        }
        return answer;
    }
}
