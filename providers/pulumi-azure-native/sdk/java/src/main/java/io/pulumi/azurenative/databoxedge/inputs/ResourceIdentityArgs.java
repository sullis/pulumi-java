// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.enums.MsiIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Msi identity details of the resource
 * 
 */
public final class ResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * Identity type
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,MsiIdentityType>> type;

    public Input<Either<String,MsiIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ResourceIdentityArgs(@Nullable Input<Either<String,MsiIdentityType>> type) {
        this.type = type;
    }

    private ResourceIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,MsiIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,MsiIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,MsiIdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ResourceIdentityArgs build() {
            return new ResourceIdentityArgs(type);
        }
    }
}
