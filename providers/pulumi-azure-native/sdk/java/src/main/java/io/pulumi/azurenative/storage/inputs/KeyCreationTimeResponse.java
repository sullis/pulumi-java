// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Storage account keys creation time.
 * 
 */
public final class KeyCreationTimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyCreationTimeResponse Empty = new KeyCreationTimeResponse();

    @InputImport(name="key1")
      private final @Nullable String key1;

    public Optional<String> getKey1() {
        return this.key1 == null ? Optional.empty() : Optional.ofNullable(this.key1);
    }

    @InputImport(name="key2")
      private final @Nullable String key2;

    public Optional<String> getKey2() {
        return this.key2 == null ? Optional.empty() : Optional.ofNullable(this.key2);
    }

    public KeyCreationTimeResponse(
        @Nullable String key1,
        @Nullable String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    private KeyCreationTimeResponse() {
        this.key1 = null;
        this.key2 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyCreationTimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key1;
        private @Nullable String key2;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyCreationTimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key1 = defaults.key1;
    	      this.key2 = defaults.key2;
        }

        public Builder setKey1(@Nullable String key1) {
            this.key1 = key1;
            return this;
        }

        public Builder setKey2(@Nullable String key2) {
            this.key2 = key2;
            return this;
        }
        public KeyCreationTimeResponse build() {
            return new KeyCreationTimeResponse(key1, key2);
        }
    }
}