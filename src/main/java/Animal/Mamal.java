package Animal;

public class Mamal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       return name;
    }

    public Mamal(String name) {
       setName(name);
    }



    protected void eat() {
        String food = "";

        System.out.print(getName() + "eats" + food);
    }
}