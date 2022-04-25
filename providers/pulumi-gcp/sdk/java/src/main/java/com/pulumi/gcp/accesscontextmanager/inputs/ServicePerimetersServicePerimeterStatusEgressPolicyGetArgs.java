// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs Empty = new ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
    private @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom;

    /**
     * @return Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs>> egressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
    private @Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo;

    /**
     * @return Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs>> egressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    private ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs() {}

    private ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs $) {
        this.egressFrom = $.egressFrom;
        this.egressTo = $.egressTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs $;

        public Builder() {
            $ = new ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs();
        }

        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs defaults) {
            $ = new ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(@Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom) {
            $.egressFrom = egressFrom;
            return this;
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromGetArgs egressFrom) {
            return egressFrom(Output.of(egressFrom));
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(@Nullable Output<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo) {
            $.egressTo = egressTo;
            return this;
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(ServicePerimetersServicePerimeterStatusEgressPolicyEgressToGetArgs egressTo) {
            return egressTo(Output.of(egressTo));
        }

        public ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs build() {
            return $;
        }
    }

}
