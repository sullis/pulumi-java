// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainArgs Empty = new GetDomainArgs();

    /**
     * Name of the domain.
     * 
     */
    @InputImport(name="domainName", required=true)
    private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDomainArgs(
        String domainName,
        String resourceGroupName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDomainArgs() {
        this.domainName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetDomainArgs build() {
            return new GetDomainArgs(domainName, resourceGroupName);
        }
    }
}
