package com.kchmielewski.sda.optional.task02;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasePersonNameTest {
    private final Person person = new Person("John", "Smith", 13);

    @Test
    public void forNullPersonReturnsDefaultOne() throws Exception {
        assertThat(new BasePersonName().getName(new NullablePersonProvider(null))).isEqualTo("");
    }

    @Test
    public void forEmptyPersonReturnsDefaultOne() throws Exception {
        assertThat(new BasePersonName().getName(new OptionalPersonProvider(null))).isEqualTo("");
    }

    @Test
    public void forNonNullPersonReturnsDefaultOne() throws Exception {
        assertThat(new BasePersonName().getName(new NullablePersonProvider(person))).isSameAs(person.name());
    }

    @Test
    public void forNotEmptyPersonReturnsDefaultOne() throws Exception {
        assertThat(new BasePersonName().getName(new OptionalPersonProvider(person))).isSameAs(person.name());
    }
}