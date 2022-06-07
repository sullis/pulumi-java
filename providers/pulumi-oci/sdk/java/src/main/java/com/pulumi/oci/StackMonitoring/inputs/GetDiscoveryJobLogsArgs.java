// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.StackMonitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.StackMonitoring.inputs.GetDiscoveryJobLogsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiscoveryJobLogsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiscoveryJobLogsArgs Empty = new GetDiscoveryJobLogsArgs();

    /**
     * The Discovery Job ID
     * 
     */
    @Import(name="discoveryJobId", required=true)
    private Output<String> discoveryJobId;

    /**
     * @return The Discovery Job ID
     * 
     */
    public Output<String> discoveryJobId() {
        return this.discoveryJobId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetDiscoveryJobLogsFilterArgs>> filters;

    public Optional<Output<List<GetDiscoveryJobLogsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The log type like INFO, WARNING, ERROR, SUCCESS
     * 
     */
    @Import(name="logType")
    private @Nullable Output<String> logType;

    /**
     * @return The log type like INFO, WARNING, ERROR, SUCCESS
     * 
     */
    public Optional<Output<String>> logType() {
        return Optional.ofNullable(this.logType);
    }

    private GetDiscoveryJobLogsArgs() {}

    private GetDiscoveryJobLogsArgs(GetDiscoveryJobLogsArgs $) {
        this.discoveryJobId = $.discoveryJobId;
        this.filters = $.filters;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiscoveryJobLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiscoveryJobLogsArgs $;

        public Builder() {
            $ = new GetDiscoveryJobLogsArgs();
        }

        public Builder(GetDiscoveryJobLogsArgs defaults) {
            $ = new GetDiscoveryJobLogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param discoveryJobId The Discovery Job ID
         * 
         * @return builder
         * 
         */
        public Builder discoveryJobId(Output<String> discoveryJobId) {
            $.discoveryJobId = discoveryJobId;
            return this;
        }

        /**
         * @param discoveryJobId The Discovery Job ID
         * 
         * @return builder
         * 
         */
        public Builder discoveryJobId(String discoveryJobId) {
            return discoveryJobId(Output.of(discoveryJobId));
        }

        public Builder filters(@Nullable Output<List<GetDiscoveryJobLogsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetDiscoveryJobLogsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetDiscoveryJobLogsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param logType The log type like INFO, WARNING, ERROR, SUCCESS
         * 
         * @return builder
         * 
         */
        public Builder logType(@Nullable Output<String> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType The log type like INFO, WARNING, ERROR, SUCCESS
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            return logType(Output.of(logType));
        }

        public GetDiscoveryJobLogsArgs build() {
            $.discoveryJobId = Objects.requireNonNull($.discoveryJobId, "expected parameter 'discoveryJobId' to be non-null");
            return $;
        }
    }

}
