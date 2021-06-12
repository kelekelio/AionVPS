package pl.aionpb.aion.quests.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xml.sax.SAXException;
import pl.aionpb.aion.db.object.CallbackMatcher;
import pl.aionpb.aion.quests.object.QuestObj;
import pl.aionpb.aion.translation.service.TranslationService;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author Grzegorz Nowakowski
 */
@Controller
public class QuestController {



    @Autowired
    private TranslationService translationService;




    // callback function. translate every dictionary entry in a given string. Might have an infinitive issue. but works :D
    private final CallbackMatcher.Callback questCallback = matchResult -> {
        String dictionaryString = translationService.findByName(matchResult.group(1)).getLocaString();
        String[] split = dictionaryString.split(";");
        return "" +
                "<span class=\"dictooltip\" data-tooltip-content=\"#" + matchResult.group(1) + "\">" +
                "<font color=\"#01888e\">" + split[0] + "</font>" +
                "</span>" +
                "<span class=\"tooltip_templates\" style=\"display:none\"><span id=\"" + matchResult.group(1) + "\">" + split[1] + "</span></span>"
                ;
    };


    // Regex to find all dictionary entries in a given string
    CallbackMatcher dictionaryCallbackMatcher = new CallbackMatcher("\\[%dic:(?<translation>[a-z_0-9]+)\\]");


    @RequestMapping({"/qtext/{id}"})
    public String itemView(@PathVariable(value = "id") Integer id, Model model) throws ParserConfigurationException, SAXException, XPathExpressionException, IOException, URISyntaxException {

        QuestObj quest = new QuestObj(id);  //create Quest HTML object

        quest.setQuestText(dictionaryCallbackMatcher.replaceMatches(quest.getQuestText(), questCallback));      //translate all dictionary entries in the whole HTML file
        quest.setQuestSummary(dictionaryCallbackMatcher.replaceMatches(quest.getQuestSummary(), questCallback)); //translate dictionary entries in the summery

        model.addAttribute("quest", quest);
        return "quests/qtext";
    }
}
