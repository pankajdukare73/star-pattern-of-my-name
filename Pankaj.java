
class Pankaj {
    public void star(int k) {
        for (int j = 0; j < k; j++) {
            System.out.print("*");
        }

    }

    public void space(int k) {
        for (int j = 0; j < k; j++) {
            System.out.print(" ");
        }

    }

    public static void main(String[] pankaj) {
        int s[][] = { 
                        {4,2,4,2,1,3,1,2,1,2,1,2,4,3,4},
                        {1,2,1,2,1,2,1,2,2,2,1,2,1,1,1,3,1,2,1,5,1},
                        {4,2,4,2,1,1,1,1,1,2,2,4,4,5,1},
                        {1,5,1,2,1,2,1,2,2,2,1,1,1,3,1,2,1,2,1,2,1},
                        {1,5,1,2,1,2,1,3,1,2,1,2,1,2,1,2,1,2,4}
                    };
        Pankaj d = new Pankaj();
        for (int j = 0; j < s.length; j++)
         {
            for (int i = 0; i < s[j].length; i++) 
            {
                if (i % 2 == 0) 
                {
                    d.star(s[j][i]);
                } else {
                    d.space(s[j][i]);
                }
            }
            System.out.println();
        }

    }
}
/*
    Output:
            ****  ****  *   *  *  *  ****   ****
            *  *  *  *  **  *  * *   *  *     *
            ****  ****  * * *  **    ****     *
            *     *  *  *  **  * *   *  *  *  *
            *     *  *  *   *  *  *  *  *  ****
*/