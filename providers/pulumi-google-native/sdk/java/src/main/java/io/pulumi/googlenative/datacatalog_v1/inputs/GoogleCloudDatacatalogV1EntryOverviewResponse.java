// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Entry overview fields for rich text descriptions of entries.
 * 
 */
public final class GoogleCloudDatacatalogV1EntryOverviewResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1EntryOverviewResponse Empty = new GoogleCloudDatacatalogV1EntryOverviewResponse();

    /**
     * Entry overview with support for rich text. The overview must only contain Unicode characters, and should be formatted using HTML. The maximum length is 10 MiB as this value holds HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
     * 
     */
    @InputImport(name="overview", required=true)
      private final String overview;

    public String getOverview() {
        return this.overview;
    }

    public GoogleCloudDatacatalogV1EntryOverviewResponse(String overview) {
        this.overview = Objects.requireNonNull(overview, "expected parameter 'overview' to be non-null");
    }

    private GoogleCloudDatacatalogV1EntryOverviewResponse() {
        this.overview = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1EntryOverviewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String overview;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1EntryOverviewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overview = defaults.overview;
        }

        public Builder setOverview(String overview) {
            this.overview = Objects.requireNonNull(overview);
            return this;
        }
        public GoogleCloudDatacatalogV1EntryOverviewResponse build() {
            return new GoogleCloudDatacatalogV1EntryOverviewResponse(overview);
        }
    }
}