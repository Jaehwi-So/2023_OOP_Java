package lecture07;
/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Turtle {
    private int limbs = 4;
    protected String food;

    public int getLimbs() { return this.limbs; }
    public void setFood(String f) { this.food = f; }
    public void eat() { System.out.println("Turtle eats " + food); }
}

class SeaTurtle extends Turtle {
    public void swim() { System.out.println("A sea turtle swims..."); }

    @Override
    public int getLimbs() { return super.getLimbs(); }
    public void printLimbs() {
        System.out.println("limbs: " + getLimbs());
    }
}

class LandTurtle extends Turtle {
    public void walk() { System.out.println("A land turtle walks..."); }
    public void printLimbs() {
        System.out.println("limbs: " + getLimbs());
    }
}


public class TurtleMain {
    public static void main(String[] args) {
        SeaTurtle st = new SeaTurtle();
        LandTurtle lt = new LandTurtle();
        st.printLimbs();
        lt.printLimbs();
    }
}
