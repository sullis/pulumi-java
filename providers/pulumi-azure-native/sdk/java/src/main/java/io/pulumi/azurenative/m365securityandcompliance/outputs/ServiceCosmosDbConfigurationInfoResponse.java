// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceCosmosDbConfigurationInfoResponse {
    /**
     * The URI of the customer-managed key for the backing database.
     * 
     */
    private final @Nullable String keyVaultKeyUri;
    /**
     * The provisioned throughput for the backing database.
     * 
     */
    private final @Nullable Double offerThroughput;

    @OutputCustomType.Constructor({"keyVaultKeyUri","offerThroughput"})
    private ServiceCosmosDbConfigurationInfoResponse(
        @Nullable String keyVaultKeyUri,
        @Nullable Double offerThroughput) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        this.offerThroughput = offerThroughput;
    }

    /**
     * The URI of the customer-managed key for the backing database.
     * 
    */
    public Optional<String> getKeyVaultKeyUri() {
        return Optional.ofNullable(this.keyVaultKeyUri);
    }
    /**
     * The provisioned throughput for the backing database.
     * 
    */
    public Optional<Double> getOfferThroughput() {
        return Optional.ofNullable(this.offerThroughput);
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