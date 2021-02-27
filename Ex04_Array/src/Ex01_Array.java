//2차원 배열
public class Ex01_Array {

    public static void main(String[] args) {
        
        int[][] score = new int[3][2]; //3행2열

        score[0][0] = 100;
        score[0][1] = 200;
        
        score[1][0] = 300;
        score[1][1] = 400;
        
        score[2][0] = 500;
        score[2][1] = 600;
        
        //2차원 배열의 값을 출력하라 (for 2개)
        //행의 개수 : 배열이름.length >> socre.length
        //열의개수 (행마다 다를 수 있음) : 배열이름[0].length
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("socre[%d][%d]=%d\t", i, j, score[i][j]);
            }
            System.out.println();
        }
        
        int[][] score3 = new int[][] {
            {11,12},
            {13,14},
            {15,16}
        };
        
        //퀴즈
        //개선된 for문 2개를 통해서 socre3 배열의 값을 출력하세요
        for(int[] col : score3) { //col이 배열의 0,0 주소를 받음
            for(int value : col) {
                System.out.println("값 : " + value);
            }
        }
        
        
        
        
    }
}
