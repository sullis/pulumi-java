// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationAlarmSeverity;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationAlarm {
    /**
     * The name of the CloudWatch alarm to be monitored for the component.
     * 
     */
    private final String alarmName;
    /**
     * Indicates the degree of outage when the alarm goes off.
     * 
     */
    private final @Nullable ApplicationAlarmSeverity severity;

    @CustomType.Constructor
    private ApplicationAlarm(
        @CustomType.Parameter("alarmName") String alarmName,
        @CustomType.Parameter("severity") @Nullable ApplicationAlarmSeverity severity) {
        this.alarmName = alarmName;
        this.severity = severity;
    }

    /**
     * The name of the CloudWatch alarm to be monitored for the component.
     * 
    */
    public String alarmName() {
        return this.alarmName;
    }
    /**
     * Indicates the degree of outage when the alarm goes off.
     * 
    */
    public Optional<ApplicationAlarmSeverity> severity() {
        return Optional.ofNullable(this.severity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAlarm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;
        private @Nullable ApplicationAlarmSeverity severity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAlarm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.severity = defaults.severity;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public Builder severity(@Nullable ApplicationAlarmSeverity severity) {
            this.severity = severity;
            return this;
        }        public ApplicationAlarm build() {
            return new ApplicationAlarm(alarmName, severity);
        }
    }
}
