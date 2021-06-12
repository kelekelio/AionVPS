package pl.aionpb.aion.quests.object;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import pl.aionpb.aion.db.object.Settings;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Grzegorz Nowakowski
 */
public class QuestObj {

    private String questText;
    private String questSummary;


    public QuestObj(int id) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, URISyntaxException {

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        Document xmlDocument = builder.parse(getXmlInputSource(id));

        this.questText =
                getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select1')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select2')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select3')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select4')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select5')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select6')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select7')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select8')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select9')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select10')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select11')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select12')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select13')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select_success')]") +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'select_quest_reward')]") + "Completion: " +
                        getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'quest_complete')]")
        ;

        this.questSummary = getNodeList(xmlDocument, "//HtmlPage[starts-with(@name, 'quest_summary')]");


    }

    public QuestObj() {
    }

    public String getQuestText() {
        return questText;
    }

    public void setQuestText(String questText) {
        this.questText = questText;
    }

    public String getQuestSummary() {
        return questSummary;
    }

    public void setQuestSummary(String questSummary) {
        this.questSummary = questSummary;
    }

    private InputSource getXmlInputSource (int id) throws IOException, URISyntaxException {
        return new InputSource(new StringReader(putXmlIntoString(id)));
    }


    public static String putXmlIntoString (int id) throws URISyntaxException, IOException {
        String server = Settings.getServerId();
        String code = Settings.getLocaCode();


        String filePath = "static/server/" + server + "/quest/" + code + "/quest_q" + id + ".html";
        URL res = QuestObj.class.getClassLoader().getResource(filePath);

        if (res == null) {
            filePath = "static/server/" + server + "/quest/ko/quest_q" + id + ".html";
            res = QuestObj.class.getClassLoader().getResource(filePath);

            if (res == null) {
                filePath = "static/server/common/quest/quest_qempty.html";
                res = QuestObj.class.getClassLoader().getResource(filePath);
            }
        }

        String conents = new String(Files.readAllBytes(Paths.get(res.toURI())));

        conents = conents.replaceAll("<Contents cdata=\"true\">", "<Content><![CDATA[");
        conents = conents.replaceAll("</Contents>", "]]></Content>");

        return conents;
    }


    public static String getNodeString (Document xmlDocument, String expression) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        Node node = (Node) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODE);

        if (node == null) {
            return "";
        } else {
            return node.getTextContent();
        }
    }

    public static String getNodeList (Document xmlDocument, String expression) throws XPathExpressionException {

        StringBuilder questHtml = new StringBuilder();

        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nl = (NodeList) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);

        for(int i=0; i < nl.getLength() ; i++) {
            Node node = nl.item(i);
            questHtml.append(node.getTextContent());
        }
        return questHtml.toString();
    }
}
