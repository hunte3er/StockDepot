/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.depot;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import java.io.FileReader;

/**
 *
 * @author eiker
 */
public class StockDB {
    StockDB(String filePath){
        JsonParser parser = new JSONParser();
        JsonObject = (JsonObject) parser.parse(new FileReader(filePath));
        JsonObject jsonObject = //...
        JsonNode jsonNode = convertJsonFormat(jsonObject);
        ObjectMapper mapper = new ObjectMapper();
        MyPojoClass myPojo = mapper.readValue(new TreeTraversingParser(jsonNode), MyPojoClass.class);
    }
}
