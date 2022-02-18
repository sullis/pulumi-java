// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The artifact source's type.
     * 
     */
    @EnumType
    public enum SourceControlType {
        VsoGit("VsoGit"),
        GitHub("GitHub"),
        StorageAccount("StorageAccount");

        private final String value;

        SourceControlType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SourceControlType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
