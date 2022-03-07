// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Status of the issue.
     * 
     */
    @EnumType
    public enum State {
        /**
         * The issue is proposed.
         * 
         */
        Proposed("proposed"),
        /**
         * The issue is opened.
         * 
         */
        Open("open"),
        /**
         * The issue was removed.
         * 
         */
        Removed("removed"),
        /**
         * The issue is now resolved.
         * 
         */
        Resolved("resolved"),
        /**
         * The issue was closed.
         * 
         */
        Closed("closed");

        private final String value;

        State(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "State[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }