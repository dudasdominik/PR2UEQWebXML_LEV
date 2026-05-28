package pr2ueq;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;


public class xPathPR2UEQ {


    public static void main(String[] args){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            XPathFactory PathFactory = XPathFactory.newInstance();

            var xPath = PathFactory.newXPath();



            Document document = documentBuilder.parse("C://Users//Dominik//IdeaProjects//xPathPR2UEQ//src//pr2ueq//hallgato.xml");

            document.getDocumentElement().normalize();

            String neptunkod = "/class/hallgato[@id = '02']";

            System.out.println("\n Futás Eredménye:");

            NodeList neptunKod = (NodeList) xPath.compile(neptunkod).evaluate(document, XPathConstants.NODESET);

            for (int i = 0; i < neptunKod.getLength(); i++) {
                Node node = neptunKod.item(i);

                System.out.println("\n Aktuális elem: " + node.getNodeName());


                if(node.getNodeType() == Node.ELEMENT_NODE &&node.getNodeName().equals("hallgato")){
                    Element element = (Element) node;

                    System.out.println("Hallgató ID: " + element.getAttribute("id"));

                    System.out.println("Keresztnév: " + element.getElementsByTagName("keresztnev").item(0).getTextContent());

                    System.out.println("Vezetéknév: " + element.getElementsByTagName("vezeteknev").item(0).getTextContent());

                    System.out.println("Becenév: " + element.getElementsByTagName("becenev").item(0).getTextContent());

                    System.out.println("Kor: " + element.getElementsByTagName("kor").item(0).getTextContent());

                }
            }

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
    }
}
