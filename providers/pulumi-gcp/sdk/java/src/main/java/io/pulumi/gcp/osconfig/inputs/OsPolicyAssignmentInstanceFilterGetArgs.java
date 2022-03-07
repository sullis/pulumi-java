// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInventoryGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentInstanceFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentInstanceFilterGetArgs Empty = new OsPolicyAssignmentInstanceFilterGetArgs();

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    @InputImport(name="all")
      private final @Nullable Input<Boolean> all;

    public Input<Boolean> getAll() {
        return this.all == null ? Input.empty() : this.all;
    }

    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    @InputImport(name="exclusionLabels")
      private final @Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels;

    public Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> getExclusionLabels() {
        return this.exclusionLabels == null ? Input.empty() : this.exclusionLabels;
    }

    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    @InputImport(name="inclusionLabels")
      private final @Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels;

    public Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> getInclusionLabels() {
        return this.inclusionLabels == null ? Input.empty() : this.inclusionLabels;
    }

    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    @InputImport(name="inventories")
      private final @Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories;

    public Input<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> getInventories() {
        return this.inventories == null ? Input.empty() : this.inventories;
    }

    public OsPolicyAssignmentInstanceFilterGetArgs(
        @Nullable Input<Boolean> all,
        @Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels,
        @Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels,
        @Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories) {
        this.all = all;
        this.exclusionLabels = exclusionLabels;
        this.inclusionLabels = inclusionLabels;
        this.inventories = inventories;
    }

    private OsPolicyAssignmentInstanceFilterGetArgs() {
        this.all = Input.empty();
        this.exclusionLabels = Input.empty();
        this.inclusionLabels = Input.empty();
        this.inventories = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> all;
        private @Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels;
        private @Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels;
        private @Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder setAll(@Nullable Input<Boolean> all) {
            this.all = all;
            return this;
        }

        public Builder setAll(@Nullable Boolean all) {
            this.all = Input.ofNullable(all);
            return this;
        }

        public Builder setExclusionLabels(@Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels) {
            this.exclusionLabels = exclusionLabels;
            return this;
        }

        public Builder setExclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs> exclusionLabels) {
            this.exclusionLabels = Input.ofNullable(exclusionLabels);
            return this;
        }

        public Builder setInclusionLabels(@Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels) {
            this.inclusionLabels = inclusionLabels;
            return this;
        }

        public Builder setInclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs> inclusionLabels) {
            this.inclusionLabels = Input.ofNullable(inclusionLabels);
            return this;
        }

        public Builder setInventories(@Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories) {
            this.inventories = inventories;
            return this;
        }

        public Builder setInventories(@Nullable List<OsPolicyAssignmentInstanceFilterInventoryGetArgs> inventories) {
            this.inventories = Input.ofNullable(inventories);
            return this;
        }
        public OsPolicyAssignmentInstanceFilterGetArgs build() {
            return new OsPolicyAssignmentInstanceFilterGetArgs(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}