package imageconverter.model;

import java.util.Objects;

public abstract class AbstractArgument {
    private final String path;

    public AbstractArgument(String path) {
        this.path = Objects.requireNonNull(path, "path must not be null");
    }

    public String getPath() {
        return path;
    }
}
