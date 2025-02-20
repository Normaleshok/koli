package lessons;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.Serializable;

public class Personn implements Serializable {
    private static final long serialVersionUID = 2850941593282398964L;
    private int id;
    private String name;

    public Personn(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.id + " : " + this.name;
    }
}
