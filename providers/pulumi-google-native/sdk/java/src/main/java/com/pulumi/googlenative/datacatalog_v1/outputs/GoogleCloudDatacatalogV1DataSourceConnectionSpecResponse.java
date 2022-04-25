// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse {
    /**
     * @return Fields specific to BigQuery connections.
     * 
     */
    private final GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse(@CustomType.Parameter("bigqueryConnectionSpec") GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec) {
        this.bigqueryConnectionSpec = bigqueryConnectionSpec;
    }

    /**
     * @return Fields specific to BigQuery connections.
     * 
     */
    public GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec() {
        return this.bigqueryConnectionSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryConnectionSpec = defaults.bigqueryConnectionSpec;
        }

        public Builder bigqueryConnectionSpec(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec) {
            this.bigqueryConnectionSpec = Objects.requireNonNull(bigqueryConnectionSpec);
            return this;
        }        public GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse build() {
            return new GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse(bigqueryConnectionSpec);
        }
    }
}
