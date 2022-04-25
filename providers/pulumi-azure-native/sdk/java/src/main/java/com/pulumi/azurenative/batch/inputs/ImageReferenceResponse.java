// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageReferenceResponse Empty = new ImageReferenceResponse();

    /**
     * This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * For example, UbuntuServer or WindowsServer.
     * 
     */
    @Import(name="offer")
    private @Nullable String offer;

    /**
     * @return For example, UbuntuServer or WindowsServer.
     * 
     */
    public Optional<String> offer() {
        return Optional.ofNullable(this.offer);
    }

    /**
     * For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    @Import(name="publisher")
    private @Nullable String publisher;

    /**
     * @return For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    public Optional<String> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * For example, 18.04-LTS or 2019-Datacenter.
     * 
     */
    @Import(name="sku")
    private @Nullable String sku;

    /**
     * @return For example, 18.04-LTS or 2019-Datacenter.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * A value of &#39;latest&#39; can be specified to select the latest version of an image. If omitted, the default is &#39;latest&#39;.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return A value of &#39;latest&#39; can be specified to select the latest version of an image. If omitted, the default is &#39;latest&#39;.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private ImageReferenceResponse() {}

    private ImageReferenceResponse(ImageReferenceResponse $) {
        this.id = $.id;
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageReferenceResponse $;

        public Builder() {
            $ = new ImageReferenceResponse();
        }

        public Builder(ImageReferenceResponse defaults) {
            $ = new ImageReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param offer For example, UbuntuServer or WindowsServer.
         * 
         * @return builder
         * 
         */
        public Builder offer(@Nullable String offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param publisher For example, Canonical or MicrosoftWindowsServer.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable String publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param sku For example, 18.04-LTS or 2019-Datacenter.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable String sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param version A value of &#39;latest&#39; can be specified to select the latest version of an image. If omitted, the default is &#39;latest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public ImageReferenceResponse build() {
            return $;
        }
    }

}
