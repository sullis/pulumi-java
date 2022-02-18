// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for the Cosmos DB database backing the service.
 * 
 */
public final class ServiceCosmosDbConfigurationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceCosmosDbConfigurationInfoResponse Empty = new ServiceCosmosDbConfigurationInfoResponse();

    /**
     * The URI of the customer-managed key for the backing database.
     * 
     */
    @InputImport(name="keyVaultKeyUri")
    private final @Nullable String keyVaultKeyUri;

    public Optional<String> getKeyVaultKeyUri() {
        return this.keyVaultKeyUri == null ? Optional.empty() : Optional.ofNullable(this.keyVaultKeyUri);
    }

    /**
     * The provisioned throughput for the backing database.
     * 
     */
    @InputImport(name="offerThroughput")
    private final @Nullable Double offerThroughput;

    public Optional<Double> getOfferThroughput() {
        return this.offerThroughput == null ? Optional.empty() : Optional.ofNullable(this.offerThroughput);
    }

    public ServiceCosmosDbConfigurationInfoResponse(
        @Nullable String keyVaultKeyUri,
        @Nullable Double offerThroughput) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        this.offerThroughput = offerThroughput;
    }

    private ServiceCosmosDbConfigurationInfoResponse() {
        this.keyVaultKeyUri = null;
        this.offerThroughput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCosmosDbConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultKeyUri;
        private @Nullable Double offerThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCosmosDbConfigurationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultKeyUri = defaults.keyVaultKeyUri;
    	      this.offerThroughput = defaults.offerThroughput;
        }

        public Builder setKeyVaultKeyUri(@Nullable String keyVaultKeyUri) {
            this.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }

        public Builder setOfferThroughput(@Nullable Double offerThroughput) {
            this.offerThroughput = offerThroughput;
            return this;
        }

        public ServiceCosmosDbConfigurationInfoResponse build() {
            return new ServiceCosmosDbConfigurationInfoResponse(keyVaultKeyUri, offerThroughput);
        }
    }
}
