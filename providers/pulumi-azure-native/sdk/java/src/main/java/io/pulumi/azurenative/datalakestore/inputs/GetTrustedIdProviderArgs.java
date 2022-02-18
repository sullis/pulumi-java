// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTrustedIdProviderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTrustedIdProviderArgs Empty = new GetTrustedIdProviderArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the trusted identity provider to retrieve.
     * 
     */
    @InputImport(name="trustedIdProviderName", required=true)
    private final String trustedIdProviderName;

    public String getTrustedIdProviderName() {
        return this.trustedIdProviderName;
    }

    public GetTrustedIdProviderArgs(
        String accountName,
        String resourceGroupName,
        String trustedIdProviderName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.trustedIdProviderName = Objects.requireNonNull(trustedIdProviderName, "expected parameter 'trustedIdProviderName' to be non-null");
    }

    private GetTrustedIdProviderArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.trustedIdProviderName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrustedIdProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String trustedIdProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrustedIdProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.trustedIdProviderName = defaults.trustedIdProviderName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTrustedIdProviderName(String trustedIdProviderName) {
            this.trustedIdProviderName = Objects.requireNonNull(trustedIdProviderName);
            return this;
        }

        public GetTrustedIdProviderArgs build() {
            return new GetTrustedIdProviderArgs(accountName, resourceGroupName, trustedIdProviderName);
        }
    }
}
