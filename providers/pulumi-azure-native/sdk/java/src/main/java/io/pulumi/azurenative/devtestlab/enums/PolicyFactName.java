// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     * 
     */
    @EnumType
    public enum PolicyFactName {
        UserOwnedLabVmCount("UserOwnedLabVmCount"),
        UserOwnedLabPremiumVmCount("UserOwnedLabPremiumVmCount"),
        LabVmCount("LabVmCount"),
        LabPremiumVmCount("LabPremiumVmCount"),
        LabVmSize("LabVmSize"),
        GalleryImage("GalleryImage"),
        UserOwnedLabVmCountInSubnet("UserOwnedLabVmCountInSubnet"),
        LabTargetCost("LabTargetCost"),
        EnvironmentTemplate("EnvironmentTemplate"),
        ScheduleEditPermission("ScheduleEditPermission");

        private final String value;

        PolicyFactName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PolicyFactName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
