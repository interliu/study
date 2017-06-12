package com.lm.interliu.thinking.c5.pets;


import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "com.lm.interliu.thinking.c5.pets.Mutt",
            "com.lm.interliu.thinking.c5.pets.Pug",
            "com.lm.interliu.thinking.c5.pets.EgyptianMau",
            "com.lm.interliu.thinking.c5.pets.Manx",
            "com.lm.interliu.thinking.c5.pets.Cymric",
            "com.lm.interliu.thinking.c5.pets.Rat",
            "com.lm.interliu.thinking.c5.pets.Mouse",
            "com.lm.interliu.thinking.c5.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
