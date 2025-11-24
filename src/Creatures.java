public class Creatures {
    private int healthStat;
    private int strengthStat;
    private int defenceStat;
    private String name;

    public Creatures(String name, int healthStat, int strengthStat, int defenceStat){
        this.healthStat=healthStat;
        this.strengthStat=strengthStat;
        this.defenceStat=defenceStat;
        this.name=name;
    }
    public int attributePointRandomizer(){
        int x= ((int)(Math.random()*26)+75);
        return x;
    }


    public void attributeCalculator (String prioritizedAttribute, int skillPoints) {
        if (prioritizedAttribute.equals("strength") || prioritizedAttribute.equals("Strength")) {
            strengthStat=15;
            strengthStat =  strengthStat+(int) ((Math.random() * (skillPoints)) + 10);
            while(strengthStat>skillPoints){
                strengthStat =  (int) ((Math.random() * (strengthStat)));
            }
            skillPoints=skillPoints-strengthStat;
            System.out.println("Skill points: "+skillPoints);
            do {
                defenceStat = (int) ((Math.random() * (skillPoints)) + 12);
                healthStat = (int) ((Math.random() * (skillPoints)) + 12);
            } while (((defenceStat + healthStat) > skillPoints));
            skillPoints=skillPoints-defenceStat-healthStat;
            System.out.println(skillPoints);
            strengthStat=strengthStat+skillPoints;
        }
        if (prioritizedAttribute.equals("health") || prioritizedAttribute.equals("Health")) {
            healthStat = 15;
            healthStat=healthStat+(int)((Math.random()*(skillPoints))+10);
            while(healthStat>skillPoints){
                healthStat = (int)((Math.random()*(healthStat)));
            }
            skillPoints=skillPoints-healthStat;
            strengthStat=(int)((Math.random()*(skillPoints))+12);
            defenceStat=(int)((Math.random()*(skillPoints))+12);
            while ((strengthStat + defenceStat) > skillPoints) {
                defenceStat = (int) ((Math.random() * (skillPoints)) + 12);
                strengthStat = (int) ((Math.random() * (skillPoints)) + 12);
            }
            skillPoints = skillPoints - (defenceStat + strengthStat);
            healthStat = healthStat + skillPoints;
        }
        if (prioritizedAttribute.equals("defence") || prioritizedAttribute.equals("Defence")) {
            defenceStat = defenceStat + 10;
            skillPoints = skillPoints - 10;
            while (healthStat + strengthStat <= skillPoints) {
                healthStat = (int) ((Math.random() * (skillPoints - 10)) + 10);
                strengthStat = (int) ((Math.random() * (skillPoints - 10)) + 10);
            }
            skillPoints = skillPoints - healthStat - strengthStat;
            defenceStat = defenceStat + skillPoints;
            skillPoints = 0;
        }

        System.out.println("Strength stat: " + strengthStat);
        System.out.println("Health stat: " + healthStat);
        System.out.println("Defence stat: " + defenceStat);

    }
//



}
