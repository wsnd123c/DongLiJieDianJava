package com.powernode.spring6.dao;

import java.util.List;
import java.util.Map;

public class YuQian {
    private  String[] aiHaos;
    private   List<String> list;

    @Override
    public String toString() {
        return "YuQian{" +
                "map=" + map +
                '}';
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
    private Map<Integer ,String> map;
    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }
}
