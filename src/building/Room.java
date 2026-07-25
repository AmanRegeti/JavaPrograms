package building;

import java.util.List;
import java.util.Objects;

public class Room {
    private RoomTypes type;
    private int doors;
    private int windows;
    public Room(RoomTypes type, int doors, int windows) {
        this.type = type;
        this.doors = doors;
        this.windows = windows;
    }
    public RoomTypes getNumber() {
        return this.type;
    }
    public int getDoors() {
        return this.doors;
    }
    public int getWindows() {
        return this.windows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return doors == room.doors && windows == room.windows && type == room.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, doors, windows);
    }

    @Override
    public String toString() {
        return "Room{" +
                "type=" + type +
                ", doors=" + doors +
                ", windows=" + windows +
                '}';
    }
}
//building.Building:title - List building.Floor:number - List Aprt:number - room: type,door,window
