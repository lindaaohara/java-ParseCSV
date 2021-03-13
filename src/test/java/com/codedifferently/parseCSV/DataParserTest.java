package com.codedifferently.parseCSV;

import com.codedifferently.parseCSV.data.Source;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DataParserTest {

    private String csvRawData;

    @Before
    public void setUp(){
        csvRawData = Source.data;
    }

    @Test
    public void parseTeamsDataIntoObjectTest(){
        DataParser dataParser = new DataParser();
        ArrayList<Team> teams = dataParser.parseTeamsDataIntoObject(csvRawData);
        String expected = "Team Name: Manchester United\n"+
                         "Games: 38\n"+
                        "Wins: 24\n"+
                        "Losses: 5\n"+
                        "Draws: 9\n"+
                        "Goals: 87\n"+
                        "Goals Allowed: 45\n"+
                        "Points: 77";
        String actual = teams.get(2).toString();
        Assert.assertEquals(expected, actual);
    }
}
