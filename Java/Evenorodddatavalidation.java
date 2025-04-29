import javax.swing.JOptionPane;

public class Evenorodddatavalidation {
    public static void main(String[] args)
    {
        String testNum = "";
        int num = 0;
        
        JOptionPane.showMessageDialog(null,
            "Program uses Java Gui message and input dialogs. \n" +
            "Progrm evaultes intergers as even or odd. \n" +
            "Note: Program *does* perform data validation, \n" +
            "prompting user until correct data entered.");

        testNum = JOptionPane.showInputDialog(null,
            "Enter Interger:",
            "Number Test Dialog",
            JOptionPane.INFORMATION_MESSAGE);
            
            
            while  (!isNumber(testNum))
            {
                testNum = JOptionPane.showInputDialog(null,
                    "Invalid interger.Please enter interger:",
                    "Number Test Dialog",
                    JOptionPane.INFORMATION_MESSAGE);
                }
  
  num=Integer.parseInt(testNum);
  if( num % 2 == 0 ){
    JOptionPane.showMessageDialog(null,num+" is an even number.");
  }
  else{
    JOptionPane.showMessageDialog(null,num+" is an odd number.");
  }
  
            }
private static boolean isNumber(String n){
    try{
        Integer.parseInt(n);
        return true;
    }
catch (NumberFormatException nfe){
    return false;
}
}

    
}
