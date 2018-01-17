package com.kchmielewski.sda.optional.task03;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BaseCanISellAlcoholToThatPersonTest {
    private final Person youngPerson = new Person("John", "Smith", 17);
    private final Person olderPerson = new Person("John", "Smith", 18);

    @Test
    public void forNullThrowsException() {
        assertThatThrownBy(() -> new BaseCanISellAlcoholToThatPerson().canISellAlcohol(new NullablePersonProvider(null)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void forEmptyPersonThrowsException() {
        assertThatThrownBy(() -> new BaseCanISellAlcoholToThatPerson().canISellAlcohol(new OptionalPersonProvider(null)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void forNotNullPersonAgedLessThan18ReturnsFalse() {
        assertThat(new BaseCanISellAlcoholToThatPerson().canISellAlcohol(new NullablePersonProvider(youngPerson))).isSameAs(false);
    }

    @Test
    public void forNotEmptyPersonAgedLessThan18ReturnsFalse() {
        assertThat(new BaseCanISellAlcoholToThatPerson().canISellAlcohol(new OptionalPersonProvider(youngPerson))).isSameAs(false);
    }

    @Test
    public void forNotNullPersonAgedMoreOrEqualTo8ReturnsFalse() {
        assertThat(new BaseCanISellAlcoholToThatPerson().canISellAlcohol(new NullablePersonProvider(olderPerson))).isSameAs(true);
    }

    @Test
    public void forNotEmptyPersonAgedMoreOrEqualTo8ReturnsFalse() {
        assertThat(new BaseCanISellAlcoholToThatPerson().canISellAlcohol(new OptionalPersonProvider(olderPerson))).isSameAs(true);
    }
}