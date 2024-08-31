public class Main {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int rs = 0, re = 5, cs = 0, ce = 4;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "\t");}
            System.out.println(); }
        System.out.println();
        while(rs < re && cs < ce) {
            for(int i = cs; i < ce; i++) {
                System.out.print(a[rs][i] + "\t");}
            rs++;
            for(int i = rs; i < re; i++) {
                System.out.print(a[i][ce - 1] + "\t");}
            ce--;
            if(rs < re) {
                for(int i = ce - 1; i >= cs; --i) {
                    System.out.print(a[re - 1][i] + "\t");}
                re--;}
            if(cs < ce) {
                for(int i = re - 1; i >= rs; --i) {
                    System.out.print(a[i][cs] + "\t");}
                cs++;
            }}}}
