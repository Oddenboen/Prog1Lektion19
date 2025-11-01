package opgave05;

import opgave05.model.Episode;
import opgave05.model.Series;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Walter");
        cast.add("Jesse");
        Series BB = new Series("Breaking Bad", cast);

        Episode one = BB.createEpisode(1,90);
        one.addGuestActor("Gus");
        Episode two = BB.createEpisode(2,60);

        System.out.println(BB.getGuestActors());
        System.out.println(BB.getTitle());
        System.out.println(BB.getCast());
        System.out.println(BB.totalLength());

    }
}
