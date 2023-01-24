interface resume{
    void biodata();
}
class Teacher implements resume{
    String name,qualification,achievements;
    float experience;
    public void biodata(){
        name ="ABC";
        qualification = "M.Tech";
        achievements = "Web Developer";
        experience=6.9f;
        System.out.println("----Teachers Resume----");
        System.out.println("Name : "+name);
        System.out.println("Qualification : "+qualification);
        System.out.println("Achievements : "+achievements);
        System.out.println("Experience : "+experience);
    }
}
class Student implements resume{
    String name,discipline;
    float res;
    public void biodata(){
        name = "DEF";
        discipline="CSE";
        res = 9.0f;
        System.out.println("----Student Resume----");
        System.out.println("Name : "+name);
        System.out.println("Discipline : "+discipline);
        System.out.println("Result : "+res+ "CGPA");
    }
}
public class exp7{
    public static void main(String args[]){
        Teacher t=new Teacher();
        t.biodata();
        Student s=new Student();
        s.biodata();
    }
}