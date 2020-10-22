package imageconverter.model;

public class InputLocation extends AbstractArgument {
    private InputLocation(String value) {
        super(value);
    }

    public static InputLocation valueOf(String value) {
        return new InputLocation(value);
    }

    @Override
    public String toString() {
        return String.format("InputLocation[value=%s]", getValue());
    }
}
