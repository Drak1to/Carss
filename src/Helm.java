public class Helm extends Car  {
    private int radius;

    public Helm(int body, int helm, int wheel, int radius) {
        super(body, helm, wheel);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "radius=" + radius +
                '}';
    }
    public void printRadius(){
        System.out.println("Helm " + getHelm());
    }
}

