package enum_lesson;

public enum Color {
    GREEN {
        public void printText() {
            System.out.println("Print green text");
        }
    },
    BLUE {
        public void printText() {
            System.out.println("Print blue text");
        }
    },
    RED {
        public void printText() {
            System.out.println("Print red text");
        }
    },
    BLACK {
        public void printText() {
            System.out.println("Print black text");
        }
    };

    public abstract void printText();
}
