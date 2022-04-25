// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchDeploymentRecurringScheduleMonthlyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleMonthlyGetArgs Empty = new PatchDeploymentRecurringScheduleMonthlyGetArgs();

    /**
     * One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month.
     * Months without the target day will be skipped. For example, a schedule to run &#34;every month on the 31st&#34;
     * will not run in February, April, June, etc.
     * 
     */
    @Import(name="monthDay")
    private @Nullable Output<Integer> monthDay;

    /**
     * @return One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month.
     * Months without the target day will be skipped. For example, a schedule to run &#34;every month on the 31st&#34;
     * will not run in February, April, June, etc.
     * 
     */
    public Optional<Output<Integer>> monthDay() {
        return Optional.ofNullable(this.monthDay);
    }

    /**
     * Week day in a month.
     * Structure is documented below.
     * 
     */
    @Import(name="weekDayOfMonth")
    private @Nullable Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth;

    /**
     * @return Week day in a month.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs>> weekDayOfMonth() {
        return Optional.ofNullable(this.weekDayOfMonth);
    }

    private PatchDeploymentRecurringScheduleMonthlyGetArgs() {}

    private PatchDeploymentRecurringScheduleMonthlyGetArgs(PatchDeploymentRecurringScheduleMonthlyGetArgs $) {
        this.monthDay = $.monthDay;
        this.weekDayOfMonth = $.weekDayOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchDeploymentRecurringScheduleMonthlyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchDeploymentRecurringScheduleMonthlyGetArgs $;

        public Builder() {
            $ = new PatchDeploymentRecurringScheduleMonthlyGetArgs();
        }

        public Builder(PatchDeploymentRecurringScheduleMonthlyGetArgs defaults) {
            $ = new PatchDeploymentRecurringScheduleMonthlyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monthDay One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month.
         * Months without the target day will be skipped. For example, a schedule to run &#34;every month on the 31st&#34;
         * will not run in February, April, June, etc.
         * 
         * @return builder
         * 
         */
        public Builder monthDay(@Nullable Output<Integer> monthDay) {
            $.monthDay = monthDay;
            return this;
        }

        /**
         * @param monthDay One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month.
         * Months without the target day will be skipped. For example, a schedule to run &#34;every month on the 31st&#34;
         * will not run in February, April, June, etc.
         * 
         * @return builder
         * 
         */
        public Builder monthDay(Integer monthDay) {
            return monthDay(Output.of(monthDay));
        }

        /**
         * @param weekDayOfMonth Week day in a month.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weekDayOfMonth(@Nullable Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth) {
            $.weekDayOfMonth = weekDayOfMonth;
            return this;
        }

        /**
         * @param weekDayOfMonth Week day in a month.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weekDayOfMonth(PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs weekDayOfMonth) {
            return weekDayOfMonth(Output.of(weekDayOfMonth));
        }

        public PatchDeploymentRecurringScheduleMonthlyGetArgs build() {
            return $;
        }
    }

}
