
import util.FileUtilV4;
import java.util.Random;
import java.util.Scanner;
import org.fusesource.jansi.AnsiConsole;

public class game {

    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        Hero herox = new Hero();
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String a;
        int ulang = 0;

        Scanner entry = new Scanner(System.in);

        herox.start();
        herox.rule();
        do {
            System.out.println("█████████████████████████████████████████████████████");
            System.out.println("█                                                                                █");
            System.out.println("█ 1. BATTLE                                                                      █");
            System.out.println("█ 2. HERO STATUS                                                                 █"); 
            System.out.println("█ 3. MARKET                                                                      █");
            System.out.println("█ 4. REST                                                                        █");
            System.out.println("█ 5. SAVE GAME                                                                   █");
            System.out.println("█ 6. EXIT                                                                        █");
            System.out.println("█                                  SELECT MENU                                   █");
            System.out.println("█████████████████████████████████████████████████████");
            a = entry.next();
            if (a.equals("1")) {
                herox.battle();

            } else if (a.equals("2")) {
                herox.heroStatus();
            } else if (a.equals("3")) {
                herox.market();
            } else if (a.equals("4")) {
                herox.rest();
            } else if (a.equals("5")) {
                FileUtilV4 futil = new FileUtilV4();
                String s1 = futil.openWriteFile("savegame.txt");
                System.out.println(s1);

                String txtFormat = "%s,%d,%d,%d,%d,%d,%d";

                String name = herox.getName();
                int attackDamage = herox.getAttackDamage();
                int numHealthPotions = herox.getNumHealthPotions();
                int experience = herox.getExperience();
                int lvl = herox.getLvl();
                int currentMoney = herox.getCurrentMoney();
                int days = herox.getDays();
                String s2 = futil.addWriteRecord(txtFormat, name, attackDamage, numHealthPotions, experience, lvl, currentMoney, days);
                System.out.println(s2);

                String s4 = futil.closeWriteFile();
                System.out.println(s4);
            }
        } while (!a.equals("6"));

    }
}
