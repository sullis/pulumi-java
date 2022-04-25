// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig {
    /**
     * @return An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
     * 
     */
    private final @Nullable String notificationArn;
    /**
     * @return The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
     * 
     */
    private final @Nullable List<String> notificationEvents;
    /**
     * @return When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
     * 
     */
    private final @Nullable String notificationType;

    @CustomType.Constructor
    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig(
        @CustomType.Parameter("notificationArn") @Nullable String notificationArn,
        @CustomType.Parameter("notificationEvents") @Nullable List<String> notificationEvents,
        @CustomType.Parameter("notificationType") @Nullable String notificationType) {
        this.notificationArn = notificationArn;
        this.notificationEvents = notificationEvents;
        this.notificationType = notificationType;
    }

    /**
     * @return An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
     * 
     */
    public Optional<String> notificationArn() {
        return Optional.ofNullable(this.notificationArn);
    }
    /**
     * @return The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
     * 
     */
    public List<String> notificationEvents() {
        return this.notificationEvents == null ? List.of() : this.notificationEvents;
    }
    /**
     * @return When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
     * 
     */
    public Optional<String> notificationType() {
        return Optional.ofNullable(this.notificationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String notificationArn;
        private @Nullable List<String> notificationEvents;
        private @Nullable String notificationType;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationArn = defaults.notificationArn;
    	      this.notificationEvents = defaults.notificationEvents;
    	      this.notificationType = defaults.notificationType;
        }

        public Builder notificationArn(@Nullable String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public Builder notificationEvents(@Nullable List<String> notificationEvents) {
            this.notificationEvents = notificationEvents;
            return this;
        }
        public Builder notificationEvents(String... notificationEvents) {
            return notificationEvents(List.of(notificationEvents));
        }
        public Builder notificationType(@Nullable String notificationType) {
            this.notificationType = notificationType;
            return this;
        }        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig(notificationArn, notificationEvents, notificationType);
        }
    }
}
