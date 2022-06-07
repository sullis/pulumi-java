// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIntegrationRuntimeObjectMetadatumArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeObjectMetadatumArgs Empty = new GetIntegrationRuntimeObjectMetadatumArgs();

    /**
     * Integration runtime name
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
    private Output<String> integrationRuntimeName;

    /**
     * @return Integration runtime name
     * 
     */
    public Output<String> integrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * Metadata path.
     * 
     */
    @Import(name="metadataPath")
    private @Nullable Output<String> metadataPath;

    /**
     * @return Metadata path.
     * 
     */
    public Optional<Output<String>> metadataPath() {
        return Optional.ofNullable(this.metadataPath);
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

    private GetIntegrationRuntimeObjectMetadatumArgs() {}

    private GetIntegrationRuntimeObjectMetadatumArgs(GetIntegrationRuntimeObjectMetadatumArgs $) {
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.metadataPath = $.metadataPath;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationRuntimeObjectMetadatumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationRuntimeObjectMetadatumArgs $;

        public Builder() {
            $ = new GetIntegrationRuntimeObjectMetadatumArgs();
        }

        public Builder(GetIntegrationRuntimeObjectMetadatumArgs defaults) {
            $ = new GetIntegrationRuntimeObjectMetadatumArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationRuntimeName Integration runtime name
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName Integration runtime name
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param metadataPath Metadata path.
         * 
         * @return builder
         * 
         */
        public Builder metadataPath(@Nullable Output<String> metadataPath) {
            $.metadataPath = metadataPath;
            return this;
        }

        /**
         * @param metadataPath Metadata path.
         * 
         * @return builder
         * 
         */
        public Builder metadataPath(String metadataPath) {
            return metadataPath(Output.of(metadataPath));
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

        public GetIntegrationRuntimeObjectMetadatumArgs build() {
            $.integrationRuntimeName = Objects.requireNonNull($.integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
