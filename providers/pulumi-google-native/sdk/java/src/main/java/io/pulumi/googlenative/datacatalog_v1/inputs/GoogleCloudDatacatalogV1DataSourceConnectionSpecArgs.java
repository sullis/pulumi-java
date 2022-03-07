// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BigQueryConnectionSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
 * 
 */
public final class GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs Empty = new GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs();

    /**
     * Fields specific to BigQuery connections.
     * 
     */
    @InputImport(name="bigqueryConnectionSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1BigQueryConnectionSpecArgs> bigqueryConnectionSpec;

    public Input<GoogleCloudDatacatalogV1BigQueryConnectionSpecArgs> getBigqueryConnectionSpec() {
        return this.bigqueryConnectionSpec == null ? Input.empty() : this.bigqueryConnectionSpec;
    }

    public GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs(@Nullable Input<GoogleCloudDatacatalogV1BigQueryConnectionSpecArgs> bigqueryConnectionSpec) {
        this.bigqueryConnectionSpec = bigqueryConnectionSpec;
    }

    private GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs() {
        this.bigqueryConnectionSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDatacatalogV1BigQueryConnectionSpecArgs> bigqueryConnectionSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryConnectionSpec = defaults.bigqueryConnectionSpec;
        }

        public Builder setBigqueryConnectionSpec(@Nullable Input<GoogleCloudDatacatalogV1BigQueryConnectionSpecArgs> bigqueryConnectionSpec) {
            this.bigqueryConnectionSpec = bigqueryConnectionSpec;
            return this;
        }

        public Builder setBigqueryConnectionSpec(@Nullable GoogleCloudDatacatalogV1BigQueryConnectionSpecArgs bigqueryConnectionSpec) {
            this.bigqueryConnectionSpec = Input.ofNullable(bigqueryConnectionSpec);
            return this;
        }
        public GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs build() {
            return new GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs(bigqueryConnectionSpec);
        }
    }
}