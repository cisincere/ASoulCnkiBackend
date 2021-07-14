package asia.asoulcnki.api.common.util;

import java.io.*;
import java.util.Objects;

public class FileUtil {
    public static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        FileReader reader = null;
        try {
            reader = new FileReader(path);
            int ch;
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(reader)) {
                try {
                    reader.close();
                } catch (IOException ignored) {
                }
            }
        }
        return sb.toString().trim();
    }
}
