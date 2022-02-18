// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLinkArgs Empty = new GetLinkArgs();

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
    private final String hubName;

    public String getHubName() {
        return this.hubName;
    }

    /**
     * The name of the link.
     * 
     */
    @InputImport(name="linkName", required=true)
    private final String linkName;

    public String getLinkName() {
        return this.linkName;
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

    public GetLinkArgs(
        String hubName,
        String linkName,
        String resourceGroupName) {
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.linkName = Objects.requireNonNull(linkName, "expected parameter 'linkName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLinkArgs() {
        this.hubName = null;
        this.linkName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubName;
        private String linkName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.linkName = defaults.linkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setLinkName(String linkName) {
            this.linkName = Objects.requireNonNull(linkName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetLinkArgs build() {
            return new GetLinkArgs(hubName, linkName, resourceGroupName);
        }
    }
}
