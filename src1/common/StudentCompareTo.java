package common;

public class StudentCompareTo implements Comparable<StudentCompareTo> {
    private int id;
    private String name;
    private int age;
 
    /*
     *Compare a given Student with current(this) object.
     *If current Student id is greater than the received object,
     *then current object is greater than the other.
     */  
    /*public int compareTo(StudentCompareTo otherStudent) {
       // return this.id - otherStudent.id ; //result of this operation can overflow
       return (this.id < otherStudent.id ) ? -1: (this.id > otherStudent.id) ? 1:0 ;

    }
*/
    /**
     * Compare a given Student with current(this) object.
     * first compare name and than age
     */
    @Override
    public int compareTo(StudentCompareTo otherStudent) {      
        //compare name
        int nameDiff = name.compareToIgnoreCase(otherStudent.name);
        if(nameDiff != 0){
            return nameDiff;
        }
        //names are equals compare age
        return age - otherStudent.age;
    }


}
