// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class PatchDeploymentInstanceFilterGroupLabel {
    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter
     * 
     */
    private final Map<String,String> labels;

    @OutputCustomType.Constructor({"labels"})
    private PatchDeploymentInstanceFilterGroupLabel(Map<String,String> labels) {
        this.labels = Objects.requireNonNull(labels);
    }

    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentInstanceFilterGroupLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentInstanceFilterGroupLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public PatchDeploymentInstanceFilterGroupLabel build() {
            return new PatchDeploymentInstanceFilterGroupLabel(labels);
        }
    }
}
