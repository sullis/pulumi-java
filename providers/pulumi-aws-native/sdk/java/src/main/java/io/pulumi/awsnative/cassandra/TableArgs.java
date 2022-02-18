// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra;

import io.pulumi.awsnative.cassandra.inputs.TableBillingModeArgs;
import io.pulumi.awsnative.cassandra.inputs.TableClusteringKeyColumnArgs;
import io.pulumi.awsnative.cassandra.inputs.TableColumnArgs;
import io.pulumi.awsnative.cassandra.inputs.TableEncryptionSpecificationArgs;
import io.pulumi.awsnative.cassandra.inputs.TableTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    @InputImport(name="billingMode")
    private final @Nullable Input<TableBillingModeArgs> billingMode;

    public Input<TableBillingModeArgs> getBillingMode() {
        return this.billingMode == null ? Input.empty() : this.billingMode;
    }

    /**
     * Clustering key columns of the table
     * 
     */
    @InputImport(name="clusteringKeyColumns")
    private final @Nullable Input<List<TableClusteringKeyColumnArgs>> clusteringKeyColumns;

    public Input<List<TableClusteringKeyColumnArgs>> getClusteringKeyColumns() {
        return this.clusteringKeyColumns == null ? Input.empty() : this.clusteringKeyColumns;
    }

    /**
     * Default TTL (Time To Live) in seconds, where zero is disabled. If the value is greater than zero, TTL is enabled for the entire table and an expiration timestamp is added to each column.
     * 
     */
    @InputImport(name="defaultTimeToLive")
    private final @Nullable Input<Integer> defaultTimeToLive;

    public Input<Integer> getDefaultTimeToLive() {
        return this.defaultTimeToLive == null ? Input.empty() : this.defaultTimeToLive;
    }

    @InputImport(name="encryptionSpecification")
    private final @Nullable Input<TableEncryptionSpecificationArgs> encryptionSpecification;

    public Input<TableEncryptionSpecificationArgs> getEncryptionSpecification() {
        return this.encryptionSpecification == null ? Input.empty() : this.encryptionSpecification;
    }

    /**
     * Name for Cassandra keyspace
     * 
     */
    @InputImport(name="keyspaceName", required=true)
    private final Input<String> keyspaceName;

    public Input<String> getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * Partition key columns of the table
     * 
     */
    @InputImport(name="partitionKeyColumns", required=true)
    private final Input<List<TableColumnArgs>> partitionKeyColumns;

    public Input<List<TableColumnArgs>> getPartitionKeyColumns() {
        return this.partitionKeyColumns;
    }

    /**
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table
     * 
     */
    @InputImport(name="pointInTimeRecoveryEnabled")
    private final @Nullable Input<Boolean> pointInTimeRecoveryEnabled;

    public Input<Boolean> getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled == null ? Input.empty() : this.pointInTimeRecoveryEnabled;
    }

    /**
     * Non-key columns of the table
     * 
     */
    @InputImport(name="regularColumns")
    private final @Nullable Input<List<TableColumnArgs>> regularColumns;

    public Input<List<TableColumnArgs>> getRegularColumns() {
        return this.regularColumns == null ? Input.empty() : this.regularColumns;
    }

    /**
     * Name for Cassandra table
     * 
     */
    @InputImport(name="tableName")
    private final @Nullable Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName == null ? Input.empty() : this.tableName;
    }

    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<TableTagArgs>> tags;

    public Input<List<TableTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public TableArgs(
        @Nullable Input<TableBillingModeArgs> billingMode,
        @Nullable Input<List<TableClusteringKeyColumnArgs>> clusteringKeyColumns,
        @Nullable Input<Integer> defaultTimeToLive,
        @Nullable Input<TableEncryptionSpecificationArgs> encryptionSpecification,
        Input<String> keyspaceName,
        Input<List<TableColumnArgs>> partitionKeyColumns,
        @Nullable Input<Boolean> pointInTimeRecoveryEnabled,
        @Nullable Input<List<TableColumnArgs>> regularColumns,
        @Nullable Input<String> tableName,
        @Nullable Input<List<TableTagArgs>> tags) {
        this.billingMode = billingMode;
        this.clusteringKeyColumns = clusteringKeyColumns;
        this.defaultTimeToLive = defaultTimeToLive;
        this.encryptionSpecification = encryptionSpecification;
        this.keyspaceName = Objects.requireNonNull(keyspaceName, "expected parameter 'keyspaceName' to be non-null");
        this.partitionKeyColumns = Objects.requireNonNull(partitionKeyColumns, "expected parameter 'partitionKeyColumns' to be non-null");
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        this.regularColumns = regularColumns;
        this.tableName = tableName;
        this.tags = tags;
    }

    private TableArgs() {
        this.billingMode = Input.empty();
        this.clusteringKeyColumns = Input.empty();
        this.defaultTimeToLive = Input.empty();
        this.encryptionSpecification = Input.empty();
        this.keyspaceName = Input.empty();
        this.partitionKeyColumns = Input.empty();
        this.pointInTimeRecoveryEnabled = Input.empty();
        this.regularColumns = Input.empty();
        this.tableName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TableBillingModeArgs> billingMode;
        private @Nullable Input<List<TableClusteringKeyColumnArgs>> clusteringKeyColumns;
        private @Nullable Input<Integer> defaultTimeToLive;
        private @Nullable Input<TableEncryptionSpecificationArgs> encryptionSpecification;
        private Input<String> keyspaceName;
        private Input<List<TableColumnArgs>> partitionKeyColumns;
        private @Nullable Input<Boolean> pointInTimeRecoveryEnabled;
        private @Nullable Input<List<TableColumnArgs>> regularColumns;
        private @Nullable Input<String> tableName;
        private @Nullable Input<List<TableTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingMode = defaults.billingMode;
    	      this.clusteringKeyColumns = defaults.clusteringKeyColumns;
    	      this.defaultTimeToLive = defaults.defaultTimeToLive;
    	      this.encryptionSpecification = defaults.encryptionSpecification;
    	      this.keyspaceName = defaults.keyspaceName;
    	      this.partitionKeyColumns = defaults.partitionKeyColumns;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.regularColumns = defaults.regularColumns;
    	      this.tableName = defaults.tableName;
    	      this.tags = defaults.tags;
        }

        public Builder setBillingMode(@Nullable Input<TableBillingModeArgs> billingMode) {
            this.billingMode = billingMode;
            return this;
        }

        public Builder setBillingMode(@Nullable TableBillingModeArgs billingMode) {
            this.billingMode = Input.ofNullable(billingMode);
            return this;
        }

        public Builder setClusteringKeyColumns(@Nullable Input<List<TableClusteringKeyColumnArgs>> clusteringKeyColumns) {
            this.clusteringKeyColumns = clusteringKeyColumns;
            return this;
        }

        public Builder setClusteringKeyColumns(@Nullable List<TableClusteringKeyColumnArgs> clusteringKeyColumns) {
            this.clusteringKeyColumns = Input.ofNullable(clusteringKeyColumns);
            return this;
        }

        public Builder setDefaultTimeToLive(@Nullable Input<Integer> defaultTimeToLive) {
            this.defaultTimeToLive = defaultTimeToLive;
            return this;
        }

        public Builder setDefaultTimeToLive(@Nullable Integer defaultTimeToLive) {
            this.defaultTimeToLive = Input.ofNullable(defaultTimeToLive);
            return this;
        }

        public Builder setEncryptionSpecification(@Nullable Input<TableEncryptionSpecificationArgs> encryptionSpecification) {
            this.encryptionSpecification = encryptionSpecification;
            return this;
        }

        public Builder setEncryptionSpecification(@Nullable TableEncryptionSpecificationArgs encryptionSpecification) {
            this.encryptionSpecification = Input.ofNullable(encryptionSpecification);
            return this;
        }

        public Builder setKeyspaceName(Input<String> keyspaceName) {
            this.keyspaceName = Objects.requireNonNull(keyspaceName);
            return this;
        }

        public Builder setKeyspaceName(String keyspaceName) {
            this.keyspaceName = Input.of(Objects.requireNonNull(keyspaceName));
            return this;
        }

        public Builder setPartitionKeyColumns(Input<List<TableColumnArgs>> partitionKeyColumns) {
            this.partitionKeyColumns = Objects.requireNonNull(partitionKeyColumns);
            return this;
        }

        public Builder setPartitionKeyColumns(List<TableColumnArgs> partitionKeyColumns) {
            this.partitionKeyColumns = Input.of(Objects.requireNonNull(partitionKeyColumns));
            return this;
        }

        public Builder setPointInTimeRecoveryEnabled(@Nullable Input<Boolean> pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }

        public Builder setPointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Input.ofNullable(pointInTimeRecoveryEnabled);
            return this;
        }

        public Builder setRegularColumns(@Nullable Input<List<TableColumnArgs>> regularColumns) {
            this.regularColumns = regularColumns;
            return this;
        }

        public Builder setRegularColumns(@Nullable List<TableColumnArgs> regularColumns) {
            this.regularColumns = Input.ofNullable(regularColumns);
            return this;
        }

        public Builder setTableName(@Nullable Input<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = Input.ofNullable(tableName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<TableTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TableTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public TableArgs build() {
            return new TableArgs(billingMode, clusteringKeyColumns, defaultTimeToLive, encryptionSpecification, keyspaceName, partitionKeyColumns, pointInTimeRecoveryEnabled, regularColumns, tableName, tags);
        }
    }
}
