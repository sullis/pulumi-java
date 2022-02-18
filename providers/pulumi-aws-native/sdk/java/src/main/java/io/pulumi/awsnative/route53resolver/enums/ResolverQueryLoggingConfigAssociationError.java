// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * ResolverQueryLogConfigAssociationError
     * 
     */
    @EnumType
    public enum ResolverQueryLoggingConfigAssociationError {
        None("NONE"),
        DestinationNotFound("DESTINATION_NOT_FOUND"),
        AccessDenied("ACCESS_DENIED");

        private final String value;

        ResolverQueryLoggingConfigAssociationError(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResolverQueryLoggingConfigAssociationError[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
