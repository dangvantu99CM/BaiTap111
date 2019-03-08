
package mvc_matrixbutton;

/**
 *
 * @author lenovo i3
 */
public class Model {
    public int[][] matrix = new int[5][5];
    public Model(int [][] matr){
        setMatrix(matr);       
    }
    public void setMatrix(int [][] mat){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = mat[i][j];
            }
        }
    }
    public int [][] getMatrix(){
        return matrix;
    }
    public void cungtang(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] += 1;
            }
        }
    }
    public void cunggiam(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] -= 1;
            }
        }
    }
    
}
