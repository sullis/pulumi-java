// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse {
    /**
     * The Data Catalog resource name of the dataset entry the current table belongs to. For example: `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
     * 
     */
    private final String dataset;
    /**
     * BigQuery resource name of the latest shard.
     * 
     */
    private final String latestShardResource;
    /**
     * Total number of shards.
     * 
     */
    private final String shardCount;
    /**
     * The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`. For example, for the `MyTable20180101` shard, the `table_prefix` is `MyTable`.
     * 
     */
    private final String tablePrefix;

    @OutputCustomType.Constructor({"dataset","latestShardResource","shardCount","tablePrefix"})
    private GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse(
        String dataset,
        String latestShardResource,
        String shardCount,
        String tablePrefix) {
        this.dataset = Objects.requireNonNull(dataset);
        this.latestShardResource = Objects.requireNonNull(latestShardResource);
        this.shardCount = Objects.requireNonNull(shardCount);
        this.tablePrefix = Objects.requireNonNull(tablePrefix);
    }

    /**
     * The Data Catalog resource name of the dataset entry the current table belongs to. For example: `projects/{PROJECT_ID}/locations/{LOCATION}/entrygroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`.
     * 
    */
    public String getDataset() {
        return this.dataset;
    }
    /**
     * BigQuery resource name of the latest shard.
     * 
    */
    public String getLatestShardResource() {
        return this.latestShardResource;
    }
    /**
     * Total number of shards.
     * 
    */
    public String getShardCount() {
        return this.shardCount;
    }
    /**
     * The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`. For example, for the `MyTable20180101` shard, the `table_prefix` is `MyTable`.
     * 
    */
    public String getTablePrefix() {
        return this.tablePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataset;
        private String latestShardResource;
        private String shardCount;
        private String tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.latestShardResource = defaults.latestShardResource;
    	      this.shardCount = defaults.shardCount;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder setDataset(String dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setLatestShardResource(String latestShardResource) {
            this.latestShardResource = Objects.requireNonNull(latestShardResource);
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
        public GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse build() {
            return new GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse(dataset, latestShardResource, shardCount, tablePrefix);
        }
    }
}