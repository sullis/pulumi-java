// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for the Cosmos DB database backing the service.
 * 
 */
public final class ServiceCosmosDbConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCosmosDbConfigurationInfoArgs Empty = new ServiceCosmosDbConfigurationInfoArgs();

    /**
     * The URI of the customer-managed key for the backing database.
     * 
     */
    @Import(name="keyVaultKeyUri")
    private @Nullable Output<String> keyVaultKeyUri;

    /**
     * @return The URI of the customer-managed key for the backing database.
     * 
     */
    public Optional<Output<String>> keyVaultKeyUri() {
        return Optional.ofNullable(this.keyVaultKeyUri);
    }

    /**
     * The provisioned throughput for the backing database.
     * 
     */
    @Import(name="offerThroughput")
    private @Nullable Output<Double> offerThroughput;

    /**
     * @return The provisioned throughput for the backing database.
     * 
     */
    public Optional<Output<Double>> offerThroughput() {
        return Optional.ofNullable(this.offerThroughput);
    }

    private ServiceCosmosDbConfigurationInfoArgs() {}

    private ServiceCosmosDbConfigurationInfoArgs(ServiceCosmosDbConfigurationInfoArgs $) {
        this.keyVaultKeyUri = $.keyVaultKeyUri;
        this.offerThroughput = $.offerThroughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCosmosDbConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCosmosDbConfigurationInfoArgs $;

        public Builder() {
            $ = new ServiceCosmosDbConfigurationInfoArgs();
        }

        public Builder(ServiceCosmosDbConfigurationInfoArgs defaults) {
            $ = new ServiceCosmosDbConfigurationInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultKeyUri The URI of the customer-managed key for the backing database.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyUri(@Nullable Output<String> keyVaultKeyUri) {
            $.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }

        /**
         * @param keyVaultKeyUri The URI of the customer-managed key for the backing database.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyUri(String keyVaultKeyUri) {
            return keyVaultKeyUri(Output.of(keyVaultKeyUri));
        }

        /**
         * @param offerThroughput The provisioned throughput for the backing database.
         * 
         * @return builder
         * 
         */
        public Builder offerThroughput(@Nullable Output<Double> offerThroughput) {
            $.offerThroughput = offerThroughput;
            return this;
        }

        /**
         * @param offerThroughput The provisioned throughput for the backing database.
         * 
         * @return builder
         * 
         */
        public Builder offerThroughput(Double offerThroughput) {
            return offerThroughput(Output.of(offerThroughput));
        }

        public ServiceCosmosDbConfigurationInfoArgs build() {
            return $;
        }
    }

}
