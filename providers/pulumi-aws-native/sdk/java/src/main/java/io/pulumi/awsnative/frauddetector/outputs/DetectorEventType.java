// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.outputs.DetectorEntityType;
import io.pulumi.awsnative.frauddetector.outputs.DetectorEventVariable;
import io.pulumi.awsnative.frauddetector.outputs.DetectorLabel;
import io.pulumi.awsnative.frauddetector.outputs.DetectorTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorEventType {
    private final @Nullable String arn;
    private final @Nullable String createdTime;
    private final @Nullable String description;
    private final @Nullable List<DetectorEntityType> entityTypes;
    private final @Nullable List<DetectorEventVariable> eventVariables;
    private final @Nullable Boolean inline;
    private final @Nullable List<DetectorLabel> labels;
    private final @Nullable String lastUpdatedTime;
    private final @Nullable String name;
    private final @Nullable List<DetectorTag> tags;

    @OutputCustomType.Constructor({"arn","createdTime","description","entityTypes","eventVariables","inline","labels","lastUpdatedTime","name","tags"})
    private DetectorEventType(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable List<DetectorEntityType> entityTypes,
        @Nullable List<DetectorEventVariable> eventVariables,
        @Nullable Boolean inline,
        @Nullable List<DetectorLabel> labels,
        @Nullable String lastUpdatedTime,
        @Nullable String name,
        @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.entityTypes = entityTypes;
        this.eventVariables = eventVariables;
        this.inline = inline;
        this.labels = labels;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<DetectorEntityType> getEntityTypes() {
        return this.entityTypes == null ? List.of() : this.entityTypes;
    }
    public List<DetectorEventVariable> getEventVariables() {
        return this.eventVariables == null ? List.of() : this.eventVariables;
    }
    public Optional<Boolean> getInline() {
        return Optional.ofNullable(this.inline);
    }
    public List<DetectorLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorEventType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable List<DetectorEntityType> entityTypes;
        private @Nullable List<DetectorEventVariable> eventVariables;
        private @Nullable Boolean inline;
        private @Nullable List<DetectorLabel> labels;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorEventType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.entityTypes = defaults.entityTypes;
    	      this.eventVariables = defaults.eventVariables;
    	      this.inline = defaults.inline;
    	      this.labels = defaults.labels;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEntityTypes(@Nullable List<DetectorEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        public Builder setEventVariables(@Nullable List<DetectorEventVariable> eventVariables) {
            this.eventVariables = eventVariables;
            return this;
        }

        public Builder setInline(@Nullable Boolean inline) {
            this.inline = inline;
            return this;
        }

        public Builder setLabels(@Nullable List<DetectorLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }

        public DetectorEventType build() {
            return new DetectorEventType(arn, createdTime, description, entityTypes, eventVariables, inline, labels, lastUpdatedTime, name, tags);
        }
    }
}
