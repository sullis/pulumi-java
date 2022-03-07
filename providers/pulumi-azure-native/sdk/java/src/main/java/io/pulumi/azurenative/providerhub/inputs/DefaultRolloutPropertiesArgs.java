// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.ProvisioningState;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutPropertiesSpecificationArgs;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutPropertiesStatusArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the rollout.
 * 
 */
public final class DefaultRolloutPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultRolloutPropertiesArgs Empty = new DefaultRolloutPropertiesArgs();

    @InputImport(name="provisioningState")
      private final @Nullable Input<Either<String,ProvisioningState>> provisioningState;

    public Input<Either<String,ProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    @InputImport(name="specification")
      private final @Nullable Input<DefaultRolloutPropertiesSpecificationArgs> specification;

    public Input<DefaultRolloutPropertiesSpecificationArgs> getSpecification() {
        return this.specification == null ? Input.empty() : this.specification;
    }

    @InputImport(name="status")
      private final @Nullable Input<DefaultRolloutPropertiesStatusArgs> status;

    public Input<DefaultRolloutPropertiesStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public DefaultRolloutPropertiesArgs(
        @Nullable Input<Either<String,ProvisioningState>> provisioningState,
        @Nullable Input<DefaultRolloutPropertiesSpecificationArgs> specification,
        @Nullable Input<DefaultRolloutPropertiesStatusArgs> status) {
        this.provisioningState = provisioningState;
        this.specification = specification;
        this.status = status;
    }

    private DefaultRolloutPropertiesArgs() {
        this.provisioningState = Input.empty();
        this.specification = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ProvisioningState>> provisioningState;
        private @Nullable Input<DefaultRolloutPropertiesSpecificationArgs> specification;
        private @Nullable Input<DefaultRolloutPropertiesStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.specification = defaults.specification;
    	      this.status = defaults.status;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setSpecification(@Nullable Input<DefaultRolloutPropertiesSpecificationArgs> specification) {
            this.specification = specification;
            return this;
        }

        public Builder setSpecification(@Nullable DefaultRolloutPropertiesSpecificationArgs specification) {
            this.specification = Input.ofNullable(specification);
            return this;
        }

        public Builder setStatus(@Nullable Input<DefaultRolloutPropertiesStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable DefaultRolloutPropertiesStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public DefaultRolloutPropertiesArgs build() {
            return new DefaultRolloutPropertiesArgs(provisioningState, specification, status);
        }
    }
}