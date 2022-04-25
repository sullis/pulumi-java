// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Message containing connection draining configuration.
 * 
 */
public final class ConnectionDrainingResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionDrainingResponse Empty = new ConnectionDrainingResponse();

    /**
     * Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
     * 
     */
    @Import(name="drainingTimeoutSec", required=true)
    private Integer drainingTimeoutSec;

    /**
     * @return Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
     * 
     */
    public Integer drainingTimeoutSec() {
        return this.drainingTimeoutSec;
    }

    private ConnectionDrainingResponse() {}

    private ConnectionDrainingResponse(ConnectionDrainingResponse $) {
        this.drainingTimeoutSec = $.drainingTimeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionDrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionDrainingResponse $;

        public Builder() {
            $ = new ConnectionDrainingResponse();
        }

        public Builder(ConnectionDrainingResponse defaults) {
            $ = new ConnectionDrainingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param drainingTimeoutSec Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
         * 
         * @return builder
         * 
         */
        public Builder drainingTimeoutSec(Integer drainingTimeoutSec) {
            $.drainingTimeoutSec = drainingTimeoutSec;
            return this;
        }

        public ConnectionDrainingResponse build() {
            $.drainingTimeoutSec = Objects.requireNonNull($.drainingTimeoutSec, "expected parameter 'drainingTimeoutSec' to be non-null");
            return $;
        }
    }

}
