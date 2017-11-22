package com.kchmielewski.sda.optional.task01;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseDefaultPersonTest {
    private final Person person = new Person("John", "Smith", 13);
    private final DefaultPerson defaultPerson = new BaseDefaultPerson();

    @Test
    public void forNullPersonReturnsDefaultOne() throws Exception {
        assertThat(new BaseDefaultPerson().getPersonOrDefault(new NullablePersonProvider(null)))
                .isEqualTo(defaultPerson.defaultPerson());
    }

    @Test
    public void forEmptyPersonReturnsDefaultOne() throws Exception {
        assertThat(new BaseDefaultPerson().getPersonOrDefault(new OptionalPersonProvider(null)))
                .isEqualTo(defaultPerson.defaultPerson());
    }

    @Test
    public void forNonNullPersonReturnsDefaultOne() throws Exception {
        assertThat(new BaseDefaultPerson().getPersonOrDefault(new NullablePersonProvider(person)))
                .isSameAs(person);
    }

    @Test
    public void forNotEmptyPersonReturnsDefaultOne() throws Exception {
        assertThat(new BaseDefaultPerson().getPersonOrDefault(new OptionalPersonProvider(person)))
                .isSameAs(person);
    }
}