public class PersonTest {
    public static void main(String[] args) {
        // Creating a Person with only a name
        Person person1 = new Person("John");
        System.out.println(person1);  // Output: Person{name='John', weight=null, height=null}

        // Creating a Person with name, weight, and height
        Person person2 = new Person("Alice", 68.5, 165.3);
        System.out.println(person2);  // Output: Person{name='Alice', weight=68.5, height=165.3}
    }
}
