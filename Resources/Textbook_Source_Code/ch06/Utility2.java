
public class Utility2
{
    /**
     Returns the first argument with all occurrences of other arguments deleted;
    */
    public static String censor(String sentence, String...  unwanted)
    {
        for (int i = 0; i < unwanted.length; i++)
            sentence = deleteOne(sentence, unwanted[i]);
        return sentence;
    }

      /**
     Returns sentence with all occurrences of oneUnwanted removed.
    */
    private static String deleteOne(String sentence, String oneUnwanted)
    {
        String ending;
        int position = sentence.indexOf(oneUnwanted);
        while (position >= 0) //While word was found in sentence
        {
            ending = sentence.substring(position + oneUnwanted.length( ));
            sentence = sentence.substring(0, position) + ending;
            position = sentence.indexOf(oneUnwanted);
        }
        return sentence;
    }
}
