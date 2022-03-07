// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Storage Redundancy type offered by Azure.
     * 
     */
    @EnumType
    public enum AzureStorageRedundancy {
        Unknown("Unknown"),
        LocallyRedundant("LocallyRedundant"),
        ZoneRedundant("ZoneRedundant"),
        GeoRedundant("GeoRedundant"),
        ReadAccessGeoRedundant("ReadAccessGeoRedundant");

        private final String value;

        AzureStorageRedundancy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AzureStorageRedundancy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }