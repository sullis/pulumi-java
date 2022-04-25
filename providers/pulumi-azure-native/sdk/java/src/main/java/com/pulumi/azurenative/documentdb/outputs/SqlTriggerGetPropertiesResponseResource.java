// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlTriggerGetPropertiesResponseResource {
    /**
     * @return Body of the Trigger
     * 
     */
    private final @Nullable String body;
    /**
     * @return A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    private final String etag;
    /**
     * @return Name of the Cosmos DB SQL trigger
     * 
     */
    private final String id;
    /**
     * @return A system generated property. A unique identifier.
     * 
     */
    private final String rid;
    /**
     * @return The operation the trigger is associated with
     * 
     */
    private final @Nullable String triggerOperation;
    /**
     * @return Type of the Trigger
     * 
     */
    private final @Nullable String triggerType;
    /**
     * @return A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    private final Double ts;

    @CustomType.Constructor
    private SqlTriggerGetPropertiesResponseResource(
        @CustomType.Parameter("body") @Nullable String body,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("rid") String rid,
        @CustomType.Parameter("triggerOperation") @Nullable String triggerOperation,
        @CustomType.Parameter("triggerType") @Nullable String triggerType,
        @CustomType.Parameter("ts") Double ts) {
        this.body = body;
        this.etag = etag;
        this.id = id;
        this.rid = rid;
        this.triggerOperation = triggerOperation;
        this.triggerType = triggerType;
        this.ts = ts;
    }

    /**
     * @return Body of the Trigger
     * 
     */
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Name of the Cosmos DB SQL trigger
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A system generated property. A unique identifier.
     * 
     */
    public String rid() {
        return this.rid;
    }
    /**
     * @return The operation the trigger is associated with
     * 
     */
    public Optional<String> triggerOperation() {
        return Optional.ofNullable(this.triggerOperation);
    }
    /**
     * @return Type of the Trigger
     * 
     */
    public Optional<String> triggerType() {
        return Optional.ofNullable(this.triggerType);
    }
    /**
     * @return A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    public Double ts() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlTriggerGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String body;
        private String etag;
        private String id;
        private String rid;
        private @Nullable String triggerOperation;
        private @Nullable String triggerType;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlTriggerGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.triggerOperation = defaults.triggerOperation;
    	      this.triggerType = defaults.triggerType;
    	      this.ts = defaults.ts;
        }

        public Builder body(@Nullable String body) {
            this.body = body;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder rid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }
        public Builder triggerOperation(@Nullable String triggerOperation) {
            this.triggerOperation = triggerOperation;
            return this;
        }
        public Builder triggerType(@Nullable String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }        public SqlTriggerGetPropertiesResponseResource build() {
            return new SqlTriggerGetPropertiesResponseResource(body, etag, id, rid, triggerOperation, triggerType, ts);
        }
    }
}
