// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.MongoIndexResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MongoDBCollectionGetPropertiesResponseResource {
    /**
     * Analytical TTL.
     * 
     */
    private final @Nullable Integer analyticalStorageTtl;
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    private final String etag;
    /**
     * Name of the Cosmos DB MongoDB collection
     * 
     */
    private final String id;
    /**
     * List of index keys
     * 
     */
    private final @Nullable List<MongoIndexResponse> indexes;
    /**
     * A system generated property. A unique identifier.
     * 
     */
    private final String rid;
    /**
     * A key-value pair of shard keys to be applied for the request.
     * 
     */
    private final @Nullable Map<String,String> shardKey;
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    private final Double ts;

    @OutputCustomType.Constructor({"analyticalStorageTtl","etag","id","indexes","rid","shardKey","ts"})
    private MongoDBCollectionGetPropertiesResponseResource(
        @Nullable Integer analyticalStorageTtl,
        String etag,
        String id,
        @Nullable List<MongoIndexResponse> indexes,
        String rid,
        @Nullable Map<String,String> shardKey,
        Double ts) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.indexes = indexes;
        this.rid = Objects.requireNonNull(rid);
        this.shardKey = shardKey;
        this.ts = Objects.requireNonNull(ts);
    }

    /**
     * Analytical TTL.
     * 
     */
    public Optional<Integer> getAnalyticalStorageTtl() {
        return Optional.ofNullable(this.analyticalStorageTtl);
    }
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Name of the Cosmos DB MongoDB collection
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * List of index keys
     * 
     */
    public List<MongoIndexResponse> getIndexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }
    /**
     * A system generated property. A unique identifier.
     * 
     */
    public String getRid() {
        return this.rid;
    }
    /**
     * A key-value pair of shard keys to be applied for the request.
     * 
     */
    public Map<String,String> getShardKey() {
        return this.shardKey == null ? Map.of() : this.shardKey;
    }
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    public Double getTs() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBCollectionGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer analyticalStorageTtl;
        private String etag;
        private String id;
        private @Nullable List<MongoIndexResponse> indexes;
        private String rid;
        private @Nullable Map<String,String> shardKey;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBCollectionGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.indexes = defaults.indexes;
    	      this.rid = defaults.rid;
    	      this.shardKey = defaults.shardKey;
    	      this.ts = defaults.ts;
        }

        public Builder setAnalyticalStorageTtl(@Nullable Integer analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIndexes(@Nullable List<MongoIndexResponse> indexes) {
            this.indexes = indexes;
            return this;
        }

        public Builder setRid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder setShardKey(@Nullable Map<String,String> shardKey) {
            this.shardKey = shardKey;
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public MongoDBCollectionGetPropertiesResponseResource build() {
            return new MongoDBCollectionGetPropertiesResponseResource(analyticalStorageTtl, etag, id, indexes, rid, shardKey, ts);
        }
    }
}
