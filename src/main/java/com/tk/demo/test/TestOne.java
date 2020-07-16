package com.tk.demo.test;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;

public class TestOne {

    public static void main(String[] args) {
        //筛选方法

        List<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i+"次helloworldand"+i*10);
        }

    }

    private List<String> filterData(List<String> list,String str,int num){
        List<String> resultListOne = new ArrayList<>();
        for(String s:list){
            if(str.equals(s)){
                resultListOne.add(s);
            }
        }

        List<String> resultListTwo= new ArrayList<>();
        for(String ss:resultListOne){
            if(ss.endsWith("60")){
                resultListTwo.add(ss);
            }
        }
        return null;
    }
}
