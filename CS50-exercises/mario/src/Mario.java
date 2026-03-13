public class Mario {
    int height;

    public void setHeight(int height){
        if(height <= 0 || height > 10){
            System.out.println("Invalid height");
        } else {
            this.height = height;
        }
    }
    public int getHeight(){
        return this.height;
    }

    public void printPyramid(){
        for (int i = 1; i <= height; i++){
            for (int k = height; k > i; k--){
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }

            System.out.print("  ");

            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }



}
