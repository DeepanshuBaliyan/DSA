public class TillingProblem {
    public static int Arrange(int n){
        int fnm1 = Arrange(n-1);
        int fnm2 = Arrange(n-2);

        int totalWays = fnm1 +fnm2;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(3);
    }
}
