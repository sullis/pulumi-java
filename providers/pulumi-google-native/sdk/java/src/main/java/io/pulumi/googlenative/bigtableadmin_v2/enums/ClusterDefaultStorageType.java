// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden.
     * 
     */
    @EnumType
    public enum ClusterDefaultStorageType {
        /**
         * The user did not specify a storage type.
         * 
         */
        StorageTypeUnspecified("STORAGE_TYPE_UNSPECIFIED"),
        /**
         * Flash (SSD) storage should be used.
         * 
         */
        Ssd("SSD"),
        /**
         * Magnetic drive (HDD) storage should be used.
         * 
         */
        Hdd("HDD");

        private final String value;

        ClusterDefaultStorageType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ClusterDefaultStorageType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }