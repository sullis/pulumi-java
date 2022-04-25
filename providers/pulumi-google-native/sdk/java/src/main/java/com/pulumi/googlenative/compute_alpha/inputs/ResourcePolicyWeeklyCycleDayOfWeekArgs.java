// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.ResourcePolicyWeeklyCycleDayOfWeekDay;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePolicyWeeklyCycleDayOfWeekArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyWeeklyCycleDayOfWeekArgs Empty = new ResourcePolicyWeeklyCycleDayOfWeekArgs();

    /**
     * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
     * 
     */
    @Import(name="day")
    private @Nullable Output<ResourcePolicyWeeklyCycleDayOfWeekDay> day;

    /**
     * @return Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
     * 
     */
    public Optional<Output<ResourcePolicyWeeklyCycleDayOfWeekDay>> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * Time within the window to start the operations. It must be in format &#34;HH:MM&#34;, where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Time within the window to start the operations. It must be in format &#34;HH:MM&#34;, where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private ResourcePolicyWeeklyCycleDayOfWeekArgs() {}

    private ResourcePolicyWeeklyCycleDayOfWeekArgs(ResourcePolicyWeeklyCycleDayOfWeekArgs $) {
        this.day = $.day;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyWeeklyCycleDayOfWeekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyWeeklyCycleDayOfWeekArgs $;

        public Builder() {
            $ = new ResourcePolicyWeeklyCycleDayOfWeekArgs();
        }

        public Builder(ResourcePolicyWeeklyCycleDayOfWeekArgs defaults) {
            $ = new ResourcePolicyWeeklyCycleDayOfWeekArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
         * 
         * @return builder
         * 
         */
        public Builder day(@Nullable Output<ResourcePolicyWeeklyCycleDayOfWeekDay> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
         * 
         * @return builder
         * 
         */
        public Builder day(ResourcePolicyWeeklyCycleDayOfWeekDay day) {
            return day(Output.of(day));
        }

        /**
         * @param startTime Time within the window to start the operations. It must be in format &#34;HH:MM&#34;, where HH : [00-23] and MM : [00-00] GMT.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Time within the window to start the operations. It must be in format &#34;HH:MM&#34;, where HH : [00-23] and MM : [00-00] GMT.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ResourcePolicyWeeklyCycleDayOfWeekArgs build() {
            return $;
        }
    }

}
