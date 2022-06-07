// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppCatalogListingResourceVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppCatalogListingResourceVersionPlainArgs Empty = new GetAppCatalogListingResourceVersionPlainArgs();

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

    /**
     * Listing Resource Version.
     * 
     */
    @Import(name="resourceVersion", required=true)
    private String resourceVersion;

    /**
     * @return Listing Resource Version.
     * 
     */
    public String resourceVersion() {
        return this.resourceVersion;
    }

    private GetAppCatalogListingResourceVersionPlainArgs() {}

    private GetAppCatalogListingResourceVersionPlainArgs(GetAppCatalogListingResourceVersionPlainArgs $) {
        this.listingId = $.listingId;
        this.resourceVersion = $.resourceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppCatalogListingResourceVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppCatalogListingResourceVersionPlainArgs $;

        public Builder() {
            $ = new GetAppCatalogListingResourceVersionPlainArgs();
        }

        public Builder(GetAppCatalogListingResourceVersionPlainArgs defaults) {
            $ = new GetAppCatalogListingResourceVersionPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param resourceVersion Listing Resource Version.
         * 
         * @return builder
         * 
         */
        public Builder resourceVersion(String resourceVersion) {
            $.resourceVersion = resourceVersion;
            return this;
        }

        public GetAppCatalogListingResourceVersionPlainArgs build() {
            $.listingId = Objects.requireNonNull($.listingId, "expected parameter 'listingId' to be non-null");
            $.resourceVersion = Objects.requireNonNull($.resourceVersion, "expected parameter 'resourceVersion' to be non-null");
            return $;
        }
    }

}
