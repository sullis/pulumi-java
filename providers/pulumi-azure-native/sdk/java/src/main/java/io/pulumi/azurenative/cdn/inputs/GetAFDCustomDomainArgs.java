// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAFDCustomDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAFDCustomDomainArgs Empty = new GetAFDCustomDomainArgs();

    /**
     * Name of the domain under the profile which is unique globally.
     * 
     */
    @Import(name="customDomainName", required=true)
      private final String customDomainName;

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAFDCustomDomainArgs(
        String customDomainName,
        String profileName,
        String resourceGroupName) {
        this.customDomainName = Objects.requireNonNull(customDomainName, "expected parameter 'customDomainName' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAFDCustomDomainArgs() {
        this.customDomainName = null;
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAFDCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customDomainName;
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDCustomDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDomainName = defaults.customDomainName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder customDomainName(String customDomainName) {
            this.customDomainName = Objects.requireNonNull(customDomainName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetAFDCustomDomainArgs build() {
            return new GetAFDCustomDomainArgs(customDomainName, profileName, resourceGroupName);
        }
    }
}
