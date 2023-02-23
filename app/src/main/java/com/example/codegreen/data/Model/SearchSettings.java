package com.example.codegreen.data.Model;

import android.app.Activity;

import com.example.codegreen.View.SearchActivity;

public class SearchSettings {
    private static boolean fromSettings;
    private static String produceID;
    private static String areaID;

    public SearchSettings(boolean fromSettings, String produceID, String areaID) {
        SearchSettings.fromSettings = fromSettings;
        setProduceID(produceID);
        setAreaID(areaID);
    }

    public static boolean isFromSettings() {
        return fromSettings;
    }

    public static void setFromSettings(boolean fromSettings) {
        SearchSettings.fromSettings = fromSettings;
    }

    public static String getProduceID() {
        return produceID;
    }

    public static void setProduceID(String produceID) {
        switch (produceID){
            case "POR", "BEE","CHI","GOA","FIS", "CLA","SQU","SHR"
                    -> SearchSettings.produceID = produceID;
            default -> {
                System.out.println("An Error has occurred");
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }
    }

    public static String getAreaID() {
        return areaID;
    }

    public static void setAreaID(String areaID) {
        SearchSettings.areaID = areaID;
    }
}
