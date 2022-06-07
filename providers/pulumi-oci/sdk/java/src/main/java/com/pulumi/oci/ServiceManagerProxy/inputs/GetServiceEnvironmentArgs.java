// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceManagerProxy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceEnvironmentArgs Empty = new GetServiceEnvironmentArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * The unique identifier associated with the service environment.
     * 
     */
    @Import(name="serviceEnvironmentId", required=true)
    private Output<String> serviceEnvironmentId;

    /**
     * @return The unique identifier associated with the service environment.
     * 
     */
    public Output<String> serviceEnvironmentId() {
        return this.serviceEnvironmentId;
    }

    private GetServiceEnvironmentArgs() {}

    private GetServiceEnvironmentArgs(GetServiceEnvironmentArgs $) {
        this.compartmentId = $.compartmentId;
        this.serviceEnvironmentId = $.serviceEnvironmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceEnvironmentArgs $;

        public Builder() {
            $ = new GetServiceEnvironmentArgs();
        }

        public Builder(GetServiceEnvironmentArgs defaults) {
            $ = new GetServiceEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param serviceEnvironmentId The unique identifier associated with the service environment.
         * 
         * @return builder
         * 
         */
        public Builder serviceEnvironmentId(Output<String> serviceEnvironmentId) {
            $.serviceEnvironmentId = serviceEnvironmentId;
            return this;
        }

        /**
         * @param serviceEnvironmentId The unique identifier associated with the service environment.
         * 
         * @return builder
         * 
         */
        public Builder serviceEnvironmentId(String serviceEnvironmentId) {
            return serviceEnvironmentId(Output.of(serviceEnvironmentId));
        }

        public GetServiceEnvironmentArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.serviceEnvironmentId = Objects.requireNonNull($.serviceEnvironmentId, "expected parameter 'serviceEnvironmentId' to be non-null");
            return $;
        }
    }

}
