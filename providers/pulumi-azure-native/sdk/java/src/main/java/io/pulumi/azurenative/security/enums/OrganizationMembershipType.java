// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The multi cloud account's membership type in the organization
     * 
     */
    @EnumType
    public enum OrganizationMembershipType {
        Member("Member"),
        Organization("Organization");

        private final String value;

        OrganizationMembershipType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OrganizationMembershipType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
