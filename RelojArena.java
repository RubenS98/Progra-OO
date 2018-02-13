public class RelojArena {
    public static void main (String[] args){
        int [][] bi = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};
        for(int r=0; r<bi.length; r++){
            for(int c=0; c<(bi[0].length); c++){
                System.out.print(bi[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(highest(bi));
    }//cierre de main

    public static int highest (int[][] bi){
        int highest=0;
        int sum=0;
        for(int r=0; r<bi.length-2; r++){
            for(int c=0; c<(bi[0].length-2); c++){
                if(r==0 && c==0){
                    highest=bi[r][c]+bi[r][c+1]+bi[r][c+2]+bi[r+1][c+1]+bi[r+2][c]+bi[r+2][c+1]+bi[r+2][c+2];
                    System.out.println(highest);
                }
                else{
                    sum=bi[r][c]+bi[r][c+1]+bi[r][c+2]+bi[r+1][c+1]+bi[r+2][c]+bi[r+2][c+1]+bi[r+2][c+2];
                    if(sum>highest){
                        highest=sum;
                    }
                    System.out.println(sum);
                }

                sum=0;
            }
        }
        System.out.println();
        return highest;
    }
}
