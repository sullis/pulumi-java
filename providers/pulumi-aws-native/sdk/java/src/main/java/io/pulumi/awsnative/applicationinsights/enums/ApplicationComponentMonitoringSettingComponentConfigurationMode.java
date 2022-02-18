// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The component monitoring configuration mode.
     * 
     */
    @EnumType
    public enum ApplicationComponentMonitoringSettingComponentConfigurationMode {
        Default("DEFAULT"),
        DefaultWithOverwrite("DEFAULT_WITH_OVERWRITE"),
        Custom("CUSTOM");

        private final String value;

        ApplicationComponentMonitoringSettingComponentConfigurationMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ApplicationComponentMonitoringSettingComponentConfigurationMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
