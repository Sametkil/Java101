package e;

public class OBSMain {
    public static void main(String[] args) {
        OBSTeacher t1 = new OBSTeacher("Samet", "1234", "TRH");
        OBSTeacher t2 = new OBSTeacher("Ahmet", "0000", "FZK");
        OBSTeacher t3 = new OBSTeacher("Cemal", "9876", "BIO");

        OBSCourse tarih = new OBSCourse("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        OBSCourse fizik = new OBSCourse("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        OBSCourse biyo = new OBSCourse("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        OBSStudent s1 = new OBSStudent("Mehmet", "5678", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(70,60,50);
        s1.isPass();

        OBSStudent s2=new OBSStudent("Veli","7864","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,60,59);
        s2.isPass();
    }
}
