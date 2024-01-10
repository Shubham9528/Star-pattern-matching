class pattern_matching {

    int hollow_rectangle_patter() 
    {
        int n = 5;                                              /*     * * * * *                  
                                                                       *       *
                                                                       *       * 
                                                                       *       * 
                                                                       * * * * *  */
        int st = n;// no of stars
        int sp = n - 2;// no.of empty spaces
        int no_of_lines = 1;
        while (no_of_lines <= n) {
            if (no_of_lines == 1 || no_of_lines == n) {
                for (int i = 1; i <= st; i++) {
                    System.out.print("* ");// print star for first and last line

                }

            } else {
                System.out.print("* ");
                for (int i = 1; i <= sp; i++) {
                    System.out.print("  ");

                }
                System.out.print("* ");

            }

            no_of_lines++;
            System.out.println();

        }
        return 0;

    }
    int rotate_half_pyramid() 
                                                    /*         
                                                                    *
                                                                  * *
                                                                * * *
                                                              * * * *         */
    {
        int n = 5;
        int st=1;
        int sp=n-1;
        int no_of_lines = 1;
        while (no_of_lines <= n) 
        {
            for(int i=1;i<=sp;i++)
            {
                System.out.print(" ");
            }
            for(int i=1;i<=st;i++)
            {
                System.out.print("*");
            }
            st+=1;
            sp-=1;
            no_of_lines++;
            System.out.println();
        }

        return 0;
        
    }
    int butterfly_pattern(){
                                                                     /*     *             * 
                                                                            * *         * * 
                                                                            * * *     * * * 
                                                                            * * * * * * * * 
                                                                            * * * * * * * * 
                                                                            * * *     * * * 
                                                                            * *         * * 
                                                                            *             *    */
        int n=5;
        int st=1;
        int sp=2*n-2;
        int no_of_lines=1;
        while(no_of_lines<=n*2){
            for(int i=1;i<=st;i++)
            {
                System.out.print("* ");
            }
            for(int i=1;i<=sp;i++)
            {
                System.out.print("  ");
            }
            
            for(int i=1;i<=st;i++)
            {
                System.out.print("* ");
            }
             
            
         if(no_of_lines<n){
              st++;
               sp=sp-2;
            
               
            }
            else if(no_of_lines>n){
              st--;
              sp=sp+2;
             
              
            }
            no_of_lines++;
            System.out.println();
            
           
            
        }
            return 0;
    }
    int solid_rhombus_pattern()
    {
                                                            /*             * * * * * 
                                                                         * * * * *   
                                                                        * * * * *     
                                                                      * * * * *       
                                                                    * * * * *         */
        int n=5;
        int st=n;
        int sp=n-1;
        int no_of_lines=1; 

        while(no_of_lines<=n)
        {
            for(int i=0;i<sp;i++){
                System.out.print("  ");
            }
            for(int i=0;i<st;i++){
                System.out.print("* ");
            }
            sp=sp-1;
            no_of_lines++;
            System.out.println();
        }

        return 0;
    }
    int hollow_rhombus_space()
                                                                            /*     * * * * * 
                                                                                  *       *   
                                                                                 *       *     
                                                                                *       *       
                                                                               * * * * *      */
    { 
        int n=5;
        int st=n;
        int sp=n-1;
        int no_of_lines=1;
        while(no_of_lines<=n)
        {
            for(int i=0;i<sp;i++)
        {
            System.out.print("  ");
        }
        if(no_of_lines==1 || no_of_lines==n)
        {
            for(int i=0;i<st;i++)
            {
                System.out.print("* ");
            }
        }
        else if(no_of_lines>1 || no_of_lines<n-1)
        {
            System.out.print("* ");
            for(int i=0;i<n-2;i++)
            {
                System.out.print("  ");
                

            }
            System.out.print("* ");
            


        }
        no_of_lines++;
        sp=sp-1;
        System.out.println();

        
    }
       return 0;


}

int dimond_pattern(){
                                                                 /*       *       
                                                                        * * *     
                                                                      * * * * *   
                                                                    * * * * * * * 
                                                                    * * * * * * * 
                                                                      * * * * *   
                                                                        * * *     
                                                                          *              */

     int n=4;
     int st=1;
     int sp=n-1;
     int no_of_lines=1;
     while(no_of_lines<=n*2)
     {
        for(int i=0;i<sp;i++)
        {
            System.out.print("  ");
        }
        for(int i=0;i<st;i++)
        {
            System.out.print("* ");
        }

          if(no_of_lines<n){
            
            sp--;
            st=st+2;
         }
        else if(no_of_lines>n){       
                sp++;
                st=st-2;
            }
       
         no_of_lines++;
        System.out.println(); 

        }
        
      
    return 0;
}


int hollow_diamond_patten(){     //code under developemnt
     
     
    int n=10;
    int st=1;//inner space
    int sp=n-1;//outer space
    int esp=2;
    int no_of_lines=1;
    while(no_of_lines<=n*2)
    {
        for(int i=0;i<sp;i++)
        {
            System.out.print("  ");
        }
        // if(no_of_lines==0 || no_of_lines==n-1)
        // {
        //    System.out.print("* ");
           

        // }
            
        System.out.print("*");
        
        for(int i=0;i<2*st-1;i++)
        {
            System.out.print("  ");
        }

        System.out.print("*");
        if(no_of_lines<n)
        {
            st=st+1;
            sp--;

        }
        else if(no_of_lines>n) {
            st=st-1;
            sp++;
            
        }
        
        no_of_lines++;;
        System.out.println();
    }





    return 0;
}


// end of class
}
class pattern 
{
    public static void main(String args[]) 
    {
        pattern_matching pm = new pattern_matching();
        // pm.hollow_rectangle_patter();
        // System.out.println();
        // pm.rotate_half_pyramid();
        // System.out.println();
        // pm.butterfly_pattern();
        // System.out.println();
        // pm.solid_rhombus_pattern();
        // System.out.println();
         //pm.hollow_rhombus_space();
          //pm.dimond_pattern();
         //pm.hollow_diamond_patten();

        

    }
}
