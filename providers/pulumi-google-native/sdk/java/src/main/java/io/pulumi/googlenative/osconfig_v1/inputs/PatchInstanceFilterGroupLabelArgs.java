// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Targets a group of VM instances by using their [assigned labels](https://cloud.google.com/compute/docs/labeling-resources). Labels are key-value pairs. A `GroupLabel` is a combination of labels that is used to target VMs for a patch job. For example, a patch job can target VMs that have the following `GroupLabel`: `{"env":"test", "app":"web"}`. This means that the patch job is applied to VMs that have both the labels `env=test` and `app=web`.
 * 
 */
public final class PatchInstanceFilterGroupLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchInstanceFilterGroupLabelArgs Empty = new PatchInstanceFilterGroupLabelArgs();

    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    public PatchInstanceFilterGroupLabelArgs(@Nullable Input<Map<String,String>> labels) {
        this.labels = labels;
    }

    private PatchInstanceFilterGroupLabelArgs() {
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchInstanceFilterGroupLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchInstanceFilterGroupLabelArgs defaults) {
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
        public PatchInstanceFilterGroupLabelArgs build() {
            return new PatchInstanceFilterGroupLabelArgs(labels);
        }
    }
}