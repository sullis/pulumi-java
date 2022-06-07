// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIotHubDataConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIotHubDataConnectionArgs Empty = new GetIotHubDataConnectionArgs();

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName", required=true)
    private Output<String> dataConnectionName;

    /**
     * @return The name of the data connection.
     * 
     */
    public Output<String> dataConnectionName() {
        return this.dataConnectionName;
    }

    /**
     * The name of the database in the Kusto pool.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database in the Kusto pool.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
    private Output<String> kustoPoolName;

    /**
     * @return The name of the Kusto pool.
     * 
     */
    public Output<String> kustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetIotHubDataConnectionArgs() {}

    private GetIotHubDataConnectionArgs(GetIotHubDataConnectionArgs $) {
        this.dataConnectionName = $.dataConnectionName;
        this.databaseName = $.databaseName;
        this.kustoPoolName = $.kustoPoolName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIotHubDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIotHubDataConnectionArgs $;

        public Builder() {
            $ = new GetIotHubDataConnectionArgs();
        }

        public Builder(GetIotHubDataConnectionArgs defaults) {
            $ = new GetIotHubDataConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataConnectionName The name of the data connection.
         * 
         * @return builder
         * 
         */
        public Builder dataConnectionName(Output<String> dataConnectionName) {
            $.dataConnectionName = dataConnectionName;
            return this;
        }

        /**
         * @param dataConnectionName The name of the data connection.
         * 
         * @return builder
         * 
         */
        public Builder dataConnectionName(String dataConnectionName) {
            return dataConnectionName(Output.of(dataConnectionName));
        }

        /**
         * @param databaseName The name of the database in the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database in the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(Output<String> kustoPoolName) {
            $.kustoPoolName = kustoPoolName;
            return this;
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(String kustoPoolName) {
            return kustoPoolName(Output.of(kustoPoolName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetIotHubDataConnectionArgs build() {
            $.dataConnectionName = Objects.requireNonNull($.dataConnectionName, "expected parameter 'dataConnectionName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.kustoPoolName = Objects.requireNonNull($.kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
