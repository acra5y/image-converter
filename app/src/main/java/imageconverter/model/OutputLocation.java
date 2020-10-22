package imageconverter.model;

public class OutputLocation extends AbstractArgument {
    private OutputLocation(String value) {
        super(value);
    }

    public static OutputLocation valueOf(String value) {
        return new OutputLocation(value);
    }

    @Override
    public String toString() {
        return String.format("OutputLocation[value=%s]", getValue());
    }
}
