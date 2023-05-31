import java.util.Scanner;
import java.util.ArrayList;
class queen{
    public int n;
    queen(int n){this.n=n;}

    public int find(ArrayList<Integer> list){
        int index=0;
        int num=list.size();
        if(num==n){
            return 1;
        }

        for(int j=0;j<n;j++){
            int k=0;
            for(;k<list.size();k++){
                if(j==list.get(k)||(j-list.get(k)==list.size()-k)||(j-list.get(k)==-list.size()+k)){
                    break;
                }
            }
            if(k>=list.size()){
                ArrayList<Integer> kkk = new ArrayList<>(list);
                kkk.add(j);
                index+=this.find(kkk);
            }
        }

        return index;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        int n=Integer.valueOf(num.split(" ")[0]);
        queen q=new queen(n);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(q.find(list));
    }
}