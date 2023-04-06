package controllers;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("convert")
public class FirstController {
    @GetMapping("from/{firstCurrency}/to/{secondCurrency}")
    public Map<String, String> exchange(@PathVariable String firstCurrency, @PathVariable String secondCurrency,
                                        @RequestParam int value) {
        HashMap<String, String> response = new HashMap<>();
        double returningValue = value * 0.013;
        response.put(secondCurrency, returningValue + "");
        String instanceName = "FirstProducer";
        response.put("instanceId", instanceName);
        return response;
    }
}
