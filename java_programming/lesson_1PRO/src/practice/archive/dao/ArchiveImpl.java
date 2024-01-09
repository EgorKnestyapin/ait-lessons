package practice.archive.dao;

import practice.archive.dto.DocumentDto;
import practice.archive.model.Document;

import java.time.LocalDate;
import java.util.List;

public class ArchiveImpl implements Archive {
    List<Document> documentList;

    public ArchiveImpl(List<Document> documentList) {
        this.documentList = documentList;
    }

    @Override
    public boolean addDocument(Document document) {
        if (document == null) {
            return false;
        }
        return documentList.add(document);
    }

    @Override
    public List<Document> getAllDocuments() {
        return documentList;
    }

    @Override
    public List<Document> findDocumentsByAuthor(String author) {
        return documentList.stream()
                .filter(doc -> doc.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    @Override
    public List<Document> findDocumentsByName(String name) {
        return documentList.stream()
                .filter(doc -> doc.getName().equalsIgnoreCase(name))
                .toList();
    }

    @Override
    public Document findDocumentById(int id) {
        return documentList.stream()
                .filter(doc -> doc.getId() == id)
                .findAny()
                .orElse(null);
    }

    @Override
    public List<Document> findDocumentsForPeriod(LocalDate from, LocalDate to) {
        return documentList.stream()
                .filter(doc -> doc.getDateOfPublishing().isAfter(from) && doc.getDateOfPublishing().isBefore(to))
                .toList();
    }

    @Override
    public Document updateDocumentById(int id, DocumentDto dto) {
        Document document = documentList.stream()
                .filter(doc -> doc.getId() == id)
                .findAny()
                .orElse(null);
        if (document == null) {
            return null;
        }
        document.setName(dto.getName());
        document.setAuthor(dto.getAuthor());
        document.setDateOfPublishing(dto.getDateOfPublishing());

        return document;
    }

    @Override
    public Document removeDocumentById(int id) {
        Document document = findDocumentById(id);
        if (document == null) {
            return null;
        }
        documentList = documentList.stream()
                .filter(doc -> doc.getId() != id)
                .toList();

        return document;
    }
}
