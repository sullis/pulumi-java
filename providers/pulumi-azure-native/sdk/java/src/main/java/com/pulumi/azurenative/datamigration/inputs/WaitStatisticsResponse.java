// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Wait statistics gathered during query batch execution
 * 
 */
public final class WaitStatisticsResponse extends com.pulumi.resources.InvokeArgs {

    public static final WaitStatisticsResponse Empty = new WaitStatisticsResponse();

    /**
     * Total no. of waits
     * 
     */
    @Import(name="waitCount", required=true)
    private Double waitCount;

    /**
     * @return Total no. of waits
     * 
     */
    public Double waitCount() {
        return this.waitCount;
    }

    /**
     * Total wait time in millisecond(s)
     * 
     */
    @Import(name="waitTimeMs", required=true)
    private Double waitTimeMs;

    /**
     * @return Total wait time in millisecond(s)
     * 
     */
    public Double waitTimeMs() {
        return this.waitTimeMs;
    }

    /**
     * Type of the Wait
     * 
     */
    @Import(name="waitType", required=true)
    private String waitType;

    /**
     * @return Type of the Wait
     * 
     */
    public String waitType() {
        return this.waitType;
    }

    private WaitStatisticsResponse() {}

    private WaitStatisticsResponse(WaitStatisticsResponse $) {
        this.waitCount = $.waitCount;
        this.waitTimeMs = $.waitTimeMs;
        this.waitType = $.waitType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WaitStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WaitStatisticsResponse $;

        public Builder() {
            $ = new WaitStatisticsResponse();
        }

        public Builder(WaitStatisticsResponse defaults) {
            $ = new WaitStatisticsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param waitCount Total no. of waits
         * 
         * @return builder
         * 
         */
        public Builder waitCount(Double waitCount) {
            $.waitCount = waitCount;
            return this;
        }

        /**
         * @param waitTimeMs Total wait time in millisecond(s)
         * 
         * @return builder
         * 
         */
        public Builder waitTimeMs(Double waitTimeMs) {
            $.waitTimeMs = waitTimeMs;
            return this;
        }

        /**
         * @param waitType Type of the Wait
         * 
         * @return builder
         * 
         */
        public Builder waitType(String waitType) {
            $.waitType = waitType;
            return this;
        }

        public WaitStatisticsResponse build() {
            $.waitCount = Objects.requireNonNull($.waitCount, "expected parameter 'waitCount' to be non-null");
            $.waitTimeMs = Codegen.doubleProp("waitTimeMs").arg($.waitTimeMs).def(0e+00).require();
            $.waitType = Objects.requireNonNull($.waitType, "expected parameter 'waitType' to be non-null");
            return $;
        }
    }

}
