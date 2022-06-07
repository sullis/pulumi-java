// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackendHealthPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendHealthPlainArgs Empty = new GetBackendHealthPlainArgs();

    /**
     * The IP address and port of the backend server to retrieve the health status for.  Example: `10.0.0.3:8080`
     * 
     */
    @Import(name="backendName", required=true)
    private String backendName;

    /**
     * @return The IP address and port of the backend server to retrieve the health status for.  Example: `10.0.0.3:8080`
     * 
     */
    public String backendName() {
        return this.backendName;
    }

    /**
     * The name of the backend set associated with the backend server to retrieve the health status for.  Example: `example_backend_set`
     * 
     */
    @Import(name="backendSetName", required=true)
    private String backendSetName;

    /**
     * @return The name of the backend set associated with the backend server to retrieve the health status for.  Example: `example_backend_set`
     * 
     */
    public String backendSetName() {
        return this.backendSetName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer associated with the backend server health status to be retrieved.
     * 
     */
    @Import(name="loadBalancerId", required=true)
    private String loadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer associated with the backend server health status to be retrieved.
     * 
     */
    public String loadBalancerId() {
        return this.loadBalancerId;
    }

    private GetBackendHealthPlainArgs() {}

    private GetBackendHealthPlainArgs(GetBackendHealthPlainArgs $) {
        this.backendName = $.backendName;
        this.backendSetName = $.backendSetName;
        this.loadBalancerId = $.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendHealthPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendHealthPlainArgs $;

        public Builder() {
            $ = new GetBackendHealthPlainArgs();
        }

        public Builder(GetBackendHealthPlainArgs defaults) {
            $ = new GetBackendHealthPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendName The IP address and port of the backend server to retrieve the health status for.  Example: `10.0.0.3:8080`
         * 
         * @return builder
         * 
         */
        public Builder backendName(String backendName) {
            $.backendName = backendName;
            return this;
        }

        /**
         * @param backendSetName The name of the backend set associated with the backend server to retrieve the health status for.  Example: `example_backend_set`
         * 
         * @return builder
         * 
         */
        public Builder backendSetName(String backendSetName) {
            $.backendSetName = backendSetName;
            return this;
        }

        /**
         * @param loadBalancerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer associated with the backend server health status to be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        public GetBackendHealthPlainArgs build() {
            $.backendName = Objects.requireNonNull($.backendName, "expected parameter 'backendName' to be non-null");
            $.backendSetName = Objects.requireNonNull($.backendSetName, "expected parameter 'backendSetName' to be non-null");
            $.loadBalancerId = Objects.requireNonNull($.loadBalancerId, "expected parameter 'loadBalancerId' to be non-null");
            return $;
        }
    }

}
