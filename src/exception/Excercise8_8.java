package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise8_8 {
    public static void main(String[] args) {
        int answer = (int) ((Math.random()*100)+1);
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.print("1과 100 사이의 값 입력 : ");

            try {
                input = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
                //input = new Scanner(System.in).nextInt();
                continue;
            }
            if(answer > input) {
                System.out.println("더 큰 수 입력하기");
            } else if (answer < input) {
                System.out.println("더 작은 수 입력하기");
            } else {
                System.out.println("맞췄습니다");
                System.out.println("시도횟수는 " + count + "번 입니다");
                break; //do-while문 종료
            }

        } while (true);
    }
}
