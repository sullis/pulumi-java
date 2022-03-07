// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1beta.outputs.AssignmentGroupLabelResponse;
import io.pulumi.googlenative.osconfig_v1beta.outputs.AssignmentOsTypeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AssignmentResponse {
    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups, for example "env=prod or env=staging".
     * 
     */
    private final List<AssignmentGroupLabelResponse> groupLabels;
    /**
     * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another way to group VM instances when targeting configs, for example prefix="prod-". Only supported for project-level policies.
     * 
     */
    private final List<String> instanceNamePrefixes;
    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to facilitate the management of changes by the instance or to target specific VM instances for development and testing. Only supported for project-level policies and must reference instances within this project.
     * 
     */
    private final List<String> instances;
    /**
     * Targets VM instances matching at least one of the following OS types. VM instances must match all supplied criteria for a given OsType to be included.
     * 
     */
    private final List<AssignmentOsTypeResponse> osTypes;
    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    private final List<String> zones;

    @OutputCustomType.Constructor({"groupLabels","instanceNamePrefixes","instances","osTypes","zones"})
    private AssignmentResponse(
        List<AssignmentGroupLabelResponse> groupLabels,
        List<String> instanceNamePrefixes,
        List<String> instances,
        List<AssignmentOsTypeResponse> osTypes,
        List<String> zones) {
        this.groupLabels = Objects.requireNonNull(groupLabels);
        this.instanceNamePrefixes = Objects.requireNonNull(instanceNamePrefixes);
        this.instances = Objects.requireNonNull(instances);
        this.osTypes = Objects.requireNonNull(osTypes);
        this.zones = Objects.requireNonNull(zones);
    }

    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups, for example "env=prod or env=staging".
     * 
    */
    public List<AssignmentGroupLabelResponse> getGroupLabels() {
        return this.groupLabels;
    }
    /**
     * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another way to group VM instances when targeting configs, for example prefix="prod-". Only supported for project-level policies.
     * 
    */
    public List<String> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes;
    }
    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to facilitate the management of changes by the instance or to target specific VM instances for development and testing. Only supported for project-level policies and must reference instances within this project.
     * 
    */
    public List<String> getInstances() {
        return this.instances;
    }
    /**
     * Targets VM instances matching at least one of the following OS types. VM instances must match all supplied criteria for a given OsType to be included.
     * 
    */
    public List<AssignmentOsTypeResponse> getOsTypes() {
        return this.osTypes;
    }
    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
    */
    public List<String> getZones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AssignmentGroupLabelResponse> groupLabels;
        private List<String> instanceNamePrefixes;
        private List<String> instances;
        private List<AssignmentOsTypeResponse> osTypes;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.osTypes = defaults.osTypes;
    	      this.zones = defaults.zones;
        }

        public Builder setGroupLabels(List<AssignmentGroupLabelResponse> groupLabels) {
            this.groupLabels = Objects.requireNonNull(groupLabels);
            return this;
        }

        public Builder setInstanceNamePrefixes(List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = Objects.requireNonNull(instanceNamePrefixes);
            return this;
        }

        public Builder setInstances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setOsTypes(List<AssignmentOsTypeResponse> osTypes) {
            this.osTypes = Objects.requireNonNull(osTypes);
            return this;
        }

        public Builder setZones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public AssignmentResponse build() {
            return new AssignmentResponse(groupLabels, instanceNamePrefixes, instances, osTypes, zones);
        }
    }
}