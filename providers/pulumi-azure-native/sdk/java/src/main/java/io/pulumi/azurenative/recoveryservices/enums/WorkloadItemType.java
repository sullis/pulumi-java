// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Workload item type of the item for which intent is to be set
     * 
     */
    @EnumType
    public enum WorkloadItemType {
        Invalid("Invalid"),
        SQLInstance("SQLInstance"),
        SQLDataBase("SQLDataBase"),
        SAPHanaSystem("SAPHanaSystem"),
        SAPHanaDatabase("SAPHanaDatabase"),
        SAPAseSystem("SAPAseSystem"),
        SAPAseDatabase("SAPAseDatabase");

        private final String value;

        WorkloadItemType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WorkloadItemType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
