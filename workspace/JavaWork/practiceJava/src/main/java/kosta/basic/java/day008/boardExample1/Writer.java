package kosta.basic.java.day008.boardExample1;

public class Writer {

    public Document createDocument(int documentNo, String documentName, String documentWriter, String documentContent){
        return new Document(documentNo, documentName,documentWriter,documentContent);
    }

}
