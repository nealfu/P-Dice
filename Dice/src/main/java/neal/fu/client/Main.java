package neal.fu.client;

import neal.fu.domain.*;

/**
 * @author neal.fu
 */
public class Main {
    public static  void main(String... args) {
        inspectDices(15, 6, 5);
   //     inspectDices(20, 6, 7, 8, 11);
    }

    private static void inspectDices(int steps, int... sidesList) {
        Dices dices = new Dices();

        for (int sides : sidesList) {
            dices.add(new Dice(sides));
        }

        System.out.println("几个骰子投一次出各种点数的几率");
        Chances oneRollChances = dices.oneRollChances();
        System.out.print(oneRollChances.toString());
        System.out.println("几率最大的点数: " + oneRollChances.getPointsOfMaxChance());

        System.out.println("-----------------------------------------------------");

        System.out.println("几个骰子投出各种点数和的几率，不限次数");
        Chances multipleRollChances = dices.multipleRollChances(steps);
        System.out.print(multipleRollChances.toString());
        System.out.println("几率最大的点数: " + multipleRollChances.getPointsOfMaxChance());
    }

}
