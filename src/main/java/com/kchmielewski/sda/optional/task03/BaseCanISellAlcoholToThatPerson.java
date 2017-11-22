package com.kchmielewski.sda.optional.task03;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;

public class BaseCanISellAlcoholToThatPerson implements CanISellAlcoholToThatPerson {
    public boolean canISellAlcohol(NullablePersonProvider provider) {
        return false;
    }

    public boolean canISellAlcohol(OptionalPersonProvider provider) {
        return false;
    }
}
