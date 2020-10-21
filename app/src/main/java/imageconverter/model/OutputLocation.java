package imageconverter.model;

public class OutputLocation extends AbstractArgument {
    public OutputLocation(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return String.format("OutputLocation[value=%s]", getValue());
    }
}
