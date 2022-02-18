// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of authentication used to connect to the OData service.
     * 
     */
    @EnumType
    public enum ODataAuthenticationType {
        Basic("Basic"),
        Anonymous("Anonymous"),
        Windows("Windows"),
        AadServicePrincipal("AadServicePrincipal"),
        ManagedServiceIdentity("ManagedServiceIdentity");

        private final String value;

        ODataAuthenticationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ODataAuthenticationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
