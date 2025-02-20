package theoriy;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

enum Animal {
    DOG("собака"),
    CAT("кошка"),
    FROG("лягушка");

    private String translation;

    private Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return this.translation;
    }

    public String toString() {
        return "Перевод на русский язык " + this.translation;
    }
}
