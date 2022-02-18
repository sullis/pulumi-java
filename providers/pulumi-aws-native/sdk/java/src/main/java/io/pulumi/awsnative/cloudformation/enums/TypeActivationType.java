// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of extension
     * 
     */
    @EnumType
    public enum TypeActivationType {
        Resource("RESOURCE"),
        Module("MODULE");

        private final String value;

        TypeActivationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TypeActivationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
