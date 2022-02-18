// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Represents the desired status of AutodefinedReverse. The only supported value on creation is DISABLE. Deletion of this resource will return AutodefinedReverse to its default value (ENABLED).
     * 
     */
    @EnumType
    public enum ResolverConfigAutodefinedReverseFlag {
        Disable("DISABLE");

        private final String value;

        ResolverConfigAutodefinedReverseFlag(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResolverConfigAutodefinedReverseFlag[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
