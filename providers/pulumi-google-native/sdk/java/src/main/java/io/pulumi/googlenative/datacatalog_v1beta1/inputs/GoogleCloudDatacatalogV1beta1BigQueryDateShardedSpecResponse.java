// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Spec for a group of BigQuery tables with name pattern `[prefix]YYYYMMDD`. Context: https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding
 * 
 */
public final class GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse Empty = new GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse();

    /**
     * The Data Catalog resource name of the dataset entry the current table belongs to, for example, `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`.
     * 
     */
    @InputImport(name="dataset", required=true)
      private final String dataset;

    public String getDataset() {
        return this.dataset;
    }

    /**
     * Total number of shards.
     * 
     */
    @InputImport(name="shardCount", required=true)
      private final String shardCount;

    public String getShardCount() {
        return this.shardCount;
    }

    /**
     * The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`, for example, for shard `MyTable20180101`, the `table_prefix` is `MyTable`.
     * 
     */
    @InputImport(name="tablePrefix", required=true)
      private final String tablePrefix;

    public String getTablePrefix() {
        return this.tablePrefix;
    }

    public GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse(
        String dataset,
        String shardCount,
        String tablePrefix) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.shardCount = Objects.requireNonNull(shardCount, "expected parameter 'shardCount' to be non-null");
        this.tablePrefix = Objects.requireNonNull(tablePrefix, "expected parameter 'tablePrefix' to be non-null");
    }

    private GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse() {
        this.dataset = null;
        this.shardCount = null;
        this.tablePrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataset;
        private String shardCount;
        private String tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.shardCount = defaults.shardCount;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder setDataset(String dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setShardCount(String shardCount) {
            this.shardCount = Objects.requireNonNull(shardCount);
            return this;
        }

        public Builder setTablePrefix(String tablePrefix) {
            this.tablePrefix = Objects.requireNonNull(tablePrefix);
            return this;
        }
        public GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse(dataset, shardCount, tablePrefix);
        }
    }
}