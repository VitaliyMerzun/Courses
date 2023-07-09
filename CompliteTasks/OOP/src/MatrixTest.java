public class MatrixTest {

    public static void main(String[] args) {
        Matrix testMatrix1 = new Matrix(5, 8);

        testMatrix1.printMatrix();
        System.out.println(testMatrix1.getRows());
        System.out.println(testMatrix1.getColums());

        float[][] initialMatrix = {{1,2},{3,4},{5,6}};

        Matrix testMatrix2 = new Matrix(initialMatrix);

        testMatrix2.printMatrix();
        System.out.println(testMatrix2.getRows());
        System.out.println(testMatrix2.getColums());

        Matrix testMatrix3 = new Matrix(initialMatrix);
        testMatrix3.setValue(2,1, 99);

        testMatrix2.addMatrix(testMatrix3);
        testMatrix2.printMatrix();
        System.out.println(testMatrix2.getRows());
        System.out.println(testMatrix2.getColums());

        float[][] initialMatrix1 = {{1,2},{3,4},{5,6}};
        float[][] initialMatrix2 = {{1,2,3},{4,5,6}};
        Matrix multMatrix1 = new Matrix(initialMatrix1);
        Matrix multMatrix2 = new Matrix(initialMatrix2);

        multMatrix1.matrixMult(multMatrix2).printMatrix();


    }
}
