// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.inputs.NotificationReceiverValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A notification event receivers.
 * 
 */
public final class NotificationEventReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationEventReceiverArgs Empty = new NotificationEventReceiverArgs();

    /**
     * The type of the notification event receiver.
     * 
     */
    @InputImport(name="receiverType")
    private final @Nullable Input<String> receiverType;

    public Input<String> getReceiverType() {
        return this.receiverType == null ? Input.empty() : this.receiverType;
    }

    /**
     * The notification event receiver value.
     * 
     */
    @InputImport(name="receiverValue")
    private final @Nullable Input<NotificationReceiverValueArgs> receiverValue;

    public Input<NotificationReceiverValueArgs> getReceiverValue() {
        return this.receiverValue == null ? Input.empty() : this.receiverValue;
    }

    public NotificationEventReceiverArgs(
        @Nullable Input<String> receiverType,
        @Nullable Input<NotificationReceiverValueArgs> receiverValue) {
        this.receiverType = receiverType;
        this.receiverValue = receiverValue;
    }

    private NotificationEventReceiverArgs() {
        this.receiverType = Input.empty();
        this.receiverValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEventReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> receiverType;
        private @Nullable Input<NotificationReceiverValueArgs> receiverValue;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEventReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiverType = defaults.receiverType;
    	      this.receiverValue = defaults.receiverValue;
        }

        public Builder setReceiverType(@Nullable Input<String> receiverType) {
            this.receiverType = receiverType;
            return this;
        }

        public Builder setReceiverType(@Nullable String receiverType) {
            this.receiverType = Input.ofNullable(receiverType);
            return this;
        }

        public Builder setReceiverValue(@Nullable Input<NotificationReceiverValueArgs> receiverValue) {
            this.receiverValue = receiverValue;
            return this;
        }

        public Builder setReceiverValue(@Nullable NotificationReceiverValueArgs receiverValue) {
            this.receiverValue = Input.ofNullable(receiverValue);
            return this;
        }

        public NotificationEventReceiverArgs build() {
            return new NotificationEventReceiverArgs(receiverType, receiverValue);
        }
    }
}
