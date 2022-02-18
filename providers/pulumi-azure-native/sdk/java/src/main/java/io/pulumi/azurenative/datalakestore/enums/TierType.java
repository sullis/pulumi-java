// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The commitment tier to use for next month.
     * 
     */
    @EnumType
    public enum TierType {
        Consumption("Consumption"),
        Commitment_1TB("Commitment_1TB"),
        Commitment_10TB("Commitment_10TB"),
        Commitment_100TB("Commitment_100TB"),
        Commitment_500TB("Commitment_500TB"),
        Commitment_1PB("Commitment_1PB"),
        Commitment_5PB("Commitment_5PB");

        private final String value;

        TierType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TierType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
