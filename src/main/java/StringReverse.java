
public class StringReverse {
    /**
     * Task: return the reverse of a string.
     * There are multiple good ways to solve this problem.
     *
     * You could do some math to grab characters from the end of the String using a typical for loop.
     * For instance, you could use build a String by writing a for loop that decrements rather than increments, grabbing
     * characters from the String starting from the end.
     * You could also look into the methods provided by StringBuilder.
     *
     * @param str a String.
     * @return the reverse of str.
     */
    public String reverse(String str){
        String[] rev=str.split("");
        for(int i=0;i<rev.length/2;i++)
        {
            String temp=rev[i];
            rev[i]=rev[rev.length-1-i];
            rev[rev.length-1-i]=temp;
        }
        String reve=String.join("",rev);
        return reve;
    }
}
