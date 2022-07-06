public class Student {
    private String name;
    private int age;
    private EducationType educationType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EducationType getEducationType() {
        return educationType;
    }

    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }
    public static Student makeStudent(String name, int age, EducationType educationType) {
    Student student = new Student();
    student.name = name;
    student.age = age;
    student.educationType = educationType;
    return student;
    }

    @Override
    public String toString() {
        return "Student's " +
                "name is " + name +
                ", age is " + age +
                ", education type is " + educationType +
                ".";
    }
}