package behavioral.memento.sample1;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL_1", 320);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL_3", 520);
        System.out.println(game);

        System.out.println("loading....");
        game.load(file.getSave());
        System.out.println(game);
    }
}






