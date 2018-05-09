package com.example.gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * test gradle and test json of responseBody
 * @author liutong
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        System.out.println("*********welcome to gradle test**********");
        return "welcome to gradle test";
    }

    @GetMapping("/getString")
    public String getString(){
        System.out.println("*********getString**********");
        return "hello";
    }

    @GetMapping("/getInt")
    public Integer getInt(){
        System.out.println("*********getInt**********");
        return 1000;
    }

    @GetMapping("/getList")
    public List<Integer> getList(){
        System.out.println("*********getList**********");
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        return list;
    }

    @GetMapping("/getMap")
    public Map<String, Object> getMap(){
        System.out.println("*********getMap**********");
        Map<String, Object> map = new HashMap<>(8);
        map.put("first","one");
        map.put("second","two");
        map.put("third",3);
        return map;
    }

    @GetMapping("/getMapList")
    public List<Map<String, Object>> getMapList(){
        System.out.println("*********getMapList**********");
        List<Map<String, Object>> mapList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>(8);
        map.put("first","one");
        map.put("second","two");
        map.put("third",3);
        mapList.add(map);
        map = new HashMap<>(8);
        map.put("forth","four");
        map.put("fifth","five");
        map.put("sixth",6);
        mapList.add(map);
        return mapList;
    }

}
