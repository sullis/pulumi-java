// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHealthArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHealthArgs Empty = new GetHealthArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to return health status for.
     * 
     */
    @Import(name="loadBalancerId", required=true)
    private Output<String> loadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to return health status for.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }

    private GetHealthArgs() {}

    private GetHealthArgs(GetHealthArgs $) {
        this.loadBalancerId = $.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHealthArgs $;

        public Builder() {
            $ = new GetHealthArgs();
        }

        public Builder(GetHealthArgs defaults) {
            $ = new GetHealthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to return health status for.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to return health status for.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        public GetHealthArgs build() {
            $.loadBalancerId = Objects.requireNonNull($.loadBalancerId, "expected parameter 'loadBalancerId' to be non-null");
            return $;
        }
    }

}
