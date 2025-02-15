package rought;

public class FindPath {
    public static void main(String[] args) {
        boolean[][] ob = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int way[][] = new int[ob.length][ob[0].length];
            Path("",ob,0,0,way,1);
    }
    static void Path(String p,boolean[][] ob, int r,int c,int [][]way,int steps){
            if(r == ob.length-1 && c == ob[0].length-1 ){
                way[r][c] = steps;
                for (int i = 0; i < way.length; i++) {
                    for (int j = 0; j < way[0].length; j++) {
                        System.out.print(way[i][j]);
                    }
                    System.out.println();
                }
                System.out.println(p);
                System.out.println();
                return;
            }

            if (!ob[r][c]){
             return;
            }

            way[r][c] = steps;
            ob[r][c] = false;
            if (r< ob.length-1){
                Path(p+"D",ob,r+1,c,way,steps+1);
            }

            if (c<ob[0].length-1){
                Path(p+"R",ob,r,c+1,way,steps+1);
            }

            if (r>0){
                Path(p+"U",ob,r-1,c,way,steps+1);
            }
            if (c>0){
                Path(p+"L",ob,r,c-1,way,steps+1);
            }

            ob[r][c] = true;

    }
}
