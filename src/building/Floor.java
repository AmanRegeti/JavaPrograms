package building;

import java.util.List;
import java.util.Objects;

public class Floor {
        private int number;
        private List<Apartment> apartments;
        public Floor(char number, List<Apartment> apartments) {
                this.number = number;
                this.apartments = apartments;
        }
        public int getNumber() {
                return this.number;
        }
        public List<Apartment> getApartments() {
                return this.apartments;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Floor floor = (Floor) o;
                return number == floor.number && Objects.equals(apartments, floor.apartments);
        }

        @Override
        public int hashCode() {
                return Objects.hash(number, apartments);
        }

        @Override
        public String toString() {
                return "Floor{" +
                        "number=" + number +
                        ", apartments=" + apartments +
                        '}';
        }
}
