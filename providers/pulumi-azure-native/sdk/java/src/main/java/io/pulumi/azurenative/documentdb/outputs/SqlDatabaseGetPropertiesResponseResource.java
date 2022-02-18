// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlDatabaseGetPropertiesResponseResource {
    /**
     * A system generated property that specified the addressable path of the collections resource.
     * 
     */
    private final @Nullable String colls;
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    private final String etag;
    /**
     * Name of the Cosmos DB SQL database
     * 
     */
    private final String id;
    /**
     * A system generated property. A unique identifier.
     * 
     */
    private final String rid;
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    private final Double ts;
    /**
     * A system generated property that specifies the addressable path of the users resource.
     * 
     */
    private final @Nullable String users;

    @OutputCustomType.Constructor({"colls","etag","id","rid","ts","users"})
    private SqlDatabaseGetPropertiesResponseResource(
        @Nullable String colls,
        String etag,
        String id,
        String rid,
        Double ts,
        @Nullable String users) {
        this.colls = colls;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.rid = Objects.requireNonNull(rid);
        this.ts = Objects.requireNonNull(ts);
        this.users = users;
    }

    /**
     * A system generated property that specified the addressable path of the collections resource.
     * 
     */
    public Optional<String> getColls() {
        return Optional.ofNullable(this.colls);
    }
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Name of the Cosmos DB SQL database
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A system generated property. A unique identifier.
     * 
     */
    public String getRid() {
        return this.rid;
    }
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    public Double getTs() {
        return this.ts;
    }
    /**
     * A system generated property that specifies the addressable path of the users resource.
     * 
     */
    public Optional<String> getUsers() {
        return Optional.ofNullable(this.users);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDatabaseGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String colls;
        private String etag;
        private String id;
        private String rid;
        private Double ts;
        private @Nullable String users;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDatabaseGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colls = defaults.colls;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
    	      this.users = defaults.users;
        }

        public Builder setColls(@Nullable String colls) {
            this.colls = colls;
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

        public Builder setRid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public Builder setUsers(@Nullable String users) {
            this.users = users;
            return this;
        }

        public SqlDatabaseGetPropertiesResponseResource build() {
            return new SqlDatabaseGetPropertiesResponseResource(colls, etag, id, rid, ts, users);
        }
    }
}
