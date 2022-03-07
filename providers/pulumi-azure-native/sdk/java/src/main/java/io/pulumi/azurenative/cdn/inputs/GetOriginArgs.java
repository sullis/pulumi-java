// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOriginArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOriginArgs Empty = new GetOriginArgs();

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @InputImport(name="endpointName", required=true)
      private final String endpointName;

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * Name of the origin which is unique within the endpoint.
     * 
     */
    @InputImport(name="originName", required=true)
      private final String originName;

    public String getOriginName() {
        return this.originName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
      private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetOriginArgs(
        String endpointName,
        String originName,
        String profileName,
        String resourceGroupName) {
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.originName = Objects.requireNonNull(originName, "expected parameter 'originName' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetOriginArgs() {
        this.endpointName = null;
        this.originName = null;
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointName;
        private String originName;
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.originName = defaults.originName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setOriginName(String originName) {
            this.originName = Objects.requireNonNull(originName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetOriginArgs build() {
            return new GetOriginArgs(endpointName, originName, profileName, resourceGroupName);
        }
    }
}