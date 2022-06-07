// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppCatalogListingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppCatalogListingPlainArgs Empty = new GetAppCatalogListingPlainArgs();

    /**
     * The OCID of the listing.
     * 
     */
    @Import(name="listingId", required=true)
    private String listingId;

    /**
     * @return The OCID of the listing.
     * 
     */
    public String listingId() {
        return this.listingId;
    }

    private GetAppCatalogListingPlainArgs() {}

    private GetAppCatalogListingPlainArgs(GetAppCatalogListingPlainArgs $) {
        this.listingId = $.listingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppCatalogListingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppCatalogListingPlainArgs $;

        public Builder() {
            $ = new GetAppCatalogListingPlainArgs();
        }

        public Builder(GetAppCatalogListingPlainArgs defaults) {
            $ = new GetAppCatalogListingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listingId The OCID of the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(String listingId) {
            $.listingId = listingId;
            return this;
        }

        public GetAppCatalogListingPlainArgs build() {
            $.listingId = Objects.requireNonNull($.listingId, "expected parameter 'listingId' to be non-null");
            return $;
        }
    }

}
