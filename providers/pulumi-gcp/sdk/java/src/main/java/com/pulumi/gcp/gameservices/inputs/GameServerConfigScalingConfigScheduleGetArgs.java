// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerConfigScalingConfigScheduleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerConfigScalingConfigScheduleGetArgs Empty = new GameServerConfigScalingConfigScheduleGetArgs();

    /**
     * The duration for the cron job event. The duration of the event is effective
     * after the cron job&#39;s start time.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="cronJobDuration")
    private @Nullable Output<String> cronJobDuration;

    /**
     * @return The duration for the cron job event. The duration of the event is effective
     * after the cron job&#39;s start time.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> cronJobDuration() {
        return Optional.ofNullable(this.cronJobDuration);
    }

    /**
     * The cron definition of the scheduled event. See
     * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
     * defined by the realm.
     * 
     */
    @Import(name="cronSpec")
    private @Nullable Output<String> cronSpec;

    /**
     * @return The cron definition of the scheduled event. See
     * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
     * defined by the realm.
     * 
     */
    public Optional<Output<String>> cronSpec() {
        return Optional.ofNullable(this.cronSpec);
    }

    /**
     * The end time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The end time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The start time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private GameServerConfigScalingConfigScheduleGetArgs() {}

    private GameServerConfigScalingConfigScheduleGetArgs(GameServerConfigScalingConfigScheduleGetArgs $) {
        this.cronJobDuration = $.cronJobDuration;
        this.cronSpec = $.cronSpec;
        this.endTime = $.endTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerConfigScalingConfigScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerConfigScalingConfigScheduleGetArgs $;

        public Builder() {
            $ = new GameServerConfigScalingConfigScheduleGetArgs();
        }

        public Builder(GameServerConfigScalingConfigScheduleGetArgs defaults) {
            $ = new GameServerConfigScalingConfigScheduleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cronJobDuration The duration for the cron job event. The duration of the event is effective
         * after the cron job&#39;s start time.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder cronJobDuration(@Nullable Output<String> cronJobDuration) {
            $.cronJobDuration = cronJobDuration;
            return this;
        }

        /**
         * @param cronJobDuration The duration for the cron job event. The duration of the event is effective
         * after the cron job&#39;s start time.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder cronJobDuration(String cronJobDuration) {
            return cronJobDuration(Output.of(cronJobDuration));
        }

        /**
         * @param cronSpec The cron definition of the scheduled event. See
         * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
         * defined by the realm.
         * 
         * @return builder
         * 
         */
        public Builder cronSpec(@Nullable Output<String> cronSpec) {
            $.cronSpec = cronSpec;
            return this;
        }

        /**
         * @param cronSpec The cron definition of the scheduled event. See
         * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
         * defined by the realm.
         * 
         * @return builder
         * 
         */
        public Builder cronSpec(String cronSpec) {
            return cronSpec(Output.of(cronSpec));
        }

        /**
         * @param endTime The end time of the event.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time of the event.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime The start time of the event.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time of the event.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public GameServerConfigScalingConfigScheduleGetArgs build() {
            return $;
        }
    }

}
