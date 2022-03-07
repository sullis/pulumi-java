// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.enums.NotificationChannelVerificationStatus;
import io.pulumi.googlenative.monitoring_v3.inputs.MutationRecordArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationChannelArgs Empty = new NotificationChannelArgs();

    /**
     * Record of the creation of this channel.
     * 
     */
    @InputImport(name="creationRecord")
      private final @Nullable Input<MutationRecordArgs> creationRecord;

    public Input<MutationRecordArgs> getCreationRecord() {
        return this.creationRecord == null ? Input.empty() : this.creationRecord;
    }

    /**
     * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed 1024 Unicode characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in your project, though this is not enforced. The display name is limited to 512 Unicode characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting policies on the channel at some point in the future.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Configuration fields that define the channel and its behavior. The permissible and required labels are specified in the NotificationChannelDescriptor.labels of the NotificationChannelDescriptor corresponding to the type field.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Records of the modification of this channel.
     * 
     */
    @InputImport(name="mutationRecords")
      private final @Nullable Input<List<MutationRecordArgs>> mutationRecords;

    public Input<List<MutationRecordArgs>> getMutationRecords() {
        return this.mutationRecords == null ? Input.empty() : this.mutationRecords;
    }

    /**
     * The full REST resource name for this channel. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the server on creation.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @InputImport(name="userLabels")
      private final @Nullable Input<Map<String,String>> userLabels;

    public Input<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Input.empty() : this.userLabels;
    }

    /**
     * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    @InputImport(name="verificationStatus")
      private final @Nullable Input<NotificationChannelVerificationStatus> verificationStatus;

    public Input<NotificationChannelVerificationStatus> getVerificationStatus() {
        return this.verificationStatus == null ? Input.empty() : this.verificationStatus;
    }

    public NotificationChannelArgs(
        @Nullable Input<MutationRecordArgs> creationRecord,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<MutationRecordArgs>> mutationRecords,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> type,
        @Nullable Input<Map<String,String>> userLabels,
        @Nullable Input<NotificationChannelVerificationStatus> verificationStatus) {
        this.creationRecord = creationRecord;
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.labels = labels;
        this.mutationRecords = mutationRecords;
        this.name = name;
        this.project = project;
        this.type = type;
        this.userLabels = userLabels;
        this.verificationStatus = verificationStatus;
    }

    private NotificationChannelArgs() {
        this.creationRecord = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.enabled = Input.empty();
        this.labels = Input.empty();
        this.mutationRecords = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
        this.userLabels = Input.empty();
        this.verificationStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MutationRecordArgs> creationRecord;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<MutationRecordArgs>> mutationRecords;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> type;
        private @Nullable Input<Map<String,String>> userLabels;
        private @Nullable Input<NotificationChannelVerificationStatus> verificationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationRecord = defaults.creationRecord;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.labels = defaults.labels;
    	      this.mutationRecords = defaults.mutationRecords;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
    	      this.userLabels = defaults.userLabels;
    	      this.verificationStatus = defaults.verificationStatus;
        }

        public Builder setCreationRecord(@Nullable Input<MutationRecordArgs> creationRecord) {
            this.creationRecord = creationRecord;
            return this;
        }

        public Builder setCreationRecord(@Nullable MutationRecordArgs creationRecord) {
            this.creationRecord = Input.ofNullable(creationRecord);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMutationRecords(@Nullable Input<List<MutationRecordArgs>> mutationRecords) {
            this.mutationRecords = mutationRecords;
            return this;
        }

        public Builder setMutationRecords(@Nullable List<MutationRecordArgs> mutationRecords) {
            this.mutationRecords = Input.ofNullable(mutationRecords);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserLabels(@Nullable Input<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder setUserLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Input.ofNullable(userLabels);
            return this;
        }

        public Builder setVerificationStatus(@Nullable Input<NotificationChannelVerificationStatus> verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }

        public Builder setVerificationStatus(@Nullable NotificationChannelVerificationStatus verificationStatus) {
            this.verificationStatus = Input.ofNullable(verificationStatus);
            return this;
        }
        public NotificationChannelArgs build() {
            return new NotificationChannelArgs(creationRecord, description, displayName, enabled, labels, mutationRecords, name, project, type, userLabels, verificationStatus);
        }
    }
}