package com.example.emi.palindromeapp;

/**
 * Created by Emi on 11.03.2018.
 */

public class StringUtility {

    public static boolean isPalindrome(String pal_org)
    {
        String pal = pal_org.toLowerCase();
        int startPos=0;
        int endPos= pal.length() -1;

        while(startPos < endPos)
        //will continue as long as our start pos is less then end pos
        //compare the first letter to the last letter and continue onwards in
        {
            //need substring variables that will test if the letters are equal
            //									start		end

            char startLetter = pal.charAt(startPos);
            char endLetter = pal.charAt(endPos);

            if(startLetter != endLetter)
            {
                return false;
            }

            startPos++; //increase startpos by 1
            endPos--;	//decrement endpos by 1 with every iteration so they meet at the center
        }

        return true;
    }
}
