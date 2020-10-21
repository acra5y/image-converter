package imageconverter.model;

public class Arguments {
    private final InputLocation inputLocation;
    private final OutputLocation outputLocation;

    public Arguments(InputLocation inputLocation, OutputLocation outputLocation) {
        this.inputLocation = inputLocation;
        this.outputLocation = outputLocation;
    }

    public InputLocation getInputLocation() {
        return inputLocation;
    }

    public OutputLocation getOutputLocation() {
        return outputLocation;
    }

    @Override
    public String toString() {
        return String.format("Arguments[inputLocation=%s,outputLocation=%s]", inputLocation, outputLocation);
    }
}
