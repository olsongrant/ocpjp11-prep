package exam.other;

import exam.animal.Frog;

public class Tadpole extends Frog {

	public static void main(String[] args) {
        Tadpole t = new Tadpole();
        t.ribbit();
        t.jump();
        Frog f = new Tadpole();
        f.ribbit();
        f.jump();


	}

}
