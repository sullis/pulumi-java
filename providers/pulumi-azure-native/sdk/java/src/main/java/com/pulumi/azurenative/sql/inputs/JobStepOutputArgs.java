// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.JobStepOutputType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The output configuration of a job step.
 * 
 */
public final class JobStepOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobStepOutputArgs Empty = new JobStepOutputArgs();

    /**
     * The resource ID of the credential to use to connect to the output destination.
     * 
     */
    @Import(name="credential", required=true)
    private Output<String> credential;

    /**
     * @return The resource ID of the credential to use to connect to the output destination.
     * 
     */
    public Output<String> credential() {
        return this.credential;
    }

    /**
     * The output destination database.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The output destination database.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The output destination resource group.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The output destination resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The output destination schema.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The output destination schema.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * The output destination server name.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The output destination server name.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The output destination subscription id.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return The output destination subscription id.
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The output destination table.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    /**
     * @return The output destination table.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    /**
     * The output destination type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,JobStepOutputType>> type;

    /**
     * @return The output destination type.
     * 
     */
    public Optional<Output<Either<String,JobStepOutputType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private JobStepOutputArgs() {}

    private JobStepOutputArgs(JobStepOutputArgs $) {
        this.credential = $.credential;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaName = $.schemaName;
        this.serverName = $.serverName;
        this.subscriptionId = $.subscriptionId;
        this.tableName = $.tableName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStepOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStepOutputArgs $;

        public Builder() {
            $ = new JobStepOutputArgs();
        }

        public Builder(JobStepOutputArgs defaults) {
            $ = new JobStepOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credential The resource ID of the credential to use to connect to the output destination.
         * 
         * @return builder
         * 
         */
        public Builder credential(Output<String> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential The resource ID of the credential to use to connect to the output destination.
         * 
         * @return builder
         * 
         */
        public Builder credential(String credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param databaseName The output destination database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The output destination database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param resourceGroupName The output destination resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The output destination resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schemaName The output destination schema.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The output destination schema.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param serverName The output destination server name.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The output destination server name.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param subscriptionId The output destination subscription id.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The output destination subscription id.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tableName The output destination table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The output destination table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        /**
         * @param type The output destination type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,JobStepOutputType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The output destination type.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,JobStepOutputType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The output destination type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The output destination type.
         * 
         * @return builder
         * 
         */
        public Builder type(JobStepOutputType type) {
            return type(Either.ofRight(type));
        }

        public JobStepOutputArgs build() {
            $.credential = Objects.requireNonNull($.credential, "expected parameter 'credential' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.schemaName = Codegen.stringProp("schemaName").output().arg($.schemaName).def("dbo").getNullable();
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            $.type = Codegen.stringProp("type").left(JobStepOutputType.class).output().arg($.type).def("SqlDatabase").getNullable();
            return $;
        }
    }

}
