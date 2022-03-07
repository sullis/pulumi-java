// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required
     * 
     */
    @EnumType
    public enum RuleAction {
        /**
         * Default no action.
         * 
         */
        NoAction("NO_ACTION"),
        /**
         * Matching 'Entries' grant access.
         * 
         */
        Allow("ALLOW"),
        /**
         * Matching 'Entries' grant access and the caller promises to log the request per the returned log_configs.
         * 
         */
        AllowWithLog("ALLOW_WITH_LOG"),
        /**
         * Matching 'Entries' deny access.
         * 
         */
        Deny("DENY"),
        /**
         * Matching 'Entries' deny access and the caller promises to log the request per the returned log_configs.
         * 
         */
        DenyWithLog("DENY_WITH_LOG"),
        /**
         * Matching 'Entries' tell IAM.Check callers to generate logs.
         * 
         */
        Log("LOG");

        private final String value;

        RuleAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RuleAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }