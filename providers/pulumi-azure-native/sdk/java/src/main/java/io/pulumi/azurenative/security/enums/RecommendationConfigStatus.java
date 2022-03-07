// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Recommendation status. When the recommendation status is disabled recommendations are not generated.
     * 
     */
    @EnumType
    public enum RecommendationConfigStatus {
        Disabled("Disabled"),
        Enabled("Enabled");

        private final String value;

        RecommendationConfigStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RecommendationConfigStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }