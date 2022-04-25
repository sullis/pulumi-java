// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew;

import com.pulumi.awsnative.databrew.inputs.ScheduleTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * Schedule cron
     * 
     */
    @Import(name="cronExpression", required=true)
    private Output<String> cronExpression;

    /**
     * @return Schedule cron
     * 
     */
    public Output<String> cronExpression() {
        return this.cronExpression;
    }

    @Import(name="jobNames")
    private @Nullable Output<List<String>> jobNames;

    public Optional<Output<List<String>>> jobNames() {
        return Optional.ofNullable(this.jobNames);
    }

    /**
     * Schedule Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Schedule Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="tags")
    private @Nullable Output<List<ScheduleTagArgs>> tags;

    public Optional<Output<List<ScheduleTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ScheduleArgs() {}

    private ScheduleArgs(ScheduleArgs $) {
        this.cronExpression = $.cronExpression;
        this.jobNames = $.jobNames;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleArgs $;

        public Builder() {
            $ = new ScheduleArgs();
        }

        public Builder(ScheduleArgs defaults) {
            $ = new ScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cronExpression Schedule cron
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(Output<String> cronExpression) {
            $.cronExpression = cronExpression;
            return this;
        }

        /**
         * @param cronExpression Schedule cron
         * 
         * @return builder
         * 
         */
        public Builder cronExpression(String cronExpression) {
            return cronExpression(Output.of(cronExpression));
        }

        public Builder jobNames(@Nullable Output<List<String>> jobNames) {
            $.jobNames = jobNames;
            return this;
        }

        public Builder jobNames(List<String> jobNames) {
            return jobNames(Output.of(jobNames));
        }

        public Builder jobNames(String... jobNames) {
            return jobNames(List.of(jobNames));
        }

        /**
         * @param name Schedule Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Schedule Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<List<ScheduleTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ScheduleTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ScheduleTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ScheduleArgs build() {
            $.cronExpression = Objects.requireNonNull($.cronExpression, "expected parameter 'cronExpression' to be non-null");
            return $;
        }
    }

}
