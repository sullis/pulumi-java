// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSecretArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

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

    /**
     * Name of the Secret under the profile.
     * 
     */
    @InputImport(name="secretName", required=true)
    private final String secretName;

    public String getSecretName() {
        return this.secretName;
    }

    public GetSecretArgs(
        String profileName,
        String resourceGroupName,
        String secretName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private GetSecretArgs() {
        this.profileName = null;
        this.resourceGroupName = null;
        this.secretName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileName;
        private String resourceGroupName;
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretName = defaults.secretName;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSecretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public GetSecretArgs build() {
            return new GetSecretArgs(profileName, resourceGroupName, secretName);
        }
    }
}
