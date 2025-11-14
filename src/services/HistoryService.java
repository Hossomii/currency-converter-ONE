package services;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistoryService {
    private static final String FILE_NAME = "history.log";

    public void save(String record) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);

            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            writer.write("[" + now.format(formatter) + "] " + record + "\n");

            writer.close();
        } catch (IOException e) {
            System.out.println("Error ao salvar histórico: " + e.getMessage());
        }
    }
}
