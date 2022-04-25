// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.awsnative.applicationinsights.enums.ApplicationAlarmSeverity;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A CloudWatch alarm to be monitored for the component.
 * 
 */
public final class ApplicationAlarmArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationAlarmArgs Empty = new ApplicationAlarmArgs();

    /**
     * The name of the CloudWatch alarm to be monitored for the component.
     * 
     */
    @Import(name="alarmName", required=true)
    private Output<String> alarmName;

    /**
     * @return The name of the CloudWatch alarm to be monitored for the component.
     * 
     */
    public Output<String> alarmName() {
        return this.alarmName;
    }

    /**
     * Indicates the degree of outage when the alarm goes off.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<ApplicationAlarmSeverity> severity;

    /**
     * @return Indicates the degree of outage when the alarm goes off.
     * 
     */
    public Optional<Output<ApplicationAlarmSeverity>> severity() {
        return Optional.ofNullable(this.severity);
    }

    private ApplicationAlarmArgs() {}

    private ApplicationAlarmArgs(ApplicationAlarmArgs $) {
        this.alarmName = $.alarmName;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationAlarmArgs $;

        public Builder() {
            $ = new ApplicationAlarmArgs();
        }

        public Builder(ApplicationAlarmArgs defaults) {
            $ = new ApplicationAlarmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alarmName The name of the CloudWatch alarm to be monitored for the component.
         * 
         * @return builder
         * 
         */
        public Builder alarmName(Output<String> alarmName) {
            $.alarmName = alarmName;
            return this;
        }

        /**
         * @param alarmName The name of the CloudWatch alarm to be monitored for the component.
         * 
         * @return builder
         * 
         */
        public Builder alarmName(String alarmName) {
            return alarmName(Output.of(alarmName));
        }

        /**
         * @param severity Indicates the degree of outage when the alarm goes off.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<ApplicationAlarmSeverity> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity Indicates the degree of outage when the alarm goes off.
         * 
         * @return builder
         * 
         */
        public Builder severity(ApplicationAlarmSeverity severity) {
            return severity(Output.of(severity));
        }

        public ApplicationAlarmArgs build() {
            $.alarmName = Objects.requireNonNull($.alarmName, "expected parameter 'alarmName' to be non-null");
            return $;
        }
    }

}
