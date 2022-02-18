// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the content source type.
     * 
     */
    @EnumType
    public enum ContentSourceType {
        EmbeddedContent("embeddedContent"),
        Uri("uri");

        private final String value;

        ContentSourceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContentSourceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
