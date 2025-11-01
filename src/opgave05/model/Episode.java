package opgave05.model;

import java.util.ArrayList;

public class Episode {
    private int number;
    private ArrayList<String> guestActors;
    private int lengthMinutes;

    public Episode(int number, int lengthMinutes) {
        this.number = number;
        this.lengthMinutes = lengthMinutes;
        this.guestActors = new ArrayList<String>();
    }

    public int getNumber() {
        return number;
    }

    public void addGuestActor(String name) {
        guestActors.add(name);
    }

    public int getLength() {
        return lengthMinutes;
    }

    public ArrayList<String> getGuestCast() {
        return guestActors;
    }
}
