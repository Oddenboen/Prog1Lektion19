package opgave01;

import opgave01.opgave02.Swimmer;
import opgave01.opgave02.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp2 {
    public static void main(String[] args) {

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(2.3);
        lapTimes.add(0.98);
        Swimmer s1 = new Swimmer("Jan", 1976, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.07);
        lapTimes.add(1.03);
        Swimmer s2 = new Swimmer("Bo", 1977, lapTimes, "FCK");

        TrainingPlan a = new TrainingPlan('A', 20, 15);
        a.addSwimmer(s1);
        a.addSwimmer(s2);

        a.printSwimmers();
    }
}
