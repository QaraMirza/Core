/*
    Уроки из Stepic:
    2.3 Массивы и строки
    3.1 Основы ООП
    3.3 Объявления классов
    3.4 Наследование
    3.5 Абстрактные классы
    6.1 Generics
    6.2 Коллекции
 */
import java.util.ArrayList;
import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        County county = new County("Meklenburg", 8000);
        county.addSoldiers(5000);

        Kingdom kingdom = new Kingdom("Austria", 30000);
        kingdom.addSoldiers(3000);
        kingdom.addVassal(county);

        System.out.println(kingdom.getVassals());
    }
}

abstract class State {
    private String name;
    private int army;

    State(String name, int army) {
        this.name = name;
        this.army = army;
    }

    void addSoldiers(int count) {
        this.army += count;
    }

    void renameState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getArmy() {
        return army;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", army=" + army +
                '}';
    }
}

class County extends State {

    County(String name, int army) {
        super(name, army);
    }
}

class Kingdom extends State {

    private List vassals = new ArrayList<County>();

    Kingdom(String name, int army) {
        super(name, army);
    }

    void addVassal(County county) {
        vassals.add(county);
    }

    public List getVassals() {
        return vassals;
    }
}
