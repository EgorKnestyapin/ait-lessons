package homework;

public enum Command {
    С("шаг на север") {
        @Override
        public boolean isOpposite(Command command) {
            return command == Ю;
        }
    },
    Ю("шаг на юг") {
        @Override
        public boolean isOpposite(Command command) {
            return command == С;
        }
    },
    З("шаг на запад") {
        @Override
        public boolean isOpposite(Command command) {
            return command == В;
        }
    },
    В("шаг на восток") {
        @Override
        public boolean isOpposite(Command command) {
            return command == З;
        }
    };
    private String step;

    Command(String step) {
        this.step = step;
    }

    public String getStep() {
        return step;
    }

    public abstract boolean isOpposite(Command command);
}
