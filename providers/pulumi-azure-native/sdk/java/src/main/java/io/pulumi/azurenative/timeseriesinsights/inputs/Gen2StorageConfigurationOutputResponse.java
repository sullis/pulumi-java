// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The storage configuration provides the non-secret connection details about the customer storage account that is used to store the environment's data.
 * 
 */
public final class Gen2StorageConfigurationOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final Gen2StorageConfigurationOutputResponse Empty = new Gen2StorageConfigurationOutputResponse();

    /**
     * The name of the storage account that will hold the environment's Gen2 data.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    public Gen2StorageConfigurationOutputResponse(String accountName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
    }

    private Gen2StorageConfigurationOutputResponse() {
        this.accountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Gen2StorageConfigurationOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;

        public Builder() {
    	      // Empty
        }

        public Builder(Gen2StorageConfigurationOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Gen2StorageConfigurationOutputResponse build() {
            return new Gen2StorageConfigurationOutputResponse(accountName);
        }
    }
}