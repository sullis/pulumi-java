// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CompositeAlarmArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompositeAlarmArgs Empty = new CompositeAlarmArgs();

    /**
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * 
     */
    @InputImport(name="actionsEnabled")
    private final @Nullable Input<Boolean> actionsEnabled;

    public Input<Boolean> getActionsEnabled() {
        return this.actionsEnabled == null ? Input.empty() : this.actionsEnabled;
    }

    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Specify each action as an Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="alarmActions")
    private final @Nullable Input<List<String>> alarmActions;

    public Input<List<String>> getAlarmActions() {
        return this.alarmActions == null ? Input.empty() : this.alarmActions;
    }

    /**
     * The description of the alarm
     * 
     */
    @InputImport(name="alarmDescription")
    private final @Nullable Input<String> alarmDescription;

    public Input<String> getAlarmDescription() {
        return this.alarmDescription == null ? Input.empty() : this.alarmDescription;
    }

    /**
     * The name of the Composite Alarm
     * 
     */
    @InputImport(name="alarmName", required=true)
    private final Input<String> alarmName;

    public Input<String> getAlarmName() {
        return this.alarmName;
    }

    /**
     * Expression which aggregates the state of other Alarms (Metric or Composite Alarms)
     * 
     */
    @InputImport(name="alarmRule", required=true)
    private final Input<String> alarmRule;

    public Input<String> getAlarmRule() {
        return this.alarmRule;
    }

    /**
     * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="insufficientDataActions")
    private final @Nullable Input<List<String>> insufficientDataActions;

    public Input<List<String>> getInsufficientDataActions() {
        return this.insufficientDataActions == null ? Input.empty() : this.insufficientDataActions;
    }

    /**
     * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="oKActions")
    private final @Nullable Input<List<String>> oKActions;

    public Input<List<String>> getOKActions() {
        return this.oKActions == null ? Input.empty() : this.oKActions;
    }

    public CompositeAlarmArgs(
        @Nullable Input<Boolean> actionsEnabled,
        @Nullable Input<List<String>> alarmActions,
        @Nullable Input<String> alarmDescription,
        Input<String> alarmName,
        Input<String> alarmRule,
        @Nullable Input<List<String>> insufficientDataActions,
        @Nullable Input<List<String>> oKActions) {
        this.actionsEnabled = actionsEnabled;
        this.alarmActions = alarmActions;
        this.alarmDescription = alarmDescription;
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.alarmRule = Objects.requireNonNull(alarmRule, "expected parameter 'alarmRule' to be non-null");
        this.insufficientDataActions = insufficientDataActions;
        this.oKActions = oKActions;
    }

    private CompositeAlarmArgs() {
        this.actionsEnabled = Input.empty();
        this.alarmActions = Input.empty();
        this.alarmDescription = Input.empty();
        this.alarmName = Input.empty();
        this.alarmRule = Input.empty();
        this.insufficientDataActions = Input.empty();
        this.oKActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositeAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> actionsEnabled;
        private @Nullable Input<List<String>> alarmActions;
        private @Nullable Input<String> alarmDescription;
        private Input<String> alarmName;
        private Input<String> alarmRule;
        private @Nullable Input<List<String>> insufficientDataActions;
        private @Nullable Input<List<String>> oKActions;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositeAlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsEnabled = defaults.actionsEnabled;
    	      this.alarmActions = defaults.alarmActions;
    	      this.alarmDescription = defaults.alarmDescription;
    	      this.alarmName = defaults.alarmName;
    	      this.alarmRule = defaults.alarmRule;
    	      this.insufficientDataActions = defaults.insufficientDataActions;
    	      this.oKActions = defaults.oKActions;
        }

        public Builder setActionsEnabled(@Nullable Input<Boolean> actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }

        public Builder setActionsEnabled(@Nullable Boolean actionsEnabled) {
            this.actionsEnabled = Input.ofNullable(actionsEnabled);
            return this;
        }

        public Builder setAlarmActions(@Nullable Input<List<String>> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }

        public Builder setAlarmActions(@Nullable List<String> alarmActions) {
            this.alarmActions = Input.ofNullable(alarmActions);
            return this;
        }

        public Builder setAlarmDescription(@Nullable Input<String> alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }

        public Builder setAlarmDescription(@Nullable String alarmDescription) {
            this.alarmDescription = Input.ofNullable(alarmDescription);
            return this;
        }

        public Builder setAlarmName(Input<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }

        public Builder setAlarmName(String alarmName) {
            this.alarmName = Input.of(Objects.requireNonNull(alarmName));
            return this;
        }

        public Builder setAlarmRule(Input<String> alarmRule) {
            this.alarmRule = Objects.requireNonNull(alarmRule);
            return this;
        }

        public Builder setAlarmRule(String alarmRule) {
            this.alarmRule = Input.of(Objects.requireNonNull(alarmRule));
            return this;
        }

        public Builder setInsufficientDataActions(@Nullable Input<List<String>> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }

        public Builder setInsufficientDataActions(@Nullable List<String> insufficientDataActions) {
            this.insufficientDataActions = Input.ofNullable(insufficientDataActions);
            return this;
        }

        public Builder setOKActions(@Nullable Input<List<String>> oKActions) {
            this.oKActions = oKActions;
            return this;
        }

        public Builder setOKActions(@Nullable List<String> oKActions) {
            this.oKActions = Input.ofNullable(oKActions);
            return this;
        }

        public CompositeAlarmArgs build() {
            return new CompositeAlarmArgs(actionsEnabled, alarmActions, alarmDescription, alarmName, alarmRule, insufficientDataActions, oKActions);
        }
    }
}
