// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
     * 
     */
    @EnumType
    public enum LoginMode {
        /**
         * The LOGON32_LOGON_BATCH Win32 login mode. The batch login mode is recommended for long running parallel processes.
         * 
         */
        Batch("Batch"),
        /**
         * The LOGON32_LOGON_INTERACTIVE Win32 login mode. Some applications require having permissions associated with the interactive login mode. If this is the case for an application used in your task, then this option is recommended.
         * 
         */
        Interactive("Interactive");

        private final String value;

        LoginMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LoginMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }