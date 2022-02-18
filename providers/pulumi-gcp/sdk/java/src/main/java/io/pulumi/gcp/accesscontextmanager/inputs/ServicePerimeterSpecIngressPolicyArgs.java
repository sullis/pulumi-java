// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecIngressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecIngressPolicyArgs Empty = new ServicePerimeterSpecIngressPolicyArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressFrom")
    private final @Nullable Input<ServicePerimeterSpecIngressPolicyIngressFromArgs> ingressFrom;

    public Input<ServicePerimeterSpecIngressPolicyIngressFromArgs> getIngressFrom() {
        return this.ingressFrom == null ? Input.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressTo")
    private final @Nullable Input<ServicePerimeterSpecIngressPolicyIngressToArgs> ingressTo;

    public Input<ServicePerimeterSpecIngressPolicyIngressToArgs> getIngressTo() {
        return this.ingressTo == null ? Input.empty() : this.ingressTo;
    }

    public ServicePerimeterSpecIngressPolicyArgs(
        @Nullable Input<ServicePerimeterSpecIngressPolicyIngressFromArgs> ingressFrom,
        @Nullable Input<ServicePerimeterSpecIngressPolicyIngressToArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimeterSpecIngressPolicyArgs() {
        this.ingressFrom = Input.empty();
        this.ingressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecIngressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimeterSpecIngressPolicyIngressFromArgs> ingressFrom;
        private @Nullable Input<ServicePerimeterSpecIngressPolicyIngressToArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecIngressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder setIngressFrom(@Nullable Input<ServicePerimeterSpecIngressPolicyIngressFromArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder setIngressFrom(@Nullable ServicePerimeterSpecIngressPolicyIngressFromArgs ingressFrom) {
            this.ingressFrom = Input.ofNullable(ingressFrom);
            return this;
        }

        public Builder setIngressTo(@Nullable Input<ServicePerimeterSpecIngressPolicyIngressToArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }

        public Builder setIngressTo(@Nullable ServicePerimeterSpecIngressPolicyIngressToArgs ingressTo) {
            this.ingressTo = Input.ofNullable(ingressTo);
            return this;
        }

        public ServicePerimeterSpecIngressPolicyArgs build() {
            return new ServicePerimeterSpecIngressPolicyArgs(ingressFrom, ingressTo);
        }
    }
}
