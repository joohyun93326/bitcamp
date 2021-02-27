
public class Ex03_Cinema {

    public static void main(String[] args) {
        String[][] seat = new String[3][5];
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++) {
                // seat[i] 배열의 길이를 구한다
                // = i번째 행에 해당하는 열의 길이를 구한다
                
                seat[i][j] = "__"; // 좌석
                
            }
        }
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++) {
            
                System.out.print(seat[i][j]);
            }
            System.out.println();
        }
        
        // 좌석예매
        seat[2][1] = "홍길동";
        seat[0][0] = "김유신";
        
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++) {            
                System.out.printf("[%s]", seat[i][j].equals("__")?"좌석":"예매");
                // for문 돌면서 i행 j열에 __문자열이면 좌석
                // 다른 문자가 들어있으면 예매
                // 삼항연산자와 equals메소드 이용
            }
            System.out.println();
        }
        
        int row, col; //사용자 행 열 값을 받았다고 가정하고
        row = 2;
        col = 1;
        if(seat[row][col].equals("__")) {
            System.out.println("예약 가능한 좌석입니다");
        }else {
            System.out.println("이미 예약 되었습니다");
        }
        
        //좌석 초기화 (자주 쓰는 구문 함수 생성)
        for(int i = 0 ; i < seat.length ; i++) {
               for(int j = 0 ; j < seat[i].length ; j++) {
                   seat[i][j] ="__"; //좌석
               }
           }

   }

}