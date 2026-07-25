package building;

import java.util.List;
import java.util.Objects;

// dto: a data transfer object, where there is no logic only information about the object used to transfer the object from method to method or class to class
public class Building {
    private char section;
    // Polymorphism: is where you can use the parent class as reference to store child class object
    private List<Floor> floors;
    public Building(char section, List<Floor> floors) {
        this.section = section;
        this.floors = floors;
    }
    public char getSection() {
        return this.section;
    }
    public List<Floor> getFloors() {
        return this.floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return section == building.section && Objects.equals(floors, building.floors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(section, floors);
    }

    @Override
    public String toString() {
        return "Building{" +
                "section=" + section +
                ", floors=" + floors +
                '}';
    }
}

