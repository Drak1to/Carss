public class Wheel extends Car {
    private int number;

    public Wheel(int body, int helm, int wheel, int number) {
        super(body, helm, wheel);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "number=" + number +
                '}';
    }
    public void printNumbaer() {
        System.out.println("Wheel " + getWheel());
    }


    }



