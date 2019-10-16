package components;

public class Engine extends Component {

    private int speed;

    public Engine(String make, String model, int speed) {
        super(make, model);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
