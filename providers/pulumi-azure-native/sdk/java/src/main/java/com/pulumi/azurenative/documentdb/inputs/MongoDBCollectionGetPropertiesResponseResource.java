// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.MongoIndexResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MongoDBCollectionGetPropertiesResponseResource extends com.pulumi.resources.InvokeArgs {

    public static final MongoDBCollectionGetPropertiesResponseResource Empty = new MongoDBCollectionGetPropertiesResponseResource();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
    private @Nullable Integer analyticalStorageTtl;

    /**
     * @return Analytical TTL.
     * 
     */
    public Optional<Integer> analyticalStorageTtl() {
        return Optional.ofNullable(this.analyticalStorageTtl);
    }

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Name of the Cosmos DB MongoDB collection
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Name of the Cosmos DB MongoDB collection
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * List of index keys
     * 
     */
    @Import(name="indexes")
    private @Nullable List<MongoIndexResponse> indexes;

    /**
     * @return List of index keys
     * 
     */
    public Optional<List<MongoIndexResponse>> indexes() {
        return Optional.ofNullable(this.indexes);
    }

    /**
     * A system generated property. A unique identifier.
     * 
     */
    @Import(name="rid", required=true)
    private String rid;

    /**
     * @return A system generated property. A unique identifier.
     * 
     */
    public String rid() {
        return this.rid;
    }

    /**
     * A key-value pair of shard keys to be applied for the request.
     * 
     */
    @Import(name="shardKey")
    private @Nullable Map<String,String> shardKey;

    /**
     * @return A key-value pair of shard keys to be applied for the request.
     * 
     */
    public Optional<Map<String,String>> shardKey() {
        return Optional.ofNullable(this.shardKey);
    }

    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    @Import(name="ts", required=true)
    private Double ts;

    /**
     * @return A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    public Double ts() {
        return this.ts;
    }

    private MongoDBCollectionGetPropertiesResponseResource() {}

    private MongoDBCollectionGetPropertiesResponseResource(MongoDBCollectionGetPropertiesResponseResource $) {
        this.analyticalStorageTtl = $.analyticalStorageTtl;
        this.etag = $.etag;
        this.id = $.id;
        this.indexes = $.indexes;
        this.rid = $.rid;
        this.shardKey = $.shardKey;
        this.ts = $.ts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MongoDBCollectionGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MongoDBCollectionGetPropertiesResponseResource $;

        public Builder() {
            $ = new MongoDBCollectionGetPropertiesResponseResource();
        }

        public Builder(MongoDBCollectionGetPropertiesResponseResource defaults) {
            $ = new MongoDBCollectionGetPropertiesResponseResource(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyticalStorageTtl Analytical TTL.
         * 
         * @return builder
         * 
         */
        public Builder analyticalStorageTtl(@Nullable Integer analyticalStorageTtl) {
            $.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }

        /**
         * @param etag A system generated property representing the resource etag required for optimistic concurrency control.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Name of the Cosmos DB MongoDB collection
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param indexes List of index keys
         * 
         * @return builder
         * 
         */
        public Builder indexes(@Nullable List<MongoIndexResponse> indexes) {
            $.indexes = indexes;
            return this;
        }

        /**
         * @param indexes List of index keys
         * 
         * @return builder
         * 
         */
        public Builder indexes(MongoIndexResponse... indexes) {
            return indexes(List.of(indexes));
        }

        /**
         * @param rid A system generated property. A unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder rid(String rid) {
            $.rid = rid;
            return this;
        }

        /**
         * @param shardKey A key-value pair of shard keys to be applied for the request.
         * 
         * @return builder
         * 
         */
        public Builder shardKey(@Nullable Map<String,String> shardKey) {
            $.shardKey = shardKey;
            return this;
        }

        /**
         * @param ts A system generated property that denotes the last updated timestamp of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ts(Double ts) {
            $.ts = ts;
            return this;
        }

        public MongoDBCollectionGetPropertiesResponseResource build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.rid = Objects.requireNonNull($.rid, "expected parameter 'rid' to be non-null");
            $.ts = Objects.requireNonNull($.ts, "expected parameter 'ts' to be non-null");
            return $;
        }
    }

}
