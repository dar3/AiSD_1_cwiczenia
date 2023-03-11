public class Student {
    protected int index;
    protected String firstname;
    protected String lastname;
    protected double grades;

    public Student(int index, String firstname, String lastname) {
        this.index = index;
        this.firstname = firstname;
        this.lastname = lastname;
        this.grades = 0;

    }

    @Override
    public String toString() {
        return "Index " + index + " nazwisko " + lastname + " imie " + firstname + " ocena " + grades;
    }
        public int getIndex () {
            return index;
        }

        public void setIndex ( int index){
            this.index = index;
        }

        public String getFirstname () {
            return firstname;
        }

        public void setFirstname (String firstname){
            this.firstname = firstname;
        }

        public String getLastname () {
            return lastname;
        }

        public void setLastname (String lastname){
            this.lastname = lastname;
        }

        public double getGrades () {
            return grades;
        }

        public void setGrades ( double grades){
            this.grades = grades;
        }
    }

