import java.util.Objects;

public class Person {
   String name;
   float age;
   float height;
   float weight;

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o;
      return age == person.age &&
              name.equals(person.name) &&
              weight == person.weight &&
              height == person.height;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, age, height, weight);
   }

   @Override
   public String toString() {

      return "Person: " + name + ", Age: " + age + ", Height:" + height + ", Weight:" + weight;
   }
}
