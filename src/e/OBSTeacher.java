package e;

public class OBSTeacher {
    String name;
    String mPhone;
    String branch;

    public OBSTeacher(String name, String mPhone, String branch) {
        this.name = name;
        this.mPhone = mPhone;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : "+this.name);
        System.out.println("Telefonu : "+this.mPhone);
        System.out.println("Bölümü : "+this.branch);

    }


}
