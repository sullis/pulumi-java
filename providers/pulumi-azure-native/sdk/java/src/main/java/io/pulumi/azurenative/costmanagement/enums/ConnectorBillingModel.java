// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Connector billing model
     * 
     */
    @EnumType
    public enum ConnectorBillingModel {
        Trial("trial"),
        AutoUpgrade("autoUpgrade"),
        Premium("premium"),
        Expired("expired");

        private final String value;

        ConnectorBillingModel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectorBillingModel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
