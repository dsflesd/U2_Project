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
        int initialSkillPoints = skillPoints;
        int strengthStatAdd = 0;
//        while(skillPoints>0){
        if (prioritizedAttribute.equals("strength") || prioritizedAttribute.equals("Strength")) {
            strengthStat=20;
            strengthStat =  strengthStat+(int) ((Math.random() * (skillPoints)) + 10);
            while(strengthStat>skillPoints){
                strengthStat =  (int) ((Math.random() * (strengthStat)));}

//
//
            defenceStat = (int) ((Math.random() * (skillPoints)) + 10);
            healthStat = (int) ((Math.random() * (skillPoints)) + 10);

            while (!(defenceStat + healthStat+strengthStat == skillPoints)){
                defenceStat = (int) ((Math.random() * (skillPoints)) + 10);
                healthStat = (int) ((Math.random() * (skillPoints)) + 10);
            }
//            while ((defenceStat + healthStat + strengthStatAdd < skillPoints)) {
//                if (defenceStat + healthStat + strengthStatAdd > skillPoints){
//                strengthStatAdd = (int) ((Math.random() * (skillPoints - 10)) + 10);
//                defenceStat = (int) ((Math.random() * (skillPoints - 10)) + 10);
//                healthStat = (int) ((Math.random() * (skillPoints - 10)) + 10);}
//                else {
//                    strengthStatAdd = (int) ((Math.random() * (skillPoints - 10)) + 10);
//                    defenceStat = (int) ((Math.random() * (skillPoints - 10)) + 10);
//                    healthStat = (int) ((Math.random() * (skillPoints - 10)) + 10);
//                }
//            }

        }
//
//            skillPoints=initialSkillPoints-(healthStat+defenceStat);
//            System.out.println(skillPoints);
//            strengthStat=strengthStat+skillPoints;
////            skillPoints=0;

        if (prioritizedAttribute.equals("health") || prioritizedAttribute.equals("Health")) {
            healthStat = healthStat + 10;
            skillPoints = skillPoints - 10;
            while (strengthStat + defenceStat <= skillPoints) {
                defenceStat = (int) ((Math.random() * (skillPoints - 10)) + 10);
                strengthStat = (int) ((Math.random() * (skillPoints - 10)) + 10);
            }
            skillPoints = skillPoints - defenceStat - strengthStat;
            healthStat = healthStat + skillPoints;
            skillPoints = 0;
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
