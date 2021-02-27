package day0119;

public class Ex12Printf {
    public static void main(String[] args) {
        //1. 10진법 정수('d'ecimal)
        int number = 12345;
        //A. 10진법 정수를 그대로 출력해라
        System.out.printf("1-A. [%d]\n", number);
        //B. 10진법 정수를 10자리 오른쪽 정렬해서 출력해라
        System.out.printf("1-B. [%10d]\n", number);
        //C. 10진법 정수를 3자리 오른쪽 정렬해서 출력해라
        //만약 출력해야할 내용이 우리가 지정할 자릿수보다 많으면
        //우리가 지정한 자릿수는 무시가 된다.
        System.out.printf("1-C. [%3d]\n", number);
        //D. 10진법 정수를 10자리 왼쪽 정렬해서 출력해라
        System.out.printf("1-D. [%-10d]\n", number);
        //E. 10진법 정수를 10자리 오른쪽 정렬하고 왼쪽 빈자리는 0으로 채워서 출력해라
        System.out.printf("1-E. [%010d]\n", number);
        
        //2. 16진법 정수 (he'x'adecimal)
        number = 95;
        //A. 16진법 정수를 그대로 출력하되 알파벳이 있으면 소문자로 출력해라
        System.out.printf("2-A. [%x]\n", number);
        //B. 16진법 정수를 그대로 출력하되 알파벳이 있으면 대문자로 출력해라
        System.out.printf("2-B. [%X]\n", number);
        //C. 16진법 정수를 8자리 왼쪽 정렬하고 알파벳이 있으면 소문자로 출력해라
        System.out.printf("2-C. [%-8x]\n", number);
        //D. 16진법 정수를 8자리 오른쪽 정렬하고 알파벳이 있으면 대문자로 출력해라
        System.out.printf("2-C. [%8X]\n", number);
        //E. 16진법 정수를 8자리 오른쪽 정렬하고 알파벳이 있으면 대문자로 출력하되
        //왼쪽 빈 자리는 0으로 채워라
        System.out.printf("2-C. [%08X]\n", number);
        
        //3. 실수('f'loat)
        // %f를 사용하지만 실제론 double, float 상관없다.
        double d = 12.345;
        //A. 실수를 그대로 출력해라 (소수점 6자리까지 출력됨)
        System.out.printf("3-A. [%f]\n", d);
        //B. 실수를 6자리로 출력해라
        System.out.printf("3-B. [%6f]\n", d);
        //C. 실수를 12자리로 출력해라
        System.out.printf("3-C. [%12f]\n", d);
        //D. 실수를 소수점 2번째 자리까지 출력해라
        System.out.printf("3-D. [%.2f]\n", d);
        //E. 실수를 소수점 2번째 자리까지 출력하고 총 6자리로 출력해라
        System.out.printf("3-E. [%6.2f]\n", d);
        
        //4. 스트링('S'tring)
        String str = new String("abcDEF");
        //A. 스트링을 그대로 출력해라
        System.out.printf("4-A. [%s]\n", str);
        //B. 스트링을 모두 대문자로 출력해라
        System.out.printf("4-B. [%S]\n", str);
        
        //printf를 사용할 때 알아두면 좋은 점
        //1. 출력할 내용을 여러가지 %문자를 사용해서 조합할 수 도 있다.
        System.out.printf("이름: %s, 총 가입일수 : %d일\n", "박주현", 1234);
        //2. 존재하지 않는 %문자를 사용하면 에러가 난다.
        //System.out.printf("%m\n", 1234);
        //3. %문자와 맞지 않는 값을 넘겨주면 에러가 난다.
        //System.out.printf("%d\n", 12.34);
        //4. %문자의 개수보다 넘겨주는 값의 개수가 많으면 문제가 없다.
        System.out.printf("%d %d %d \n", 1, 2, 3, 4, 5);
        //5. %문자의 개수가 넘겨주는 값의 개수보다 많으면 에러가 난다.
        //System.out.printf("%d %d %d \n", 1, 2);

    }
       
}
