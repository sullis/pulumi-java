// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAuthorizationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationArgs Empty = new GetAuthorizationArgs();

    /**
     * Name of the ExpressRoute Circuit Authorization in the private cloud
     * 
     */
    @InputImport(name="authorizationName", required=true)
      private final String authorizationName;

    public String getAuthorizationName() {
        return this.authorizationName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @InputImport(name="privateCloudName", required=true)
      private final String privateCloudName;

    public String getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAuthorizationArgs(
        String authorizationName,
        String privateCloudName,
        String resourceGroupName) {
        this.authorizationName = Objects.requireNonNull(authorizationName, "expected parameter 'authorizationName' to be non-null");
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAuthorizationArgs() {
        this.authorizationName = null;
        this.privateCloudName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationName;
        private String privateCloudName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationName = defaults.authorizationName;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAuthorizationName(String authorizationName) {
            this.authorizationName = Objects.requireNonNull(authorizationName);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetAuthorizationArgs build() {
            return new GetAuthorizationArgs(authorizationName, privateCloudName, resourceGroupName);
        }
    }
}