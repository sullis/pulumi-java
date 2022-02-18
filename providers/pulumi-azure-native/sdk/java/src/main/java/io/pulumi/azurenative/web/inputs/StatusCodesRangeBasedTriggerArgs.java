// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger based on range of status codes.
 * 
 */
public final class StatusCodesRangeBasedTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusCodesRangeBasedTriggerArgs Empty = new StatusCodesRangeBasedTriggerArgs();

    /**
     * Request Count.
     * 
     */
    @InputImport(name="count")
    private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * HTTP status code.
     * 
     */
    @InputImport(name="statusCodes")
    private final @Nullable Input<String> statusCodes;

    public Input<String> getStatusCodes() {
        return this.statusCodes == null ? Input.empty() : this.statusCodes;
    }

    /**
     * Time interval.
     * 
     */
    @InputImport(name="timeInterval")
    private final @Nullable Input<String> timeInterval;

    public Input<String> getTimeInterval() {
        return this.timeInterval == null ? Input.empty() : this.timeInterval;
    }

    public StatusCodesRangeBasedTriggerArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<String> path,
        @Nullable Input<String> statusCodes,
        @Nullable Input<String> timeInterval) {
        this.count = count;
        this.path = path;
        this.statusCodes = statusCodes;
        this.timeInterval = timeInterval;
    }

    private StatusCodesRangeBasedTriggerArgs() {
        this.count = Input.empty();
        this.path = Input.empty();
        this.statusCodes = Input.empty();
        this.timeInterval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesRangeBasedTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<String> path;
        private @Nullable Input<String> statusCodes;
        private @Nullable Input<String> timeInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesRangeBasedTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.statusCodes = defaults.statusCodes;
    	      this.timeInterval = defaults.timeInterval;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setStatusCodes(@Nullable Input<String> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }

        public Builder setStatusCodes(@Nullable String statusCodes) {
            this.statusCodes = Input.ofNullable(statusCodes);
            return this;
        }

        public Builder setTimeInterval(@Nullable Input<String> timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public Builder setTimeInterval(@Nullable String timeInterval) {
            this.timeInterval = Input.ofNullable(timeInterval);
            return this;
        }

        public StatusCodesRangeBasedTriggerArgs build() {
            return new StatusCodesRangeBasedTriggerArgs(count, path, statusCodes, timeInterval);
        }
    }
}
