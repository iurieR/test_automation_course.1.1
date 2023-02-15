package polimorfizm;

import polimorfizm.Animal;

public class Caine extends Animal {

    @Override
    public void emiteSunete() {
        System.out.println("ham!");
    }
}
