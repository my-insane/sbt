public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person(true, "p1");
        Person p2 = new Person(false, "p2");
        Person p3 = new Person(true, "p3");
        Person p4 = new Person(false, "p4");

        p1.spouse = p2;
        p2.spouse = p1;
        p3.spouse = p4;
        p4.spouse = p3;
        p1.marry(p4);
        p1.marry(p3);
        p1.marry(p2);

    }

    @Override
    public String toString() {
        return "Person{" +
                "man=" + man +
                ", name='" + name + '\'' +
                ", spouse=" + spouse +
                '}';
    }

    /**
     *      * This method checks gender of persons. If genders are not equal - tries to marry.
     *      * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses
     * - then divorce will set 4 spouse to null) and then executes marry().
     *      * @param person - new husband/wife for this person.
     *      * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     *      
     */

    public boolean marry(Person person) {
        if (this.man == person.man) {
            System.out.println("man = man? no marry");
            return false;
        }
        if (this.spouse != null && this.spouse != person.spouse.spouse) {
            this.spouse.divorce();
            System.out.println("divorce & marry");
            return true;
        }
        if (this.spouse == person.spouse.spouse) {
            System.out.println("spouses");
            return false;
        }
        this.spouse = person;
        person.spouse = this;
        System.out.println("marry");
        return true;
    }

    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        } else return false;
    }
}




