// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs Empty = new OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs();

    /**
     * Labels are identified by key/value pairs in this map. A VM should contain all the key/value pairs specified in this map to be selected.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    public OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs(@Nullable Input<Map<String,String>> labels) {
        this.labels = labels;
    }

    private OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs() {
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs build() {
            return new OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs(labels);
        }
    }
}
