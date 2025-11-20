package com.powernode.spring6.bean;

import java.util.Arrays;

public class YuQian {
    private  String[] aiHaos;

    @Override
    public String toString() {
        return "YuQian{" +
                "aiHaos=" + Arrays.toString(aiHaos) +
                '}';
    }

    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }
}
