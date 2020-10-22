package imageconverter;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.batik.transcoder.*;
import org.apache.batik.transcoder.image.PNGTranscoder;
import imageconverter.model.*;

public class ImageConverter {
    public static void convertImage(Arguments arguments) throws IOException, TranscoderException {
        try (FileOutputStream outputStream = new FileOutputStream(arguments.getOutputLocation().getPath())) {
            TranscoderInput transcoderInput = new TranscoderInput(arguments.getInputLocation().getPath());
            TranscoderOutput transcoderOutput = new TranscoderOutput(outputStream);

            PNGTranscoder pngTranscoder = new PNGTranscoder();
            pngTranscoder.transcode(transcoderInput, transcoderOutput);
        } catch (IOException e) {
            System.out.println("Could not save image. " + e);
            throw e;
        } catch (TranscoderException e) {
            System.out.println("Could not convert image. " + e);
            throw e;
        }
    }
}
