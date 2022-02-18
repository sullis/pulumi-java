// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Use CLOUDFRONT for CloudFront IPSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    @EnumType
    public enum IPSetScope {
        Cloudfront("CLOUDFRONT"),
        Regional("REGIONAL");

        private final String value;

        IPSetScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IPSetScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
