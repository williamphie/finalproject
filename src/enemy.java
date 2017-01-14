import java.util.Random;

public class enemy {
            
        private int EnemyHealth = 75 ;
        private int enemyAttackDamage = 25;
        private int bossHp = 120;
        private int bossDamage = 40;
        private String name ; 
        private int health;
        Random rand = new Random();
        
        public enemy(){
            this.name = getEnemyName();
        }
        
        public int bossHP() {
            return bossHp;
        }
        
        public int bossDamage() {
            return bossDamage;
        }
        
        public String getEnemyName(){
            String [] enemies = { "Squirtle", "Bulbasaur" , "Staryu" , "Vulpix" , "Growlithe" ,"Psyduck" ,"Oddish"};
            String enemy = enemies [rand.nextInt (enemies.length)];
            return enemy;
        }
        
        public void enemyStatus() {
            
            System.out.println("Enemy name : "+ name);
            System.out.println("Enemy Health: "+EnemyHealth);
            System.out.println("Enemy Attack Damage: "+enemyAttackDamage);
            
        }

    public String getName() {
        return name;
    }

    public int getMaxEnemyHealth() {
        return EnemyHealth;
    }
    public int setMaxEnemyHealth(){
        return EnemyHealth;
    }
    public int getEnemyAttackDamage() {
        return enemyAttackDamage;
    }
//    public int getEnemyHealth(){
//        return health;
    }
        
//}
