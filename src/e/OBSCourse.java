package e;

public class OBSCourse {
    OBSTeacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public OBSCourse(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }

    void addTeacher(OBSTeacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }
    }
    void printTeacher(){this.teacher.print();
    }

}
