// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Scope for this rule. The scope and filter determine which clients match the rule.
     * 
     */
    @EnumType
    public enum NfsAccessRuleScope {
        Default_("default"),
        Network("network"),
        Host("host");

        private final String value;

        NfsAccessRuleScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NfsAccessRuleScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
