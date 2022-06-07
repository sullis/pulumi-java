// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Logging.inputs.GetLogsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogsArgs Empty = new GetLogsArgs();

    /**
     * Resource name
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Resource name
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetLogsFilterArgs>> filters;

    public Optional<Output<List<GetLogsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * OCID of a log group to work with.
     * 
     */
    @Import(name="logGroupId", required=true)
    private Output<String> logGroupId;

    /**
     * @return OCID of a log group to work with.
     * 
     */
    public Output<String> logGroupId() {
        return this.logGroupId;
    }

    /**
     * The logType that the log object is for, whether custom or service.
     * 
     */
    @Import(name="logType")
    private @Nullable Output<String> logType;

    /**
     * @return The logType that the log object is for, whether custom or service.
     * 
     */
    public Optional<Output<String>> logType() {
        return Optional.ofNullable(this.logType);
    }

    /**
     * Log object resource.
     * 
     */
    @Import(name="sourceResource")
    private @Nullable Output<String> sourceResource;

    /**
     * @return Log object resource.
     * 
     */
    public Optional<Output<String>> sourceResource() {
        return Optional.ofNullable(this.sourceResource);
    }

    /**
     * Service that created the log object.
     * 
     */
    @Import(name="sourceService")
    private @Nullable Output<String> sourceService;

    /**
     * @return Service that created the log object.
     * 
     */
    public Optional<Output<String>> sourceService() {
        return Optional.ofNullable(this.sourceService);
    }

    /**
     * Lifecycle state of the log object
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Lifecycle state of the log object
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private GetLogsArgs() {}

    private GetLogsArgs(GetLogsArgs $) {
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.logGroupId = $.logGroupId;
        this.logType = $.logType;
        this.sourceResource = $.sourceResource;
        this.sourceService = $.sourceService;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogsArgs $;

        public Builder() {
            $ = new GetLogsArgs();
        }

        public Builder(GetLogsArgs defaults) {
            $ = new GetLogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Resource name
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Resource name
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetLogsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetLogsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetLogsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param logGroupId OCID of a log group to work with.
         * 
         * @return builder
         * 
         */
        public Builder logGroupId(Output<String> logGroupId) {
            $.logGroupId = logGroupId;
            return this;
        }

        /**
         * @param logGroupId OCID of a log group to work with.
         * 
         * @return builder
         * 
         */
        public Builder logGroupId(String logGroupId) {
            return logGroupId(Output.of(logGroupId));
        }

        /**
         * @param logType The logType that the log object is for, whether custom or service.
         * 
         * @return builder
         * 
         */
        public Builder logType(@Nullable Output<String> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType The logType that the log object is for, whether custom or service.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            return logType(Output.of(logType));
        }

        /**
         * @param sourceResource Log object resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceResource(@Nullable Output<String> sourceResource) {
            $.sourceResource = sourceResource;
            return this;
        }

        /**
         * @param sourceResource Log object resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceResource(String sourceResource) {
            return sourceResource(Output.of(sourceResource));
        }

        /**
         * @param sourceService Service that created the log object.
         * 
         * @return builder
         * 
         */
        public Builder sourceService(@Nullable Output<String> sourceService) {
            $.sourceService = sourceService;
            return this;
        }

        /**
         * @param sourceService Service that created the log object.
         * 
         * @return builder
         * 
         */
        public Builder sourceService(String sourceService) {
            return sourceService(Output.of(sourceService));
        }

        /**
         * @param state Lifecycle state of the log object
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Lifecycle state of the log object
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public GetLogsArgs build() {
            $.logGroupId = Objects.requireNonNull($.logGroupId, "expected parameter 'logGroupId' to be non-null");
            return $;
        }
    }

}
