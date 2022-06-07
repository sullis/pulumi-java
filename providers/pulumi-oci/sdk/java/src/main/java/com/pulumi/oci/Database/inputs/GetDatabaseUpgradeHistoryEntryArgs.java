// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseUpgradeHistoryEntryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseUpgradeHistoryEntryArgs Empty = new GetDatabaseUpgradeHistoryEntryArgs();

    /**
     * The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="databaseId", required=true)
    private Output<String> databaseId;

    /**
     * @return The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> databaseId() {
        return this.databaseId;
    }

    /**
     * The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="upgradeHistoryEntryId", required=true)
    private Output<String> upgradeHistoryEntryId;

    /**
     * @return The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> upgradeHistoryEntryId() {
        return this.upgradeHistoryEntryId;
    }

    private GetDatabaseUpgradeHistoryEntryArgs() {}

    private GetDatabaseUpgradeHistoryEntryArgs(GetDatabaseUpgradeHistoryEntryArgs $) {
        this.databaseId = $.databaseId;
        this.upgradeHistoryEntryId = $.upgradeHistoryEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseUpgradeHistoryEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseUpgradeHistoryEntryArgs $;

        public Builder() {
            $ = new GetDatabaseUpgradeHistoryEntryArgs();
        }

        public Builder(GetDatabaseUpgradeHistoryEntryArgs defaults) {
            $ = new GetDatabaseUpgradeHistoryEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder databaseId(Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param upgradeHistoryEntryId The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder upgradeHistoryEntryId(Output<String> upgradeHistoryEntryId) {
            $.upgradeHistoryEntryId = upgradeHistoryEntryId;
            return this;
        }

        /**
         * @param upgradeHistoryEntryId The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder upgradeHistoryEntryId(String upgradeHistoryEntryId) {
            return upgradeHistoryEntryId(Output.of(upgradeHistoryEntryId));
        }

        public GetDatabaseUpgradeHistoryEntryArgs build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            $.upgradeHistoryEntryId = Objects.requireNonNull($.upgradeHistoryEntryId, "expected parameter 'upgradeHistoryEntryId' to be non-null");
            return $;
        }
    }

}
