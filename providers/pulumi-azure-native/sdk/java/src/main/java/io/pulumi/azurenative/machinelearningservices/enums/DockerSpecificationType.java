// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Docker specification must be either Build or Image
     * 
     */
    @EnumType
    public enum DockerSpecificationType {
        Build("Build"),
        Image("Image");

        private final String value;

        DockerSpecificationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DockerSpecificationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
