// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusEgressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusEgressPolicyArgs Empty = new ServicePerimetersServicePerimeterStatusEgressPolicyArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressFrom")
      private final @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom;

    public Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs> getEgressFrom() {
        return this.egressFrom == null ? Input.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressTo")
      private final @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs> egressTo;

    public Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs> getEgressTo() {
        return this.egressTo == null ? Input.empty() : this.egressTo;
    }

    public ServicePerimetersServicePerimeterStatusEgressPolicyArgs(
        @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom,
        @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimetersServicePerimeterStatusEgressPolicyArgs() {
        this.egressFrom = Input.empty();
        this.egressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom;
        private @Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(@Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder setEgressFrom(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromArgs egressFrom) {
            this.egressFrom = Input.ofNullable(egressFrom);
            return this;
        }

        public Builder setEgressTo(@Nullable Input<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder setEgressTo(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressToArgs egressTo) {
            this.egressTo = Input.ofNullable(egressTo);
            return this;
        }
        public ServicePerimetersServicePerimeterStatusEgressPolicyArgs build() {
            return new ServicePerimetersServicePerimeterStatusEgressPolicyArgs(egressFrom, egressTo);
        }
    }
}