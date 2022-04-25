// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListMediaServiceKeysResult {
    /**
     * @return The primary authorization endpoint.
     * 
     */
    private final @Nullable String primaryAuthEndpoint;
    /**
     * @return The primary key for the Media Service resource.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * @return The authorization scope.
     * 
     */
    private final @Nullable String scope;
    /**
     * @return The secondary authorization endpoint.
     * 
     */
    private final @Nullable String secondaryAuthEndpoint;
    /**
     * @return The secondary key for the Media Service resource.
     * 
     */
    private final @Nullable String secondaryKey;

    @CustomType.Constructor
    private ListMediaServiceKeysResult(
        @CustomType.Parameter("primaryAuthEndpoint") @Nullable String primaryAuthEndpoint,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("secondaryAuthEndpoint") @Nullable String secondaryAuthEndpoint,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.primaryAuthEndpoint = primaryAuthEndpoint;
        this.primaryKey = primaryKey;
        this.scope = scope;
        this.secondaryAuthEndpoint = secondaryAuthEndpoint;
        this.secondaryKey = secondaryKey;
    }

    /**
     * @return The primary authorization endpoint.
     * 
     */
    public Optional<String> primaryAuthEndpoint() {
        return Optional.ofNullable(this.primaryAuthEndpoint);
    }
    /**
     * @return The primary key for the Media Service resource.
     * 
     */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * @return The authorization scope.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return The secondary authorization endpoint.
     * 
     */
    public Optional<String> secondaryAuthEndpoint() {
        return Optional.ofNullable(this.secondaryAuthEndpoint);
    }
    /**
     * @return The secondary key for the Media Service resource.
     * 
     */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMediaServiceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primaryAuthEndpoint;
        private @Nullable String primaryKey;
        private @Nullable String scope;
        private @Nullable String secondaryAuthEndpoint;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMediaServiceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryAuthEndpoint = defaults.primaryAuthEndpoint;
    	      this.primaryKey = defaults.primaryKey;
    	      this.scope = defaults.scope;
    	      this.secondaryAuthEndpoint = defaults.secondaryAuthEndpoint;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder primaryAuthEndpoint(@Nullable String primaryAuthEndpoint) {
            this.primaryAuthEndpoint = primaryAuthEndpoint;
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder secondaryAuthEndpoint(@Nullable String secondaryAuthEndpoint) {
            this.secondaryAuthEndpoint = secondaryAuthEndpoint;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }        public ListMediaServiceKeysResult build() {
            return new ListMediaServiceKeysResult(primaryAuthEndpoint, primaryKey, scope, secondaryAuthEndpoint, secondaryKey);
        }
    }
}
