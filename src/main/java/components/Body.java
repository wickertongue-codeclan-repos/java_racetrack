package components;

public class Body extends Component {
    private String colour;

    public Body(String make, String model, String colour) {
        super(make, model);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

}
