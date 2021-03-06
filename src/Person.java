public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person()
    {
        this.firstName = "First Name";
        this.lastName = "Last Name";
        this.age = 0;
    }
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String theFirstName)
    {
        this.firstName = theFirstName;
    }
    public void setLastName(String theLastName)
    {
        this.lastName = theLastName;
    }
    public void setAge(int theAge)
    {
        this.age = theAge;
    }

    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }

    public void printName()
    {
       System.out.println(firstName + " " + lastName);
    }
    public void printAge()
    {
        System.out.println(age);
    }

}


