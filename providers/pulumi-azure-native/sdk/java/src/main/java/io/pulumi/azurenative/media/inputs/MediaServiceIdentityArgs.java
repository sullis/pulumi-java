// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.ManagedIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MediaServiceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final MediaServiceIdentityArgs Empty = new MediaServiceIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<Either<String,ManagedIdentityType>> type;

    public Input<Either<String,ManagedIdentityType>> getType() {
        return this.type;
    }

    public MediaServiceIdentityArgs(Input<Either<String,ManagedIdentityType>> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MediaServiceIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,ManagedIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaServiceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<Either<String,ManagedIdentityType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ManagedIdentityType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public MediaServiceIdentityArgs build() {
            return new MediaServiceIdentityArgs(type);
        }
    }
}
