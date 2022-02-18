// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The mode of the connected registry resource that indicates the permissions of the registry.
     * 
     */
    @EnumType
    public enum ConnectedRegistryMode {
        Registry("Registry"),
        Mirror("Mirror");

        private final String value;

        ConnectedRegistryMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectedRegistryMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
