// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates type of action rule
     * 
     */
    @EnumType
    public enum ActionRuleType {
        Suppression("Suppression"),
        ActionGroup("ActionGroup"),
        Diagnostics("Diagnostics");

        private final String value;

        ActionRuleType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ActionRuleType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
