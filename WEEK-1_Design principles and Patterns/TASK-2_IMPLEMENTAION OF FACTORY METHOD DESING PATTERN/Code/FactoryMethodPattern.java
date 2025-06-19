// Step 1: Define Document Interface
interface Document {
    void open();
}

// Step 2: Concrete Document Classes
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}

// Step 3: Abstract Factory-IF ANY DOCUMENT EXTENDS IT YOU CAN ACCOMODATE IN FUTURE
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Step 4: Concrete Factories-PREPARES INTERMEIDATE
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// Step 5: Test Class-CLIENT
public class FactoryMethodPattern {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
