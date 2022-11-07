package com.FruitFactory.FruitFactoryApplication.Controller;

import com.FruitFactory.FruitFactoryApplication.servise.FruitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value=("FruitService"))
public class FruitController {

    private final FruitService FruitService;

    public FruitController(FruitService FruitService){


        this.FruitService = FruitService;

    }

    @GetMapping("/{FruitType}")
    public String getFruitType(@PathVariable String FruitType){
        // Servisten dönen response(cevap) u al ve yolla

      return FruitService.getFruitType(FruitType);

    }

}
