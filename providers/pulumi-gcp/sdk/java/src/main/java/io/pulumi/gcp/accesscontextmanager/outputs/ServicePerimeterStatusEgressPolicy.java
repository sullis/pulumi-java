// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusEgressPolicyEgressFrom;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusEgressPolicyEgressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimeterStatusEgressPolicy {
    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterStatusEgressPolicyEgressFrom egressFrom;
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterStatusEgressPolicyEgressTo egressTo;

    @OutputCustomType.Constructor({"egressFrom","egressTo"})
    private ServicePerimeterStatusEgressPolicy(
        @Nullable ServicePerimeterStatusEgressPolicyEgressFrom egressFrom,
        @Nullable ServicePerimeterStatusEgressPolicyEgressTo egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimeterStatusEgressPolicyEgressFrom> getEgressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimeterStatusEgressPolicyEgressTo> getEgressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusEgressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimeterStatusEgressPolicyEgressFrom egressFrom;
        private @Nullable ServicePerimeterStatusEgressPolicyEgressTo egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusEgressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(@Nullable ServicePerimeterStatusEgressPolicyEgressFrom egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder setEgressTo(@Nullable ServicePerimeterStatusEgressPolicyEgressTo egressTo) {
            this.egressTo = egressTo;
            return this;
        }
        public ServicePerimeterStatusEgressPolicy build() {
            return new ServicePerimeterStatusEgressPolicy(egressFrom, egressTo);
        }
    }
}