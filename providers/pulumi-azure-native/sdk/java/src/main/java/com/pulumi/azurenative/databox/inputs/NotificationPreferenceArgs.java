// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.NotificationStageName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Notification preference for a job stage.
 * 
 */
public final class NotificationPreferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPreferenceArgs Empty = new NotificationPreferenceArgs();

    /**
     * Notification is required or not.
     * 
     */
    @Import(name="sendNotification", required=true)
      private final Output<Boolean> sendNotification;

    public Output<Boolean> sendNotification() {
        return this.sendNotification;
    }

    /**
     * Name of the stage.
     * 
     */
    @Import(name="stageName", required=true)
      private final Output<Either<String,NotificationStageName>> stageName;

    public Output<Either<String,NotificationStageName>> stageName() {
        return this.stageName;
    }

    public NotificationPreferenceArgs(
        Output<Boolean> sendNotification,
        Output<Either<String,NotificationStageName>> stageName) {
        this.sendNotification = Codegen.booleanProp("sendNotification").output().arg(sendNotification).def(true).require();
        this.stageName = Objects.requireNonNull(stageName, "expected parameter 'stageName' to be non-null");
    }

    private NotificationPreferenceArgs() {
        this.sendNotification = Codegen.empty();
        this.stageName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> sendNotification;
        private Output<Either<String,NotificationStageName>> stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationPreferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sendNotification = defaults.sendNotification;
    	      this.stageName = defaults.stageName;
        }

        public Builder sendNotification(Output<Boolean> sendNotification) {
            this.sendNotification = Objects.requireNonNull(sendNotification);
            return this;
        }
        public Builder sendNotification(Boolean sendNotification) {
            this.sendNotification = Output.of(Objects.requireNonNull(sendNotification));
            return this;
        }
        public Builder stageName(Output<Either<String,NotificationStageName>> stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }
        public Builder stageName(Either<String,NotificationStageName> stageName) {
            this.stageName = Output.of(Objects.requireNonNull(stageName));
            return this;
        }        public NotificationPreferenceArgs build() {
            return new NotificationPreferenceArgs(sendNotification, stageName);
        }
    }
}
