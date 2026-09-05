package building;

import java.util.List;
import java.util.Objects;

public class Apartment {
    private int number;
    private List<Room> rooms;
    public Apartment(int number, List<Room> rooms) {
        this.number = number;
        this.rooms = rooms;
    }
    public int getNumber() {
        return this.number;
    }
    public List<Room> getRooms() {
        return this.rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return number == apartment.number && Objects.equals(rooms, apartment.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, rooms);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "number=" + number +
                ", rooms=" + rooms +
                '}';
    }
}





