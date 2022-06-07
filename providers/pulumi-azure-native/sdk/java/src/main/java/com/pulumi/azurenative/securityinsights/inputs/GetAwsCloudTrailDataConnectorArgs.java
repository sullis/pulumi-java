// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAwsCloudTrailDataConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsCloudTrailDataConnectorArgs Empty = new GetAwsCloudTrailDataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @Import(name="dataConnectorId", required=true)
    private Output<String> dataConnectorId;

    /**
     * @return Connector ID
     * 
     */
    public Output<String> dataConnectorId() {
        return this.dataConnectorId;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetAwsCloudTrailDataConnectorArgs() {}

    private GetAwsCloudTrailDataConnectorArgs(GetAwsCloudTrailDataConnectorArgs $) {
        this.dataConnectorId = $.dataConnectorId;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsCloudTrailDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsCloudTrailDataConnectorArgs $;

        public Builder() {
            $ = new GetAwsCloudTrailDataConnectorArgs();
        }

        public Builder(GetAwsCloudTrailDataConnectorArgs defaults) {
            $ = new GetAwsCloudTrailDataConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataConnectorId Connector ID
         * 
         * @return builder
         * 
         */
        public Builder dataConnectorId(Output<String> dataConnectorId) {
            $.dataConnectorId = dataConnectorId;
            return this;
        }

        /**
         * @param dataConnectorId Connector ID
         * 
         * @return builder
         * 
         */
        public Builder dataConnectorId(String dataConnectorId) {
            return dataConnectorId(Output.of(dataConnectorId));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetAwsCloudTrailDataConnectorArgs build() {
            $.dataConnectorId = Objects.requireNonNull($.dataConnectorId, "expected parameter 'dataConnectorId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
