package e;

public class BoksMatch {
    BoksFighter f1;
    BoksFighter f2;
    int minHeight;
    int maxHeight;

    public BoksMatch(BoksFighter f1, BoksFighter f2, int minHeight, int maxHeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }
    public void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){

                while (this.f1.luck==this.f2.luck){
                    this.f1.luck=Math.round(Math.random());
                    this.f2.luck=Math.round(Math.random());
                }

                System.out.println("--------Yeni tur--------");

                if (this.f1.luck>this.f2.luck){
                    this.f2.health= this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.luck=0;
                    this.f2.luck=1;

                } else {
                    this.f1.health=this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    this.f1.luck=1;
                    this.f2.luck=0;
                }

                System.out.println(this.f1.name+" Sağlık: "+ this.f1.health);
                System.out.println(this.f2.name+" Sağlık: "+ this.f2.health);

            }
        } else {
            System.out.println("Sporcuların sikletleri uyumsuz.");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minHeight && this.f1.weight <= maxHeight) && (this.f2.weight >= minHeight && this.f2.weight <= maxHeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+" kazandı");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+ " kazandı");
            return true;
        }
        return false;
    }
}
