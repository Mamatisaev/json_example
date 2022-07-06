import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) {

        Student[] students = {
                Student.makeStudent("Mike Tyson", 56, EducationType.DAY),
                Student.makeStudent("David Beckham", 47, EducationType.EVENING),
                Student.makeStudent("Michael Jordan", 59, EducationType.ONLINE)
        };
        String json = GSON.toJson(students);
        System.out.println(json);
    }
}