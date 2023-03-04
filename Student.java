public class Student {
    private String name;
    private String surname;
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  name + " " + surname;
    }

   

    
}
