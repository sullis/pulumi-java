// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.GetNotificationChannelSensitiveLabel;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNotificationChannelResult {
    private final String description;
    private final @Nullable String displayName;
    private final Boolean enabled;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Map<String,String> labels;
    private final String name;
    private final @Nullable String project;
    private final List<GetNotificationChannelSensitiveLabel> sensitiveLabels;
    private final @Nullable String type;
    private final @Nullable Map<String,String> userLabels;
    private final String verificationStatus;

    @OutputCustomType.Constructor({"description","displayName","enabled","id","labels","name","project","sensitiveLabels","type","userLabels","verificationStatus"})
    private GetNotificationChannelResult(
        String description,
        @Nullable String displayName,
        Boolean enabled,
        String id,
        @Nullable Map<String,String> labels,
        String name,
        @Nullable String project,
        List<GetNotificationChannelSensitiveLabel> sensitiveLabels,
        @Nullable String type,
        @Nullable Map<String,String> userLabels,
        String verificationStatus) {
        this.description = Objects.requireNonNull(description);
        this.displayName = displayName;
        this.enabled = Objects.requireNonNull(enabled);
        this.id = Objects.requireNonNull(id);
        this.labels = labels;
        this.name = Objects.requireNonNull(name);
        this.project = project;
        this.sensitiveLabels = Objects.requireNonNull(sensitiveLabels);
        this.type = type;
        this.userLabels = userLabels;
        this.verificationStatus = Objects.requireNonNull(verificationStatus);
    }

    public String getDescription() {
        return this.description;
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public List<GetNotificationChannelSensitiveLabel> getSensitiveLabels() {
        return this.sensitiveLabels;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    public Map<String,String> getUserLabels() {
        return this.userLabels == null ? Map.of() : this.userLabels;
    }
    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private @Nullable String displayName;
        private Boolean enabled;
        private String id;
        private @Nullable Map<String,String> labels;
        private String name;
        private @Nullable String project;
        private List<GetNotificationChannelSensitiveLabel> sensitiveLabels;
        private @Nullable String type;
        private @Nullable Map<String,String> userLabels;
        private String verificationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.sensitiveLabels = defaults.sensitiveLabels;
    	      this.type = defaults.type;
    	      this.userLabels = defaults.userLabels;
    	      this.verificationStatus = defaults.verificationStatus;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSensitiveLabels(List<GetNotificationChannelSensitiveLabel> sensitiveLabels) {
            this.sensitiveLabels = Objects.requireNonNull(sensitiveLabels);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder setVerificationStatus(String verificationStatus) {
            this.verificationStatus = Objects.requireNonNull(verificationStatus);
            return this;
        }
        public GetNotificationChannelResult build() {
            return new GetNotificationChannelResult(description, displayName, enabled, id, labels, name, project, sensitiveLabels, type, userLabels, verificationStatus);
        }
    }
}