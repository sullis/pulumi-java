// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAssetEncryptionKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssetEncryptionKeyArgs Empty = new GetAssetEncryptionKeyArgs();

    /**
     * The Media Services account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The Asset name.
     * 
     */
    @InputImport(name="assetName", required=true)
    private final String assetName;

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAssetEncryptionKeyArgs(
        String accountName,
        String assetName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAssetEncryptionKeyArgs() {
        this.accountName = null;
        this.assetName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String assetName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.assetName = defaults.assetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetAssetEncryptionKeyArgs build() {
            return new GetAssetEncryptionKeyArgs(accountName, assetName, resourceGroupName);
        }
    }
}
