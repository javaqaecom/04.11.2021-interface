import java.beans.PersistenceDelegate;

public class main {

    public static void main(String[] args) {
        Tiger t1 = new Tiger("sharikhan",150);
        person p1 = new person("simba","safari",12000);

        t1.eat();
        t1.drink();
        t1.chilling();

        p1.eat();
        p1.drink();
        p1.chilling();
    }
}
