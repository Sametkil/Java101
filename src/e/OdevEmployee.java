package e;

public class OdevEmployee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public OdevEmployee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary>1000){
            return (salary*3)/100;
        } else {
            return 0;
        }
    }
    double bonus(){
        if (workHours>40){
            return (this.workHours-40)*30;
        } else {
            return 0;
        }
    }
    double raiseSalary(){
        if (hireYear<10){
            return (this.salary*5)/100;
        } else if (hireYear<20) {
            return (this.salary*10)/100;
        } else {
            return (this.salary*15)/100;
        }
    }

    @Override
    public String toString() {
        return  "Adı=\t" + name +"\n"+
                "Maaşı=\t" + salary +"\n"+
                "Çalışma Saati=\t" + workHours +"\n"+
                "Başlangıç Yılı=\t" + hireYear +"\n"+
                "Vergi=\t"+tax() +"\n"+
                "Bonus=\t"+bonus() +"\n"+
                "Maaş Artışı=\t"+raiseSalary() +"\n"+
                "Vergi ve Bonuslar ile birlikte maaşı=\t"+(this.salary+raiseSalary()-tax()) +"\n"+
                "Toplam Maaş=\t"+(this.salary+raiseSalary()) ;
    }
}
