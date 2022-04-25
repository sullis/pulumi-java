// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

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
public final class JobStepOutputResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobStepOutputResponse Empty = new JobStepOutputResponse();

    /**
     * The resource ID of the credential to use to connect to the output destination.
     * 
     */
    @Import(name="credential", required=true)
    private String credential;

    /**
     * @return The resource ID of the credential to use to connect to the output destination.
     * 
     */
    public String credential() {
        return this.credential;
    }

    /**
     * The output destination database.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The output destination database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The output destination resource group.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable String resourceGroupName;

    /**
     * @return The output destination resource group.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The output destination schema.
     * 
     */
    @Import(name="schemaName")
    private @Nullable String schemaName;

    /**
     * @return The output destination schema.
     * 
     */
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * The output destination server name.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The output destination server name.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * The output destination subscription id.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable String subscriptionId;

    /**
     * @return The output destination subscription id.
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The output destination table.
     * 
     */
    @Import(name="tableName", required=true)
    private String tableName;

    /**
     * @return The output destination table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * The output destination type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The output destination type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private JobStepOutputResponse() {}

    private JobStepOutputResponse(JobStepOutputResponse $) {
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
    public static Builder builder(JobStepOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStepOutputResponse $;

        public Builder() {
            $ = new JobStepOutputResponse();
        }

        public Builder(JobStepOutputResponse defaults) {
            $ = new JobStepOutputResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param credential The resource ID of the credential to use to connect to the output destination.
         * 
         * @return builder
         * 
         */
        public Builder credential(String credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param databaseName The output destination database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param resourceGroupName The output destination resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param schemaName The output destination schema.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param serverName The output destination server name.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param subscriptionId The output destination subscription id.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param tableName The output destination table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param type The output destination type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public JobStepOutputResponse build() {
            $.credential = Objects.requireNonNull($.credential, "expected parameter 'credential' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.schemaName = Codegen.stringProp("schemaName").arg($.schemaName).def("dbo").getNullable();
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).def("SqlDatabase").getNullable();
            return $;
        }
    }

}
