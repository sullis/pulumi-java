// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseAdvisorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseAdvisorArgs Empty = new GetDatabaseAdvisorArgs();

    /**
     * The name of the Database Advisor.
     * 
     */
    @Import(name="advisorName", required=true)
    private Output<String> advisorName;

    /**
     * @return The name of the Database Advisor.
     * 
     */
    public Output<String> advisorName() {
        return this.advisorName;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
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

    private GetDatabaseAdvisorArgs() {}

    private GetDatabaseAdvisorArgs(GetDatabaseAdvisorArgs $) {
        this.advisorName = $.advisorName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseAdvisorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseAdvisorArgs $;

        public Builder() {
            $ = new GetDatabaseAdvisorArgs();
        }

        public Builder(GetDatabaseAdvisorArgs defaults) {
            $ = new GetDatabaseAdvisorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advisorName The name of the Database Advisor.
         * 
         * @return builder
         * 
         */
        public Builder advisorName(Output<String> advisorName) {
            $.advisorName = advisorName;
            return this;
        }

        /**
         * @param advisorName The name of the Database Advisor.
         * 
         * @return builder
         * 
         */
        public Builder advisorName(String advisorName) {
            return advisorName(Output.of(advisorName));
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
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

        public GetDatabaseAdvisorArgs build() {
            $.advisorName = Objects.requireNonNull($.advisorName, "expected parameter 'advisorName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
