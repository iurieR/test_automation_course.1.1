package topic7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesManager {
    static void scriereaInformatieTextInFisier(String caleaCatreFisier, String date) {
        try {
            FileWriter writer = new FileWriter(caleaCatreFisier);
            writer.write(date);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static void alipireaInformatieiLaFisier(String calaeaCatreFisier, String date) {
        try {
            FileWriter writer = new FileWriter(calaeaCatreFisier, true);
            writer.append(date);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String citireaDateDinFisier(String caleaCatreFisier) {
        char c[] = new char[100];
        try {
            FileReader reader = new FileReader(caleaCatreFisier);
            reader.read(c);
            System.out.println("datele au fost scrise");
            System.out.println(c);
            reader.close();
        } catch (IOException e) {
            System.out.println("calea fisierului este gresita " + e);
        }
        return caleaCatreFisier;
    }

}
