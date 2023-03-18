package topic7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String caleaCatreFisier = "/Users/iuriereabenchi/Desktop/vladOK.txt";

        FilesManager.scriereaInformatieTextInFisier(caleaCatreFisier, "scrierea primei inform");
        FilesManager.alipireaInformatieiLaFisier(caleaCatreFisier, "alipirea primei info");
        FilesManager.citireaDateDinFisier(caleaCatreFisier);

    }
}
