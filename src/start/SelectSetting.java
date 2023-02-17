package start;

import java.util.Scanner;

public class SelectSetting {

    Scanner sc = new Scanner(System.in);

    public int SelectSetting(){

        System.out.println("설치할 프로그램을 선택해주세요");
        System.out.println("1:STS , 2:JDK1.8");
        System.out.print(">>> : ");
        int s = sc.nextInt();
        System.out.println(s + "를 선택하셨습니다");
        return 0;
    }

}
