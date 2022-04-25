// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListServiceTestKeysResult {
    /**
     * @return Indicates whether the test endpoint feature enabled or not
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Primary key
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * @return Primary test endpoint
     * 
     */
    private final @Nullable String primaryTestEndpoint;
    /**
     * @return Secondary key
     * 
     */
    private final @Nullable String secondaryKey;
    /**
     * @return Secondary test endpoint
     * 
     */
    private final @Nullable String secondaryTestEndpoint;

    @CustomType.Constructor
    private ListServiceTestKeysResult(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("primaryTestEndpoint") @Nullable String primaryTestEndpoint,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey,
        @CustomType.Parameter("secondaryTestEndpoint") @Nullable String secondaryTestEndpoint) {
        this.enabled = enabled;
        this.primaryKey = primaryKey;
        this.primaryTestEndpoint = primaryTestEndpoint;
        this.secondaryKey = secondaryKey;
        this.secondaryTestEndpoint = secondaryTestEndpoint;
    }

    /**
     * @return Indicates whether the test endpoint feature enabled or not
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Primary key
     * 
     */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * @return Primary test endpoint
     * 
     */
    public Optional<String> primaryTestEndpoint() {
        return Optional.ofNullable(this.primaryTestEndpoint);
    }
    /**
     * @return Secondary key
     * 
     */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }
    /**
     * @return Secondary test endpoint
     * 
     */
    public Optional<String> secondaryTestEndpoint() {
        return Optional.ofNullable(this.secondaryTestEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListServiceTestKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String primaryKey;
        private @Nullable String primaryTestEndpoint;
        private @Nullable String secondaryKey;
        private @Nullable String secondaryTestEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListServiceTestKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.primaryKey = defaults.primaryKey;
    	      this.primaryTestEndpoint = defaults.primaryTestEndpoint;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.secondaryTestEndpoint = defaults.secondaryTestEndpoint;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder primaryTestEndpoint(@Nullable String primaryTestEndpoint) {
            this.primaryTestEndpoint = primaryTestEndpoint;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public Builder secondaryTestEndpoint(@Nullable String secondaryTestEndpoint) {
            this.secondaryTestEndpoint = secondaryTestEndpoint;
            return this;
        }        public ListServiceTestKeysResult build() {
            return new ListServiceTestKeysResult(enabled, primaryKey, primaryTestEndpoint, secondaryKey, secondaryTestEndpoint);
        }
    }
}
