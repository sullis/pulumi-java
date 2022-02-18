// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionArgs Empty = new PreventionJobTriggerInspectJobActionArgs();

    /**
     * Schedule for triggered jobs
     * Structure is documented below.
     * 
     */
    @InputImport(name="saveFindings", required=true)
    private final Input<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings;

    public Input<PreventionJobTriggerInspectJobActionSaveFindingsArgs> getSaveFindings() {
        return this.saveFindings;
    }

    public PreventionJobTriggerInspectJobActionArgs(Input<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings) {
        this.saveFindings = Objects.requireNonNull(saveFindings, "expected parameter 'saveFindings' to be non-null");
    }

    private PreventionJobTriggerInspectJobActionArgs() {
        this.saveFindings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.saveFindings = defaults.saveFindings;
        }

        public Builder setSaveFindings(Input<PreventionJobTriggerInspectJobActionSaveFindingsArgs> saveFindings) {
            this.saveFindings = Objects.requireNonNull(saveFindings);
            return this;
        }

        public Builder setSaveFindings(PreventionJobTriggerInspectJobActionSaveFindingsArgs saveFindings) {
            this.saveFindings = Input.of(Objects.requireNonNull(saveFindings));
            return this;
        }

        public PreventionJobTriggerInspectJobActionArgs build() {
            return new PreventionJobTriggerInspectJobActionArgs(saveFindings);
        }
    }
}
