import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private void cleanLogDirectory() throws IOException {
        File logDirectory = new File("log");
        File[] logFiles = logDirectory.listFiles();
        assert logFiles != null;
        for (File logFile : logFiles) {
            logFile.delete();
        }
    }

    private String readFileContent(String filePath) throws IOException {
        File file = new File(filePath);
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append("\n");
            }
        }
        return content.toString();
    }

    @Test
    public void testIO() throws IOException {
        cleanLogDirectory();

        DataContainer dataContainer = new DataContainer();

        dataContainer.myMethod1();
        dataContainer.myMethod2();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String expectedFile = dateFormat.format(new Date()) + ".txt";
        String expectedLog = "Object created: " + dateFormat.format(new Date()) + "\n" +
                "My method 1 worked: " + dateFormat.format(new Date()) + "\n" +
                "My method 2 worked: " + dateFormat.format(new Date()) + "\n";

        String actualLog = readFileContent("log/" + expectedFile);

        Assertions.assertEquals(expectedLog, actualLog);
    }
}