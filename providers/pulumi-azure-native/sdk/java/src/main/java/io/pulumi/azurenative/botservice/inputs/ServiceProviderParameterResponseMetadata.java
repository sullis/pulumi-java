// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.ServiceProviderParameterResponseConstraints;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Meta data for the Service Provider
 * 
 */
public final class ServiceProviderParameterResponseMetadata extends io.pulumi.resources.InvokeArgs {

    public static final ServiceProviderParameterResponseMetadata Empty = new ServiceProviderParameterResponseMetadata();

    /**
     * the constraints of the bot meta data.
     * 
     */
    @InputImport(name="constraints")
      private final @Nullable ServiceProviderParameterResponseConstraints constraints;

    public Optional<ServiceProviderParameterResponseConstraints> getConstraints() {
        return this.constraints == null ? Optional.empty() : Optional.ofNullable(this.constraints);
    }

    public ServiceProviderParameterResponseMetadata(@Nullable ServiceProviderParameterResponseConstraints constraints) {
        this.constraints = constraints;
    }

    private ServiceProviderParameterResponseMetadata() {
        this.constraints = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProviderParameterResponseMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceProviderParameterResponseConstraints constraints;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProviderParameterResponseMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
        }

        public Builder setConstraints(@Nullable ServiceProviderParameterResponseConstraints constraints) {
            this.constraints = constraints;
            return this;
        }
        public ServiceProviderParameterResponseMetadata build() {
            return new ServiceProviderParameterResponseMetadata(constraints);
        }
    }
}