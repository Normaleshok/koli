package theoriy;

public class classesandobjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Kirill", 24);
        String s1 = "Anton";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 20);
        person1.speak();
        person2.speak();
    }

    static class Person {
        String name;
        int age;

        Person() {
        }

        void setNameAndAge(String username, int userage) {
            this.name = username;
            this.age = userage;
        }

        int calculateYearsToRetirement() {
            int years = 65 - this.age;
            return years;
        }

        void speak() {
            for(int i = 0; i < 3; ++i) {
                System.out.println("Меня зовут " + this.name + ", мне " + this.age + " лет");
            }

        }

        void sayHello() {
            System.out.println("Привет!");
        }
    }
}
