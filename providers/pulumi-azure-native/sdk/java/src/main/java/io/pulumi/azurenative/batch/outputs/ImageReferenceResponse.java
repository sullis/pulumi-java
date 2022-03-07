// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageReferenceResponse {
    /**
     * This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     * 
     */
    private final @Nullable String id;
    /**
     * For example, UbuntuServer or WindowsServer.
     * 
     */
    private final @Nullable String offer;
    /**
     * For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    private final @Nullable String publisher;
    /**
     * For example, 18.04-LTS or 2019-Datacenter.
     * 
     */
    private final @Nullable String sku;
    /**
     * A value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"id","offer","publisher","sku","version"})
    private ImageReferenceResponse(
        @Nullable String id,
        @Nullable String offer,
        @Nullable String publisher,
        @Nullable String sku,
        @Nullable String version) {
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    /**
     * This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * For example, UbuntuServer or WindowsServer.
     * 
    */
    public Optional<String> getOffer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * For example, Canonical or MicrosoftWindowsServer.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * For example, 18.04-LTS or 2019-Datacenter.
     * 
    */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * A value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String offer;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setOffer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ImageReferenceResponse build() {
            return new ImageReferenceResponse(id, offer, publisher, sku, version);
        }
    }
}