import java.lang.reflect.Array;
import java.util.*;


public class Student {
    private int id;
    private String secondName;
    private String firstName;
    private String middleName;
    private int birthYear;
    private String address;
    private int telephoneNumber;
    private String faculty;
    private int course;
    private int group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Student(int id, String secondName, String firstName, String middleName, int birthYear, String address, int telephoneNumber, String faculty, int course, int group) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthYear=" + birthYear +
                ", address='" + address + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }

}
enum Faculties{
    GHJ,ARR,CDS
}
class MassiveStudent{
    private Student[] massiveStudent;
    public MassiveStudent(Student ... student){
        super();
        toMassiveStudent(student);
    }
    private void toMassiveStudent(Student ... student)
    {
        massiveStudent = student;
        /*for (Student stud:massiveStudent) {

            System.out.println(stud.toString());
        }*/
    }
    public void listStudentSameFaculty(String faculty)
    {
        for (Student student:massiveStudent)
        {
            if(student.getFaculty() == faculty)
            {
                System.out.println(student.getSecondName());
            }
        }
    }
    public void listStudentAfterYear(int year)
    {
        for (Student student:massiveStudent)
        {
            if(student.getBirthYear() > year)
            {
                System.out.println(student.getSecondName());
            }
        }
    }
    public void listStudentGroup(int group)
    {
        for (Student student:massiveStudent)
        {
            if(student.getGroup() == group)
            {
                System.out.println(student.getSecondName());
            }
        }
    }
    public void listStudentFacultyCourses()
    {
        for (Faculties faculty: Faculties.values())
        {
            System.out.println(faculty.name() + ":");
            for (int i = 1; i <=4 ; i++) {
                for (Student student:
                     massiveStudent) {
                    if (faculty.name().equals(student.getFaculty()) && student.getCourse() == i)
                    {
                        System.out.println("Course " + i + ": "+student.getSecondName());
                    }
                }
            }
        }
    }
    public boolean tend (double kelvin)
    {
      return kelvin<273;
    }

}

enum Counter{
    UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE
};
class ExecuteStudentClass
{
    private Student[] massiveStudent;
    public static void main(String[] args) {
        Student student1 = new Student(1,"Petrov","cnsub","nchedbn",1981,"encjunb",467364,"GHJ",1,5);
        Student student2 = new Student(2,"Simonov","cnsubnknkn","nchedbn",1979,"encjunb",467364,"GHJ",4,5);
        Student student3 = new Student(1,"Sidorov","cnsub","nchedbn",1981,"encjunb",467364,"ARR",2,5);
        Student student4 = new Student(2,"Solomonov","cnsubnknkn","nchedbn",1979,"encjunb",467364,"ARR",3,5);
        Student student5 = new Student(1,"Semenov","cnsub","nchedbn",1981,"encjunb",467364,"CDS",4,5);
        Student student6 = new Student(2,"Sekin","cnsubnknkn","nchedbn",1979,"encjunb",467364,"CDS",1,5);
        MassiveStudent massStud = new MassiveStudent(student1,student2,student3,student4,student5,student6);
        System.out.println(massStud.tend(300));
       /* massStud.listStudentSameFaculty("gdsybv");
        massStud.listStudentAfterYear(1980);
        massStud.listStudentGroup(5);*/


    }

}
