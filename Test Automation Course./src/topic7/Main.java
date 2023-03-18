package topic7;

import topic6.ContulPersoanei;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String caleaCatreFisier = "/Users/iuriereabenchi/Desktop/vladOK.txt";
        ContulPersoanei contulArina = new ContulPersoanei("Arina", "3344", 3444d);

        FilesManager.scriereaInformatieTextInFisier(caleaCatreFisier, contulArina.getNumePersoana());
        FilesManager.alipireaInformatieiLaFisier(caleaCatreFisier, contulArina.getId());
        FilesManager.citireaDateDinFisier(caleaCatreFisier);

    }
}
