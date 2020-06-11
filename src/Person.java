public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
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

        if (person.man != this.man) {
            if (this.spouse != null || person.spouse != null) {
                this.divorce();
                person.divorce();
                this.spouse.divorce();
                person.spouse.divorce();
                this.spouse = person;
                person.spouse = this.spouse;
            }
        }
        if (this.man != person.man && this.spouse != person.spouse) return true;
        else
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
