// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationAlarmSeverity;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CloudWatch alarm to be monitored for the component.
 * 
 */
public final class ApplicationAlarmArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationAlarmArgs Empty = new ApplicationAlarmArgs();

    /**
     * The name of the CloudWatch alarm to be monitored for the component.
     * 
     */
    @Import(name="alarmName", required=true)
      private final Output<String> alarmName;

    public Output<String> alarmName() {
        return this.alarmName;
    }

    /**
     * Indicates the degree of outage when the alarm goes off.
     * 
     */
    @Import(name="severity")
      private final @Nullable Output<ApplicationAlarmSeverity> severity;

    public Output<ApplicationAlarmSeverity> severity() {
        return this.severity == null ? Codegen.empty() : this.severity;
    }

    public ApplicationAlarmArgs(
        Output<String> alarmName,
        @Nullable Output<ApplicationAlarmSeverity> severity) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.severity = severity;
    }

    private ApplicationAlarmArgs() {
        this.alarmName = Codegen.empty();
        this.severity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> alarmName;
        private @Nullable Output<ApplicationAlarmSeverity> severity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.severity = defaults.severity;
        }

        public Builder alarmName(Output<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public Builder alarmName(String alarmName) {
            this.alarmName = Output.of(Objects.requireNonNull(alarmName));
            return this;
        }
        public Builder severity(@Nullable Output<ApplicationAlarmSeverity> severity) {
            this.severity = severity;
            return this;
        }
        public Builder severity(@Nullable ApplicationAlarmSeverity severity) {
            this.severity = Codegen.ofNullable(severity);
            return this;
        }        public ApplicationAlarmArgs build() {
            return new ApplicationAlarmArgs(alarmName, severity);
        }
    }
}
