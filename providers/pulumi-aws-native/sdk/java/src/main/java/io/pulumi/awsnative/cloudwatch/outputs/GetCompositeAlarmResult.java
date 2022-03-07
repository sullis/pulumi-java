// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCompositeAlarmResult {
    /**
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * 
     */
    private final @Nullable Boolean actionsEnabled;
    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Specify each action as an Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable List<String> alarmActions;
    /**
     * The description of the alarm
     * 
     */
    private final @Nullable String alarmDescription;
    /**
     * Expression which aggregates the state of other Alarms (Metric or Composite Alarms)
     * 
     */
    private final @Nullable String alarmRule;
    /**
     * Amazon Resource Name (ARN) of the alarm
     * 
     */
    private final @Nullable String arn;
    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable List<String> insufficientDataActions;
    /**
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable List<String> oKActions;

    @OutputCustomType.Constructor({"actionsEnabled","alarmActions","alarmDescription","alarmRule","arn","insufficientDataActions","oKActions"})
    private GetCompositeAlarmResult(
        @Nullable Boolean actionsEnabled,
        @Nullable List<String> alarmActions,
        @Nullable String alarmDescription,
        @Nullable String alarmRule,
        @Nullable String arn,
        @Nullable List<String> insufficientDataActions,
        @Nullable List<String> oKActions) {
        this.actionsEnabled = actionsEnabled;
        this.alarmActions = alarmActions;
        this.alarmDescription = alarmDescription;
        this.alarmRule = alarmRule;
        this.arn = arn;
        this.insufficientDataActions = insufficientDataActions;
        this.oKActions = oKActions;
    }

    /**
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * 
    */
    public Optional<Boolean> getActionsEnabled() {
        return Optional.ofNullable(this.actionsEnabled);
    }
    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Specify each action as an Amazon Resource Name (ARN).
     * 
    */
    public List<String> getAlarmActions() {
        return this.alarmActions == null ? List.of() : this.alarmActions;
    }
    /**
     * The description of the alarm
     * 
    */
    public Optional<String> getAlarmDescription() {
        return Optional.ofNullable(this.alarmDescription);
    }
    /**
     * Expression which aggregates the state of other Alarms (Metric or Composite Alarms)
     * 
    */
    public Optional<String> getAlarmRule() {
        return Optional.ofNullable(this.alarmRule);
    }
    /**
     * Amazon Resource Name (ARN) of the alarm
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
    */
    public List<String> getInsufficientDataActions() {
        return this.insufficientDataActions == null ? List.of() : this.insufficientDataActions;
    }
    /**
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
    */
    public List<String> getOKActions() {
        return this.oKActions == null ? List.of() : this.oKActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompositeAlarmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean actionsEnabled;
        private @Nullable List<String> alarmActions;
        private @Nullable String alarmDescription;
        private @Nullable String alarmRule;
        private @Nullable String arn;
        private @Nullable List<String> insufficientDataActions;
        private @Nullable List<String> oKActions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompositeAlarmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsEnabled = defaults.actionsEnabled;
    	      this.alarmActions = defaults.alarmActions;
    	      this.alarmDescription = defaults.alarmDescription;
    	      this.alarmRule = defaults.alarmRule;
    	      this.arn = defaults.arn;
    	      this.insufficientDataActions = defaults.insufficientDataActions;
    	      this.oKActions = defaults.oKActions;
        }

        public Builder setActionsEnabled(@Nullable Boolean actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }

        public Builder setAlarmActions(@Nullable List<String> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }

        public Builder setAlarmDescription(@Nullable String alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }

        public Builder setAlarmRule(@Nullable String alarmRule) {
            this.alarmRule = alarmRule;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setInsufficientDataActions(@Nullable List<String> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }

        public Builder setOKActions(@Nullable List<String> oKActions) {
            this.oKActions = oKActions;
            return this;
        }
        public GetCompositeAlarmResult build() {
            return new GetCompositeAlarmResult(actionsEnabled, alarmActions, alarmDescription, alarmRule, arn, insufficientDataActions, oKActions);
        }
    }
}