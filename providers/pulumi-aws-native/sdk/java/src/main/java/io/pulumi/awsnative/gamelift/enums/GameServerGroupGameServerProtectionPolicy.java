// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * 
     */
    @EnumType
    public enum GameServerGroupGameServerProtectionPolicy {
        NoProtection("NO_PROTECTION"),
        FullProtection("FULL_PROTECTION");

        private final String value;

        GameServerGroupGameServerProtectionPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GameServerGroupGameServerProtectionPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }