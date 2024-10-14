public class vMultidimensonalArray {
    public static void main(String[] args) {
        int[][] dias = new int[4][4];
        dias[0][0] = 30;
        dias[0][1] = 28;
        dias[0][2] = 31;
        dias[0][3] = 30;

        dias[1][0] = 31;
        dias[1][1] = 30;
        dias[1][2] = 31;
        dias[1][3] = 30;

        dias[2][0] = 31;
        dias[2][1] = 30;
        dias[2][2] = 31;
        dias[2][3] = 30;
//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length ; j++) {
//                System.out.println(dias[i][j]);
//            }
            for (int[] num :dias){
                for (int numm : num){
                    System.out.println(numm);
                }
            }

        }
    }


