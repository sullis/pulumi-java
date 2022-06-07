// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlPoolArgs Empty = new GetSqlPoolArgs();

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
     * SQL pool name
     * 
     */
    @Import(name="sqlPoolName", required=true)
    private Output<String> sqlPoolName;

    /**
     * @return SQL pool name
     * 
     */
    public Output<String> sqlPoolName() {
        return this.sqlPoolName;
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

    private GetSqlPoolArgs() {}

    private GetSqlPoolArgs(GetSqlPoolArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.sqlPoolName = $.sqlPoolName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlPoolArgs $;

        public Builder() {
            $ = new GetSqlPoolArgs();
        }

        public Builder(GetSqlPoolArgs defaults) {
            $ = new GetSqlPoolArgs(Objects.requireNonNull(defaults));
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
         * @param sqlPoolName SQL pool name
         * 
         * @return builder
         * 
         */
        public Builder sqlPoolName(Output<String> sqlPoolName) {
            $.sqlPoolName = sqlPoolName;
            return this;
        }

        /**
         * @param sqlPoolName SQL pool name
         * 
         * @return builder
         * 
         */
        public Builder sqlPoolName(String sqlPoolName) {
            return sqlPoolName(Output.of(sqlPoolName));
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

        public GetSqlPoolArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sqlPoolName = Objects.requireNonNull($.sqlPoolName, "expected parameter 'sqlPoolName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
