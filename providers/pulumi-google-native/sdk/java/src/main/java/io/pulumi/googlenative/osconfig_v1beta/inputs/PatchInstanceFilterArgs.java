// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.inputs.PatchInstanceFilterGroupLabelArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A filter to target VM instances for patching. The targeted VMs must meet all criteria specified. So if both labels and zones are specified, the patch job targets only VMs with those labels and in those zones.
 * 
 */
public final class PatchInstanceFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchInstanceFilterArgs Empty = new PatchInstanceFilterArgs();

    /**
     * Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    @InputImport(name="all")
      private final @Nullable Input<Boolean> all;

    public Input<Boolean> getAll() {
        return this.all == null ? Input.empty() : this.all;
    }

    /**
     * Targets VM instances matching at least one of these label sets. This allows targeting of disparate groups, for example "env=prod or env=staging".
     * 
     */
    @InputImport(name="groupLabels")
      private final @Nullable Input<List<PatchInstanceFilterGroupLabelArgs>> groupLabels;

    public Input<List<PatchInstanceFilterGroupLabelArgs>> getGroupLabels() {
        return this.groupLabels == null ? Input.empty() : this.groupLabels;
    }

    /**
     * Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix="prod-".
     * 
     */
    @InputImport(name="instanceNamePrefixes")
      private final @Nullable Input<List<String>> instanceNamePrefixes;

    public Input<List<String>> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? Input.empty() : this.instanceNamePrefixes;
    }

    /**
     * Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
     * 
     */
    @InputImport(name="instances")
      private final @Nullable Input<List<String>> instances;

    public Input<List<String>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public PatchInstanceFilterArgs(
        @Nullable Input<Boolean> all,
        @Nullable Input<List<PatchInstanceFilterGroupLabelArgs>> groupLabels,
        @Nullable Input<List<String>> instanceNamePrefixes,
        @Nullable Input<List<String>> instances,
        @Nullable Input<List<String>> zones) {
        this.all = all;
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.zones = zones;
    }

    private PatchInstanceFilterArgs() {
        this.all = Input.empty();
        this.groupLabels = Input.empty();
        this.instanceNamePrefixes = Input.empty();
        this.instances = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchInstanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> all;
        private @Nullable Input<List<PatchInstanceFilterGroupLabelArgs>> groupLabels;
        private @Nullable Input<List<String>> instanceNamePrefixes;
        private @Nullable Input<List<String>> instances;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchInstanceFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.zones = defaults.zones;
        }

        public Builder setAll(@Nullable Input<Boolean> all) {
            this.all = all;
            return this;
        }

        public Builder setAll(@Nullable Boolean all) {
            this.all = Input.ofNullable(all);
            return this;
        }

        public Builder setGroupLabels(@Nullable Input<List<PatchInstanceFilterGroupLabelArgs>> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }

        public Builder setGroupLabels(@Nullable List<PatchInstanceFilterGroupLabelArgs> groupLabels) {
            this.groupLabels = Input.ofNullable(groupLabels);
            return this;
        }

        public Builder setInstanceNamePrefixes(@Nullable Input<List<String>> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }

        public Builder setInstanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = Input.ofNullable(instanceNamePrefixes);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<String> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public PatchInstanceFilterArgs build() {
            return new PatchInstanceFilterArgs(all, groupLabels, instanceNamePrefixes, instances, zones);
        }
    }
}