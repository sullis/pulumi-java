// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The cluster's billing type.
     * 
     */
    @EnumType
    public enum BillingType {
        Cluster("Cluster"),
        Workspaces("Workspaces");

        private final String value;

        BillingType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BillingType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
