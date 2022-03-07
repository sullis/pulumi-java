// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    @EnumType
    public enum UserState {
        /**
         * User state is active.
         * 
         */
        Active("active"),
        /**
         * User is blocked. Blocked users cannot authenticate at developer portal or call API.
         * 
         */
        Blocked("blocked"),
        /**
         * User account is pending. Requires identity confirmation before it can be made active.
         * 
         */
        Pending("pending"),
        /**
         * User account is closed. All identities and related entities are removed.
         * 
         */
        Deleted("deleted");

        private final String value;

        UserState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UserState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }