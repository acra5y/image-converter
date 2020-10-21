package imageconverter;

import org.junit.Test;
import static org.junit.Assert.*;
import imageconverter.model.*;

public class ArgumentsParserTest {
    @Test
    public void testParseArguments_success() {
        String inputLocation = "inputLocation";
        String outputLocation = "outputLocation";
        String[] args = {inputLocation, outputLocation};

        Arguments result = ArgumentsParser.parse(args);

        assertEquals("Should create Arguments with correct input location", inputLocation, result.getInputLocation().getValue());
        assertEquals("Should create Arguments with correct output location", outputLocation, result.getOutputLocation().getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseArguments_notEnoughArguments() {
        String[] args = {"inputLocation"};

        Arguments result = ArgumentsParser.parse(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseArguments_tooManyArguments() {
        String[] args = {"one", "two", "three"};

        Arguments result = ArgumentsParser.parse(args);
    }
}
