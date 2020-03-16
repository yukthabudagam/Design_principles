package design_Principles.design_Principles;

import java.util.Scanner;

public class MainCalc {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();int a = sc.nextInt(); int b = sc.nextInt();
        switch (x){
            case 1:
                AddCal add = new AddCal();
                add.addition(a,b);
                break;
            case 2:
                SubCal sub = new SubCal();
                sub.subtraction(a,b);
                break;
            case 3:
                MulCal mul = new MulCal();
                mul.multi(a,b);
                break;
            case 4:
                DivCal div = new DivCal();
                div.division(a,b);
                break;
        }
    }

}
