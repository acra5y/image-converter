package imageconverter.model;

public class InputLocation extends AbstractArgument {
    private InputLocation(String path) {
        super(path);
    }

    public static InputLocation valueOf(String path) {
        return new InputLocation(path);
    }

    @Override
    public String toString() {
        return String.format("InputLocation[path=%s]", getPath());
    }
}
