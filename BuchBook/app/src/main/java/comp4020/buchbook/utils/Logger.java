package comp4020.buchbook.utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Logger {

    private static final String LOG_FILE_NAME = "log.txt";
    private static PrintWriter writer = null;

    private static PrintWriter openFile() throws FileNotFoundException, UnsupportedEncodingException{

        writer = new PrintWriter(LOG_FILE_NAME, "UTF-8");

        return writer;
    }

    private static void closeFile() {

        if (writer != null) {

            writer.close();
            writer = null;
        }
    }

    public static void log(String callerInfo) {

        try {
            openFile();

            // Grab system time
            long time = System.currentTimeMillis();

            // Write info to log
            writer.println("[" + time + "] " + callerInfo);

            closeFile();

        } catch (Exception e) {

            closeFile();
        }
    }
}
