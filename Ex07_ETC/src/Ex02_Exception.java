
public class Ex02_Exception {

    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        System.out.println("main Start");
        
        try {
            for(int i = 0; i < 10; i++) {
                result = num / (int)(Math.random()*10); //0~9 
                System.out.println("result : " + result + " i : " + i);
            }
        }catch (ArithmeticException e) { //하위 예외(구체화, 특수화) 가독성 좋다.
            System.out.println("문제 발생 로그 기록 .. 관자에게 메일 발송 ");
            System.out.println("원인 : " + e.getMessage());
        }catch (NullPointerException e) {
            //TODO : handle exception
        }catch (Exception e) {
            //ArithmeticException 아니고 NullPointerException아닌 예외는 니가 다 해결
            //Exception 만 써도 되지만 가독성을 위해 하위 예외도 써주는 것이 좋다. 
        }
        
        System.out.println("main end");


    }

}
