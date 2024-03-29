package practice.archive.model;

public enum Menu {
    GET_DOCUMENTS(1, "Get all documents"),
    GET_DOCUMENT_BY_NAME(2, "Get document by name"),
    GET_DOCUMENT_BY_AUTHOR(3, "Get document by author"),
    GET_DOCUMENT_FOR_PERIOD(4, "Get document for a period"),
    ADD_DOCUMENT(5, "Add document to archive"),
    UPDATE_DOCUMENT(6, "Update document info"),
    DELETE_DOCUMENT(7, "Delete document"),
    SAVE(8, "Save"),
    LOAD(9, "Load"),
    EXIT(10, "Exit");
    private int id;
    private String item;

    Menu(int id, String item) {
        this.id = id;
        this.item = item;
    }

    public static void printMenu() {
        Menu[] menu = Menu.values();
        for (Menu value : menu) {
            System.out.print(value.id + ": " + value.item + " | ");
        }
        System.out.println();
        System.out.println("Input your choice: ");
    }
}
