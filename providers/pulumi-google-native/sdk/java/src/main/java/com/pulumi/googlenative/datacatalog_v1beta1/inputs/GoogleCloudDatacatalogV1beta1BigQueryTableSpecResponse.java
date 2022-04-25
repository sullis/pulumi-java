// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1TableSpecResponse;
import com.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1ViewSpecResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a BigQuery table.
 * 
 */
public final class GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse Empty = new GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse();

    /**
     * The table source type.
     * 
     */
    @Import(name="tableSourceType", required=true)
    private String tableSourceType;

    /**
     * @return The table source type.
     * 
     */
    public String tableSourceType() {
        return this.tableSourceType;
    }

    /**
     * Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
     * 
     */
    @Import(name="tableSpec", required=true)
    private GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec;

    /**
     * @return Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
     * 
     */
    public GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec() {
        return this.tableSpec;
    }

    /**
     * Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
     * 
     */
    @Import(name="viewSpec", required=true)
    private GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec;

    /**
     * @return Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
     * 
     */
    public GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec() {
        return this.viewSpec;
    }

    private GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse() {}

    private GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse(GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse $) {
        this.tableSourceType = $.tableSourceType;
        this.tableSpec = $.tableSpec;
        this.viewSpec = $.viewSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse();
        }

        public Builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse defaults) {
            $ = new GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param tableSourceType The table source type.
         * 
         * @return builder
         * 
         */
        public Builder tableSourceType(String tableSourceType) {
            $.tableSourceType = tableSourceType;
            return this;
        }

        /**
         * @param tableSpec Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
         * 
         * @return builder
         * 
         */
        public Builder tableSpec(GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec) {
            $.tableSpec = tableSpec;
            return this;
        }

        /**
         * @param viewSpec Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
         * 
         * @return builder
         * 
         */
        public Builder viewSpec(GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec) {
            $.viewSpec = viewSpec;
            return this;
        }

        public GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse build() {
            $.tableSourceType = Objects.requireNonNull($.tableSourceType, "expected parameter 'tableSourceType' to be non-null");
            $.tableSpec = Objects.requireNonNull($.tableSpec, "expected parameter 'tableSpec' to be non-null");
            $.viewSpec = Objects.requireNonNull($.viewSpec, "expected parameter 'viewSpec' to be non-null");
            return $;
        }
    }

}
