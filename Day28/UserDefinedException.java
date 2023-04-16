 class InvalidAgeException extends Exception {
    
     InvalidAgeException(String message) {
       super(message);
    
    }
}
 
 
 class Person {
    private String name;
    private int age;
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public void checkAge() throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println(name + " is " + age + " years old.");
    }
}
 
 class UserDefinedException {
    public static void main(String[] args) {
        Person john = new Person("John", 25);
        Person jane = new Person("Jane", 150);
 
        try {
            john.checkAge();
            jane.checkAge();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}