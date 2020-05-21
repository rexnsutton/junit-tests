import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList <Integer> grades = new ArrayList<>();
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
//        this.grades = grades;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    public void addGrade (int grade){
        this.grades.add(grade);
    }
//    public double getAverage(){
//
//    }



//    public static void main(String[] args) {
//        Student rex = new Student(66666666, "rex");
//    }
}
