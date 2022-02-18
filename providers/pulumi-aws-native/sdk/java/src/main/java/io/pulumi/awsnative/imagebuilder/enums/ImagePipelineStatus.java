// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of the image pipeline.
     * 
     */
    @EnumType
    public enum ImagePipelineStatus {
        Disabled("DISABLED"),
        Enabled("ENABLED");

        private final String value;

        ImagePipelineStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ImagePipelineStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
