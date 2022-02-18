// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Flag if need to delete existing network security groups.
     * 
     */
    @EnumType
    public enum DeleteExistingNSGs {
        False("False"),
        True("True");

        private final String value;

        DeleteExistingNSGs(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeleteExistingNSGs[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
