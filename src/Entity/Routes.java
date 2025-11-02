package Entity;

public class Routes {
    private City from;
    private City to;

    public Routes(City from, City to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
