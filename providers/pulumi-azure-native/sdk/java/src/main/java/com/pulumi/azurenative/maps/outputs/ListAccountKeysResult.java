// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListAccountKeysResult {
    /**
     * @return The full Azure resource identifier of the Maps Account.
     * 
     */
    private final String id;
    /**
     * @return The primary key for accessing the Maps REST APIs.
     * 
     */
    private final String primaryKey;
    /**
     * @return The secondary key for accessing the Maps REST APIs.
     * 
     */
    private final String secondaryKey;

    @CustomType.Constructor
    private ListAccountKeysResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("secondaryKey") String secondaryKey) {
        this.id = id;
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
    }

    /**
     * @return The full Azure resource identifier of the Maps Account.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The primary key for accessing the Maps REST APIs.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    /**
     * @return The secondary key for accessing the Maps REST APIs.
     * 
     */
    public String secondaryKey() {
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

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }        public ListAccountKeysResult build() {
            return new ListAccountKeysResult(id, primaryKey, secondaryKey);
        }
    }
}
