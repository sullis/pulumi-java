// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.SyncConflictResolutionPolicy;
import com.pulumi.azurenative.sql.inputs.SkuArgs;
import com.pulumi.azurenative.sql.inputs.SyncGroupSchemaArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyncGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyncGroupArgs Empty = new SyncGroupArgs();

    /**
     * Conflict logging retention period.
     * 
     */
    @Import(name="conflictLoggingRetentionInDays")
    private @Nullable Output<Integer> conflictLoggingRetentionInDays;

    /**
     * @return Conflict logging retention period.
     * 
     */
    public Optional<Output<Integer>> conflictLoggingRetentionInDays() {
        return Optional.ofNullable(this.conflictLoggingRetentionInDays);
    }

    /**
     * Conflict resolution policy of the sync group.
     * 
     */
    @Import(name="conflictResolutionPolicy")
    private @Nullable Output<Either<String,SyncConflictResolutionPolicy>> conflictResolutionPolicy;

    /**
     * @return Conflict resolution policy of the sync group.
     * 
     */
    public Optional<Output<Either<String,SyncConflictResolutionPolicy>>> conflictResolutionPolicy() {
        return Optional.ofNullable(this.conflictResolutionPolicy);
    }

    /**
     * The name of the database on which the sync group is hosted.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database on which the sync group is hosted.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * If conflict logging is enabled.
     * 
     */
    @Import(name="enableConflictLogging")
    private @Nullable Output<Boolean> enableConflictLogging;

    /**
     * @return If conflict logging is enabled.
     * 
     */
    public Optional<Output<Boolean>> enableConflictLogging() {
        return Optional.ofNullable(this.enableConflictLogging);
    }

    /**
     * Password for the sync group hub database credential.
     * 
     */
    @Import(name="hubDatabasePassword")
    private @Nullable Output<String> hubDatabasePassword;

    /**
     * @return Password for the sync group hub database credential.
     * 
     */
    public Optional<Output<String>> hubDatabasePassword() {
        return Optional.ofNullable(this.hubDatabasePassword);
    }

    /**
     * User name for the sync group hub database credential.
     * 
     */
    @Import(name="hubDatabaseUserName")
    private @Nullable Output<String> hubDatabaseUserName;

    /**
     * @return User name for the sync group hub database credential.
     * 
     */
    public Optional<Output<String>> hubDatabaseUserName() {
        return Optional.ofNullable(this.hubDatabaseUserName);
    }

    /**
     * Sync interval of the sync group.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return Sync interval of the sync group.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sync schema of the sync group.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<SyncGroupSchemaArgs> schema;

    /**
     * @return Sync schema of the sync group.
     * 
     */
    public Optional<Output<SyncGroupSchemaArgs>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The name and capacity of the SKU.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    /**
     * @return The name and capacity of the SKU.
     * 
     */
    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * ARM resource id of the sync database in the sync group.
     * 
     */
    @Import(name="syncDatabaseId")
    private @Nullable Output<String> syncDatabaseId;

    /**
     * @return ARM resource id of the sync database in the sync group.
     * 
     */
    public Optional<Output<String>> syncDatabaseId() {
        return Optional.ofNullable(this.syncDatabaseId);
    }

    /**
     * The name of the sync group.
     * 
     */
    @Import(name="syncGroupName")
    private @Nullable Output<String> syncGroupName;

    /**
     * @return The name of the sync group.
     * 
     */
    public Optional<Output<String>> syncGroupName() {
        return Optional.ofNullable(this.syncGroupName);
    }

    /**
     * If use private link connection is enabled.
     * 
     */
    @Import(name="usePrivateLinkConnection")
    private @Nullable Output<Boolean> usePrivateLinkConnection;

    /**
     * @return If use private link connection is enabled.
     * 
     */
    public Optional<Output<Boolean>> usePrivateLinkConnection() {
        return Optional.ofNullable(this.usePrivateLinkConnection);
    }

    private SyncGroupArgs() {}

    private SyncGroupArgs(SyncGroupArgs $) {
        this.conflictLoggingRetentionInDays = $.conflictLoggingRetentionInDays;
        this.conflictResolutionPolicy = $.conflictResolutionPolicy;
        this.databaseName = $.databaseName;
        this.enableConflictLogging = $.enableConflictLogging;
        this.hubDatabasePassword = $.hubDatabasePassword;
        this.hubDatabaseUserName = $.hubDatabaseUserName;
        this.interval = $.interval;
        this.resourceGroupName = $.resourceGroupName;
        this.schema = $.schema;
        this.serverName = $.serverName;
        this.sku = $.sku;
        this.syncDatabaseId = $.syncDatabaseId;
        this.syncGroupName = $.syncGroupName;
        this.usePrivateLinkConnection = $.usePrivateLinkConnection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyncGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyncGroupArgs $;

        public Builder() {
            $ = new SyncGroupArgs();
        }

        public Builder(SyncGroupArgs defaults) {
            $ = new SyncGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conflictLoggingRetentionInDays Conflict logging retention period.
         * 
         * @return builder
         * 
         */
        public Builder conflictLoggingRetentionInDays(@Nullable Output<Integer> conflictLoggingRetentionInDays) {
            $.conflictLoggingRetentionInDays = conflictLoggingRetentionInDays;
            return this;
        }

        /**
         * @param conflictLoggingRetentionInDays Conflict logging retention period.
         * 
         * @return builder
         * 
         */
        public Builder conflictLoggingRetentionInDays(Integer conflictLoggingRetentionInDays) {
            return conflictLoggingRetentionInDays(Output.of(conflictLoggingRetentionInDays));
        }

        /**
         * @param conflictResolutionPolicy Conflict resolution policy of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(@Nullable Output<Either<String,SyncConflictResolutionPolicy>> conflictResolutionPolicy) {
            $.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        /**
         * @param conflictResolutionPolicy Conflict resolution policy of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(Either<String,SyncConflictResolutionPolicy> conflictResolutionPolicy) {
            return conflictResolutionPolicy(Output.of(conflictResolutionPolicy));
        }

        /**
         * @param conflictResolutionPolicy Conflict resolution policy of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(String conflictResolutionPolicy) {
            return conflictResolutionPolicy(Either.ofLeft(conflictResolutionPolicy));
        }

        /**
         * @param conflictResolutionPolicy Conflict resolution policy of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy) {
            return conflictResolutionPolicy(Either.ofRight(conflictResolutionPolicy));
        }

        /**
         * @param databaseName The name of the database on which the sync group is hosted.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database on which the sync group is hosted.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param enableConflictLogging If conflict logging is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableConflictLogging(@Nullable Output<Boolean> enableConflictLogging) {
            $.enableConflictLogging = enableConflictLogging;
            return this;
        }

        /**
         * @param enableConflictLogging If conflict logging is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableConflictLogging(Boolean enableConflictLogging) {
            return enableConflictLogging(Output.of(enableConflictLogging));
        }

        /**
         * @param hubDatabasePassword Password for the sync group hub database credential.
         * 
         * @return builder
         * 
         */
        public Builder hubDatabasePassword(@Nullable Output<String> hubDatabasePassword) {
            $.hubDatabasePassword = hubDatabasePassword;
            return this;
        }

        /**
         * @param hubDatabasePassword Password for the sync group hub database credential.
         * 
         * @return builder
         * 
         */
        public Builder hubDatabasePassword(String hubDatabasePassword) {
            return hubDatabasePassword(Output.of(hubDatabasePassword));
        }

        /**
         * @param hubDatabaseUserName User name for the sync group hub database credential.
         * 
         * @return builder
         * 
         */
        public Builder hubDatabaseUserName(@Nullable Output<String> hubDatabaseUserName) {
            $.hubDatabaseUserName = hubDatabaseUserName;
            return this;
        }

        /**
         * @param hubDatabaseUserName User name for the sync group hub database credential.
         * 
         * @return builder
         * 
         */
        public Builder hubDatabaseUserName(String hubDatabaseUserName) {
            return hubDatabaseUserName(Output.of(hubDatabaseUserName));
        }

        /**
         * @param interval Sync interval of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Sync interval of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schema Sync schema of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<SyncGroupSchemaArgs> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Sync schema of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder schema(SyncGroupSchemaArgs schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param sku The name and capacity of the SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The name and capacity of the SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param syncDatabaseId ARM resource id of the sync database in the sync group.
         * 
         * @return builder
         * 
         */
        public Builder syncDatabaseId(@Nullable Output<String> syncDatabaseId) {
            $.syncDatabaseId = syncDatabaseId;
            return this;
        }

        /**
         * @param syncDatabaseId ARM resource id of the sync database in the sync group.
         * 
         * @return builder
         * 
         */
        public Builder syncDatabaseId(String syncDatabaseId) {
            return syncDatabaseId(Output.of(syncDatabaseId));
        }

        /**
         * @param syncGroupName The name of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(@Nullable Output<String> syncGroupName) {
            $.syncGroupName = syncGroupName;
            return this;
        }

        /**
         * @param syncGroupName The name of the sync group.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(String syncGroupName) {
            return syncGroupName(Output.of(syncGroupName));
        }

        /**
         * @param usePrivateLinkConnection If use private link connection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder usePrivateLinkConnection(@Nullable Output<Boolean> usePrivateLinkConnection) {
            $.usePrivateLinkConnection = usePrivateLinkConnection;
            return this;
        }

        /**
         * @param usePrivateLinkConnection If use private link connection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder usePrivateLinkConnection(Boolean usePrivateLinkConnection) {
            return usePrivateLinkConnection(Output.of(usePrivateLinkConnection));
        }

        public SyncGroupArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
