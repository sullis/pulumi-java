// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzureCredentialsResponse {
    /**
     * Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
     */
    private final String sasToken;

    @OutputCustomType.Constructor({"sasToken"})
    private AzureCredentialsResponse(String sasToken) {
        this.sasToken = Objects.requireNonNull(sasToken);
    }

    /**
     * Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
    */
    public String getSasToken() {
        return this.sasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasToken = defaults.sasToken;
        }

        public Builder setSasToken(String sasToken) {
            this.sasToken = Objects.requireNonNull(sasToken);
            return this;
        }
        public AzureCredentialsResponse build() {
            return new AzureCredentialsResponse(sasToken);
        }
    }
}