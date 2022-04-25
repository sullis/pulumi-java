// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressFromArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyIngressToArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecIngressPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecIngressPolicyArgs Empty = new ServicePerimeterSpecIngressPolicyArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressFrom")
    private @Nullable Output<ServicePerimeterSpecIngressPolicyIngressFromArgs> ingressFrom;

    /**
     * @return Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterSpecIngressPolicyIngressFromArgs>> ingressFrom() {
        return Optional.ofNullable(this.ingressFrom);
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressTo")
    private @Nullable Output<ServicePerimeterSpecIngressPolicyIngressToArgs> ingressTo;

    /**
     * @return Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterSpecIngressPolicyIngressToArgs>> ingressTo() {
        return Optional.ofNullable(this.ingressTo);
    }

    private ServicePerimeterSpecIngressPolicyArgs() {}

    private ServicePerimeterSpecIngressPolicyArgs(ServicePerimeterSpecIngressPolicyArgs $) {
        this.ingressFrom = $.ingressFrom;
        this.ingressTo = $.ingressTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterSpecIngressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterSpecIngressPolicyArgs $;

        public Builder() {
            $ = new ServicePerimeterSpecIngressPolicyArgs();
        }

        public Builder(ServicePerimeterSpecIngressPolicyArgs defaults) {
            $ = new ServicePerimeterSpecIngressPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
         * to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ingressFrom(@Nullable Output<ServicePerimeterSpecIngressPolicyIngressFromArgs> ingressFrom) {
            $.ingressFrom = ingressFrom;
            return this;
        }

        /**
         * @param ingressFrom Defines the conditions on the source of a request causing this `IngressPolicy`
         * to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ingressFrom(ServicePerimeterSpecIngressPolicyIngressFromArgs ingressFrom) {
            return ingressFrom(Output.of(ingressFrom));
        }

        /**
         * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
         * this `IngressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ingressTo(@Nullable Output<ServicePerimeterSpecIngressPolicyIngressToArgs> ingressTo) {
            $.ingressTo = ingressTo;
            return this;
        }

        /**
         * @param ingressTo Defines the conditions on the `ApiOperation` and request destination that cause
         * this `IngressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ingressTo(ServicePerimeterSpecIngressPolicyIngressToArgs ingressTo) {
            return ingressTo(Output.of(ingressTo));
        }

        public ServicePerimeterSpecIngressPolicyArgs build() {
            return $;
        }
    }

}
