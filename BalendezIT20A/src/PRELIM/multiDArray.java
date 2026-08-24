
package PRELIM;

/**
 *
 * @author admin
 */
public class multiDArray {
    public static void main (String [] args){
        double temp [][]={
            {39, 28, 14, 33, 22},
            {37.8, 35.3, 33, 31.2, 11},
            {30.5, 23, 12, 37.7, 35}
        };
        
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}

