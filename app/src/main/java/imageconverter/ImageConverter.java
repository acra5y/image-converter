package imageconverter;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.batik.transcoder.*;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import imageconverter.model.*;

public class ImageConverter {
    private static Logger logger = LogManager.getLogger(App.class);

    public static void convertImage(Arguments arguments) throws IOException, TranscoderException {
        try (FileOutputStream outputStream = new FileOutputStream(arguments.getOutputLocation().getPath())) {
            TranscoderInput transcoderInput = new TranscoderInput(arguments.getInputLocation().getPath());
            TranscoderOutput transcoderOutput = new TranscoderOutput(outputStream);

            PNGTranscoder pngTranscoder = new PNGTranscoder();
            pngTranscoder.transcode(transcoderInput, transcoderOutput);

            logger.info("Converted image from " + arguments.getInputLocation() + " to " + arguments.getOutputLocation());
        } catch (IOException e) {
            logger.error("Could not save image.", e);
            throw e;
        } catch (TranscoderException e) {
            logger.error("Could not convert image.", e);
            throw e;
        }
    }
}
