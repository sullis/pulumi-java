// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebPubSubKeysResult {
    /**
     * @return Connection string constructed via the primaryKey
     * 
     */
    private final @Nullable String primaryConnectionString;
    /**
     * @return The primary access key.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * @return Connection string constructed via the secondaryKey
     * 
     */
    private final @Nullable String secondaryConnectionString;
    /**
     * @return The secondary access key.
     * 
     */
    private final @Nullable String secondaryKey;

    @CustomType.Constructor
    private ListWebPubSubKeysResult(
        @CustomType.Parameter("primaryConnectionString") @Nullable String primaryConnectionString,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("secondaryConnectionString") @Nullable String secondaryConnectionString,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.primaryConnectionString = primaryConnectionString;
        this.primaryKey = primaryKey;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryKey = secondaryKey;
    }

    /**
     * @return Connection string constructed via the primaryKey
     * 
     */
    public Optional<String> primaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }
    /**
     * @return The primary access key.
     * 
     */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * @return Connection string constructed via the secondaryKey
     * 
     */
    public Optional<String> secondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }
    /**
     * @return The secondary access key.
     * 
     */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebPubSubKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primaryConnectionString;
        private @Nullable String primaryKey;
        private @Nullable String secondaryConnectionString;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebPubSubKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder primaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder secondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }        public ListWebPubSubKeysResult build() {
            return new ListWebPubSubKeysResult(primaryConnectionString, primaryKey, secondaryConnectionString, secondaryKey);
        }
    }
}
