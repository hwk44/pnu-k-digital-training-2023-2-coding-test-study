package 교재;

public class 거스름돈예시 {
    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int [] cointypes = {500,100,50,10}; //

        for(int i = 0; i < 4; i++) {
            cnt += n / cointypes[i];
            n  %= cointypes[i]; //
        }
        System.out.println(cnt);
    }
}
