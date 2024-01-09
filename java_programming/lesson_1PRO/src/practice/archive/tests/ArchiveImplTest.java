package practice.archive.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.archive.dao.Archive;
import practice.archive.dao.ArchiveImpl;
import practice.archive.dto.DocumentDto;
import practice.archive.model.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {
    List<Document> documentList = new ArrayList<>();
    Archive archive = new ArchiveImpl(documentList);
    static Document doc1 = new Document("Name1", "Author1", LocalDate.of(1911, 1, 1));
    static Document doc2 = new Document("Name2", "Author2", LocalDate.of(1922, 2, 2));
    static Document doc3 = new Document("Name3", "Author3", LocalDate.of(1911, 1, 1));

    @BeforeEach
    void setUp() {
        documentList = List.of(doc1, doc2, doc3);
        for (Document doc : documentList) {
            archive.addDocument(doc);
        }
    }

    @Test
    void addDocument() {
        Document document = new Document("Name4", "Author4", LocalDate.of(1944, 4, 4));
        assertTrue(archive.addDocument(document));
        assertFalse(archive.addDocument(null));
    }

    @Test
    void getAllDocuments() {
        assertEquals(List.of(doc1, doc2, doc3), archive.getAllDocuments());
        Document document = new Document("Name4", "Author4", LocalDate.of(1944, 4, 4));
        archive.addDocument(document);
        assertEquals(List.of(doc1, doc2, doc3, document), archive.getAllDocuments());
    }

    @Test
    void findDocumentsByAuthor() {
        assertEquals(List.of(doc2), archive.findDocumentsByAuthor("Author2"));
    }

    @Test
    void findDocumentsByName() {
        assertEquals(List.of(doc3), archive.findDocumentsByName("Name3"));
    }

    @Test
    void findDocumentById() {
        assertEquals(doc1, archive.findDocumentById(1));
        assertEquals(null, archive.findDocumentById(6));
    }

    @Test
    void findDocumentsByYearOfPublishing() {
        assertEquals(List.of(doc1, doc3), archive.findDocumentsForPeriod(
                LocalDate.of(1910, 1, 1),
                LocalDate.of(1920, 3, 3))
        );
    }

    @Test
    void updateDocumentById() {
        DocumentDto dto = new DocumentDto("Name4", "Author4", LocalDate.of(1944, 4, 4));
        doc3.setAuthor("Author4");
        doc3.setName("Name4");
        doc3.setDateOfPublishing(LocalDate.of(1944, 4, 4));
        assertEquals(doc3, archive.updateDocumentById(3, dto));
    }

    @Test
    void removeDocumentById() {
        assertEquals(doc2, archive.removeDocumentById(2));
        assertEquals(List.of(doc1, doc3), archive.getAllDocuments());
    }
}