// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The component name. Currently, the only allowable value is Microsoft-Windows-Shell-Setup.
     * 
     */
    @EnumType
    public enum ComponentNames {
        MicrosoftWindowsShellSetup("Microsoft-Windows-Shell-Setup");

        private final String value;

        ComponentNames(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComponentNames[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
