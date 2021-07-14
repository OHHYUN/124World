public class Main {
    public static void main(String[] args) {
        String answer = solution(6);
        System.out.println("answer = " + answer);
    }
    public static String solution(int n) {
        String answer = "";

        String [] a = {"4", "1", "2"};
        while(n>0){
            answer =  a[n%3] + answer;
            n = (n-1)/3;
        }
        return answer;
    }

}
