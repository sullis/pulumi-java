// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusIngressPolicyIngressFrom;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusIngressPolicyIngressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimeterStatusIngressPolicy {
    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo;

    @OutputCustomType.Constructor({"ingressFrom","ingressTo"})
    private ServicePerimeterStatusIngressPolicy(
        @Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom,
        @Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimeterStatusIngressPolicyIngressFrom> getIngressFrom() {
        return Optional.ofNullable(this.ingressFrom);
    }
    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimeterStatusIngressPolicyIngressTo> getIngressTo() {
        return Optional.ofNullable(this.ingressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
        private @Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder setIngressFrom(@Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder setIngressTo(@Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }
        public ServicePerimeterStatusIngressPolicy build() {
            return new ServicePerimeterStatusIngressPolicy(ingressFrom, ingressTo);
        }
    }
}