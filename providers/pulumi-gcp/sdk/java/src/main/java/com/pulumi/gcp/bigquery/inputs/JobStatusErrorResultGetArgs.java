// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobStatusErrorResultGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobStatusErrorResultGetArgs Empty = new JobStatusErrorResultGetArgs();

    /**
     * The geographic location of the job. The default value is US.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location of the job. The default value is US.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="reason")
    private @Nullable Output<String> reason;

    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    private JobStatusErrorResultGetArgs() {}

    private JobStatusErrorResultGetArgs(JobStatusErrorResultGetArgs $) {
        this.location = $.location;
        this.message = $.message;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStatusErrorResultGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStatusErrorResultGetArgs $;

        public Builder() {
            $ = new JobStatusErrorResultGetArgs();
        }

        public Builder(JobStatusErrorResultGetArgs defaults) {
            $ = new JobStatusErrorResultGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The geographic location of the job. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location of the job. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public JobStatusErrorResultGetArgs build() {
            return $;
        }
    }

}
