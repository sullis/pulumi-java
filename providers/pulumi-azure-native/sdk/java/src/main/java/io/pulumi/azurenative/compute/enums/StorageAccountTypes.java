// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the storage account type for the managed disk. Managed OS disk storage account type can only be set when you create the scale set. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @EnumType
    public enum StorageAccountTypes {
        Standard_LRS("Standard_LRS"),
        Premium_LRS("Premium_LRS"),
        StandardSSD_LRS("StandardSSD_LRS"),
        UltraSSD_LRS("UltraSSD_LRS"),
        Premium_ZRS("Premium_ZRS"),
        StandardSSD_ZRS("StandardSSD_ZRS");

        private final String value;

        StorageAccountTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StorageAccountTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
