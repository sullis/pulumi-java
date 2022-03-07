// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEncryptionScopeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEncryptionScopeArgs Empty = new GetEncryptionScopeArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the encryption scope within the specified storage account. Encryption scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * 
     */
    @InputImport(name="encryptionScopeName", required=true)
      private final String encryptionScopeName;

    public String getEncryptionScopeName() {
        return this.encryptionScopeName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEncryptionScopeArgs(
        String accountName,
        String encryptionScopeName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.encryptionScopeName = Objects.requireNonNull(encryptionScopeName, "expected parameter 'encryptionScopeName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEncryptionScopeArgs() {
        this.accountName = null;
        this.encryptionScopeName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String encryptionScopeName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEncryptionScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.encryptionScopeName = defaults.encryptionScopeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setEncryptionScopeName(String encryptionScopeName) {
            this.encryptionScopeName = Objects.requireNonNull(encryptionScopeName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetEncryptionScopeArgs build() {
            return new GetEncryptionScopeArgs(accountName, encryptionScopeName, resourceGroupName);
        }
    }
}