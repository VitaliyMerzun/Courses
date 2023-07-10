import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataContainer {

    private String fileName;
    private static final int maxLogFiles = 2;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");

    public DataContainer() {
        cleanLogDirectory();
        createLogFile();
    }

    private void createLogFile() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String stringDate = dateFormat.format(new Date());
        fileName = stringDate + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log/" + fileName, true))) {
                writer.write("Object created: " + stringDate);
                writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cleanLogDirectory() {
        File logDirectory = new File("log");
        File[] logFiles = logDirectory.listFiles();
        if (logFiles != null && logFiles.length >= maxLogFiles) {
            for (File logFile : logFiles) {
                logFile.delete();
            }
        }
    }

    public void myMethod1() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log/" + fileName, true))) {
            writer.write("My method 1 worked: " + dateFormat.format(new Date()));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void myMethod2() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log/" + fileName, true))) {
            writer.write("My method 2 worked: " + dateFormat.format(new Date()));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
