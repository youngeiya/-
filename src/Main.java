import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 입력받을 숫자 개수

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt(); // 각 숫자를 입력받기
            if (isTriangular(num)) { // 삼각수인지 확인
                System.out.println(1); // 삼각수일 때
            } else {
                System.out.println(0); // 삼각수가 아닐 때
            }
        }

        scanner.close();
    }

    // 삼각수인지 확인하는 함수 (O(N) 시간 복잡도)
    public static boolean isTriangular(int num) {
        int[] triNum = new int[45]; //최대 44개 삼각수 미리 계산하기
        for(int i = 1; i<45; i++){
            triNum[i] = i *(i+1)/2; // 삼각수 Tn = n * (n + 1) /2
        }
        // 세 개의 삼각수의 합으로 num을 표현하 수 있는지 확인하기
        for (int i = 1; i < 45; i++){
            for(int j =1; j<45; j++){
                for(int k =1; k<45; k++){
                    if(triNum[i] + triNum[j] + triNum[k] == num){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
