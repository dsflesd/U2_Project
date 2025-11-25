public class Creatures {
    private int healthStat;
    private int strengthStat;
    private int defenceStat;
    private String name;

    public Creatures(String name, int healthStat, int strengthStat, int defenceStat) {
        this.healthStat = healthStat;
        this.strengthStat = strengthStat;
        this.defenceStat = defenceStat;
        this.name = name;
    }

    public int attributePointRandomizer() {
        return ((int) (Math.random() * 26) + 75);
    }

    public void prioritzeStrength(int skillPoints) {

        strengthStat = 15;
        strengthStat = strengthStat + (int) ((Math.random() * (skillPoints)) + 10);
        while (strengthStat >= skillPoints) {
            strengthStat = (int) ((Math.random() * (strengthStat)));
        }
        skillPoints = skillPoints - strengthStat;
        do {
            defenceStat = (int) ((Math.random() * (skillPoints)) + 12);
            healthStat = (int) ((Math.random() * (skillPoints)) + 12);
        }
        while (((defenceStat + healthStat) > skillPoints));

        skillPoints = skillPoints - defenceStat - healthStat;
        strengthStat = strengthStat + skillPoints;
    }

    public void prioritzeHealth(int skillPoints) {

        healthStat = 15;
        healthStat = healthStat + (int) ((Math.random() * (skillPoints)) + 10);
        while (healthStat >= skillPoints) {
            healthStat = (int) ((Math.random() * (healthStat)));
        }
        skillPoints = skillPoints - healthStat;
        do {
            defenceStat = (int) ((Math.random() * (skillPoints)) + 12);
            strengthStat = (int) ((Math.random() * (skillPoints)) + 12);
        }
        while (((defenceStat + strengthStat) > skillPoints));
        skillPoints = skillPoints - defenceStat - strengthStat;
        healthStat = healthStat + skillPoints;

    }
    public void priorizeDefence(int skillPoints){
//        if (prioritizedAttribute.equals("health") || prioritizedAttribute.equals("Health")) {
//            healthStat = 15;
//            healthStat=healthStat+(int)((Math.random()*(skillPoints))+10);
//            while(healthStat>=skillPoints){
//                healthStat = (int)((Math.random()*(healthStat)));
//            }
//            skillPoints=skillPoints-healthStat;
//            strengthStat=(int)((Math.random()*(skillPoints))+12);
//            defenceStat=(int)((Math.random()*(skillPoints))+12);
//            do {
//                defenceStat = (int) ((Math.random() * (skillPoints)) + 12);
//                strengthStat = (int) ((Math.random() * (skillPoints)) + 12);
//            }
//            while ((strengthStat + defenceStat) > skillPoints);
//            skillPoints = skillPoints - defenceStat - strengthStat;
//            healthStat = healthStat + skillPoints;
//        }
//        if (prioritizedAttribute.equals("defence") || prioritizedAttribute.equals("Defence")) {
//            defenceStat = 15;
//            defenceStat=defenceStat+(int)((Math.random()*(skillPoints))+10);
//            while(defenceStat>=skillPoints){
//                defenceStat=(int)(Math.random()*(defenceStat));
//            }
//            do {
//                healthStat = (int) ((Math.random() * (skillPoints)) + 12);
//                strengthStat = (int) ((Math.random() * (skillPoints)) + 12);
//            }
//            while ((healthStat + strengthStat)>skillPoints);
//            skillPoints = skillPoints - healthStat - strengthStat;
//            defenceStat = defenceStat + skillPoints;
//        }
        System.out.println("Strength stat: " + strengthStat);
        System.out.println("Health stat: " + healthStat);
        System.out.println("Defence stat: " + defenceStat);
    }
}
