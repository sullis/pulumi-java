// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Action. Rolloback or Upgrade.
     * 
     */
    @EnumType
    public enum UpgradeHistoryEntryAction {
        /**
         * Operation is not specified.
         * 
         */
        ActionUnspecified("ACTION_UNSPECIFIED"),
        /**
         * Upgrade.
         * 
         */
        Upgrade("UPGRADE"),
        /**
         * Rollback.
         * 
         */
        Rollback("ROLLBACK");

        private final String value;

        UpgradeHistoryEntryAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UpgradeHistoryEntryAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }