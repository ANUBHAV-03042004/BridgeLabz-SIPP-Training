package dataexportfeature;

interface Exporter {
    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: {\"data\":\"" + data + "\"}");
    }
}
