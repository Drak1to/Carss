public class Body extends Car {
    private int size;

    public Body(int body, int helm, int wheel, int size) {
        super(body, helm, wheel);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Body{" +
                "size=" + size +
                '}';
    }
    public void printSize(){
        System.out.println("Body " + getBody());


    }
}

