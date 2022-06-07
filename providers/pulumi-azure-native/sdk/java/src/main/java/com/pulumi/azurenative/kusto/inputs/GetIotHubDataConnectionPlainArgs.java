// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIotHubDataConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIotHubDataConnectionPlainArgs Empty = new GetIotHubDataConnectionPlainArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName", required=true)
    private String dataConnectionName;

    /**
     * @return The name of the data connection.
     * 
     */
    public String dataConnectionName() {
        return this.dataConnectionName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The name of the database in the Kusto cluster.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetIotHubDataConnectionPlainArgs() {}

    private GetIotHubDataConnectionPlainArgs(GetIotHubDataConnectionPlainArgs $) {
        this.clusterName = $.clusterName;
        this.dataConnectionName = $.dataConnectionName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIotHubDataConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIotHubDataConnectionPlainArgs $;

        public Builder() {
            $ = new GetIotHubDataConnectionPlainArgs();
        }

        public Builder(GetIotHubDataConnectionPlainArgs defaults) {
            $ = new GetIotHubDataConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param dataConnectionName The name of the data connection.
         * 
         * @return builder
         * 
         */
        public Builder dataConnectionName(String dataConnectionName) {
            $.dataConnectionName = dataConnectionName;
            return this;
        }

        /**
         * @param databaseName The name of the database in the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetIotHubDataConnectionPlainArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.dataConnectionName = Objects.requireNonNull($.dataConnectionName, "expected parameter 'dataConnectionName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
