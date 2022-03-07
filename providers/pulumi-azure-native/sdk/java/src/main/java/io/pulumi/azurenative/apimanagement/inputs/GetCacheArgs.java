// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCacheArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCacheArgs Empty = new GetCacheArgs();

    /**
     * Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region identifier).
     * 
     */
    @InputImport(name="cacheId", required=true)
      private final String cacheId;

    public String getCacheId() {
        return this.cacheId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetCacheArgs(
        String cacheId,
        String resourceGroupName,
        String serviceName) {
        this.cacheId = Objects.requireNonNull(cacheId, "expected parameter 'cacheId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetCacheArgs() {
        this.cacheId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCacheArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheId = defaults.cacheId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setCacheId(String cacheId) {
            this.cacheId = Objects.requireNonNull(cacheId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetCacheArgs build() {
            return new GetCacheArgs(cacheId, resourceGroupName, serviceName);
        }
    }
}