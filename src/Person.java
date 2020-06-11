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
            return false;
        }
        if (this.spouse != null && this.spouse != person.spouse.spouse) {
            this.divorce();
            return true;
        }
        if (this.spouse == person.spouse.spouse) {
            System.out.println("spouses");
            return false;
        }
        this.spouse = person;public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person(true, "M1");
        Person p2 = new Person(false, "W1");
        Person p3 = new Person(true, "M2");
        Person p4 = new Person(false, "W2");

        System.out.println("Пол одинаков, жениться не должны");
        p1.marry(p3);
        System.out.println(p1);
        System.out.println(p3);
        System.out.println("Женаты оба друг на друге, еще раз женим (женим два раза т.е.)");
        p1.marry(p2);
        p1.marry(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Второй женат, первый нет затестим:");
        p4.marry(p1);
        System.out.println(p4);
        System.out.println(p1);

    }

    @Override
    public String toString() {
        return "Person{" +
                "man=" + man +
                ", name='" + name + '\'' +
                ", spouse=" + (spouse != null ? spouse.name : "null") +
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
            return false;
        }
        if (this.spouse != null && this.spouse != person) {
            this.divorce();
            return true;
        }
        if (this.spouse == person) {
            return false;
        }
        this.spouse = person;
        person.spouse = this;
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




