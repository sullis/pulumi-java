// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.PatchInstanceFilterGroupLabelResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PatchInstanceFilterResponse {
    /**
     * Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    private final Boolean all;
    /**
     * Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * 
     */
    private final List<PatchInstanceFilterGroupLabelResponse> groupLabels;
    /**
     * Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix="prod-".
     * 
     */
    private final List<String> instanceNamePrefixes;
    /**
     * Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
     * 
     */
    private final List<String> instances;
    /**
     * Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    private final List<String> zones;

    @CustomType.Constructor
    private PatchInstanceFilterResponse(
        @CustomType.Parameter("all") Boolean all,
        @CustomType.Parameter("groupLabels") List<PatchInstanceFilterGroupLabelResponse> groupLabels,
        @CustomType.Parameter("instanceNamePrefixes") List<String> instanceNamePrefixes,
        @CustomType.Parameter("instances") List<String> instances,
        @CustomType.Parameter("zones") List<String> zones) {
        this.all = all;
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.zones = zones;
    }

    /**
     * Target all VM instances in the project. If true, no other criteria is permitted.
     * 
    */
    public Boolean getAll() {
        return this.all;
    }
    /**
     * Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * 
    */
    public List<PatchInstanceFilterGroupLabelResponse> getGroupLabels() {
        return this.groupLabels;
    }
    /**
     * Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group VMs when targeting configs, for example prefix="prod-".
     * 
    */
    public List<String> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes;
    }
    /**
     * Targets any of the VM instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`, `projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`, or `https://www.googleapis.com/compute/v1/projects/[PROJECT_ID]/zones/[ZONE]/instances/[INSTANCE_NAME]`
     * 
    */
    public List<String> getInstances() {
        return this.instances;
    }
    /**
     * Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
    */
    public List<String> getZones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchInstanceFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean all;
        private List<PatchInstanceFilterGroupLabelResponse> groupLabels;
        private List<String> instanceNamePrefixes;
        private List<String> instances;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchInstanceFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.zones = defaults.zones;
        }

        public Builder all(Boolean all) {
            this.all = Objects.requireNonNull(all);
            return this;
        }
        public Builder groupLabels(List<PatchInstanceFilterGroupLabelResponse> groupLabels) {
            this.groupLabels = Objects.requireNonNull(groupLabels);
            return this;
        }
        public Builder groupLabels(PatchInstanceFilterGroupLabelResponse... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }
        public Builder instanceNamePrefixes(List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = Objects.requireNonNull(instanceNamePrefixes);
            return this;
        }
        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }
        public Builder instances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public PatchInstanceFilterResponse build() {
            return new PatchInstanceFilterResponse(all, groupLabels, instanceNamePrefixes, instances, zones);
        }
    }
}
