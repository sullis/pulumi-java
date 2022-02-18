// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This specifies the behavior for the autoReview feature when an access review completes.
     * 
     */
    @EnumType
    public enum DefaultDecisionType {
        Approve("Approve"),
        Deny("Deny"),
        Recommendation("Recommendation");

        private final String value;

        DefaultDecisionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DefaultDecisionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
