
package imageconverter;

import imageconverter.model.*;

public class ArgumentsParser {
    public static Arguments parse(String[] args) {
        return new Arguments(new InputLocation(args[0]), new OutputLocation(args[1]));
    }
}
