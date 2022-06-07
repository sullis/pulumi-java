// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIntegrationRuntimeObjectMetadatumPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeObjectMetadatumPlainArgs Empty = new GetIntegrationRuntimeObjectMetadatumPlainArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The integration runtime name.
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
    private String integrationRuntimeName;

    /**
     * @return The integration runtime name.
     * 
     */
    public String integrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * Metadata path.
     * 
     */
    @Import(name="metadataPath")
    private @Nullable String metadataPath;

    /**
     * @return Metadata path.
     * 
     */
    public Optional<String> metadataPath() {
        return Optional.ofNullable(this.metadataPath);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetIntegrationRuntimeObjectMetadatumPlainArgs() {}

    private GetIntegrationRuntimeObjectMetadatumPlainArgs(GetIntegrationRuntimeObjectMetadatumPlainArgs $) {
        this.factoryName = $.factoryName;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.metadataPath = $.metadataPath;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationRuntimeObjectMetadatumPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationRuntimeObjectMetadatumPlainArgs $;

        public Builder() {
            $ = new GetIntegrationRuntimeObjectMetadatumPlainArgs();
        }

        public Builder(GetIntegrationRuntimeObjectMetadatumPlainArgs defaults) {
            $ = new GetIntegrationRuntimeObjectMetadatumPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime name.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param metadataPath Metadata path.
         * 
         * @return builder
         * 
         */
        public Builder metadataPath(@Nullable String metadataPath) {
            $.metadataPath = metadataPath;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetIntegrationRuntimeObjectMetadatumPlainArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.integrationRuntimeName = Objects.requireNonNull($.integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
