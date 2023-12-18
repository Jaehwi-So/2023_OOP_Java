package lecture07;
class CoffeeBean {
    private String species = "Coffee";
    void print() {
        System.out.println(species);
    }

    //private void setSpecies : 자식 클래스에서 접근 불가능하다.
    protected void setSpecies(String s) { species = s; }
    public String getSpecies() { return species; }
}
class Robusta extends CoffeeBean {
    @Override
    void print() {
        System.out.println("Robusta coffee...");
    }
    void print(String s) {
        System.out.printf("%s: %s\n", getSpecies(), s);
    }
}

public class Main {
    public static void main(String[] args){
        CoffeeBean bean = new Robusta();
        bean.setSpecies("Robusta1");
        bean.print();
    }
}
