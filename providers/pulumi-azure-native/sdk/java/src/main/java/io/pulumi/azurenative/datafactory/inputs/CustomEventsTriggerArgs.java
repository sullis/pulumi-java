// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger that runs every time a custom event is received.
 * 
 */
public final class CustomEventsTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomEventsTriggerArgs Empty = new CustomEventsTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Trigger description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The list of event types that cause this trigger to fire.
     * 
     */
    @InputImport(name="events", required=true)
    private final Input<List<Object>> events;

    public Input<List<Object>> getEvents() {
        return this.events;
    }

    /**
     * Pipelines that need to be started.
     * 
     */
    @InputImport(name="pipelines")
    private final @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;

    public Input<List<TriggerPipelineReferenceArgs>> getPipelines() {
        return this.pipelines == null ? Input.empty() : this.pipelines;
    }

    /**
     * The ARM resource ID of the Azure Event Grid Topic.
     * 
     */
    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    /**
     * The event subject must begin with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @InputImport(name="subjectBeginsWith")
    private final @Nullable Input<String> subjectBeginsWith;

    public Input<String> getSubjectBeginsWith() {
        return this.subjectBeginsWith == null ? Input.empty() : this.subjectBeginsWith;
    }

    /**
     * The event subject must end with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @InputImport(name="subjectEndsWith")
    private final @Nullable Input<String> subjectEndsWith;

    public Input<String> getSubjectEndsWith() {
        return this.subjectEndsWith == null ? Input.empty() : this.subjectEndsWith;
    }

    /**
     * Trigger type.
     * Expected value is 'CustomEventsTrigger'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CustomEventsTriggerArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<String> description,
        Input<List<Object>> events,
        @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines,
        Input<String> scope,
        @Nullable Input<String> subjectBeginsWith,
        @Nullable Input<String> subjectEndsWith,
        Input<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.pipelines = pipelines;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.subjectBeginsWith = subjectBeginsWith;
        this.subjectEndsWith = subjectEndsWith;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CustomEventsTriggerArgs() {
        this.annotations = Input.empty();
        this.description = Input.empty();
        this.events = Input.empty();
        this.pipelines = Input.empty();
        this.scope = Input.empty();
        this.subjectBeginsWith = Input.empty();
        this.subjectEndsWith = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomEventsTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<String> description;
        private Input<List<Object>> events;
        private @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;
        private Input<String> scope;
        private @Nullable Input<String> subjectBeginsWith;
        private @Nullable Input<String> subjectEndsWith;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomEventsTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.events = defaults.events;
    	      this.pipelines = defaults.pipelines;
    	      this.scope = defaults.scope;
    	      this.subjectBeginsWith = defaults.subjectBeginsWith;
    	      this.subjectEndsWith = defaults.subjectEndsWith;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
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

        public Builder setEvents(Input<List<Object>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setEvents(List<Object> events) {
            this.events = Input.of(Objects.requireNonNull(events));
            return this;
        }

        public Builder setPipelines(@Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        public Builder setPipelines(@Nullable List<TriggerPipelineReferenceArgs> pipelines) {
            this.pipelines = Input.ofNullable(pipelines);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setSubjectBeginsWith(@Nullable Input<String> subjectBeginsWith) {
            this.subjectBeginsWith = subjectBeginsWith;
            return this;
        }

        public Builder setSubjectBeginsWith(@Nullable String subjectBeginsWith) {
            this.subjectBeginsWith = Input.ofNullable(subjectBeginsWith);
            return this;
        }

        public Builder setSubjectEndsWith(@Nullable Input<String> subjectEndsWith) {
            this.subjectEndsWith = subjectEndsWith;
            return this;
        }

        public Builder setSubjectEndsWith(@Nullable String subjectEndsWith) {
            this.subjectEndsWith = Input.ofNullable(subjectEndsWith);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public CustomEventsTriggerArgs build() {
            return new CustomEventsTriggerArgs(annotations, description, events, pipelines, scope, subjectBeginsWith, subjectEndsWith, type);
        }
    }
}
