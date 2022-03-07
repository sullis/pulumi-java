// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentGroupLabelResponse;
import io.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentOsTypeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An assignment represents the group or groups of VM instances that the policy applies to. If an assignment is empty, it applies to all VM instances. Otherwise, the targeted VM instances must meet all the criteria specified. So if both labels and zones are specified, the policy applies to VM instances with those labels and in those zones.
 * 
 */
public final class AssignmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentResponse Empty = new AssignmentResponse();

    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups, for example "env=prod or env=staging".
     * 
     */
    @InputImport(name="groupLabels", required=true)
      private final List<AssignmentGroupLabelResponse> groupLabels;

    public List<AssignmentGroupLabelResponse> getGroupLabels() {
        return this.groupLabels;
    }

    /**
     * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another way to group VM instances when targeting configs, for example prefix="prod-". Only supported for project-level policies.
     * 
     */
    @InputImport(name="instanceNamePrefixes", required=true)
      private final List<String> instanceNamePrefixes;

    public List<String> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes;
    }

    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to facilitate the management of changes by the instance or to target specific VM instances for development and testing. Only supported for project-level policies and must reference instances within this project.
     * 
     */
    @InputImport(name="instances", required=true)
      private final List<String> instances;

    public List<String> getInstances() {
        return this.instances;
    }

    /**
     * Targets VM instances matching at least one of the following OS types. VM instances must match all supplied criteria for a given OsType to be included.
     * 
     */
    @InputImport(name="osTypes", required=true)
      private final List<AssignmentOsTypeResponse> osTypes;

    public List<AssignmentOsTypeResponse> getOsTypes() {
        return this.osTypes;
    }

    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    @InputImport(name="zones", required=true)
      private final List<String> zones;

    public List<String> getZones() {
        return this.zones;
    }

    public AssignmentResponse(
        List<AssignmentGroupLabelResponse> groupLabels,
        List<String> instanceNamePrefixes,
        List<String> instances,
        List<AssignmentOsTypeResponse> osTypes,
        List<String> zones) {
        this.groupLabels = Objects.requireNonNull(groupLabels, "expected parameter 'groupLabels' to be non-null");
        this.instanceNamePrefixes = Objects.requireNonNull(instanceNamePrefixes, "expected parameter 'instanceNamePrefixes' to be non-null");
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.osTypes = Objects.requireNonNull(osTypes, "expected parameter 'osTypes' to be non-null");
        this.zones = Objects.requireNonNull(zones, "expected parameter 'zones' to be non-null");
    }

    private AssignmentResponse() {
        this.groupLabels = List.of();
        this.instanceNamePrefixes = List.of();
        this.instances = List.of();
        this.osTypes = List.of();
        this.zones = List.of();
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