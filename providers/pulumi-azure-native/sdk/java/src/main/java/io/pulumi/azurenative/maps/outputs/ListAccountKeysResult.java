// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListAccountKeysResult {
    /**
     * The full Azure resource identifier of the Maps Account.
     * 
     */
    private final String id;
    /**
     * The primary key for accessing the Maps REST APIs.
     * 
     */
    private final String primaryKey;
    /**
     * The secondary key for accessing the Maps REST APIs.
     * 
     */
    private final String secondaryKey;

    @OutputCustomType.Constructor({"id","primaryKey","secondaryKey"})
    private ListAccountKeysResult(
        String id,
        String primaryKey,
        String secondaryKey) {
        this.id = Objects.requireNonNull(id);
        this.primaryKey = Objects.requireNonNull(primaryKey);
        this.secondaryKey = Objects.requireNonNull(secondaryKey);
    }

    /**
     * The full Azure resource identifier of the Maps Account.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The primary key for accessing the Maps REST APIs.
     * 
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * The secondary key for accessing the Maps REST APIs.
     * 
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPrimaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder setSecondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public ListAccountKeysResult build() {
            return new ListAccountKeysResult(id, primaryKey, secondaryKey);
        }
    }
}