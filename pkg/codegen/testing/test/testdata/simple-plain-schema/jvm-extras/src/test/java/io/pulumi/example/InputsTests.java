package io.pulumi.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import io.pulumi.Log;
import io.pulumi.example.inputs.*;
import io.pulumi.core.internal.Internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;

class InputTests {

    @Test
    void testInputsFooArgs_nullValues() {
        assertThatThrownBy(() -> {
            var args = FooArgs.Empty;
            var map = Internal.from(args).toOptionalMapAsync(mock(Log.class)).join();
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testInputsFooArgs_simpleValues() {
        var args = FooArgs.builder()
                .setA(true)
                .setB(true)
                .setC(1)
                .setD(2)
                .setE("test1")
                .setF("test2")
                .build();

        var map = Internal.from(args).toOptionalMapAsync(mock(Log.class)).join();

        assertThat(map).containsKey("a");
        assertThat(map).containsKey("b");
        assertThat(map).containsKey("c");
        assertThat(map).containsKey("d");
        assertThat(map).containsKey("e");
        assertThat(map).containsKey("f");

        assertThat(map).containsEntry("a", Optional.of(true));
        assertThat(map).containsEntry("b", Optional.of(true));
        assertThat(map).containsEntry("c", Optional.of(1));
        assertThat(map).containsEntry("d", Optional.of(2));
        assertThat(map).containsEntry("e", Optional.of("test1"));
        assertThat(map).containsEntry("f", Optional.of("test2"));
    }
}