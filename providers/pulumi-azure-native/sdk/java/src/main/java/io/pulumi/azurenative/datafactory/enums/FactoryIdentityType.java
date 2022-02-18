// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The identity type.
     * 
     */
    @EnumType
    public enum FactoryIdentityType {
        SystemAssigned("SystemAssigned"),
        UserAssigned("UserAssigned"),
        SystemAssigned_UserAssigned("SystemAssigned,UserAssigned");

        private final String value;

        FactoryIdentityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FactoryIdentityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
