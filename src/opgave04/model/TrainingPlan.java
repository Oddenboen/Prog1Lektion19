package opgave04.model;

import opgave01.opgave02.Swimmer;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;
    private ArrayList<Swimmer> swimmer;

    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
        this.swimmer = new ArrayList<Swimmer>();
    }

    public Swimmer createSwimmer(String name, int yearGroup, ArrayList<Double> lapTimes, String club) {
        Swimmer swimmer = new Swimmer(name, yearGroup, lapTimes, club);
        this.swimmer.add(swimmer);
        return swimmer;
    }

    public void brugere() {
        System.out.println("Brugerne af træningsplan: " + getLevel());
        for (Swimmer swimmers : swimmer) {
            System.out.println(swimmers.getName());
        }
    }

    public void removeSwimmer(int index) {
        if (index <= swimmer.size())
            this.swimmer.remove(index);
    }

    public void printSwimmers() {
        for (Swimmer swimmers : swimmer) {
            System.out.println(swimmers.getName() + "'s bedste tid er " + swimmers.bestLapTime() +
                    " han træner " + (this.weeklyStrengthHours + this.weeklyWaterHours) + " timer om ugen");
        }
    }

    public void addSwimmer(Swimmer swimmer) {
        this.swimmer.add(swimmer);
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char niveau) {
        this.level = niveau;
    }

    public int getWeeklyStrengthHours() {
        return weeklyStrengthHours;
    }

    public void setWeeklyStrengthHours(int weeklyStrengthHours) {
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }

    public void setWeeklyWaterHours(int weeklyWaterHours) {
        this.weeklyWaterHours = weeklyWaterHours;
    }

}
