package topic7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesManager {
    static void scriereaInformatieTextInFisier(String caleaCatreFisier, String date) throws IOException {
        try {
            FileWriter writer = new FileWriter(caleaCatreFisier);
            writer.write(date);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static void alipireaInformatieiLaFisier(String calaeaCatreFisier, String date) throws IOException {
        try {
            FileWriter writer = new FileWriter(calaeaCatreFisier);
            writer.append(date);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String citireaDateDinFisier(String caleaCatreFisier) throws IOException {
        char c[] = new char[100];
        try {
            FileReader reader = new FileReader(caleaCatreFisier);
            reader.read(c);
            System.out.println("datele au fost scrise");
            System.out.println(c);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("calea fisierului este gresita " + e);
        }
        return caleaCatreFisier;
    }

}
