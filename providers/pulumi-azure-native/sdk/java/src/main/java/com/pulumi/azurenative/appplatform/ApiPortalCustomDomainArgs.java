// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.appplatform.inputs.ApiPortalCustomDomainPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiPortalCustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiPortalCustomDomainArgs Empty = new ApiPortalCustomDomainArgs();

    /**
     * The name of API portal.
     * 
     */
    @Import(name="apiPortalName", required=true)
    private Output<String> apiPortalName;

    /**
     * @return The name of API portal.
     * 
     */
    public Output<String> apiPortalName() {
        return this.apiPortalName;
    }

    /**
     * The name of the API portal custom domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The name of the API portal custom domain.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The properties of custom domain for API portal
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ApiPortalCustomDomainPropertiesArgs> properties;

    /**
     * @return The properties of custom domain for API portal
     * 
     */
    public Optional<Output<ApiPortalCustomDomainPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
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
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ApiPortalCustomDomainArgs() {}

    private ApiPortalCustomDomainArgs(ApiPortalCustomDomainArgs $) {
        this.apiPortalName = $.apiPortalName;
        this.domainName = $.domainName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiPortalCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiPortalCustomDomainArgs $;

        public Builder() {
            $ = new ApiPortalCustomDomainArgs();
        }

        public Builder(ApiPortalCustomDomainArgs defaults) {
            $ = new ApiPortalCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiPortalName The name of API portal.
         * 
         * @return builder
         * 
         */
        public Builder apiPortalName(Output<String> apiPortalName) {
            $.apiPortalName = apiPortalName;
            return this;
        }

        /**
         * @param apiPortalName The name of API portal.
         * 
         * @return builder
         * 
         */
        public Builder apiPortalName(String apiPortalName) {
            return apiPortalName(Output.of(apiPortalName));
        }

        /**
         * @param domainName The name of the API portal custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of the API portal custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param properties The properties of custom domain for API portal
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ApiPortalCustomDomainPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties of custom domain for API portal
         * 
         * @return builder
         * 
         */
        public Builder properties(ApiPortalCustomDomainPropertiesArgs properties) {
            return properties(Output.of(properties));
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
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ApiPortalCustomDomainArgs build() {
            $.apiPortalName = Objects.requireNonNull($.apiPortalName, "expected parameter 'apiPortalName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
