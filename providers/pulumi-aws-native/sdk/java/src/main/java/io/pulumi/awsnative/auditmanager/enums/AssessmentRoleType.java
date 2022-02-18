// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     *  The IAM role type.
     * 
     */
    @EnumType
    public enum AssessmentRoleType {
        ProcessOwner("PROCESS_OWNER"),
        ResourceOwner("RESOURCE_OWNER");

        private final String value;

        AssessmentRoleType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AssessmentRoleType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
