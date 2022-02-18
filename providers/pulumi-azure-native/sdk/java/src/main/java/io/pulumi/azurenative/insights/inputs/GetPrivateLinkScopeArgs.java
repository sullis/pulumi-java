// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkScopeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkScopeArgs Empty = new GetPrivateLinkScopeArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Monitor PrivateLinkScope resource.
     * 
     */
    @InputImport(name="scopeName", required=true)
    private final String scopeName;

    public String getScopeName() {
        return this.scopeName;
    }

    public GetPrivateLinkScopeArgs(
        String resourceGroupName,
        String scopeName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopeName = Objects.requireNonNull(scopeName, "expected parameter 'scopeName' to be non-null");
    }

    private GetPrivateLinkScopeArgs() {
        this.resourceGroupName = null;
        this.scopeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String scopeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeName = defaults.scopeName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setScopeName(String scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }

        public GetPrivateLinkScopeArgs build() {
            return new GetPrivateLinkScopeArgs(resourceGroupName, scopeName);
        }
    }
}
