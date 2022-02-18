// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPolicyArgs Empty = new GetAccessPolicyArgs();

    /**
     * The name of the access policy to retrieve.
     * 
     */
    @InputImport(name="accessPolicyName", required=true)
    private final String accessPolicyName;

    public String getAccessPolicyName() {
        return this.accessPolicyName;
    }

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
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

    public GetAccessPolicyArgs(
        String accessPolicyName,
        String accountName,
        String resourceGroupName) {
        this.accessPolicyName = Objects.requireNonNull(accessPolicyName, "expected parameter 'accessPolicyName' to be non-null");
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAccessPolicyArgs() {
        this.accessPolicyName = null;
        this.accountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPolicyName;
        private String accountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyName = defaults.accessPolicyName;
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccessPolicyName(String accessPolicyName) {
            this.accessPolicyName = Objects.requireNonNull(accessPolicyName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetAccessPolicyArgs build() {
            return new GetAccessPolicyArgs(accessPolicyName, accountName, resourceGroupName);
        }
    }
}
