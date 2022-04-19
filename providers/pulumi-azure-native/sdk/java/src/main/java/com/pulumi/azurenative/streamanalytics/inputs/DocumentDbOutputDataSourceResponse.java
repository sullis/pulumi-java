// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a DocumentDB output data source.
 * 
 */
public final class DocumentDbOutputDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final DocumentDbOutputDataSourceResponse Empty = new DocumentDbOutputDataSourceResponse();

    /**
     * The DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="accountId")
      private final @Nullable String accountId;

    public Optional<String> accountId() {
        return this.accountId == null ? Optional.empty() : Optional.ofNullable(this.accountId);
    }

    /**
     * The account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="accountKey")
      private final @Nullable String accountKey;

    public Optional<String> accountKey() {
        return this.accountKey == null ? Optional.empty() : Optional.ofNullable(this.accountKey);
    }

    /**
     * The collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="collectionNamePattern")
      private final @Nullable String collectionNamePattern;

    public Optional<String> collectionNamePattern() {
        return this.collectionNamePattern == null ? Optional.empty() : Optional.ofNullable(this.collectionNamePattern);
    }

    /**
     * The name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="database")
      private final @Nullable String database;

    public Optional<String> database() {
        return this.database == null ? Optional.empty() : Optional.ofNullable(this.database);
    }

    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    @Import(name="documentId")
      private final @Nullable String documentId;

    public Optional<String> documentId() {
        return this.documentId == null ? Optional.empty() : Optional.ofNullable(this.documentId);
    }

    /**
     * The name of the field in output events used to specify the key for partitioning output across collections. If 'collectionNamePattern' contains the {partition} token, this property is required to be specified.
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable String partitionKey;

    public Optional<String> partitionKey() {
        return this.partitionKey == null ? Optional.empty() : Optional.ofNullable(this.partitionKey);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/DocumentDB'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public DocumentDbOutputDataSourceResponse(
        @Nullable String accountId,
        @Nullable String accountKey,
        @Nullable String collectionNamePattern,
        @Nullable String database,
        @Nullable String documentId,
        @Nullable String partitionKey,
        String type) {
        this.accountId = accountId;
        this.accountKey = accountKey;
        this.collectionNamePattern = collectionNamePattern;
        this.database = database;
        this.documentId = documentId;
        this.partitionKey = partitionKey;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private DocumentDbOutputDataSourceResponse() {
        this.accountId = null;
        this.accountKey = null;
        this.collectionNamePattern = null;
        this.database = null;
        this.documentId = null;
        this.partitionKey = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentDbOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String accountKey;
        private @Nullable String collectionNamePattern;
        private @Nullable String database;
        private @Nullable String documentId;
        private @Nullable String partitionKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentDbOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountKey = defaults.accountKey;
    	      this.collectionNamePattern = defaults.collectionNamePattern;
    	      this.database = defaults.database;
    	      this.documentId = defaults.documentId;
    	      this.partitionKey = defaults.partitionKey;
    	      this.type = defaults.type;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder collectionNamePattern(@Nullable String collectionNamePattern) {
            this.collectionNamePattern = collectionNamePattern;
            return this;
        }
        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        public Builder documentId(@Nullable String documentId) {
            this.documentId = documentId;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DocumentDbOutputDataSourceResponse build() {
            return new DocumentDbOutputDataSourceResponse(accountId, accountKey, collectionNamePattern, database, documentId, partitionKey, type);
        }
    }
}
