import java.util.*;

public class ch11_20a
{
    /*Write a modified version of the Vocabulary program developed in Chapter 10 that uses sets rather than
    ArrayLists to store its words. (The program will be noticeably shorter and will run faster!)*/

    public static Set<String> getWords(Scanner input)
    {
        //read all words and sort
        Set<String> words = new HashSet<>();
        while (input.hasNext())
        {
            String next = input.next().toLowerCase();
            words.add(next);
        }


        // add unique words to new list and return
        Set<String> result = new HashSet<>();
        if (words.size() > 0)
        {
            for (String string: words)
            {
               if (result.contains(string) == false)
               {
                   result.add(string);
               }
            }
        }
        return result;
    }
}
