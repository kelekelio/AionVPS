package pl.aionpb.aion.db.object;


import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Grzegorz Nowakowski
 */
public class CallbackMatcher {

    public interface Callback {
        String foundMatch(MatchResult matchResult);
    }

    private final Pattern pattern;

    public CallbackMatcher(String regex)
    {
        this.pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    }

    public String replaceMatches(String string, Callback callback)
    {
        //System.out.println(string);
        Matcher matcher = this.pattern.matcher(string);
        while(matcher.find())
        {
            final MatchResult matchResult = matcher.toMatchResult();
            final String replacement = callback.foundMatch(matchResult);
            string = string.substring(0, matchResult.start()) +
                    replacement + string.substring(matchResult.end());
            matcher.reset(string);
        }
        return string;
    }
}
