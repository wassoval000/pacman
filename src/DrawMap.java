public class DrawMap {

    static int[][] arr = new int[700][900];
    static int rows = 700;
    static int col = 900;
    static int edge1 = 300;
    static int e0 = 50;
    static int e1 = 650;
    static int e2 = 350;
    static int e3 = 700/4;
    static int e4 = (700/4)-60;
    static int e5 = (700/4)*3;
    static int e6 = ((700/4)*3)+60;
    static int e7 = (700/2)-90;
    static int e8 = (700/2)+90;
    static int mid0 = (edge1/2)+60;
    static int mid1 = 450+(edge1/2);
    static int mid2 = mid1+(edge1/3)+60;
    static int left0 = (900/4)+30;
    static int left1 = (900/2)+30;
    static int hor0 = ((700/4)*3)+60;

    static int[][] pacArr = new int[700][900];
    static int pac0 = (700/4)-30;
    static int pac1 = (900/3)-35;
    static int pac2 = 900-10;

    public static void draw() {

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                arr[j][i] = 0;
            }
        }
        for (int i = 0; i < col - (edge1 * 2); i++) {
            arr[e0][i] = 1;
            arr[e1][i] = 1;
        }
        for (int i = (edge1 * 2); i < col; i++) {
            arr[e0][i] = 1;
            arr[e1][i] = 1;
        }
        for (int i = 0; i < (edge1 / 2.0); i++) {
            arr[e2][i] = 1;
        }
        for (int i = mid0; i < mid0 + (edge1 / 3.0); i++) {
            arr[e2][i] = 1;
        }
        for (int i = mid1; i < mid1 + (edge1 / 3.0); i++) {
            arr[e2][i] = 1;
        }
        for (int i = mid2; i < mid2 + (edge1 / 3.0); i++) {
            arr[e2][i] = 1;
        }
        for (int i = left0; i < (col / 2) - 60; i++) {
            arr[e3][i] = 1;
            arr[e5][i] = 1;
            if (i > edge1) {
                arr[e4][i] = 1;
                arr[e6][i] = 1;
            }
        }
        for (int i = left1; i < 2 * edge1; i++) {
            arr[e3][i] = 1;
            arr[e5][i] = 1;
            if (i > edge1) {
                arr[e4][i] = 1;
                arr[e6][i] = 1;
            }
        }
        for (int i = col - (edge1 / 2); i < col - 60; i++) {
            arr[e3][i] = 1;
            arr[e5][i] = 1;
        }
        for (int i = (col - edge1) + 60; i < col - (edge1 / 2); i++) {
            arr[e4][i] = 1;
            arr[e6][i] = 1;
        }
        for (int i = (col / 2) - 50; i < (col / 2) + 50; i++) {
            arr[e7][i] = 1;
            arr[e8][i] = 1;
        }
        for (int i = e4; i >= 0; i--) {
            arr[i][(col / 2) - 60] = 1;
            arr[i][(col / 2) + 30] = 1;
        }
        for (int i = e4; i >= e0; i--) {
            arr[i][edge1] = 1;
            arr[i][col - edge1] = 1;
        }
        for (int i = hor0; i <= rows - e0; i++) {
            arr[i][edge1] = 1;
            arr[i][col - edge1] = 1;
        }
        for (int i = rows + 115; i <= rows; i--) {
            arr[i][(col / 2) - 60] = 1;
            arr[i][(col / 2) + 30] = 1;
        }
        for (int i = (rows / 2) + 90; i >= (rows / 2) - 90; i--) {
            arr[i][(col / 2) + 50] = 1;
            arr[i][(col / 2) - 50] = 1;
            for (int j = (rows / 2) + 40; j >= (rows / 2) - 40; j--) {
                arr[j][(col / 2) - 50] = 0;
            }
        }
        for (int i = e0 + 60; i <= e2 - 100; i++) {
            arr[i][(col / 3) - 45] = 1;
        }
        for (int i = rows - (e0 + 60); i >= 450; i--) {
            arr[i][(col / 3) - 45] = 1;
        }
        for (int i = e0 + 60; i <= e3; i++) {
            arr[i][60] = 1;
            arr[i][150] = 1;
        }
        for (int i = rows - (e0 + 60); i >= 3 * (e3); i--) {
            arr[i][60] = 1;
            arr[i][150] = 1;
        }
        for (int i = (rows / 2) - 100; i <= (rows / 2) + 100; i++) {
            arr[i][(col / 2) + 150] = 1;
            arr[i][col - 140] = 1;
            arr[i][(col / 4) - 15] = 1;
        }
        for (int i = (rows / 3) - 30; i <= (rows / 3) + 50; i++) {
            arr[i][(col / 8)] = 1;
            arr[i][col - (col / 4)] = 1;
        }
        for (int i = (2 * (rows / 3)) + 30; i >= (2 * (rows / 3)) - 50; i--) {
            arr[i][(col / 8)] = 1;
            arr[i][col - (col / 4)] = 1;
        }
        for (int i = ((rows / 4) * 3) + 60; i <= rows-1; i++) {
            arr[i][(col/2)-60] = 1;
            arr[i][(col/2)+30] = 1;
        }

        ///////////////////////////////////////////

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                pacArr[i][j] = 0;
            }
        }
        for(int i = pac1; i <= pac2; i++){

            pacArr[pac0][i] = 1;

        }
    }

}
