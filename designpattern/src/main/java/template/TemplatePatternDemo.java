package template;

/**
 * Created by mlh on 2017/12/31.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();//Game
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
