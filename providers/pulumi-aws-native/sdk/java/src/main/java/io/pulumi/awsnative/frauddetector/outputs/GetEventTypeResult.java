// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.outputs.EventTypeEntityType;
import io.pulumi.awsnative.frauddetector.outputs.EventTypeEventVariable;
import io.pulumi.awsnative.frauddetector.outputs.EventTypeLabel;
import io.pulumi.awsnative.frauddetector.outputs.EventTypeTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventTypeResult {
    private final @Nullable String arn;
    private final @Nullable String createdTime;
    private final @Nullable String description;
    private final @Nullable List<EventTypeEntityType> entityTypes;
    private final @Nullable List<EventTypeEventVariable> eventVariables;
    private final @Nullable List<EventTypeLabel> labels;
    private final @Nullable String lastUpdatedTime;
    private final @Nullable List<EventTypeTag> tags;

    @OutputCustomType.Constructor({"arn","createdTime","description","entityTypes","eventVariables","labels","lastUpdatedTime","tags"})
    private GetEventTypeResult(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable List<EventTypeEntityType> entityTypes,
        @Nullable List<EventTypeEventVariable> eventVariables,
        @Nullable List<EventTypeLabel> labels,
        @Nullable String lastUpdatedTime,
        @Nullable List<EventTypeTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.entityTypes = entityTypes;
        this.eventVariables = eventVariables;
        this.labels = labels;
        this.lastUpdatedTime = lastUpdatedTime;
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
    public List<EventTypeEntityType> getEntityTypes() {
        return this.entityTypes == null ? List.of() : this.entityTypes;
    }
    public List<EventTypeEventVariable> getEventVariables() {
        return this.eventVariables == null ? List.of() : this.eventVariables;
    }
    public List<EventTypeLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public List<EventTypeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable List<EventTypeEntityType> entityTypes;
        private @Nullable List<EventTypeEventVariable> eventVariables;
        private @Nullable List<EventTypeLabel> labels;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<EventTypeTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.entityTypes = defaults.entityTypes;
    	      this.eventVariables = defaults.eventVariables;
    	      this.labels = defaults.labels;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
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

        public Builder setEntityTypes(@Nullable List<EventTypeEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        public Builder setEventVariables(@Nullable List<EventTypeEventVariable> eventVariables) {
            this.eventVariables = eventVariables;
            return this;
        }

        public Builder setLabels(@Nullable List<EventTypeLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setTags(@Nullable List<EventTypeTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetEventTypeResult build() {
            return new GetEventTypeResult(arn, createdTime, description, entityTypes, eventVariables, labels, lastUpdatedTime, tags);
        }
    }
}
