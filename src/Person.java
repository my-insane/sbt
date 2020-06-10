public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (person.man != this.man) {
            if (this.spouse != null && person.spouse != null) {
                this.divorce();
                person.divorce();
                this.spouse.divorce();
                person.spouse.divorce();
                this.spouse = person;
                person.spouse = this.spouse;
                return false;
            }
        }
        if (this.spouse == null) return true;
        return false;
    }


    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse = null;
            return true;
        } else {
            return false;
        }
    }
}
