package imageconverter.model;

public class InputLocation extends AbstractArgument {
    public InputLocation(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return String.format("InputLocation[value=%s]", getValue());
    }
}
