package com.kchmielewski.sda.optional.task03;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;

public interface CanISellAlcoholToThatPerson {
    boolean canISellAlcohol(NullablePersonProvider provider);

    boolean canISellAlcohol(OptionalPersonProvider provider);
}
