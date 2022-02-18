// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how to handle request payload content type conversions.
     * 
     */
    @EnumType
    public enum MethodIntegrationResponseContentHandling {
        ConvertToBinary("CONVERT_TO_BINARY"),
        ConvertToText("CONVERT_TO_TEXT");

        private final String value;

        MethodIntegrationResponseContentHandling(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MethodIntegrationResponseContentHandling[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
