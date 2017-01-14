
import util.FileUtilV4;

import java.util.Random;
import java.util.Scanner;
import util.RpgUtil ;

public class Hero {

    private String name;
    private String namex;
    private int health = 100;
    private int attackDamage = 40;
    private int numHealthPotions = 2;
    private int healthPotionHealAmount = 30;
    private int experience = 0;
    private int experienceUp = 0;
    private int lvl = 1;
    private int enemyHealth;
    private int enemyblood = 75;
    private int enemyGotDamage;
    private int getHeroExp = 20;
    private int lanjut;
    private String a;
    private String ok;
    private int bossHp = 120;
    private int bossDamage = 50;
    private String wo;
    private int ya;
    private int currentMoney = 100;
    private String market;
    private int days = 1;
    private String ab;
    private String lol;
    private String menu;

    Scanner entry = new Scanner(System.in);
    Scanner huruf = new Scanner(System.in);
    Random rand = new Random();
    enemy enemy = new enemy();
  
    
    
    
    public void character(String name,int attackDamage,int numHealthPotions, int exprience,int lvl , int currentMoney,int days) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.numHealthPotions = numHealthPotions;
        this.experience = exprience;
        this.lvl = lvl;
        this.currentMoney = currentMoney;
        this.days = days;
    }
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public void start() {
       
        System.out.println(RpgUtil.ANSI_BLUE+"████████████████████████████████████████████████████");
        System.out.println(RpgUtil.ANSI_BLUE+"█              █───█─▄▀▀─█───▄▀▀─▄▀▀▄─█▄─▄█─▄▀▀              █\n" +
ANSI_BLUE+"█              █───█─█───█───█───█──█─█▀▄▀█─█──              █\n" +
ANSI_BLUE+"█              █───█─█▀▀─█───█───█──█─█─▀─█─█▀▀              █\n" +
ANSI_BLUE+"█              █▄█▄█─█───█───█───█──█─█───█─█──              █\n" +
ANSI_BLUE+"█              ─▀─▀───▀▀──▀▀──▀▀──▀▀──▀───▀──▀▀              █\n" +
ANSI_BLUE+"████████████████████████████████████████████████████"                );
        
    
        
        System.out.println(RpgUtil.ANSI_BLUE+"                                                                      \n" +
ANSI_BLUE+"                                                                      \n"+
ANSI_BLUE+"                                                                      \n"+
ANSI_BLUE+"                                        .::.                          \n"+
ANSI_BLUE+"                                      .;:**'                          \n"+
ANSI_BLUE+"                                      `                               \n"+
ANSI_BLUE+"          .:XHHHHk.              db.   .;;.     dH  MX                \n"+
ANSI_YELLOW+"        oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN     \n"+
ANSI_BLUE+"        QMMMMMb  'MMX       MMMMMMP !MX' :M~   MMM MMM  .oo. XMMM 'MMM\n"+
ANSI_YELLOW+"          `MMMM.  )M> :X!Hk. MMMM   XMM.o'  .  MMMMMMM X?XMMM MMM>!MMP\n"+
ANSI_BLUE+"           'MMMb.dM! XM M'?M MMMMMX.`MMMMMMMM~ MM MMM XM `' MX MMXXMM \n"+
ANSI_YELLOW+"            ~MMMMM~ XMM. .XM XM`'MMMb.~*?**~ .MMX M t MMbooMM XMMMMMP \n"+
ANSI_BLUE+"             ?MMM>  YMMMMMM! MM   `?MMRb.    `'''   !L'MMMMM XM IMMM  \n"+
ANSI_YELLOW+"              MMMX   'MMMM'  MM       ~%:           !Mh.''' dMI IMMP  \n"+
ANSI_BLUE+"              'MMM.                                             IMX   \n"+
ANSI_YELLOW+"               ~M!M                                             IMP   \n"+
ANSI_BLUE+"                                                                      \n"+
ANSI_BLUE+"                                                                      \n"+
ANSI_BLUE+"                                 POKEMON-BLASH                        \n"+
ANSI_BLUE+"                                                                      \n"+
ANSI_BLUE+"                                                                      \n"+
ANSI_BLUE+"                                                                        " );
        
        System.out.println("█████████████████████████████████████████████████████");
        
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Menu Guide");
        System.out.println("                                      SELECT MENU                                  ");
      
        System.out.println("█████████████████████████████████████████████████████");
        lol = huruf.nextLine();
        System.out.println("Hello, I'm Professor Anderson Tree, but some people call me the Pokemon Professor \n" +
"In the world of Pokemon, people and Pokemon live and work together \n" +
"They form strong bonds together through training and Pokemon battles \n" +
"It seems you've decided to begin your own Pokemon journey. Open this Package! This Will Help You & Take Care For Me. See You");
        System.out.println("");
        if (lol.equals("1")) {
            System.out.println("Nickname :  ");
            namex = entry.nextLine();
            this.name = namex;
        }  if (lol.equals("2")) {
            FileUtilV4 futil = new FileUtilV4();
            String s1 = futil.openReadFile("savegame.txt");
            System.out.println(s1);
//            String name = "";
//            int attackDamage = 0;
//            int numHealthPotions = 0;
//            int experience = 0;
//            int lvl = 0;
//            int currentMoney = 0;
//            int days = 1;
            while (futil.getReadScanner().hasNext()) {
                String[] readLine = futil.getReadScanner().next().split(",");

                String name = readLine[0];
                int attackDamage = Integer.parseInt(readLine[1]);
                int numHealthPotions = Integer.parseInt(readLine[2]);
                int experience = Integer.parseInt(readLine[3]);
                int lvl = Integer.parseInt(readLine[4]);
                int currentMoney = Integer.parseInt(readLine[5]);
                int days = Integer.parseInt(readLine[6]);

                System.out.println("reading name             = " + name);
                System.out.println("reading attackdamage     = " + attackDamage);
                System.out.println("reading current health potions= " + numHealthPotions);
                System.out.println("reading experience       = " + experience);
                System.out.println("reading level            = " + lvl);
                System.out.println("reading money            = " + currentMoney);
                System.out.println("days                     = " + days);
            
                character(name,attackDamage,numHealthPotions,experience,lvl,currentMoney,days);
            }
            String s3 = futil.closeReadFile();
            System.out.println(s3);
            System.out.println("Game loaded . . .\n");
        }
         if (lol.equals("3")) {
            System.out.println("|-----------------------------|||-----------|||------------------------------|\n" +
"|                             ||| Help Menu |||                              |\n" +
"|                             |||-----------|||                              |\n" +
"|                                                                            |\n" +
"| Type Advantages: GRASS beats WATER, WATER beats FIRE, FIRE beats GRASS     |\n" +
"|                                                                            |\n" +
"| In battle, a Pokemon with a type advantage over the other will do          |\n" +
"| 2x damage. If the Pokemon has a type disadvantage, they do 0.5 damage.     |\n" +
"| Finally, two Pokemon of the same type do normal damage to each other.      |\n" +
"|                                                                            |\n" +
"| After every battle, your Pokemon is automatically healed.                  |\n" +
"|                                                                            |\n" +
"| If your Pokemon faints, the battle ends and your Pokemon is still          |\n" +
"| automatically healed.                                                      |\n" +
"|                                                                            |\n" +
"| The Atk stat is how much damage a Pokemon does.                            |\n" +
"| The attacker's Atk stat minus the victim's Def stat determines the actual  |\n" +
"| damage done to the victim.                                                 |\n" +
"|                                                                            |\n" +
"| The Spd stat determines which Pokemon attacks first in battle.             |\n" +
"| The Pokemon with the higher Spd stat attacks first.                        |\n" +
"|---------|------------------------------------------------------------------|\n" +
"|   Back  |                                                                  |\n" +
"|---------|------------------------------------------------------------------|  " );
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Menu Guide");
        System.out.println("█████████████████████████████████████████████████████");
             System.out.println("Hello, I'm Professor Joshua Tree, but some people call me the Pokemon Professor \n" +
"                                In the world of Pokemon, people and Pokemon live and work together \n" +
"                                They form strong bonds together through training and Pokemon battles \n" +
"                                It seems you've decided to begin your own Pokemon journey.                                ");
         lol = huruf.nextLine();
            this.name = namex;
             if (lol.equals("1")) {
                 
            System.out.println("Nickname : ");
            namex = entry.nextLine();
            this.name = namex;
        }  if (lol.equals("2")) {
            FileUtilV4 futil = new FileUtilV4();
            String s1 = futil.openReadFile("savegame.txt");
            System.out.println(s1);
//            String name = "";
//            int attackDamage = 0;
//            int numHealthPotions = 0;
//            int experience = 0;
//            int lvl = 0;
//            int currentMoney = 0;
//            int days = 1;
            while (futil.getReadScanner().hasNext()) {
                String[] readLine = futil.getReadScanner().next().split(",");

                String name = readLine[0];
                int attackDamage = Integer.parseInt(readLine[1]);
                int numHealthPotions = Integer.parseInt(readLine[2]);
                int experience = Integer.parseInt(readLine[3]);
                int lvl = Integer.parseInt(readLine[4]);
                int currentMoney = Integer.parseInt(readLine[5]);
                int days = Integer.parseInt(readLine[6]);

                System.out.println("reading name             = " + name);
                System.out.println("reading attackdamage     = " + attackDamage);
                System.out.println("reading current health potions= " + numHealthPotions);
                System.out.println("reading experience       = " + experience);
                System.out.println("reading level            = " + lvl);
                System.out.println("reading money            = " + currentMoney);
                System.out.println("days                     = " + days);
            
                character(name,attackDamage,numHealthPotions,experience,lvl,currentMoney,days);
            }
            String s3 = futil.closeReadFile();
            System.out.println(s3);
            System.out.println("Game loaded . . .\n");
    }            

}
    }
    //rule
    public void rule() {
        System.out.println("              |||-----------------------------------------|||\n" +
"	      ||| Congrats! You Got Charizard / Lizardon  |||\n" +
"	      |||-----------------------------------------|||");
        System.out.println("█████████████████████████████████████████████████████");
        System.out.println("                   .\"-,.__\n" +
"                 `.     `.  ,\n" +
"              .--'  .._,'\"-' `.\n" +
"             .    .'         `'\n" +
"             `.   /          ,'\n" +
"               `  '--.   ,-\"'\n" +
"                `\"`   |  \\\n" +
"                   -. \\, |                                                       Lizardon/Charizard - リザードン\n" +
"                    `--Y.'      ___.                                            Nickname : Charizard ( Flame Pokémon )\n" +
"                         \\     L._, \\                                       Number Index : #006 \n" +
"               _.,        `.   <  <\\                _                               Type : Fire , Flying\n" +
"             ,' '           `, `.   | \\            ( `                         Abilities : Blaze , Solar Power \n" +
"          ../, `.            `  |    .\\`.           \\ \\_                          Gender : 87.5% male, 12.5% female\n" +
"         ,' ,..  .           _.,'    ||\\l            )  '\".                       Height : 5'07 , 1.7 m \n" +
"        , ,'   \\           ,'.-.`-._,'  |           .  _._`.                      Health : 100 Hp\n" +
"      ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\              Attack Damage : 40 ATK \n" +
"    .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.\n" +
"    |  '          ..         `-...-\"  |  `-'      / /        . `.\n" +
"    | /           |L__           |    |          / /          `. `.\n" +
"   , /            .   .          |    |         / /             ` `\n" +
"  / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\\n" +
" / .           \\\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`.         Charizard is a Power-type playable character in Pokkén\n" +
".  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\        Moves it can use include Flamethrower, Fire Punch, Flare Blitz, and Seismic Toss.\n" +
"' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`        Upon entering Synergy Burst, \n" +
"|'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\       it Mega-Evolves into Mega Charizard X and can use the Burst Attack Searing Blaze.\n" +
"||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|\n" +
"||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||\n" +
"|| '              V      / /           `   | `   ,'   ,' '.    !  `. ||\n" +
"||/            _,-------7 '              . |  `-'    l         /    `||\n" +
". |          ,' .-   ,' ||               | .-.        `.      .'     ||\n" +
" `'        ,'    `\".'    |               |    `.        '. -.'       `'\n" +
"          /      ,'      |               |,'    \\-.._,.'/'\n" +
"          .     /        .               .       \\    .''\n" +
"        .`.    |         `.             /         :_,'.'\n" +
"          \\ `...\\   _     ,'-.        .'         /_.-'\n" +
"           `-.__ `,  `'   .  _.>----''.  _  __  /\n" +
"                .'        /\"'          |  \"'   '_\n" +
"               /_|.-'\\ ,\".             '.'`__'-( \\\n" +
"                 / ,\"'\"\\,'               `/  `-.|\"");
        System.out.println("█████████████████████████████████████████████████████");
        System.out.println("  _ _|    \\ |       __|  _ _|   _ \\    __|       __|     \\      \\  |   __| \n" +
"    |    .  |     \\__ \\    |    |  |   _|       (_ |    _ \\    |\\/ |   _|  \n" +
"  ___|  _|\\_|     ____/  ___|  ___/   ___|     \\___|  _/  _\\  _|  _|  ___| \n" +
"                                                                           ");
        System.out.println("█████████████████████████████████████████████████████");
        System.out.println("1. Lizardon/Charizard - リザードン Now is Your Pokédex , Bag Items : 2 Health Potion "
                + "each potion =  +30 HP ");
        System.out.println("2. Most of enemys health : 75 HP\n"+ 
                           "           enemys attack : 25 ATK \n"+
                           "           and each enemey dead you got 20 EXP ");
        System.out.println("3.Boss health are 120Hp, Boss attack are 50");
        System.out.println(" ");
        System.out.println("                            ___ ___ _     ___ ___  _         \n" +
"                         /\\  |   | |_ |\\ | |   |  / \\ |\\ |   \n" +
"                        /--\\ |   | |_ | \\| |  _|_ \\_/ | \\|");
        System.out.println(" ");
        System.out.println("                    HP Cannot > 100 , Even you use Potion.\n"+
        "                    You are level up after you got 40 xp. \n"+
        "                    You will Go - BOSS RAID in level 4.");
        System.out.println(" ");
        System.out.println("Ready To Play ? \n1.Yes Sure , Lets Go ");
        ok = entry.nextLine();

    }

    //rest
    public void rest() {
        System.out.println("You take a nap.");
        RpgUtil.delay(3000);
        System.out.println("You are awake.");
        System.out.println("Now are days-" + days);
        days++;
        System.out.println("Your blood have been refealed");
        health = 100;
        System.out.println("You got a potion");
        numHealthPotions++;
    }

    //herostatus
    public void heroStatus() {
        System.out.println("                   .\"-,.__\n" +
"                 `.     `.  ,\n" +
"              .--'  .._,'\"-' `.\n" +
"             .    .'         `'\n" +
"             `.   /          ,'\n" +
"               `  '--.   ,-\"'\n" +
"                `\"`   |  \\\n" +
"                   -. \\, |                                                       Lizardon/Charizard - リザードン\n" +
"                    `--Y.'      ___.                                            Nickname : Charizard ( Flame Pokémon )\n" +
"                         \\     L._, \\                                       Number Index : #006 \n" +
"               _.,        `.   <  <\\                _                               Type : Fire , Flying\n" +
"             ,' '           `, `.   | \\            ( `                         Abilities : Blaze , Solar Power \n" +
"          ../, `.            `  |    .\\`.           \\ \\_                          Gender : 87.5% male, 12.5% female\n" +
"         ,' ,..  .           _.,'    ||\\l            )  '\".                       Height : 5'07 , 1.7 m \n" +
"        , ,'   \\           ,'.-.`-._,'  |           .  _._`.                      \n" +
"      ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\                  \n" +
"    .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.\n" +
"    |  '          ..         `-...-\"  |  `-'      / /        . `.\n" +
"    | /           |L__           |    |          / /          `. `.\n" +
"   , /            .   .          |    |         / /             ` `\n" +
"  / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\\n" +
" / .           \\\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`.         Charizard is a Power-type playable character in Pokkén\n" +
".  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\        Moves it can use include Flamethrower, Fire Punch, Flare Blitz, and Seismic Toss.\n" +
"' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`        Upon entering Synergy Burst, \n" +
"|'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\       it Mega-Evolves into Mega Charizard X and can use the Burst Attack Searing Blaze.\n" +
"||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|\n" +
"||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||\n" +
"|| '              V      / /           `   | `   ,'   ,' '.    !  `. ||\n" +
"||/            _,-------7 '              . |  `-'    l         /    `||\n" +
". |          ,' .-   ,' ||               | .-.        `.      .'     ||\n" +
" `'        ,'    `\".'    |               |    `.        '. -.'       `'\n" +
"          /      ,'      |               |,'    \\-.._,.'/'\n" +
"          .     /        .               .       \\    .''\n" +
"        .`.    |         `.             /         :_,'.'\n" +
"          \\ `...\\   _     ,'-.        .'         /_.-'\n" +
"           `-.__ `,  `'   .  _.>----''.  _  __  /\n" +
"                .'        /\"'          |  \"'   '_\n" +
"               /_|.-'\\ ,\".             '.'`__'-( \\\n" +
"                 / ,\"'\"\\,'               `/  `-.|\"");
        System.out.println("Name: " + name);
        System.out.println("N-Pokedex : Charizard");
        System.out.println("Health : " + health);
        System.out.println("AttackDamage :" + attackDamage);
        System.out.println("Level :" + lvl);
        System.out.println("Experience :" + experience);
        System.out.println("Potion: " + numHealthPotions);
        System.out.println("Money: " + currentMoney + " peso ");
        System.out.println("Day-" + days);
        System.out.println(" ");
    }

    //enemyhealth
    public void getMaxenemyHealth() {
        enemyHealth = enemy.getMaxEnemyHealth();
    }

    //market
    public void market() { 
        System.out.println("                                           .-.__\n" +
"                                          (     `-.\n" +
"                                           [`--.__ )\n" +
"                                           | ][  ]/\n" +
"                                          .--.][_|\n" +
"                                         /        `----.______\n" +
"                     _.-----------------'                     `---------------.\n" +
"                   .'                                                          \\\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                   |                                                            |\n" +
"                    \\                                                           |\n" +
"                     `-._______________                  _.-------._            |\n" +
"                      | |              `-.   .----------'           `.          |\n" +
"                      | |   _________     \\ / __________       _______\\         |\n" +
"                      | |  |   |||   |     Y |/////\\\\\\\\\\|     |   |||  `.      /\n" +
"                      | |  |   |||   |     | |/////\\\\\\\\\\|     |   |||   |`-.__/\n" +
"                      | |  |____|____|       |/////\\\\\\\\\\|     |____|____|   | |\n" +
"  VK                  | |  | ,,,| \\  |       |////  \\\\\\\\|     |  / | \\  |   | |\n" +
"                      | |  |(o o|  \\ |       |///\\  /\\\\\\|     | /  |  \\ |   | |\n" +
"                      | |  |____|____|       |////\\/\\\\\\\\|     |____|____|   | |\n" +
"`-------._______      | |  |/   |,,, |       |o==//\\\\\\\\\\|     | \\  |  / |   | |____.---------\n" +
"                `----.| |__|.---|o o)|       |@////\\\\\\\\\\|     |  \\_|__.------'\n" +
"               _.------'          `--+------.|/////\\\\\\\\\\|_.---+--'\n" +
"----.___.-----'                                                                _________.----\n" +
"                             _.------------.________________.-----------------'");
        System.out.println("█████████████████████████████████████████████████████");
        System.out.println("1.Potion I (+30Hp) For  50 Peso                                                       ");
        System.out.println("2.Upgrade Your Pokedex damage(+10) + Training  For 300 Peso                           ");
        System.out.println("");
        System.out.println("                                   SELECT THE OPTION                                  ");
        System.out.println("");
        System.out.println("█████████████████████████████████████████████████████");
        market = huruf.nextLine();
        if (market.equals("1")) {
        System.out.println("1.Purchase ,\n2. No , Maybe Later ,\n3. Exit From Market                              ");
        System.out.println("                                   SELECT THE OPTION                                  ");
        System.out.println("");
        System.out.println("█████████████████████████████████████████████████████");
            ab = huruf.nextLine();
            if (ab.equals("1")) {
                if (currentMoney - 50 >= 0) {
                    numHealthPotions++;
                    currentMoney = currentMoney - 50;
                    if (currentMoney <= 0) {
                        currentMoney = 0;
                    }
                    System.out.println("You Success To Purchase a Potion, Your Current Potion: " + numHealthPotions);
                }
            } else if (currentMoney - 50 < 0) {
                System.out.println("Your Money Was Not Enough, Go out and Fight For Money!");
            }
        } else if (market.equals("2")) {
            System.out.println("1.Purchase ,\n2. No , Maybe Later ,\n3. Exit From Market ");
            System.out.println("                                   SELECT THE OPTION                                  ");
            System.out.println("█████████████████████████████████████████████████████");
            ab = huruf.nextLine();
            if (ab.equals("1")) {
                if (currentMoney - 300 >= 0) {
                    attackDamage = attackDamage + 10;
                    currentMoney = currentMoney - 300;
                    if (currentMoney <= 0) {
                        currentMoney = 0;
                    }
                    System.out.println("You Success to Purchase ,Now Your Pokedex More Strength - Built it Up Again ");
                    System.out.println("Your Pokedex Current Damage: " + attackDamage);
                } else if (currentMoney - 300 < 0) {
                    System.out.println("Your Money Was Not Enough, Go out and Fight For Money!");
                }
            }
        }
    }

    //battle
    public void battle() {
        lanjut = 1;
        System.out.println(" |----------------------------------------------------------------------------------|\n"+
                           " |                            ENEMY HAS FOUNDED                                     |\n"+
                           " |----------------------------------------------------------------------------------|");       
        System.out.println(" | Enemy Name :" +enemy.getName());
        System.out.println(" | Enemy HP   :" +enemy.getMaxEnemyHealth());
        System.out.println(" |----------------------------------------------------------------------------------|");
        enemyblood = 75;
        while (enemyblood > 0 && lanjut == 1) {
            System.out.println(" |                               SELECT THE OPTION                                  |\n"+
                               " |------------|------------------|---------|------------------------|---------------|\n"+
                               " |   ATK : 1  | Drink Potion : 2 | RUN: 3  |                        |               |\n"+
                               " |------------|------------------|---------|------------------------|---------------|");
            Scanner n = new Scanner(System.in);
            menu = entry.next();
            if (menu.equals("1")) {
                int damageTaken = enemy.getEnemyAttackDamage();
                enemyblood = enemyblood - attackDamage;
                health -= damageTaken;
                enemyGotDamage = attackDamage;
                if (health <= 0) {
                    health = 0;
                }

                if (enemyblood <= 0) {
                    enemyblood = 0;
                }
                System.out.println(" |----------------------------------------------------------------------------------|\n"+
                                   " |                            BATTLE                                                |\n"+
                                   " |----------------------------------------------------------------------------------|");       
                System.out.println(" | Enemy Name  :"  +enemy.getName());
                System.out.println(" | Enemy HP    :"  +enemy.getMaxEnemyHealth());
                System.out.println(" |----------------------------------------------------------------------------------|");
                System.out.println(" | Deal Damage :"  + enemyGotDamage + " " + "Great !");
                System.out.println(" | Damage Taken:"  + damageTaken + " In Retaliation !");
                System.out.println(" |----------------------------------------------------------------------------------|");
                System.out.println(" | Enemy Health: " + enemyblood);
                System.out.println(" | Hero  Health: " + health);
                System.out.println(" |----------------------------------------------------------------------------------|");

                if (health < 1) {
             
                System.out.println(" | You Have Taken Too Much Damage, You Are Too Weak To Go On!");
                System.out.println(" |----------------------------------------------------------------------------------|");
                System.exit(0);
                }
            } else if (menu.equals("2")) {
                if (numHealthPotions > 0) {
                    health += healthPotionHealAmount;
                    numHealthPotions--;
                    if (health > 100) {
                        health = 100;
                    }
               
                System.out.println(" | Drinking. HP : +" + healthPotionHealAmount + " Healing ");
                System.out.println(" | Hero Health  : "  + health + "  Healed  ");
                System.out.println(" | HP Unit      : "   + numHealthPotions + " ");
                System.out.println(" |----------------------------------------------------------------------------------|");

                } else {
                System.out.println("   Oops Sorry , Your Health Potion Unit : 0 , Fight Again To Get HP                  ");
                System.out.println(" |----------------------------------------------------------------------------------|");

                }
            } else if (menu.equals("3")) {
                System.out.println(" | Enemy Name  :"  + enemy.getName() + " Run ! Come Back Again & Defeat The Enemies  ");
                System.out.println(" |----------------------------------------------------------------------------------|");
                lanjut = 0;
            }
            if (enemyblood < 1) {
                System.out.println("                  |||------------------------------------------------|||\n" +
                                   "	          |||      Congratulations! You Kill The Enemy       |||\n" +
                                   "	          |||------------------------------------------------||| ");
                System.out.println(" | EXP  : + " + getHeroExp + " Experience ");
                experience = experience + getHeroExp;
                System.out.println(" | Current EXP : " + experience + " Experience ");
                System.out.println(" | Level : " + lvl);
                System.out.println(" | Congrats ! You Got Health Potion ");
                numHealthPotions++;
                System.out.println(" | Money :  " + currentMoney );
                currentMoney = currentMoney + 50;
                System.out.println(" | My Day : " + days);
                days++;
                System.out.println(" |----------------------------------------------------------------------------------|");
                experienceUp = lvl * 40;
                if (experience >= experienceUp) {
                System.out.println("                  |||-----------------------------------------|||\n" +
                                   "	          |||    Congratulations! You Are LEVEL UP    |||\n" +
                                   "	          |||-----------------------------------------||| ");
                    lvl++;
                System.out.println(" | Current Level : " + lvl);
                    health = health + 20;
                System.out.println(" |----------------------------------------------------------------------------------|");    
                }
                if (lvl >= 4) {
                    System.out.println("                  |||-----------------------------------------|||\n              " +
                                       "	          |||    Congratulations! You Are LEVEL UP    |||\n              " +
                                       "	          |||-----------------------------------------|||\n              " +
                                       "                  |||         !!!!  BOSS RAID  !!!!           |||\n              " +
                                       "                  |||-----------------------------------------|||\n              ");
                    
                    health = 100;
                    lvl = 4;
                    System.out.println("█████████████████████████████████████████████████████");
                }

                //Boss
                if (lvl == 4) {
                    lanjut = 1;
                    System.out.println("                                             @@        \\n\" +\n" +
"\"  @@,                                        @  @@      \\n\" +\n" +
"\" ,   @,                                       @   @  @@ \\n\" +\n" +
"\" @     @                                       @   @,,,@\\n\" +\n" +
"\" @      @,                                 ,@@@@@   @,,@                 Nickname : LUGIA ( Diving Pokemon )\\n\" +\n" +
"\",         @@,    ,,,                       @,,,,@   @@@                             Number Index : #249 \\n\" +\n" +
"\"@       ,    @@@@   @,                      @@,@@@   @                                          Type : Psychic	Flying\\n\" +\n" +
"\"@        ,            @                       @@@@   @                                     Abilities : Pressure \\n\" +\n" +
"\" @        ,            ,                         @    @                                        Gender : Genderless\\n\" +\n" +
"\"  @@       ,@          @                         @    @                                       Height : 17'01 / 5.2m \\n\" +\n" +
"\" @@@@@,      @,         @                        @    @                                          Health : 120 Hp \\n\" +\n" +
"\" @   @@@,      @        @  ,@,                   @    @                                      Attack Damage : 50 ATK \\n\" +\n" +
"\" @      @@      ,        @ @,@   ,@             @     @ \\n\" +\n" +
"\"  ,       @,     ,     @ @ @@,@  @,@ ,@         @     @ \\n\" +\n" +
"\"  @         ,         @,@@  @,@  @,@ @,@  @     @     @ \\n\" +\n" +
"\"   @@@            @   @,,@,  @,@@@,@,@,@ @,@   @      @ \\n\" +\n" +
"\"    @ @@,          ,   @,@@ @@@@  @ @ ,@@@,@  @       @ \\n\" +\n" +
"\"   @           @@@ @   @@,@@  @,,     @  @,@@@       @  \\n\" +\n" +
"\"   @        @@@   @@,   @,@@                 ,, @@@  @  \\n\" +\n" +
"\"    @    @@@        @   @@,                   @,,@   @  \\n\" +\n" +
"\"     @@@@           @  ,                      @@@@   @  \\n\" +\n" +
"\"                    @ ,                     @,,,@   @   \\n\" +\n" +
"\"                    , @              @,,@@ @@@@@    @   \\n\" +\n" +
"\"                     @          @@@   @@,,,@        @   \\n\" +\n" +
"\"                     @          @@,,@   @@@@@      @    \\n\" +\n" +
"\"                    ,            @@@,,@            @                                         Lugia - ルギア   \\n\" +                  \n" +
"\"                    @               @@             @               A Diving Pokémon. A legendary Pokémon often referred to as 'guardian of the seas'\\n\" +\n" +
"\"         ,,        @                     @        @                it has the impressive ability to control the wind. \\n\" +\n" +
"\"        @ @       ,                      @        @                Lugia typically spends its time quietly at the bottom of the ocean, Highly powerful in all areas\\n\" +\n" +
"\"       @  @      ,                        @      @                 Lugia's Aeroblast move is especially powerful. \\n\" +\n" +
"\"      ,   @     ,                 ,,       @    @ @@               It uses strong flapping of its wings to target damage on a foe's weak spot. \\n\" +\n" +
"\"      @   @    @                    ,       @  @@@  @   \\n\" +\n" +
"\"     ,    @   @             @@,              @@@@    @  \\n\" +\n" +
"\"     @    @ @@            @,         ,       @@       @ \\n\" +\n" +
"\"    ,     @@             @@          ,    ,@@          @\\n\" +\n" +
"\" ,  @     ,            @@,@@@@       @                 @\\n\" +\n" +
"\" @ ,      @,      @@  @ ,  @@ @@@@@@@@                @ \\n\" +\n" +
"\" @ @            @@,@ @ @@ @     @,  @@,              @  \\n\" +\n" +
"\" @,@           @,,@@@   @@     @     @@            @@   \\n\" +\n" +
"\",@@          ,@,,@@@           ,  @,  @      ,  @@@     \\n\" +\n" +
"\",@@         @@@@@@@           @, @ @  @       ,@ @      \\n\" +\n" +
"\"@@@        @@@@@@@@           @,@  ,   @          @     \\n\" +\n" +
"\"@@@       ,@@@@@@,@            @  @  @ @   ,    , @     \\n\" +\n" +
"\"@@        @ @@@@@ @               @  @,@@  ,    ,  @    \\n\" +\n" +
"\"@@           @@@  @               @ @ @ @  @     ,  @   \\n\" +\n" +
"\"@@       @   @@   @                @,    @ @     ,  @   \\n\" +\n" +
"\"@@      @ @ @,    @                      @ @     @   @  \\n\" +\n" +
"\",@      @@@@   ,@ @                       @      @   @  \\n\" +\n" +
"\" @      @@,    @ @                        @      @   @  \\n\" +\n" +
"\" @      ,    @@@ @                       @      ,@    @ \\n\" +\n" +
"\" ,           @,@ @                      @       @@    @ \\n\" +\n" +
"\"  @        @@,, @                       @       @@    @ \\n\" +\n" +
"\"  @      ,@@,,, @                        @     @ @    @ \\n\" +\n" +
"\"  ,    ,@ @@@, @                          @@   @  @@  @ \\n\" +\n" +
"\"   ,  @    ,@@@                             @@@     @@  \\n\" +\n" +
"\"    ,@ ");
                  System.out.println("                  BOSS RAID - NO ONE CAN KILL ME , I'M A GUARDIAN OF THE SKIES               ");
                    
                     System.out.println(" | Boss HP  :" + bossHp);
                     System.out.println("█████████████████████████████████████████████████████");

                    while (bossHp > 0 && lanjut == 1) {
                        do {
                            System.out.println(" |                               SELECT THE OPTION                                  |\n"+
                               " |------------|------------------|---------|------------------------|---------------|\n"+
                               " |   ATK : 1  | Drink Potion : 2 | RUN: 3  |                        |               |\n"+
                               " |------------|------------------|---------|------------------------|---------------|");
                            Scanner w = new Scanner(System.in);
                            
                            wo = w.nextLine();
                            if (wo.equals("1")) {
                                int damageBoss = enemy.bossDamage();
                                bossHp = bossHp - attackDamage;
                                System.out.println(health);
                                health -= damageBoss;

                                if (bossHp <= 0) {
                                    bossHp = 0;
                                }
                                if (health <= 0) {
                                    health = 0;
                                }
                                System.out.println(" |----------------------------------------------------------------------------------|\n"+
                                   " |                            BATTLE                                                |\n"+
                                   " |----------------------------------------------------------------------------------|");       
                System.out.println(" | Enemy Name  :"  +enemy.getName());
                System.out.println(" | Enemy HP    :"  +enemy.getMaxEnemyHealth());
                System.out.println(" |----------------------------------------------------------------------------------|");
                System.out.println(" | Deal Damage :"  + enemyGotDamage + " " + "Great !");
                System.out.println(" | Damage Taken:"  + damageBoss + " In Retaliation !");
                System.out.println(" |----------------------------------------------------------------------------------|");
                System.out.println(" | Enemy Health: " + bossHp);
                System.out.println(" | Hero  Health: " + health);
                System.out.println(" |----------------------------------------------------------------------------------|");
                                if (health < 1) {
                System.out.println(" | You have been defeated ,Try Again? \n1.Yes , I Surrender ,\n2.No, Let Me Try Again");
                                    ya = entry.nextInt();
                                }
                            } else if (wo.equals("2")) {
                                if (numHealthPotions > 0) {
                                    health += healthPotionHealAmount;
                                    numHealthPotions--;
                                    if (health > 100) {
                                        health = 100;
                                    }
                System.out.println(" | Drinking. HP : +" + healthPotionHealAmount + " Healing ");
                System.out.println(" | Hero Health  : "  + health + "  Healed  ");
                System.out.println(" | HP Unit      : "   + numHealthPotions + " ");
                System.out.println(" |----------------------------------------------------------------------------------|");

                                } else {
                                    System.out.println("   Oops Sorry , Your Health Potion Unit : 0 , Fight Again To Get HP                  ");
                                    System.out.println(" |----------------------------------------------------------------------------------|");
                                }
                            } else if (wo.equals("3")) {
                                System.out.println(" | Enemy Name  :"  + enemy.getName() + " Run ! Come Back Again & Defeat The Enemies  ");
                                System.out.println(" |----------------------------------------------------------------------------------|");
                                lanjut = 0;
                            }
                            if (bossHp <= 0) {
                                System.out.println("              |||-----------------------------------------|||\n              " +
                                       "|||    Congratulations! You Kill THE BOSS  |||\n              " +
                                       "|||-----------------------------------------|||\n              " +
                                       "|||      YOU ARE THE CHAMPION OF THIS GAME  |||\n              " +
                                       "|||-----------------------------------------|||\n              ");
                                System.out.println(" | Current Level : " + lvl);
                            }
                            if (health <= 0) {
                            }
                        } while (ya == 1);
                    }
                }
                lanjut = 0;
                retry();
            }

        }
    }

    public void retry() {
        int loopp = 1;
        do {
            loopp = 0;
             System.out.println("█████████████████████████████████████████████████████");
        
        System.out.println("1. Continue Playing");
        System.out.println("2. END Battle / Exit");
        System.out.println("                                      SELECT MENU                                  ");
      
        System.out.println("█████████████████████████████████████████████████████");
            
            lanjut = entry.nextInt();
            if (lanjut == 2) {
                loopp = 1;
            } else if (lanjut == 1) {
                loopp = 1;
                setenemyblood(75);
                battle();
            }
            if (lanjut == 1) {
                loopp = 1;
                battle();
            }
        } while (loopp == 0);
        System.out.print(lanjut);
    }

    public void setenemyblood(int a) {
        this.enemyblood = a;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    public void setNumHealthPotions(int numHealthPotions) {
        this.numHealthPotions = numHealthPotions;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
