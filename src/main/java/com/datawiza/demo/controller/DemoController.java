package com.datawiza.demo.controller;

import com.datawiza.demo.vo.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    @PostMapping("/animals")
    @ResponseBody
    public Map<String, Object> importAnAnimalIntoZoo(Animal animal) {
        HashMap<String, Object> response = new HashMap<>();
        response.put("data", animal);
        return response;
    }
}
