// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This is the gallery image definition identifier.
 * 
 */
public final class GalleryImageIdentifierResponse extends com.pulumi.resources.InvokeArgs {

    public static final GalleryImageIdentifierResponse Empty = new GalleryImageIdentifierResponse();

    /**
     * The name of the gallery image definition offer.
     * 
     */
    @Import(name="offer", required=true)
    private String offer;

    /**
     * @return The name of the gallery image definition offer.
     * 
     */
    public String offer() {
        return this.offer;
    }

    /**
     * The name of the gallery image definition publisher.
     * 
     */
    @Import(name="publisher", required=true)
    private String publisher;

    /**
     * @return The name of the gallery image definition publisher.
     * 
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * The name of the gallery image definition SKU.
     * 
     */
    @Import(name="sku", required=true)
    private String sku;

    /**
     * @return The name of the gallery image definition SKU.
     * 
     */
    public String sku() {
        return this.sku;
    }

    private GalleryImageIdentifierResponse() {}

    private GalleryImageIdentifierResponse(GalleryImageIdentifierResponse $) {
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryImageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryImageIdentifierResponse $;

        public Builder() {
            $ = new GalleryImageIdentifierResponse();
        }

        public Builder(GalleryImageIdentifierResponse defaults) {
            $ = new GalleryImageIdentifierResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param offer The name of the gallery image definition offer.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param publisher The name of the gallery image definition publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param sku The name of the gallery image definition SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            $.sku = sku;
            return this;
        }

        public GalleryImageIdentifierResponse build() {
            $.offer = Objects.requireNonNull($.offer, "expected parameter 'offer' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
