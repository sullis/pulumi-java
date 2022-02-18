// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentState extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentState Empty = new PatchDeploymentState();

    /**
     * Time the patch deployment was created. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    @InputImport(name="duration")
    private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * VM instances to patch.
     * Structure is documented below.
     * 
     */
    @InputImport(name="instanceFilter")
    private final @Nullable Input<PatchDeploymentInstanceFilterGetArgs> instanceFilter;

    public Input<PatchDeploymentInstanceFilterGetArgs> getInstanceFilter() {
        return this.instanceFilter == null ? Input.empty() : this.instanceFilter;
    }

    /**
     * - 
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="lastExecuteTime")
    private final @Nullable Input<String> lastExecuteTime;

    public Input<String> getLastExecuteTime() {
        return this.lastExecuteTime == null ? Input.empty() : this.lastExecuteTime;
    }

    /**
     * Unique name for the patch deployment resource in a project. The patch deployment name is in the form:
     * projects/{project_id}/patchDeployments/{patchDeploymentId}.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    @InputImport(name="oneTimeSchedule")
    private final @Nullable Input<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule;

    public Input<PatchDeploymentOneTimeScheduleGetArgs> getOneTimeSchedule() {
        return this.oneTimeSchedule == null ? Input.empty() : this.oneTimeSchedule;
    }

    /**
     * Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    @InputImport(name="patchConfig")
    private final @Nullable Input<PatchDeploymentPatchConfigGetArgs> patchConfig;

    public Input<PatchDeploymentPatchConfigGetArgs> getPatchConfig() {
        return this.patchConfig == null ? Input.empty() : this.patchConfig;
    }

    /**
     * A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @InputImport(name="patchDeploymentId")
    private final @Nullable Input<String> patchDeploymentId;

    public Input<String> getPatchDeploymentId() {
        return this.patchDeploymentId == null ? Input.empty() : this.patchDeploymentId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="recurringSchedule")
    private final @Nullable Input<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule;

    public Input<PatchDeploymentRecurringScheduleGetArgs> getRecurringSchedule() {
        return this.recurringSchedule == null ? Input.empty() : this.recurringSchedule;
    }

    /**
     * Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rollout")
    private final @Nullable Input<PatchDeploymentRolloutGetArgs> rollout;

    public Input<PatchDeploymentRolloutGetArgs> getRollout() {
        return this.rollout == null ? Input.empty() : this.rollout;
    }

    /**
     * Time the patch deployment was last updated. Timestamp is in RFC3339 text format. A timestamp in RFC3339 UTC "Zulu"
     * format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public PatchDeploymentState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> duration,
        @Nullable Input<PatchDeploymentInstanceFilterGetArgs> instanceFilter,
        @Nullable Input<String> lastExecuteTime,
        @Nullable Input<String> name,
        @Nullable Input<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule,
        @Nullable Input<PatchDeploymentPatchConfigGetArgs> patchConfig,
        @Nullable Input<String> patchDeploymentId,
        @Nullable Input<String> project,
        @Nullable Input<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule,
        @Nullable Input<PatchDeploymentRolloutGetArgs> rollout,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.duration = duration;
        this.instanceFilter = instanceFilter;
        this.lastExecuteTime = lastExecuteTime;
        this.name = name;
        this.oneTimeSchedule = oneTimeSchedule;
        this.patchConfig = patchConfig;
        this.patchDeploymentId = patchDeploymentId;
        this.project = project;
        this.recurringSchedule = recurringSchedule;
        this.rollout = rollout;
        this.updateTime = updateTime;
    }

    private PatchDeploymentState() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.duration = Input.empty();
        this.instanceFilter = Input.empty();
        this.lastExecuteTime = Input.empty();
        this.name = Input.empty();
        this.oneTimeSchedule = Input.empty();
        this.patchConfig = Input.empty();
        this.patchDeploymentId = Input.empty();
        this.project = Input.empty();
        this.recurringSchedule = Input.empty();
        this.rollout = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> duration;
        private @Nullable Input<PatchDeploymentInstanceFilterGetArgs> instanceFilter;
        private @Nullable Input<String> lastExecuteTime;
        private @Nullable Input<String> name;
        private @Nullable Input<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule;
        private @Nullable Input<PatchDeploymentPatchConfigGetArgs> patchConfig;
        private @Nullable Input<String> patchDeploymentId;
        private @Nullable Input<String> project;
        private @Nullable Input<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule;
        private @Nullable Input<PatchDeploymentRolloutGetArgs> rollout;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.duration = defaults.duration;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.lastExecuteTime = defaults.lastExecuteTime;
    	      this.name = defaults.name;
    	      this.oneTimeSchedule = defaults.oneTimeSchedule;
    	      this.patchConfig = defaults.patchConfig;
    	      this.patchDeploymentId = defaults.patchDeploymentId;
    	      this.project = defaults.project;
    	      this.recurringSchedule = defaults.recurringSchedule;
    	      this.rollout = defaults.rollout;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
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

        public Builder setDuration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setInstanceFilter(@Nullable Input<PatchDeploymentInstanceFilterGetArgs> instanceFilter) {
            this.instanceFilter = instanceFilter;
            return this;
        }

        public Builder setInstanceFilter(@Nullable PatchDeploymentInstanceFilterGetArgs instanceFilter) {
            this.instanceFilter = Input.ofNullable(instanceFilter);
            return this;
        }

        public Builder setLastExecuteTime(@Nullable Input<String> lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }

        public Builder setLastExecuteTime(@Nullable String lastExecuteTime) {
            this.lastExecuteTime = Input.ofNullable(lastExecuteTime);
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

        public Builder setOneTimeSchedule(@Nullable Input<PatchDeploymentOneTimeScheduleGetArgs> oneTimeSchedule) {
            this.oneTimeSchedule = oneTimeSchedule;
            return this;
        }

        public Builder setOneTimeSchedule(@Nullable PatchDeploymentOneTimeScheduleGetArgs oneTimeSchedule) {
            this.oneTimeSchedule = Input.ofNullable(oneTimeSchedule);
            return this;
        }

        public Builder setPatchConfig(@Nullable Input<PatchDeploymentPatchConfigGetArgs> patchConfig) {
            this.patchConfig = patchConfig;
            return this;
        }

        public Builder setPatchConfig(@Nullable PatchDeploymentPatchConfigGetArgs patchConfig) {
            this.patchConfig = Input.ofNullable(patchConfig);
            return this;
        }

        public Builder setPatchDeploymentId(@Nullable Input<String> patchDeploymentId) {
            this.patchDeploymentId = patchDeploymentId;
            return this;
        }

        public Builder setPatchDeploymentId(@Nullable String patchDeploymentId) {
            this.patchDeploymentId = Input.ofNullable(patchDeploymentId);
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

        public Builder setRecurringSchedule(@Nullable Input<PatchDeploymentRecurringScheduleGetArgs> recurringSchedule) {
            this.recurringSchedule = recurringSchedule;
            return this;
        }

        public Builder setRecurringSchedule(@Nullable PatchDeploymentRecurringScheduleGetArgs recurringSchedule) {
            this.recurringSchedule = Input.ofNullable(recurringSchedule);
            return this;
        }

        public Builder setRollout(@Nullable Input<PatchDeploymentRolloutGetArgs> rollout) {
            this.rollout = rollout;
            return this;
        }

        public Builder setRollout(@Nullable PatchDeploymentRolloutGetArgs rollout) {
            this.rollout = Input.ofNullable(rollout);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public PatchDeploymentState build() {
            return new PatchDeploymentState(createTime, description, duration, instanceFilter, lastExecuteTime, name, oneTimeSchedule, patchConfig, patchDeploymentId, project, recurringSchedule, rollout, updateTime);
        }
    }
}
