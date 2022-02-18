// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Flag if need to remove current existing peerings.
     * 
     */
    @EnumType
    public enum DeleteExistingPeering {
        False("False"),
        True("True");

        private final String value;

        DeleteExistingPeering(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeleteExistingPeering[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
