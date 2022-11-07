package com.FruitFactory.FruitFactoryApplication.servise.impl;

import com.FruitFactory.FruitFactoryApplication.servise.FruitService;
import com.FruitFactory.FruitFactoryApplication.servise.factory.Fruit;
import com.FruitFactory.FruitFactoryApplication.servise.factory.FruitFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public  class FruitServiceimpl implements FruitService {

    // 1. FruitType : Çilek ----> Çilek Meyvesi Seçilmiştir.
    // 2. FruitType : Kiraz ----> Kiraz Meyvesi Seçilmiştir.
    // 3. FruitType : Armut ----> Armut Meyvesi Üretilmiştir.
    // 4. FruitType : Erik ---->  Erik Meyvesi Seçilmiştir.
    // 5. FruitType : Mandalina ---->  Mandalina Meyvesi Seçilmiştir.

    private final FruitFactory fruitFactory;

    public FruitServiceimpl(FruitFactory fruitFactory) {
        this.fruitFactory = fruitFactory;
    }


    @Override
    public String getFruitType(String fruitType) {
        Optional<Fruit> fruit = fruitFactory.getFruit(fruitType);
        if(fruit.isPresent())
            return  fruit.get().getType();
        else
            return "Aradığınız Meyve Bulunamadı.";
    }


}
