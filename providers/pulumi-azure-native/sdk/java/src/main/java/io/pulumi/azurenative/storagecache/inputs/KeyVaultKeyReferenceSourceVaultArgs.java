// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a resource Id to source Key Vault.
 * 
 */
public final class KeyVaultKeyReferenceSourceVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultKeyReferenceSourceVaultArgs Empty = new KeyVaultKeyReferenceSourceVaultArgs();

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public KeyVaultKeyReferenceSourceVaultArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private KeyVaultKeyReferenceSourceVaultArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceSourceVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceSourceVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public KeyVaultKeyReferenceSourceVaultArgs build() {
            return new KeyVaultKeyReferenceSourceVaultArgs(id);
        }
    }
}
