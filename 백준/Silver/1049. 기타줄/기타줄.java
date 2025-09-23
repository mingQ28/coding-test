import java.util.*;
import java.io.*;

// 문제: 필요한 기타줄 N개를 사기 위해 최소 비용 계산
// 접근: 패키지(6개)와 낱개 가격 중 최저 가격을 이용해 혼합 구매, 패키지 단독 구매, 낱개 단독 구매를 비교

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
        // t[0]: 필요한 줄 수 N, t[1]: 브랜드 수 M

        int minP = 0; // 최저 패키지 가격
        int minI = 0; // 최저 낱개 가격

        // 브랜드별 가격 입력 및 최저 가격 찾기
        for(int i = 0; i < t[1]; i++){
            int[] brand = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            // brand[0]: 패키지 가격, brand[1]: 낱개 가격

            if(i == 0){ // 첫 브랜드 입력 시 초기화
                minP = brand[0];
                minI = brand[1];
            }
            minP = Math.min(minP, brand[0]); // 최저 패키지 가격 갱신
            minI = Math.min(minI, brand[1]); // 최저 낱개 가격 갱신
        }

        // 1) 패키지+낱개 혼합 구매 비용
        int sum1 = (t[0] / 6) * minP + (t[0] % 6) * minI;
        // 2) 패키지 단독 구매 비용 (필요 개수 맞추기 위해 +1 패키지)
        int sum2 = ((t[0] / 6) + 1) * minP;
        // 3) 낱개 단독 구매 비용
        int sum3 = t[0] * minI;

        // 세 가지 경우 중 최소 비용 선택
        int sum = Math.min(Math.min(sum1, sum2), sum3);

        System.out.println(sum);
    }
}
