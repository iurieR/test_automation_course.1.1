package polimorfizm;

import polimorfizm.Animal;

public class Pisica extends Animal {

    @Override
    public void emiteSunete() {
        System.out.println("meau!");
    }
}
