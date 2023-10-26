public class FriendPairingProblem {
    public static int Pairs(int n ){
        if(n==1 || n==2){
            return n;
        }

        int fnm1 = Pairs(n-1);

        int fnm2 = Pairs(n-2);
        int pairsWays = (n-1)*fnm2;

        int totalWays = fnm1+ pairsWays;

        return totalWays;

    }
    public static void main(String[] args) {
        int n =3;

        System.out.println(Pairs(n));
    }
}
