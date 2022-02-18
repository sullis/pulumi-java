// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.CassandraPartitionKeyArgs;
import io.pulumi.azurenative.documentdb.inputs.ClusterKeyArgs;
import io.pulumi.azurenative.documentdb.inputs.ColumnArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB Cassandra table schema
 * 
 */
public final class CassandraSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraSchemaArgs Empty = new CassandraSchemaArgs();

    /**
     * List of cluster key.
     * 
     */
    @InputImport(name="clusterKeys")
    private final @Nullable Input<List<ClusterKeyArgs>> clusterKeys;

    public Input<List<ClusterKeyArgs>> getClusterKeys() {
        return this.clusterKeys == null ? Input.empty() : this.clusterKeys;
    }

    /**
     * List of Cassandra table columns.
     * 
     */
    @InputImport(name="columns")
    private final @Nullable Input<List<ColumnArgs>> columns;

    public Input<List<ColumnArgs>> getColumns() {
        return this.columns == null ? Input.empty() : this.columns;
    }

    /**
     * List of partition key.
     * 
     */
    @InputImport(name="partitionKeys")
    private final @Nullable Input<List<CassandraPartitionKeyArgs>> partitionKeys;

    public Input<List<CassandraPartitionKeyArgs>> getPartitionKeys() {
        return this.partitionKeys == null ? Input.empty() : this.partitionKeys;
    }

    public CassandraSchemaArgs(
        @Nullable Input<List<ClusterKeyArgs>> clusterKeys,
        @Nullable Input<List<ColumnArgs>> columns,
        @Nullable Input<List<CassandraPartitionKeyArgs>> partitionKeys) {
        this.clusterKeys = clusterKeys;
        this.columns = columns;
        this.partitionKeys = partitionKeys;
    }

    private CassandraSchemaArgs() {
        this.clusterKeys = Input.empty();
        this.columns = Input.empty();
        this.partitionKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClusterKeyArgs>> clusterKeys;
        private @Nullable Input<List<ColumnArgs>> columns;
        private @Nullable Input<List<CassandraPartitionKeyArgs>> partitionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterKeys = defaults.clusterKeys;
    	      this.columns = defaults.columns;
    	      this.partitionKeys = defaults.partitionKeys;
        }

        public Builder setClusterKeys(@Nullable Input<List<ClusterKeyArgs>> clusterKeys) {
            this.clusterKeys = clusterKeys;
            return this;
        }

        public Builder setClusterKeys(@Nullable List<ClusterKeyArgs> clusterKeys) {
            this.clusterKeys = Input.ofNullable(clusterKeys);
            return this;
        }

        public Builder setColumns(@Nullable Input<List<ColumnArgs>> columns) {
            this.columns = columns;
            return this;
        }

        public Builder setColumns(@Nullable List<ColumnArgs> columns) {
            this.columns = Input.ofNullable(columns);
            return this;
        }

        public Builder setPartitionKeys(@Nullable Input<List<CassandraPartitionKeyArgs>> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        public Builder setPartitionKeys(@Nullable List<CassandraPartitionKeyArgs> partitionKeys) {
            this.partitionKeys = Input.ofNullable(partitionKeys);
            return this;
        }

        public CassandraSchemaArgs build() {
            return new CassandraSchemaArgs(clusterKeys, columns, partitionKeys);
        }
    }
}
