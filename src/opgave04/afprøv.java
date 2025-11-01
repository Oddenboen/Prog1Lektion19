package opgave04;


import opgave04.model.TrainingPlan;

import java.util.ArrayList;

public class afprøv {
    public static void main(String[] args) {
        TrainingPlan a = new TrainingPlan('A', 20, 15);
        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(2.3);
        lapTimes.add(0.98);
        a.createSwimmer("Jan", 1976, lapTimes, "AGF");


        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.07);
        lapTimes.add(1.03);
        a.createSwimmer("Bo", 1977, lapTimes, "FCK");

        a.removeSwimmer(4);

        a.brugere();
    }
}
