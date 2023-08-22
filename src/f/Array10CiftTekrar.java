package f;

public class Array10CiftTekrar {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list={2,6,3,7,10,2,7,4,7,1,9,8,10};
        int [] even=new int[list.length];
        int startIndex=0;
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if ((i!=j) && (list[i]==list[j]) && (list[i] % 2 == 0)){
                    if (!isFind(even,list[i])){
                        even[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }
        for (int value:even){
            if (value!=0){
                System.out.println(value);
            }
        }
    }
}