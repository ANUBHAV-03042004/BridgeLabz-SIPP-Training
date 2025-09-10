package dataexportfeature;

public class DataExporter {
    public static void main(String[] args) {
        Exporter csv = new CSVExporter();
        Exporter pdf = new PDFExporter();

        csv.export("Report Data");
        pdf.export("Report Data");
        csv.exportToJSON("Report Data");
    }
}