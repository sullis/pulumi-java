// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppLimitsArgs Empty = new AppLimitsArgs();

    /**
     * The maximum number of messages that the campaign can send daily.
     * 
     */
    @Import(name="daily")
      private final @Nullable Output<Integer> daily;

    public Output<Integer> getDaily() {
        return this.daily == null ? Output.empty() : this.daily;
    }

    /**
     * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
     * 
     */
    @Import(name="maximumDuration")
      private final @Nullable Output<Integer> maximumDuration;

    public Output<Integer> getMaximumDuration() {
        return this.maximumDuration == null ? Output.empty() : this.maximumDuration;
    }

    /**
     * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
     * 
     */
    @Import(name="messagesPerSecond")
      private final @Nullable Output<Integer> messagesPerSecond;

    public Output<Integer> getMessagesPerSecond() {
        return this.messagesPerSecond == null ? Output.empty() : this.messagesPerSecond;
    }

    /**
     * The maximum total number of messages that the campaign can send.
     * 
     */
    @Import(name="total")
      private final @Nullable Output<Integer> total;

    public Output<Integer> getTotal() {
        return this.total == null ? Output.empty() : this.total;
    }

    public AppLimitsArgs(
        @Nullable Output<Integer> daily,
        @Nullable Output<Integer> maximumDuration,
        @Nullable Output<Integer> messagesPerSecond,
        @Nullable Output<Integer> total) {
        this.daily = daily;
        this.maximumDuration = maximumDuration;
        this.messagesPerSecond = messagesPerSecond;
        this.total = total;
    }

    private AppLimitsArgs() {
        this.daily = Output.empty();
        this.maximumDuration = Output.empty();
        this.messagesPerSecond = Output.empty();
        this.total = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> daily;
        private @Nullable Output<Integer> maximumDuration;
        private @Nullable Output<Integer> messagesPerSecond;
        private @Nullable Output<Integer> total;

        public Builder() {
    	      // Empty
        }

        public Builder(AppLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daily = defaults.daily;
    	      this.maximumDuration = defaults.maximumDuration;
    	      this.messagesPerSecond = defaults.messagesPerSecond;
    	      this.total = defaults.total;
        }

        public Builder daily(@Nullable Output<Integer> daily) {
            this.daily = daily;
            return this;
        }
        public Builder daily(@Nullable Integer daily) {
            this.daily = Output.ofNullable(daily);
            return this;
        }
        public Builder maximumDuration(@Nullable Output<Integer> maximumDuration) {
            this.maximumDuration = maximumDuration;
            return this;
        }
        public Builder maximumDuration(@Nullable Integer maximumDuration) {
            this.maximumDuration = Output.ofNullable(maximumDuration);
            return this;
        }
        public Builder messagesPerSecond(@Nullable Output<Integer> messagesPerSecond) {
            this.messagesPerSecond = messagesPerSecond;
            return this;
        }
        public Builder messagesPerSecond(@Nullable Integer messagesPerSecond) {
            this.messagesPerSecond = Output.ofNullable(messagesPerSecond);
            return this;
        }
        public Builder total(@Nullable Output<Integer> total) {
            this.total = total;
            return this;
        }
        public Builder total(@Nullable Integer total) {
            this.total = Output.ofNullable(total);
            return this;
        }        public AppLimitsArgs build() {
            return new AppLimitsArgs(daily, maximumDuration, messagesPerSecond, total);
        }
    }
}
