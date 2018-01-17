package com.kchmielewski.sda.optional.task04;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseAmIBruceDickinsonTest {
    private final Person bruce = new Person("Bruce", "Dickinson", 59);
    private final Person nonBruce = new Person("Sruce", "Srcickinson", 13);

    @Test
    public void forNullPersonReturnsFalse() {
        assertThat(new BaseAmIBruceDickinson().amI(new NullablePersonProvider(null))).isFalse();
    }

    @Test
    public void forEmptyPersonReturnsFalse() {
        assertThat(new BaseAmIBruceDickinson().amI(new OptionalPersonProvider(null))).isFalse();
    }

    @Test
    public void forNullableBruceReturnsTrue() {
        assertThat(new BaseAmIBruceDickinson().amI(new NullablePersonProvider(bruce))).isTrue();
    }

    @Test
    public void forOptionalBruceReturnsTrue() {
        assertThat(new BaseAmIBruceDickinson().amI(new OptionalPersonProvider(bruce))).isTrue();
    }

    @Test
    public void forNullableNonBruceReturnsTrue() {
        assertThat(new BaseAmIBruceDickinson().amI(new NullablePersonProvider(nonBruce))).isFalse();
    }

    @Test
    public void forOptionalNonBruceReturnsTrue() {
        assertThat(new BaseAmIBruceDickinson().amI(new OptionalPersonProvider(nonBruce))).isFalse();
    }

}