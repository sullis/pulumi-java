// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The assignee's type, user/group
     * 
     */
    @EnumType
    public enum AssignmentPrincipalType {
        User("USER"),
        Group("GROUP");

        private final String value;

        AssignmentPrincipalType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AssignmentPrincipalType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
