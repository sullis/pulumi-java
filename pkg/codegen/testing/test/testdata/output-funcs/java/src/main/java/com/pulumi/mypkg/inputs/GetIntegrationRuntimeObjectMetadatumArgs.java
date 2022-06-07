// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIntegrationRuntimeObjectMetadatumArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeObjectMetadatumArgs Empty = new GetIntegrationRuntimeObjectMetadatumArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private Output<String> factoryName;

    /**
     * @return The factory name.
     * 
     */
    public Output<String> factoryName() {
        return this.factoryName;
    }

    /**
     * The integration runtime name.
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
    private Output<String> integrationRuntimeName;

    /**
     * @return The integration runtime name.
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
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetIntegrationRuntimeObjectMetadatumArgs() {}

    private GetIntegrationRuntimeObjectMetadatumArgs(GetIntegrationRuntimeObjectMetadatumArgs $) {
        this.factoryName = $.factoryName;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.metadataPath = $.metadataPath;
        this.resourceGroupName = $.resourceGroupName;
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
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(Output<String> factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            return factoryName(Output.of(factoryName));
        }

        /**
         * @param integrationRuntimeName The integration runtime name.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime name.
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
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetIntegrationRuntimeObjectMetadatumArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.integrationRuntimeName = Objects.requireNonNull($.integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
