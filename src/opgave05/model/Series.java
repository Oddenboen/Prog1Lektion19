package opgave05.model;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episodes;

    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
        this.episodes = new ArrayList<Episode>();
    }

    public Episode createEpisode(int number, int lengthMinutes) {
        Episode episode = new Episode(number, lengthMinutes);
        episodes.add(episode);

        return episode;
    }

    public ArrayList<String> getGuestActors() {
        ArrayList<String> guestCast = new ArrayList<>();
        for (Episode episode : episodes) {
            for (String guest : episode.getGuestCast()) {
                if (!guestCast.contains(guest))
                    guestCast.add(guest);
            }
        }
        return guestCast;
    }

    public int totalLength() {
        int sum = 0;
        for (Episode episode : episodes) {
            sum += episode.getLength();
        }
        return sum;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }
}
