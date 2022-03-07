// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.azurenative.healthcareapis.enums.ManagedServiceIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Setting indicating whether the service has a managed identity associated with it.
 * 
 */
public final class ServicesResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicesResourceIdentityArgs Empty = new ServicesResourceIdentityArgs();

    /**
     * Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,ManagedServiceIdentityType>> type;

    public Input<Either<String,ManagedServiceIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ServicesResourceIdentityArgs(@Nullable Input<Either<String,ManagedServiceIdentityType>> type) {
        this.type = type;
    }

    private ServicesResourceIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicesResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ManagedServiceIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicesResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,ManagedServiceIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ManagedServiceIdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ServicesResourceIdentityArgs build() {
            return new ServicesResourceIdentityArgs(type);
        }
    }
}