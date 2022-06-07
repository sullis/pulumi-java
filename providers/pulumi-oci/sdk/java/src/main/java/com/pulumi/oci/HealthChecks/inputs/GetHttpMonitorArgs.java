// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.HealthChecks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHttpMonitorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpMonitorArgs Empty = new GetHttpMonitorArgs();

    /**
     * The OCID of a monitor.
     * 
     */
    @Import(name="monitorId", required=true)
    private Output<String> monitorId;

    /**
     * @return The OCID of a monitor.
     * 
     */
    public Output<String> monitorId() {
        return this.monitorId;
    }

    private GetHttpMonitorArgs() {}

    private GetHttpMonitorArgs(GetHttpMonitorArgs $) {
        this.monitorId = $.monitorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpMonitorArgs $;

        public Builder() {
            $ = new GetHttpMonitorArgs();
        }

        public Builder(GetHttpMonitorArgs defaults) {
            $ = new GetHttpMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitorId The OCID of a monitor.
         * 
         * @return builder
         * 
         */
        public Builder monitorId(Output<String> monitorId) {
            $.monitorId = monitorId;
            return this;
        }

        /**
         * @param monitorId The OCID of a monitor.
         * 
         * @return builder
         * 
         */
        public Builder monitorId(String monitorId) {
            return monitorId(Output.of(monitorId));
        }

        public GetHttpMonitorArgs build() {
            $.monitorId = Objects.requireNonNull($.monitorId, "expected parameter 'monitorId' to be non-null");
            return $;
        }
    }

}
