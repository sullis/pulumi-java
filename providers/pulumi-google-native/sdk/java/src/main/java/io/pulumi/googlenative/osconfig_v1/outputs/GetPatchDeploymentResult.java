// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OneTimeScheduleResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.PatchConfigResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.PatchInstanceFilterResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.PatchRolloutResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.RecurringScheduleResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPatchDeploymentResult {
    /**
     * Time the patch deployment was created. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    private final String createTime;
    /**
     * Optional. Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    private final String description;
    /**
     * Optional. Duration of the patch. After the duration ends, the patch times out.
     * 
     */
    private final String duration;
    /**
     * VM instances to patch.
     * 
     */
    private final PatchInstanceFilterResponse instanceFilter;
    /**
     * The last time a patch job was started by this deployment. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    private final String lastExecuteTime;
    /**
     * Unique name for the patch deployment resource in a project. The patch deployment name is in the form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is ignored when you create a new patch deployment.
     * 
     */
    private final String name;
    /**
     * Schedule a one-time execution.
     * 
     */
    private final OneTimeScheduleResponse oneTimeSchedule;
    /**
     * Optional. Patch configuration that is applied.
     * 
     */
    private final PatchConfigResponse patchConfig;
    /**
     * Schedule recurring executions.
     * 
     */
    private final RecurringScheduleResponse recurringSchedule;
    /**
     * Optional. Rollout strategy of the patch job.
     * 
     */
    private final PatchRolloutResponse rollout;
    /**
     * Current state of the patch deployment.
     * 
     */
    private final String state;
    /**
     * Time the patch deployment was last updated. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","description","duration","instanceFilter","lastExecuteTime","name","oneTimeSchedule","patchConfig","recurringSchedule","rollout","state","updateTime"})
    private GetPatchDeploymentResult(
        String createTime,
        String description,
        String duration,
        PatchInstanceFilterResponse instanceFilter,
        String lastExecuteTime,
        String name,
        OneTimeScheduleResponse oneTimeSchedule,
        PatchConfigResponse patchConfig,
        RecurringScheduleResponse recurringSchedule,
        PatchRolloutResponse rollout,
        String state,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.duration = Objects.requireNonNull(duration);
        this.instanceFilter = Objects.requireNonNull(instanceFilter);
        this.lastExecuteTime = Objects.requireNonNull(lastExecuteTime);
        this.name = Objects.requireNonNull(name);
        this.oneTimeSchedule = Objects.requireNonNull(oneTimeSchedule);
        this.patchConfig = Objects.requireNonNull(patchConfig);
        this.recurringSchedule = Objects.requireNonNull(recurringSchedule);
        this.rollout = Objects.requireNonNull(rollout);
        this.state = Objects.requireNonNull(state);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Time the patch deployment was created. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Duration of the patch. After the duration ends, the patch times out.
     * 
    */
    public String getDuration() {
        return this.duration;
    }
    /**
     * VM instances to patch.
     * 
    */
    public PatchInstanceFilterResponse getInstanceFilter() {
        return this.instanceFilter;
    }
    /**
     * The last time a patch job was started by this deployment. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
    */
    public String getLastExecuteTime() {
        return this.lastExecuteTime;
    }
    /**
     * Unique name for the patch deployment resource in a project. The patch deployment name is in the form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is ignored when you create a new patch deployment.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Schedule a one-time execution.
     * 
    */
    public OneTimeScheduleResponse getOneTimeSchedule() {
        return this.oneTimeSchedule;
    }
    /**
     * Optional. Patch configuration that is applied.
     * 
    */
    public PatchConfigResponse getPatchConfig() {
        return this.patchConfig;
    }
    /**
     * Schedule recurring executions.
     * 
    */
    public RecurringScheduleResponse getRecurringSchedule() {
        return this.recurringSchedule;
    }
    /**
     * Optional. Rollout strategy of the patch job.
     * 
    */
    public PatchRolloutResponse getRollout() {
        return this.rollout;
    }
    /**
     * Current state of the patch deployment.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Time the patch deployment was last updated. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String duration;
        private PatchInstanceFilterResponse instanceFilter;
        private String lastExecuteTime;
        private String name;
        private OneTimeScheduleResponse oneTimeSchedule;
        private PatchConfigResponse patchConfig;
        private RecurringScheduleResponse recurringSchedule;
        private PatchRolloutResponse rollout;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.duration = defaults.duration;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.lastExecuteTime = defaults.lastExecuteTime;
    	      this.name = defaults.name;
    	      this.oneTimeSchedule = defaults.oneTimeSchedule;
    	      this.patchConfig = defaults.patchConfig;
    	      this.recurringSchedule = defaults.recurringSchedule;
    	      this.rollout = defaults.rollout;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setInstanceFilter(PatchInstanceFilterResponse instanceFilter) {
            this.instanceFilter = Objects.requireNonNull(instanceFilter);
            return this;
        }

        public Builder setLastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = Objects.requireNonNull(lastExecuteTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOneTimeSchedule(OneTimeScheduleResponse oneTimeSchedule) {
            this.oneTimeSchedule = Objects.requireNonNull(oneTimeSchedule);
            return this;
        }

        public Builder setPatchConfig(PatchConfigResponse patchConfig) {
            this.patchConfig = Objects.requireNonNull(patchConfig);
            return this;
        }

        public Builder setRecurringSchedule(RecurringScheduleResponse recurringSchedule) {
            this.recurringSchedule = Objects.requireNonNull(recurringSchedule);
            return this;
        }

        public Builder setRollout(PatchRolloutResponse rollout) {
            this.rollout = Objects.requireNonNull(rollout);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetPatchDeploymentResult build() {
            return new GetPatchDeploymentResult(createTime, description, duration, instanceFilter, lastExecuteTime, name, oneTimeSchedule, patchConfig, recurringSchedule, rollout, state, updateTime);
        }
    }
}