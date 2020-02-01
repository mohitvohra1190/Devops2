import javafx.print.PageOrientation;

import javax.swing.text.PlainDocument;

public class Palidrome {

    String text = "";

    public void setText(String input)
    {
        this.text=input;

    }

    public String getText()
    {
        return text;
    }

public boolean checkPalidrome()
    {

        int len= text.length();
        int end = len-1;
        int limit = len/2;
        int start=0;
        boolean isPalindrome=true;
        for(int i=1;i<=limit;i++)
        {
            if(text.charAt(start)!=text.charAt(end))
            {
                isPalindrome = false;
                break;

            }

            else
            {
                end=end-1;
                start=start+1;
            }
        }

   return(isPalindrome);

    }

    public static void main(String ar[])
    {
        Palidrome pl = new Palidrome();

        pl.setText("madam");
      // pl.checkPalidrome();
        System.out.println("Is"+" "+pl.getText()+" a palidrome "+" "+pl.checkPalidrome());
    }
}
