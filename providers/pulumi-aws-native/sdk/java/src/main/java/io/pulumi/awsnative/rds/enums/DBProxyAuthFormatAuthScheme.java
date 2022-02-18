// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    @EnumType
    public enum DBProxyAuthFormatAuthScheme {
        Secrets("SECRETS");

        private final String value;

        DBProxyAuthFormatAuthScheme(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DBProxyAuthFormatAuthScheme[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
