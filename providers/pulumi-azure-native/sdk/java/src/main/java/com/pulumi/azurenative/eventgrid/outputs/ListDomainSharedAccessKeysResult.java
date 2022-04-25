// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListDomainSharedAccessKeysResult {
    /**
     * @return Shared access key1 for the domain.
     * 
     */
    private final @Nullable String key1;
    /**
     * @return Shared access key2 for the domain.
     * 
     */
    private final @Nullable String key2;

    @CustomType.Constructor
    private ListDomainSharedAccessKeysResult(
        @CustomType.Parameter("key1") @Nullable String key1,
        @CustomType.Parameter("key2") @Nullable String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    /**
     * @return Shared access key1 for the domain.
     * 
     */
    public Optional<String> key1() {
        return Optional.ofNullable(this.key1);
    }
    /**
     * @return Shared access key2 for the domain.
     * 
     */
    public Optional<String> key2() {
        return Optional.ofNullable(this.key2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDomainSharedAccessKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key1;
        private @Nullable String key2;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDomainSharedAccessKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key1 = defaults.key1;
    	      this.key2 = defaults.key2;
        }

        public Builder key1(@Nullable String key1) {
            this.key1 = key1;
            return this;
        }
        public Builder key2(@Nullable String key2) {
            this.key2 = key2;
            return this;
        }        public ListDomainSharedAccessKeysResult build() {
            return new ListDomainSharedAccessKeysResult(key1, key2);
        }
    }
}
