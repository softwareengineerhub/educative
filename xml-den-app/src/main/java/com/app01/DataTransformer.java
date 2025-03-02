package com.app01;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class DataTransformer {

    public Person readDataFromXml(String path) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(path);
        MyPersonDefaultHandler defaultHandler = new MyPersonDefaultHandler();
        parser.parse(file, defaultHandler);
        return defaultHandler.getPerson();
    }

}
