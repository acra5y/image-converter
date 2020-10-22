package imageconverter.model;

public class OutputLocation extends AbstractArgument {
    private OutputLocation(String path) {
        super(path);
    }

    public static OutputLocation valueOf(String path) {
        return new OutputLocation(path);
    }

    @Override
    public String toString() {
        return String.format("OutputLocation[path=%s]", getPath());
    }
}
