
package demostring;

/**
 *
 * @author Manjot Singh(991687245)
 */
public class DemoString {

   
    public static void main(String[] args) {
//        String string = "theString";
//        System.out.println(string.charAt(0));
//        if(args.length > 0)
//             System.out.println(args[0].charAt(0));
//        else
//            System.out.print("args has no argument");
        
//        if(args.length > 0)
//             System.out.println(args[0].charAt(args.length -1));
//        else
//        System.out.print("args has no argument");
         for( String arg : args){
            System.out.println("First char of "+ arg +" in args is " + arg.charAt(0));
             System.out.println("Last char of "+ arg +" in args is " + arg.charAt(arg.length() -1));
         }
         
         for(String arg :  args){
             if(arg.indexOf('t') == -1){
                 continue;
             }
             else{
                 System.out.println("The index of t in arg " + arg + "  is " + arg.indexOf('t'));
             }
         }
    }
   
}


