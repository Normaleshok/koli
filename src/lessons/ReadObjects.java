package lessons;

import java.io.*;

public class ReadObjects {
    public static void main(String[] args) {
        Person person1 = null;
        ObjectInputStream ois = null;
        try {
            // Create FileInputStream and ObjectInputStream to read the serialized object
            ois = new ObjectInputStream(new FileInputStream("people.bin"));
            person1 = (Person) ois.readObject();  // Deserialize the object

            // Print the deserialized object
            System.out.println(person1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();  // Handle exceptions
        } finally {
            try {
                if (ois != null) {
                    ois.close();  // Close the input stream
                }
            } catch (IOException e) {
                e.printStackTrace();  // Handle closing error
            }
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    // Constructor, getters, setters, and toString method
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
