package com.kchmielewski.sda.optional.task04;

import com.kchmielewski.sda.optional.NullablePersonProvider;
import com.kchmielewski.sda.optional.OptionalPersonProvider;
import com.kchmielewski.sda.optional.Person;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseAmIBruceDickonsonTest {
    private final Person bruce = new Person("Bruce", "Dickonson", 59);
    private final Person nonBruce = new Person("Sruce", "Srcickinson", 13);

    @Test
    public void forNullPersonReturnsFalse() throws Exception {
        assertThat(new BaseAmIBruceDickonson().amI(new NullablePersonProvider(null))).isFalse();
    }

    @Test
    public void forEmptyPersonReturnsFalse() throws Exception {
        assertThat(new BaseAmIBruceDickonson().amI(new OptionalPersonProvider(null))).isFalse();
    }

    @Test
    public void forNullableBruceReturnsTrue() throws Exception {
        assertThat(new BaseAmIBruceDickonson().amI(new NullablePersonProvider(bruce))).isTrue();
    }

    @Test
    public void forOptionalBruceReturnsTrue() throws Exception {
        assertThat(new BaseAmIBruceDickonson().amI(new OptionalPersonProvider(bruce))).isTrue();
    }

    @Test
    public void forNullableNonBruceReturnsTrue() throws Exception {
        assertThat(new BaseAmIBruceDickonson().amI(new NullablePersonProvider(nonBruce))).isFalse();
    }

    @Test
    public void forOptionalNonBruceReturnsTrue() throws Exception {
        assertThat(new BaseAmIBruceDickonson().amI(new OptionalPersonProvider(nonBruce))).isFalse();
    }

}