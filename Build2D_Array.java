/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package build2d_array;

/**
 *
 * @author OcampoG4446
 */
public class Build2D_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] my2DArray = {{1,2,3},{4,5},{6,7,8}};
        System.out.println("For Loop");
        for(int row =0; row < my2DArray.length; row++ ){
            for(int cols= 0; cols < my2DArray[row].length; cols++)
                System.out.printf(" %d",my2DArray[row][cols]);
            System.out.println();
        }
        
        System.out.println("____________________");
        System.out.println("Enhanced For Loop");
        //enhanced for loop
        for (int[] row:my2DArray)//takes care rows
        {
            for(int number : row)//takes care of columns
                System.out.printf(" %d",number);
        System.out.println();
        }
        System.out.println("____________________");
        PrintMy2DArray(my2DArray);//calling method
    }//end of main
    //method
    public static void PrintMy2DArray(int[][] my2DArray){
        System.out.println("For Loop in Method");
        for(int row =0; row < my2DArray.length; row++ ){
            for(int cols= 0; cols < my2DArray[row].length; cols++)
                System.out.printf(" %d",my2DArray[row][cols]);
            System.out.println();
        }
    }//end method
    
}
