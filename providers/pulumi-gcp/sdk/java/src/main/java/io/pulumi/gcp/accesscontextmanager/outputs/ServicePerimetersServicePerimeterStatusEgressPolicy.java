// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFrom;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimetersServicePerimeterStatusEgressPolicy {
    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressFrom egressFrom;
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo egressTo;

    @OutputCustomType.Constructor({"egressFrom","egressTo"})
    private ServicePerimetersServicePerimeterStatusEgressPolicy(
        @Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressFrom egressFrom,
        @Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFrom> getEgressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo> getEgressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressFrom egressFrom;
        private @Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressFrom egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder setEgressTo(@Nullable ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public ServicePerimetersServicePerimeterStatusEgressPolicy build() {
            return new ServicePerimetersServicePerimeterStatusEgressPolicy(egressFrom, egressTo);
        }
    }
}
