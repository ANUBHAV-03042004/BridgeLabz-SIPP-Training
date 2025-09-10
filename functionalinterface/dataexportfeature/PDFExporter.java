package dataexportfeature;

class PDFExporter implements Exporter {
    public void export(String data) { System.out.println("Exporting PDF: " + data); }
}
