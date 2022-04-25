// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data flow properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeDataFlowPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeDataFlowPropertiesResponse Empty = new IntegrationRuntimeDataFlowPropertiesResponse();

    /**
     * Cluster will not be recycled and it will be used in next data flow activity run until TTL (time to live) is reached if this is set as false. Default is true.
     * 
     */
    @Import(name="cleanup")
    private @Nullable Boolean cleanup;

    /**
     * @return Cluster will not be recycled and it will be used in next data flow activity run until TTL (time to live) is reached if this is set as false. Default is true.
     * 
     */
    public Optional<Boolean> cleanup() {
        return Optional.ofNullable(this.cleanup);
    }

    /**
     * Compute type of the cluster which will execute data flow job.
     * 
     */
    @Import(name="computeType")
    private @Nullable String computeType;

    /**
     * @return Compute type of the cluster which will execute data flow job.
     * 
     */
    public Optional<String> computeType() {
        return Optional.ofNullable(this.computeType);
    }

    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    @Import(name="coreCount")
    private @Nullable Integer coreCount;

    /**
     * @return Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    public Optional<Integer> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    @Import(name="timeToLive")
    private @Nullable Integer timeToLive;

    /**
     * @return Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    public Optional<Integer> timeToLive() {
        return Optional.ofNullable(this.timeToLive);
    }

    private IntegrationRuntimeDataFlowPropertiesResponse() {}

    private IntegrationRuntimeDataFlowPropertiesResponse(IntegrationRuntimeDataFlowPropertiesResponse $) {
        this.cleanup = $.cleanup;
        this.computeType = $.computeType;
        this.coreCount = $.coreCount;
        this.timeToLive = $.timeToLive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeDataFlowPropertiesResponse $;

        public Builder() {
            $ = new IntegrationRuntimeDataFlowPropertiesResponse();
        }

        public Builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
            $ = new IntegrationRuntimeDataFlowPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cleanup Cluster will not be recycled and it will be used in next data flow activity run until TTL (time to live) is reached if this is set as false. Default is true.
         * 
         * @return builder
         * 
         */
        public Builder cleanup(@Nullable Boolean cleanup) {
            $.cleanup = cleanup;
            return this;
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder computeType(@Nullable String computeType) {
            $.computeType = computeType;
            return this;
        }

        /**
         * @param coreCount Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(@Nullable Integer coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        /**
         * @param timeToLive Time to live (in minutes) setting of the cluster which will execute data flow job.
         * 
         * @return builder
         * 
         */
        public Builder timeToLive(@Nullable Integer timeToLive) {
            $.timeToLive = timeToLive;
            return this;
        }

        public IntegrationRuntimeDataFlowPropertiesResponse build() {
            return $;
        }
    }

}
