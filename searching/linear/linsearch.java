class linsearch {
    public static void main(String[] args) {
        int[] num = {1,4,6,3,453,32,4};
        int ans=search(num, 8);
        System.out.println(ans);
        boolean ans1= search2(num, 9);
        System.out.println(ans1);
    


    }

    static int search(int[] arr, int key) {
        // if array is null
        if (arr.length == 0) {
            return -1;
        }
        // traversing the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        // if the element doesnt exist

        return -1;

    }
    //boolean
    static boolean search2(int[] arr, int key) {
        // if array is null
        if (arr.length == 0) {
            return false;
        }
        // traversing the array
        for(int element:arr)
        {
            if(element==key)
            {
                return true;
            }
        }

        
        // if the element doesnt exist

        return false;

    }

}