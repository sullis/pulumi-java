// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class UptimeCheckConfigTcpCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigTcpCheckArgs Empty = new UptimeCheckConfigTcpCheckArgs();

    /**
     * The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private UptimeCheckConfigTcpCheckArgs() {}

    private UptimeCheckConfigTcpCheckArgs(UptimeCheckConfigTcpCheckArgs $) {
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckConfigTcpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckConfigTcpCheckArgs $;

        public Builder() {
            $ = new UptimeCheckConfigTcpCheckArgs();
        }

        public Builder(UptimeCheckConfigTcpCheckArgs defaults) {
            $ = new UptimeCheckConfigTcpCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public UptimeCheckConfigTcpCheckArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
