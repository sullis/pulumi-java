// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class BigQueryOptionsResponse {
    /**
     * Optional. Whether to use BigQuery's partition tables (https://cloud.google.com/bigquery/docs/partitioned-tables). By default, Cloud Logging creates dated tables based on the log entries' timestamps, e.g. syslog_20170523. With partitioned tables the date suffix is no longer present and special query syntax (https://cloud.google.com/bigquery/docs/querying-partitioned-tables) has to be used instead. In both cases, tables are sharded based on UTC timezone.
     * 
     */
    private final Boolean usePartitionedTables;
    /**
     * True if new timestamp column based partitioning is in use, false if legacy ingestion-time partitioning is in use.All new sinks will have this field set true and will use timestamp column based partitioning. If use_partitioned_tables is false, this value has no meaning and will be false. Legacy sinks using partitioned tables will have this field set to false.
     * 
     */
    private final Boolean usesTimestampColumnPartitioning;

    @OutputCustomType.Constructor({"usePartitionedTables","usesTimestampColumnPartitioning"})
    private BigQueryOptionsResponse(
        Boolean usePartitionedTables,
        Boolean usesTimestampColumnPartitioning) {
        this.usePartitionedTables = Objects.requireNonNull(usePartitionedTables);
        this.usesTimestampColumnPartitioning = Objects.requireNonNull(usesTimestampColumnPartitioning);
    }

    /**
     * Optional. Whether to use BigQuery's partition tables (https://cloud.google.com/bigquery/docs/partitioned-tables). By default, Cloud Logging creates dated tables based on the log entries' timestamps, e.g. syslog_20170523. With partitioned tables the date suffix is no longer present and special query syntax (https://cloud.google.com/bigquery/docs/querying-partitioned-tables) has to be used instead. In both cases, tables are sharded based on UTC timezone.
     * 
    */
    public Boolean getUsePartitionedTables() {
        return this.usePartitionedTables;
    }
    /**
     * True if new timestamp column based partitioning is in use, false if legacy ingestion-time partitioning is in use.All new sinks will have this field set true and will use timestamp column based partitioning. If use_partitioned_tables is false, this value has no meaning and will be false. Legacy sinks using partitioned tables will have this field set to false.
     * 
    */
    public Boolean getUsesTimestampColumnPartitioning() {
        return this.usesTimestampColumnPartitioning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean usePartitionedTables;
        private Boolean usesTimestampColumnPartitioning;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usePartitionedTables = defaults.usePartitionedTables;
    	      this.usesTimestampColumnPartitioning = defaults.usesTimestampColumnPartitioning;
        }

        public Builder setUsePartitionedTables(Boolean usePartitionedTables) {
            this.usePartitionedTables = Objects.requireNonNull(usePartitionedTables);
            return this;
        }

        public Builder setUsesTimestampColumnPartitioning(Boolean usesTimestampColumnPartitioning) {
            this.usesTimestampColumnPartitioning = Objects.requireNonNull(usesTimestampColumnPartitioning);
            return this;
        }
        public BigQueryOptionsResponse build() {
            return new BigQueryOptionsResponse(usePartitionedTables, usesTimestampColumnPartitioning);
        }
    }
}