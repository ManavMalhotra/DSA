class reshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c){
            return mat;
        }
        int [][] newArr = new int[r][c];
        int col = 0, row = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0 ; j < mat[0].length; j++){
            	// System.out.println(i + " " + j);
                if(col == c){
                	col = 0;
                	row++;
                }
                newArr[row][col] = mat[i][j];
                col++;
            }
        }
        
        return newArr;
    }
}