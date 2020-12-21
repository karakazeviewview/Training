class TScore2 {

    public static void main(String args[]) {
int[] array=new int[5];
array[0]=1;
array[1]=5;
array[2]=10;
array[3]=8;
array[4]=9;
        //int [] array = {1,5,10,8,9};

        int intMax = calcMax(array);
        int intMin = calcMin(array);

        System.out.println("最大値は" + intMax);
        System.out.println("最小値は" + intMin);
    }

    public static int calcMax(int[] array) {

        int intMax = array[0];

        for (int i = 1; i < array.length; i++ ) {
            if(intMax < array[i]) {
                intMax = array[i];
            }
        }
        return intMax;
    }

    public static int calcMin(int[] array) {

        int intMin = array[0];

        for (int i = 1; i < array.length; i++ ) {
            if(intMin > array[i]) {
                intMin = array[i];
            }
        }
        return intMin;
    }
}
