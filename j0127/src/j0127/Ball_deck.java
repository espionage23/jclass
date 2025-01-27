package j0127;

import java.util.Scanner;

public class Ball_deck {
    Scanner scan = new Scanner(System.in);
    Ball[] b = new Ball[45];

    int[] lottoNumbers;
    int[] userNumbers;
    int matchCount;

    public Ball_deck() {
        balls();
        shuffle();
    }

    void balls() {
        for(int i=0; i<45; i++) {
            b[i] = new Ball(i+1);
        }
    }

    void shuffle() {
        for(int i=0; i<300; i++) {
            int ranNum = (int)(Math.random()*45);
            Ball temp = b[0];
            b[0] = b[ranNum];
            b[ranNum] = temp;
        }
    }

    int[] lotto() {
        lottoNumbers = new int[6];
        for(int i=0; i<6; i++) {
            lottoNumbers[i] = b[i].getNumber();
        }
        return lottoNumbers;
    }

    int[] input() {
        userNumbers = new int[6];
        for(int i=0; i<6; i++) {
            System.out.printf("%d번째 번호를 입력하세요 >> ", i+1);
            userNumbers[i] = scan.nextInt();
        }
        return userNumbers;
    }

    void match() {
        matchCount = 0;
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                if(userNumbers[i] == lottoNumbers[j]) {
                    matchCount++;
                    break;
                }
            }
        }
    }

    public int count() {
        return matchCount;
    }







}
