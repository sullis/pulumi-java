// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The key vault reference.
 * 
 */
public final class KeyVaultReference extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultReference Empty = new KeyVaultReference();

    /**
     * The resource id.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The key vault name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public KeyVaultReference(
        @Nullable String id,
        @Nullable String name) {
        this.id = id;
        this.name = name;
    }

    private KeyVaultReference() {
        this.id = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public KeyVaultReference build() {
            return new KeyVaultReference(id, name);
        }
    }
}
