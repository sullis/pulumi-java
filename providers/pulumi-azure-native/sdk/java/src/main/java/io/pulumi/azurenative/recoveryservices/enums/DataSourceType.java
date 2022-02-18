// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of workload this item represents.
     * 
     */
    @EnumType
    public enum DataSourceType {
        Invalid("Invalid"),
        VM("VM"),
        FileFolder("FileFolder"),
        AzureSqlDb("AzureSqlDb"),
        SQLDB("SQLDB"),
        Exchange("Exchange"),
        Sharepoint("Sharepoint"),
        VMwareVM("VMwareVM"),
        SystemState("SystemState"),
        Client("Client"),
        GenericDataSource("GenericDataSource"),
        SQLDataBase("SQLDataBase"),
        AzureFileShare("AzureFileShare"),
        SAPHanaDatabase("SAPHanaDatabase"),
        SAPAseDatabase("SAPAseDatabase");

        private final String value;

        DataSourceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataSourceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
