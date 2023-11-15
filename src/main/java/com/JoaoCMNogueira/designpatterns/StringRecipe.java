package com.JoaoCMNogueira.designpatterns;

import java.util.List;

import static java.nio.file.Files.size;

public class StringRecipe {

    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    public void mix(StringDrink drink){
        StringBuilder str = new StringBuilder(drink.getText());
        for (StringTransformer transformer: transformers) {
            transformer.execute(drink);
        }
    }
}
