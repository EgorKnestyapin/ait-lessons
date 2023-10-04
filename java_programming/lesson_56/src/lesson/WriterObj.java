package lesson;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterObj {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object_out.dat"))) {
            os.writeObject(new Person("Vanya", 18, new Car("opel")));
        }
    }
}
