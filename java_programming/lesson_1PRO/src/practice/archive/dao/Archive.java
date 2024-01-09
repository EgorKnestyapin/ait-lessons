package practice.archive.dao;

import practice.archive.dto.DocumentDto;
import practice.archive.model.Document;

import java.time.LocalDate;
import java.util.List;

public interface Archive {
    boolean addDocument(Document document);

    List<Document> getAllDocuments();

    List<Document> findDocumentsByAuthor(String author);

    List<Document> findDocumentsByName(String name);

    Document findDocumentById(int id);

    List<Document> findDocumentsForPeriod(LocalDate from, LocalDate to);

    Document updateDocumentById(int id, DocumentDto dto);

    Document removeDocumentById(int id);

}
