package imageconverter.model;

import java.util.Objects;

public abstract class AbstractArgument {
    private final String value;

    public AbstractArgument(String value) {
        this.value = Objects.requireNonNull(value, "value must not be null");
    }

    public String getValue() {
        return value;
    }
}
