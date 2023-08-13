package Common_IO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("src/test.txt"), new File("src/testc.txt"));
        FileUtils.copyDirectory(new File("src/Common_IO"), new File("src/test"));
        FileUtils.deleteDirectory(new File("src/test"));
    }
}
