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
        //     System.out.println("1");
        if (this.man != person.man) {
            if (this.spouse != null) {
                this.spouse.divorce();
                System.out.println("divorce & marry");
            } else if (this.spouse == person.spouse) {
                return false;
            } else {
                this.spouse = person;
                person.spouse = this;
                System.out.println("marry");
            }
        }
        if (this.man != person.man && this.spouse != person.spouse)
            return true;
        else return false;
    }

    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        } else return false;
    }
}




