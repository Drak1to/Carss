public class Car {
    private int body;
    private int helm;
    protected int wheel;

    public Car(int body, int helm, int wheel) {
        this.body = body;
        this.helm = helm;
        this.wheel = wheel;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getHelm() {
        return helm;
    }

    public void setHelm(int helm) {
        this.helm = helm;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", helm=" + helm +
                ", wheel=" + wheel +
                '}';
    }

    public void printTheDetail() {
        System.out.println("Body = " + body * 5);
        int sum = 3;
        System.out.println("Helm = " + (helm + sum) );
        System.out.println("wheel = " + wheel);

    }
    public void deficiencyWheel(){
        int sum = 1;
        System.out.println("Deficiency wheel " + wheel + " + " + 1 + " = " + (wheel + 1)   );

    }

    }



