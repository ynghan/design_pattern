package ObserverPatternBlogStudy;

import java.util.Vector;

public class ObserverBlogMain {
    public static void main(String[] args) {
        Baedi baedi = new Baedi();
        Crew lewin = new Lewin();
        Crew tiber = new Tiber();
        Crew jay = new Jay();
        Vector<Crew> crews = new Vector<>();
        crews.add(lewin);
        crews.add(tiber);
        crews.add(jay);

        for (Crew crew : crews) {
            baedi.subscribe(crew);
        }

        baedi.upgradeCutie();

        baedi.unsubscribe(crews.get(1));
        baedi.eatFood();
    }
}
