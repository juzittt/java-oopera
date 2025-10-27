import person.*;
import show.Ballet;
import show.Opera;
import show.Show;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Глеб", "Данилов", Gender.MALE, 185);
        Actor actor2 = new Actor("Александр", "Андреев", Gender.MALE, 190);
        Actor actor3 = new Actor("Екатерина", "Завьялова", Gender.FEMALE, 167);

        Director director1 = new Director("Василий", "Дмитриев", Gender.MALE, 2);
        Director director2 = new Director("Иван", "Прыгунов", Gender.MALE, 1);

        Choreographer choreographer = new Choreographer("Сергей", "Шестепёров", Gender.MALE);

        MusicAuthor musicAuthor = new MusicAuthor("Олег", "Нечипоренко", Gender.MALE);

        Show show = new Show("Город героев", 115, director2);
        Ballet ballet = new Ballet("Лебединое озеро", 190, director1, "Волшебная история о любви" +
                " прекрасного принца и заколдованной принцессы, превращённой в лебедя" +
                ", оживёт на сцене в великолепном исполнении..", musicAuthor, choreographer);
        Opera opera = new Opera("Жизнь за царя", 165, director1, "Шедевр русской классики" +
                ", положивший начало национальной оперной традиции. Монументальная музыка" +
                ", пронизанная народными мотивами, раскрывает величие " +
                "народного духа и силу патриотического подвига.", musicAuthor, 19);

        show.addActor(actor1);
        show.addActor(actor2);

        ballet.addActor(actor3);

        opera.addActor(actor1);

        show.printActors();
        ballet.printActors();
        opera.printActors();

        show.changeActor(actor3, "Данилов");
        show.printActors();

        ballet.changeActor(actor2, "Завьялова");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}