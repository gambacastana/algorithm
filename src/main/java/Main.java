public class Main {

    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int coin : coinTypes) {
            cnt += n / coin;
            System.out.println("cnt:"+cnt);
            n %= coin;
        }

        System.out.println("total:"+cnt);
    }

}
