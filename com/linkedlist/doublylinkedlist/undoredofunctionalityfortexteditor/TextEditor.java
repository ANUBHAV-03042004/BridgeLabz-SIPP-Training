package linkedlist.doublylinkedlist.undoredofunctionalityfortexteditor;

class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    private TextState current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new state
    public void type(String newText) {
        TextState newState = new TextState(newText);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        size++;

        // Trim history if exceeded
        if (size > MAX_HISTORY) {
            TextState temp = current;
            while (temp.prev != null && size > MAX_HISTORY) {
                temp.prev.next = null;
                temp.prev = temp.prev.prev;
                size--;
            }
        }
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No undo available.");
        }
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No redo available.");
        }
    }

    // Display current state
    public void showCurrentText() {
        System.out.println("Current Text: " + (current != null ? current.content : "Empty"));
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World!");
        editor.showCurrentText();

        editor.undo();
        editor.showCurrentText();

        editor.redo();
        editor.showCurrentText();

        editor.undo();
        editor.undo();
        editor.undo(); // Should say no undo available
    }
}
