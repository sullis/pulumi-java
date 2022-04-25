// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerArgs Empty = new PreventionJobTriggerArgs();

    /**
     * A description of the job trigger.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the job trigger.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User set display name of the job trigger.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User set display name of the job trigger.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Controls what and how to inspect for findings.
     * Structure is documented below.
     * 
     */
    @Import(name="inspectJob")
    private @Nullable Output<PreventionJobTriggerInspectJobArgs> inspectJob;

    /**
     * @return Controls what and how to inspect for findings.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobArgs>> inspectJob() {
        return Optional.ofNullable(this.inspectJob);
    }

    /**
     * The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     * Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are `PAUSED`, `HEALTHY`, and `CANCELLED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are `PAUSED`, `HEALTHY`, and `CANCELLED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * What event needs to occur for a new job to be started.
     * Structure is documented below.
     * 
     */
    @Import(name="triggers", required=true)
    private Output<List<PreventionJobTriggerTriggerArgs>> triggers;

    /**
     * @return What event needs to occur for a new job to be started.
     * Structure is documented below.
     * 
     */
    public Output<List<PreventionJobTriggerTriggerArgs>> triggers() {
        return this.triggers;
    }

    private PreventionJobTriggerArgs() {}

    private PreventionJobTriggerArgs(PreventionJobTriggerArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.inspectJob = $.inspectJob;
        this.parent = $.parent;
        this.status = $.status;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerArgs $;

        public Builder() {
            $ = new PreventionJobTriggerArgs();
        }

        public Builder(PreventionJobTriggerArgs defaults) {
            $ = new PreventionJobTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the job trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the job trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User set display name of the job trigger.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User set display name of the job trigger.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param inspectJob Controls what and how to inspect for findings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder inspectJob(@Nullable Output<PreventionJobTriggerInspectJobArgs> inspectJob) {
            $.inspectJob = inspectJob;
            return this;
        }

        /**
         * @param inspectJob Controls what and how to inspect for findings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder inspectJob(PreventionJobTriggerInspectJobArgs inspectJob) {
            return inspectJob(Output.of(inspectJob));
        }

        /**
         * @param parent The parent of the trigger, either in the format `projects/{{project}}`
         * or `projects/{{project}}/locations/{{location}}`
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The parent of the trigger, either in the format `projects/{{project}}`
         * or `projects/{{project}}/locations/{{location}}`
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param status Whether the trigger is currently active.
         * Default value is `HEALTHY`.
         * Possible values are `PAUSED`, `HEALTHY`, and `CANCELLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Whether the trigger is currently active.
         * Default value is `HEALTHY`.
         * Possible values are `PAUSED`, `HEALTHY`, and `CANCELLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param triggers What event needs to occur for a new job to be started.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggers(Output<List<PreventionJobTriggerTriggerArgs>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers What event needs to occur for a new job to be started.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggers(List<PreventionJobTriggerTriggerArgs> triggers) {
            return triggers(Output.of(triggers));
        }

        /**
         * @param triggers What event needs to occur for a new job to be started.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggers(PreventionJobTriggerTriggerArgs... triggers) {
            return triggers(List.of(triggers));
        }

        public PreventionJobTriggerArgs build() {
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.triggers = Objects.requireNonNull($.triggers, "expected parameter 'triggers' to be non-null");
            return $;
        }
    }

}
