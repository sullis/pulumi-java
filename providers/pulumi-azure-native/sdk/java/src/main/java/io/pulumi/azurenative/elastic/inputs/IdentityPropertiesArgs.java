// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.azurenative.elastic.enums.ManagedIdentityTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity properties.
 * 
 */
public final class IdentityPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPropertiesArgs Empty = new IdentityPropertiesArgs();

    /**
     * Managed identity type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,ManagedIdentityTypes>> type;

    public Input<Either<String,ManagedIdentityTypes>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public IdentityPropertiesArgs(@Nullable Input<Either<String,ManagedIdentityTypes>> type) {
        this.type = type;
    }

    private IdentityPropertiesArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ManagedIdentityTypes>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,ManagedIdentityTypes>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ManagedIdentityTypes> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public IdentityPropertiesArgs build() {
            return new IdentityPropertiesArgs(type);
        }
    }
}