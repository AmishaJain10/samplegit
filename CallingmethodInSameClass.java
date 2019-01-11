/* Calling methods in same class
*/
public Class CallingMethodInSameClass
{
   Public Static void main(String args[])
        {
          printOne();
          printOne();
          printTwo(); 
        }

    public static void printOne()
       {
       	System.Out.println("HelloWorld")
       }    

     public static void printTwo()
        {
        	printOne();
        	printOne();
        }   

}