// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the blockchain protocol.
     * 
     */
    @EnumType
    public enum BlockchainProtocol {
        NotSpecified("NotSpecified"),
        Parity("Parity"),
        Quorum("Quorum"),
        Corda("Corda");

        private final String value;

        BlockchainProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BlockchainProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }