// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizationArgs Empty = new AuthorizationArgs();

    /**
     * Name of the ExpressRoute Circuit Authorization in the private cloud
     * 
     */
    @InputImport(name="authorizationName")
      private final @Nullable Input<String> authorizationName;

    public Input<String> getAuthorizationName() {
        return this.authorizationName == null ? Input.empty() : this.authorizationName;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @InputImport(name="privateCloudName", required=true)
      private final Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public AuthorizationArgs(
        @Nullable Input<String> authorizationName,
        Input<String> privateCloudName,
        Input<String> resourceGroupName) {
        this.authorizationName = authorizationName;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private AuthorizationArgs() {
        this.authorizationName = Input.empty();
        this.privateCloudName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationName;
        private Input<String> privateCloudName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationName = defaults.authorizationName;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAuthorizationName(@Nullable Input<String> authorizationName) {
            this.authorizationName = authorizationName;
            return this;
        }

        public Builder setAuthorizationName(@Nullable String authorizationName) {
            this.authorizationName = Input.ofNullable(authorizationName);
            return this;
        }

        public Builder setPrivateCloudName(Input<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Input.of(Objects.requireNonNull(privateCloudName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public AuthorizationArgs build() {
            return new AuthorizationArgs(authorizationName, privateCloudName, resourceGroupName);
        }
    }
}