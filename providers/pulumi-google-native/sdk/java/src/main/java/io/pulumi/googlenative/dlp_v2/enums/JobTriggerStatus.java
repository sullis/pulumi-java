// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. A status for this trigger.
     * 
     */
    @EnumType
    public enum JobTriggerStatus {
        /**
         * Unused.
         * 
         */
        StatusUnspecified("STATUS_UNSPECIFIED"),
        /**
         * Trigger is healthy.
         * 
         */
        Healthy("HEALTHY"),
        /**
         * Trigger is temporarily paused.
         * 
         */
        Paused("PAUSED"),
        /**
         * Trigger is cancelled and can not be resumed.
         * 
         */
        Cancelled("CANCELLED");

        private final String value;

        JobTriggerStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobTriggerStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }