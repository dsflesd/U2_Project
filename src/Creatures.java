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

    public void prioritizeStrength(int skillPoints) {

        strengthStat = 18;
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

        System.out.println("Strength stat: " + strengthStat);
        System.out.println("Health stat: " + healthStat);
        System.out.println("Defence stat: " + defenceStat);
    }

    public void prioritizeHealth(int skillPoints) {
        healthStat = 18;
        healthStat = healthStat + (int) ((Math.random() * (skillPoints)) + 10);
        while (healthStat >= skillPoints) {
            healthStat = (int) ((Math.random() * (healthStat)));
        }
        skillPoints = skillPoints - healthStat;
        do {
            strengthStat = (int) ((Math.random() * (skillPoints)) + 12);
            defenceStat = (int) ((Math.random() * (skillPoints)) + 12);
        }
        while (((strengthStat + defenceStat) > skillPoints));
        skillPoints = skillPoints - defenceStat - strengthStat;
        healthStat = healthStat + skillPoints;

        System.out.println("Strength stat: " + strengthStat);
        System.out.println("Health stat: " + healthStat);
        System.out.println("Defence stat: " + defenceStat);

    }

    public void prioritizeDefence(int skillPoints) {
        defenceStat = 18;
        defenceStat = defenceStat + (int) ((Math.random() * (skillPoints)) + 10);
        while (defenceStat >= skillPoints) {
            defenceStat = (int) ((Math.random() * (defenceStat)));
        }
        skillPoints = skillPoints - defenceStat;
        do {
            strengthStat = (int) ((Math.random() * (skillPoints)) + 12);
            healthStat = (int) ((Math.random() * (skillPoints)) + 12);
        }
        while (((strengthStat + healthStat) > skillPoints));
        skillPoints = skillPoints - healthStat - strengthStat;
        defenceStat = defenceStat + skillPoints;

        System.out.println("Strength stat: " + strengthStat);
        System.out.println("Health stat: " + healthStat);
        System.out.println("Defence stat: " + defenceStat);
    }
}
