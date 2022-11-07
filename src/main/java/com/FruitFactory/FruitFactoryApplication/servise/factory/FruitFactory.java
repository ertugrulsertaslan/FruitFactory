package com.FruitFactory.FruitFactoryApplication.servise.factory;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class FruitFactory  {

    private static final Map<String, Fruit> FRUIT_MAP= new HashMap<>();

    static {

        FRUIT_MAP.put("Kiraz",new KirazFruit());
        FRUIT_MAP.put("Armut",new ArmutFruit());
        FRUIT_MAP.put("Erik",new ErikFruit());
        FRUIT_MAP.put("Mandalina",new Mandalina());
        FRUIT_MAP.put("Çilek",new ÇilekFruit());


    }

    public Optional<Fruit> getFruit(String FruitType){
        return Optional.ofNullable(FRUIT_MAP.get(FruitType));


    }
}
