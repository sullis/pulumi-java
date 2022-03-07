// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Inference endpoint authentication mode type
     * 
     */
    @EnumType
    public enum EndpointAuthMode {
        AMLToken("AMLToken"),
        Key("Key"),
        AADToken("AADToken");

        private final String value;

        EndpointAuthMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EndpointAuthMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }