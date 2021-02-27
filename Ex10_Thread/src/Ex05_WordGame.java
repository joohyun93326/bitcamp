import javax.swing.JOptionPane;

//단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하고 싶어요
//hint) 공유자원

class WordInputProcess extends Thread{
    @Override
    public void run() {
        String dan="2";
        String inputdata = JOptionPane.showInputDialog(dan + "단 값을 입력");
        if(inputdata != null && !inputdata.equals("")) {
            Ex05_WordGame.inputcheck=true; //값을 변경
            //System.out.println(Ex05_WordGame.inputcheck);
        }
        System.out.println("입력한 값은 : " + inputdata);
    }
}

class WordTimeOut extends Thread{
    @Override
    public void run() {
        for(int i = 10 ; i > 0 ; i--) {
            
            if(Ex05_WordGame.inputcheck)return; //run함수 빠져나가는 것은 stack 종료
            System.out.println("남은 시간 :" + i);
            try {
                Thread.sleep(1000);//대기실에서 1초간 쉬었다가 다시 일하기
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Ex05_WordGame {
    static boolean inputcheck =false; //공유
    public static void main(String[] args) {
        //공유자원
        
        WordInputProcess word = new WordInputProcess();
        WordTimeOut time = new WordTimeOut();
        
        word.start();
        time.start();
        
        try {
            //join() :   다른 스레드의 종료를 휴게실에서 기다림 
            //join 요청한 스레드가 종료되면 그 때 동작 ! 
            word.join(); //main에게 word 끝날 때까지 기다려 줄래 ?
            time.join(); //main에게 time 끝날 때까지 기다려 줄래 ?
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        System.out.println("Main END");

    }

}
