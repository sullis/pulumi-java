// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The token type. Must be either PersonalAccessToken or Oauth.
     * 
     */
    @EnumType
    public enum TokenType {
        PersonalAccessToken("PersonalAccessToken"),
        Oauth("Oauth");

        private final String value;

        TokenType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TokenType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }