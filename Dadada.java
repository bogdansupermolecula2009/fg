public class Dadada {


    public static void main(String[] args) {
        int a[]=new int[26];
        for(int i=0;i<26;i++){
            a[i]=(int)(Math.random()*100);
        }
        for(int i=0;i<a.length-1;i++){
            System.out.print((i+1)+": ");
            if (a[i] > a[i+1]) {
                System.out.println(a[i]+" Больше чем "+a[i+1]);
            }else if (a[i]<a[i+1]){
                System.out.println(a[i]+" Меньше чем "+a[i+1]);
            }else {
                System.out.println(a[i]+" Равно "+a[i+1]);
            }
        }
    }
}





