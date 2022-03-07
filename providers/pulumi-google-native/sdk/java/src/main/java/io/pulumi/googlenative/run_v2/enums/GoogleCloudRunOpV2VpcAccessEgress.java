// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Traffic VPC egress settings.
     * 
     */
    @EnumType
    public enum GoogleCloudRunOpV2VpcAccessEgress {
        /**
         * Unspecified
         * 
         */
        VpcEgressUnspecified("VPC_EGRESS_UNSPECIFIED"),
        /**
         * All outbound traffic is routed through the VPC connector.
         * 
         */
        AllTraffic("ALL_TRAFFIC"),
        /**
         * Only private IP ranges are routed through the VPC connector.
         * 
         */
        PrivateRangesOnly("PRIVATE_RANGES_ONLY");

        private final String value;

        GoogleCloudRunOpV2VpcAccessEgress(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudRunOpV2VpcAccessEgress[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }