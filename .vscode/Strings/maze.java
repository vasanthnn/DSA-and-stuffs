package Strings;

public class maze {
    public static void main(String[] args) {

        // pathmaze("", 3, 3);
        boolean maze[][]= {{true,true,true},
                            {true,true,true},
                            {true,true,true}};

                            // mazeobstacle("", maze, 0, 0);
            allpaths("", maze, 0, 0);

        
    }

    static void pathmaze(String p, int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }

        if(r>1){
            pathmaze(p + 'd', r-1, c); // it moves down
        }
        if(c>1){
            pathmaze(p +'r', r, c-1); // it moves right side
        }
        if(r>1 && c>1){
            pathmaze(p +'D', r-1, c-1);  // it moves diagonally
        }
    }

    static void mazeobstacle(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c== maze[0].length-1 ){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            mazeobstacle(p+'D', maze, r+1, c);
        }

        if(c<maze[0].length-1){
            mazeobstacle(p+'R', maze, r, c+1);
        }



        
    }

    static void allpaths(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c== maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        
        if(!maze[r][c]){
            return;
        }
        
        maze[r][c] = false;
       

        if(r<maze.length-1){
            allpaths(p +'D', maze, r+1, c);
        }



        if(c<maze[0].length-1){
            allpaths(p+'R', maze, r, c+1);
        }


        if(r>0){
            allpaths(p + 'U', maze, r-1, c);
        }

        if(c>0){
            allpaths(p + 'L', maze, r, c-1);
        }


        maze[r][c]=true;
       

}
}
