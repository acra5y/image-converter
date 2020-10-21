
package imageconverter;

import imageconverter.model.*;

public class ArgumentsParser {
    public static Arguments parse(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Must specify exactly two arguments: input location and output location");
        }
        return new Arguments(new InputLocation(args[0]), new OutputLocation(args[1]));
    }
}
