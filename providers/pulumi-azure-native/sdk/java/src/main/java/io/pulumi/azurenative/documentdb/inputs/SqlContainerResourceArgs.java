// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.ConflictResolutionPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.ContainerPartitionKeyArgs;
import io.pulumi.azurenative.documentdb.inputs.IndexingPolicyArgs;
import io.pulumi.azurenative.documentdb.inputs.UniqueKeyPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL container resource object
 * 
 */
public final class SqlContainerResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlContainerResourceArgs Empty = new SqlContainerResourceArgs();

    /**
     * Analytical TTL.
     * 
     */
    @InputImport(name="analyticalStorageTtl")
    private final @Nullable Input<Double> analyticalStorageTtl;

    public Input<Double> getAnalyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Input.empty() : this.analyticalStorageTtl;
    }

    /**
     * The conflict resolution policy for the container.
     * 
     */
    @InputImport(name="conflictResolutionPolicy")
    private final @Nullable Input<ConflictResolutionPolicyArgs> conflictResolutionPolicy;

    public Input<ConflictResolutionPolicyArgs> getConflictResolutionPolicy() {
        return this.conflictResolutionPolicy == null ? Input.empty() : this.conflictResolutionPolicy;
    }

    /**
     * Default time to live
     * 
     */
    @InputImport(name="defaultTtl")
    private final @Nullable Input<Integer> defaultTtl;

    public Input<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Input.empty() : this.defaultTtl;
    }

    /**
     * Name of the Cosmos DB SQL container
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    @InputImport(name="indexingPolicy")
    private final @Nullable Input<IndexingPolicyArgs> indexingPolicy;

    public Input<IndexingPolicyArgs> getIndexingPolicy() {
        return this.indexingPolicy == null ? Input.empty() : this.indexingPolicy;
    }

    /**
     * The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    @InputImport(name="partitionKey")
    private final @Nullable Input<ContainerPartitionKeyArgs> partitionKey;

    public Input<ContainerPartitionKeyArgs> getPartitionKey() {
        return this.partitionKey == null ? Input.empty() : this.partitionKey;
    }

    /**
     * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    @InputImport(name="uniqueKeyPolicy")
    private final @Nullable Input<UniqueKeyPolicyArgs> uniqueKeyPolicy;

    public Input<UniqueKeyPolicyArgs> getUniqueKeyPolicy() {
        return this.uniqueKeyPolicy == null ? Input.empty() : this.uniqueKeyPolicy;
    }

    public SqlContainerResourceArgs(
        @Nullable Input<Double> analyticalStorageTtl,
        @Nullable Input<ConflictResolutionPolicyArgs> conflictResolutionPolicy,
        @Nullable Input<Integer> defaultTtl,
        Input<String> id,
        @Nullable Input<IndexingPolicyArgs> indexingPolicy,
        @Nullable Input<ContainerPartitionKeyArgs> partitionKey,
        @Nullable Input<UniqueKeyPolicyArgs> uniqueKeyPolicy) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.defaultTtl = defaultTtl;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.indexingPolicy = indexingPolicy;
        this.partitionKey = partitionKey;
        this.uniqueKeyPolicy = uniqueKeyPolicy;
    }

    private SqlContainerResourceArgs() {
        this.analyticalStorageTtl = Input.empty();
        this.conflictResolutionPolicy = Input.empty();
        this.defaultTtl = Input.empty();
        this.id = Input.empty();
        this.indexingPolicy = Input.empty();
        this.partitionKey = Input.empty();
        this.uniqueKeyPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> analyticalStorageTtl;
        private @Nullable Input<ConflictResolutionPolicyArgs> conflictResolutionPolicy;
        private @Nullable Input<Integer> defaultTtl;
        private Input<String> id;
        private @Nullable Input<IndexingPolicyArgs> indexingPolicy;
        private @Nullable Input<ContainerPartitionKeyArgs> partitionKey;
        private @Nullable Input<UniqueKeyPolicyArgs> uniqueKeyPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.id = defaults.id;
    	      this.indexingPolicy = defaults.indexingPolicy;
    	      this.partitionKey = defaults.partitionKey;
    	      this.uniqueKeyPolicy = defaults.uniqueKeyPolicy;
        }

        public Builder setAnalyticalStorageTtl(@Nullable Input<Double> analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }

        public Builder setAnalyticalStorageTtl(@Nullable Double analyticalStorageTtl) {
            this.analyticalStorageTtl = Input.ofNullable(analyticalStorageTtl);
            return this;
        }

        public Builder setConflictResolutionPolicy(@Nullable Input<ConflictResolutionPolicyArgs> conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        public Builder setConflictResolutionPolicy(@Nullable ConflictResolutionPolicyArgs conflictResolutionPolicy) {
            this.conflictResolutionPolicy = Input.ofNullable(conflictResolutionPolicy);
            return this;
        }

        public Builder setDefaultTtl(@Nullable Input<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setDefaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Input.ofNullable(defaultTtl);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setIndexingPolicy(@Nullable Input<IndexingPolicyArgs> indexingPolicy) {
            this.indexingPolicy = indexingPolicy;
            return this;
        }

        public Builder setIndexingPolicy(@Nullable IndexingPolicyArgs indexingPolicy) {
            this.indexingPolicy = Input.ofNullable(indexingPolicy);
            return this;
        }

        public Builder setPartitionKey(@Nullable Input<ContainerPartitionKeyArgs> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setPartitionKey(@Nullable ContainerPartitionKeyArgs partitionKey) {
            this.partitionKey = Input.ofNullable(partitionKey);
            return this;
        }

        public Builder setUniqueKeyPolicy(@Nullable Input<UniqueKeyPolicyArgs> uniqueKeyPolicy) {
            this.uniqueKeyPolicy = uniqueKeyPolicy;
            return this;
        }

        public Builder setUniqueKeyPolicy(@Nullable UniqueKeyPolicyArgs uniqueKeyPolicy) {
            this.uniqueKeyPolicy = Input.ofNullable(uniqueKeyPolicy);
            return this;
        }

        public SqlContainerResourceArgs build() {
            return new SqlContainerResourceArgs(analyticalStorageTtl, conflictResolutionPolicy, defaultTtl, id, indexingPolicy, partitionKey, uniqueKeyPolicy);
        }
    }
}
