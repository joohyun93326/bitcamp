package day001;
//수학과 학생들의 기말고사 시험점수
//int[] score = new int[] {79,88,97,54,56,95};
//int max = score[0];  //max 변수 >> 79
//int min  = score[0]; //min  변수 >> 79

/*
제어문을 사용해서  max  라는 변수에 시험점수 최대값을
min  라는 변수에 시험점수 최소값을 담으세요
출력결과 : max > 97 , min > 54
단 for 문을 한번만 사용하세요 (max , min 하나의  for문)
*/
public class Test02 {
    public static void main(String[] args) {
        
        int[] score = {79, 88, 97, 54, 56, 95};
        
        int max = score[0];
        int min = score[0];
        
        for (int i = 1; i < score.length; i++) {
            
            max = (score[i] > max) ? score[i] : max;
            min = (score[i] < min) ? score[i] : min;
                   
        }
        
        System.out.printf("max : %d , min : %d", max, min);
        
        
        
        }
        
        
    }


