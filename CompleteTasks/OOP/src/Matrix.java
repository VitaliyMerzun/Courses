import java.util.Arrays;

public class Matrix {

    public final int rows;

    public final int colums;

    public float[][] matrix;

    public Matrix(int rows, int colums){
        this.rows = rows;
        this.colums = colums;
        this.matrix = new float[rows][colums];
    }

    public Matrix(float[][] matrix){
        this.rows = matrix.length;
        this.colums = matrix[0].length;
        this.matrix = matrix;
    }

    public int getColums() { return this.colums; }

    public int getRows() { return this.rows; }

    public float getValue(int colums, int rows) { return matrix[colums][rows]; }

    public void setValue(int colums, int rows, float value) {
        matrix[colums][rows] = value;
    }

    public void addMatrix(Matrix matrix2) {
        if (getRows() == matrix2.getRows() & getColums() == matrix2.getColums()) {
            for (int y = 0; y < getRows(); y++)
                for (int x = 0; x < getColums(); x++) {
                    matrix[y][x] += matrix2.matrix[y][x];
                }
        }
        else
            System.out.println("Матрицы различных размеров");
        }

    public void matrixOnFloatMult(float num) {
        for (int y = 0; y < getRows(); y++)
            for (int x = 0; x < getColums(); x++)
                matrix[y][x] *= num;
    }

    public Matrix matrixMult(Matrix matrix1) {

        if (getRows() == matrix1.getColums()) {
            Matrix resultMatrix = new Matrix(getRows(), matrix1.getColums());
            for (int y = 0; y < getRows(); y++)
                for (int x = 0; x < matrix1.getColums(); x++) {
                    float num = 0.0f;
                    for (int z = 0; z < matrix1.getRows(); z++)
                        num += matrix[y][z] * matrix1.matrix[z][x];
                    resultMatrix.matrix[y][x] = num;
                }
            return resultMatrix;
        }
        else
            return null;
    }

    public void printMatrix(){
        for (float[] ints :matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

}
