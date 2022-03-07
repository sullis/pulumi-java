// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The IKE integrity algorithm (IKE phase 2).
     * 
     */
    @EnumType
    public enum IkeIntegrity {
        MD5("MD5"),
        SHA1("SHA1"),
        SHA256("SHA256"),
        SHA384("SHA384"),
        GCMAES256("GCMAES256"),
        GCMAES128("GCMAES128");

        private final String value;

        IkeIntegrity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IkeIntegrity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }