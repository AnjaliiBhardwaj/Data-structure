class SetMatrixZero{
    public void setRow(int matrix[][], int row, int col, int i){
        for(int c=0;c<col;c++){
            if(matrix[i][c]!=0){
                matrix[i][c]=-999999;
            }
        }
    }
    public void setCol(int matrix[][], int row, int col, int j){
        for(int r=0;r<row;r++){
            if(matrix[r][j]!=0){
                matrix[r][j]=-999999;
            }
        }
    }
    public void setZero(int matrix[][],int row, int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-999999){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    setRow(matrix,row,col,i);
                    setCol(matrix,row,col,j);
                }
            }
        }
        setZero(matrix, row, col);
    }
}