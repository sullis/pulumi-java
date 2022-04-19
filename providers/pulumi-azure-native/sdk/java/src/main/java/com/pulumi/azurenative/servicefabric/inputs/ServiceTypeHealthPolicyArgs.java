// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the health policy used to evaluate the health of services belonging to a service type.
 * 
 */
public final class ServiceTypeHealthPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTypeHealthPolicyArgs Empty = new ServiceTypeHealthPolicyArgs();

    /**
     * The maximum percentage of services allowed to be unhealthy before your application is considered in error.
     * 
     */
    @Import(name="maxPercentUnhealthyServices")
      private final @Nullable Output<Integer> maxPercentUnhealthyServices;

    public Output<Integer> maxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices == null ? Codegen.empty() : this.maxPercentUnhealthyServices;
    }

    public ServiceTypeHealthPolicyArgs(@Nullable Output<Integer> maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = Codegen.integerProp("maxPercentUnhealthyServices").output().arg(maxPercentUnhealthyServices).def(0).getNullable();
    }

    private ServiceTypeHealthPolicyArgs() {
        this.maxPercentUnhealthyServices = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTypeHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxPercentUnhealthyServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTypeHealthPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPercentUnhealthyServices = defaults.maxPercentUnhealthyServices;
        }

        public Builder maxPercentUnhealthyServices(@Nullable Output<Integer> maxPercentUnhealthyServices) {
            this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
            return this;
        }
        public Builder maxPercentUnhealthyServices(@Nullable Integer maxPercentUnhealthyServices) {
            this.maxPercentUnhealthyServices = Codegen.ofNullable(maxPercentUnhealthyServices);
            return this;
        }        public ServiceTypeHealthPolicyArgs build() {
            return new ServiceTypeHealthPolicyArgs(maxPercentUnhealthyServices);
        }
    }
}
