// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.NetworkLoadBalancer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetListenerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListenerPlainArgs Empty = new GetListenerPlainArgs();

    /**
     * The name of the listener to get.  Example: `example_listener`
     * 
     */
    @Import(name="listenerName", required=true)
    private String listenerName;

    /**
     * @return The name of the listener to get.  Example: `example_listener`
     * 
     */
    public String listenerName() {
        return this.listenerName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
     * 
     */
    @Import(name="networkLoadBalancerId", required=true)
    private String networkLoadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
     * 
     */
    public String networkLoadBalancerId() {
        return this.networkLoadBalancerId;
    }

    private GetListenerPlainArgs() {}

    private GetListenerPlainArgs(GetListenerPlainArgs $) {
        this.listenerName = $.listenerName;
        this.networkLoadBalancerId = $.networkLoadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListenerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListenerPlainArgs $;

        public Builder() {
            $ = new GetListenerPlainArgs();
        }

        public Builder(GetListenerPlainArgs defaults) {
            $ = new GetListenerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listenerName The name of the listener to get.  Example: `example_listener`
         * 
         * @return builder
         * 
         */
        public Builder listenerName(String listenerName) {
            $.listenerName = listenerName;
            return this;
        }

        /**
         * @param networkLoadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
         * 
         * @return builder
         * 
         */
        public Builder networkLoadBalancerId(String networkLoadBalancerId) {
            $.networkLoadBalancerId = networkLoadBalancerId;
            return this;
        }

        public GetListenerPlainArgs build() {
            $.listenerName = Objects.requireNonNull($.listenerName, "expected parameter 'listenerName' to be non-null");
            $.networkLoadBalancerId = Objects.requireNonNull($.networkLoadBalancerId, "expected parameter 'networkLoadBalancerId' to be non-null");
            return $;
        }
    }

}
