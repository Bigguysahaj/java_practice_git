public class triangle{
    public static void main(String[] args){
        triangle(4,0);
    }

    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
           
            
            
            triangle(r,c+1);
            System.out.print("*");
            
        }
        else {
            
            
            triangle(r-1,0);
            System.out.println();
            // this line only execute after the function call is poped off
        }
    }
    // static void fulltriangle(int r, int c){
    //     if (r==0){
    //         return;
    //     }

    //     if ()
            
    // }

}