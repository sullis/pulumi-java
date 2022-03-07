// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccountResponseSku {
    /**
     * Gets or sets the sku capacity.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * Gets or sets the sku name.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"capacity","name"})
    private AccountResponseSku(
        @Nullable Integer capacity,
        @Nullable String name) {
        this.capacity = capacity;
        this.name = name;
    }

    /**
     * Gets or sets the sku capacity.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Gets or sets the sku name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountResponseSku defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountResponseSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public AccountResponseSku build() {
            return new AccountResponseSku(capacity, name);
        }
    }
}