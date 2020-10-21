package imageconverter;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.batik.transcoder.*;
import org.apache.batik.transcoder.image.PNGTranscoder;
import imageconverter.model.*;

public class ImageConverter {
    public static void convertImage(Arguments arguments) {
        try (FileOutputStream outputStream = new FileOutputStream(arguments.getOutputLocation().getValue())) {
            TranscoderInput transcoderInput = new TranscoderInput(arguments.getInputLocation().getValue());
            TranscoderOutput transcoderOutput = new TranscoderOutput(outputStream);

            PNGTranscoder pngTranscoder = new PNGTranscoder();
            pngTranscoder.transcode(transcoderInput, transcoderOutput);
        } catch (IOException | TranscoderException ex) {
            System.out.println("Exception Thrown: " + ex);
        }
    }
}
