// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAutoHealingPoliciesGetArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerNamedPortGetArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulDiskGetArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusGetArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerUpdatePolicyGetArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerState extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerState Empty = new RegionInstanceGroupManagerState();

    /**
     * The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    @Import(name="autoHealingPolicies")
      private final @Nullable Output<RegionInstanceGroupManagerAutoHealingPoliciesGetArgs> autoHealingPolicies;

    public Output<RegionInstanceGroupManagerAutoHealingPoliciesGetArgs> getAutoHealingPolicies() {
        return this.autoHealingPolicies == null ? Output.empty() : this.autoHealingPolicies;
    }

    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    @Import(name="baseInstanceName")
      private final @Nullable Output<String> baseInstanceName;

    public Output<String> getBaseInstanceName() {
        return this.baseInstanceName == null ? Output.empty() : this.baseInstanceName;
    }

    /**
     * An optional textual description of the instance
     * group manager.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The shape to which the group converges either proactively or on resize events (depending on the value set in update_policy.0.instance_redistribution_type). For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/regional-mig-distribution-shape).
     * 
     */
    @Import(name="distributionPolicyTargetShape")
      private final @Nullable Output<String> distributionPolicyTargetShape;

    public Output<String> getDistributionPolicyTargetShape() {
        return this.distributionPolicyTargetShape == null ? Output.empty() : this.distributionPolicyTargetShape;
    }

    /**
     * The distribution policy for this managed instance
     * group. You can specify one or more values. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#selectingzones).
     * 
     */
    @Import(name="distributionPolicyZones")
      private final @Nullable Output<List<String>> distributionPolicyZones;

    public Output<List<String>> getDistributionPolicyZones() {
        return this.distributionPolicyZones == null ? Output.empty() : this.distributionPolicyZones;
    }

    /**
     * The fingerprint of the instance group manager.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint == null ? Output.empty() : this.fingerprint;
    }

    /**
     * The full URL of the instance group created by the manager.
     * 
     */
    @Import(name="instanceGroup")
      private final @Nullable Output<String> instanceGroup;

    public Output<String> getInstanceGroup() {
        return this.instanceGroup == null ? Output.empty() : this.instanceGroup;
    }

    /**
     * - Version name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    @Import(name="namedPorts")
      private final @Nullable Output<List<RegionInstanceGroupManagerNamedPortGetArgs>> namedPorts;

    public Output<List<RegionInstanceGroupManagerNamedPortGetArgs>> getNamedPorts() {
        return this.namedPorts == null ? Output.empty() : this.namedPorts;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region where the managed instance group resides. If not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The URL of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs). Proactive cross zone instance redistribution must be disabled before you can update stateful disks on existing instance group managers. This can be controlled via the `update_policy`.
     * 
     */
    @Import(name="statefulDisks")
      private final @Nullable Output<List<RegionInstanceGroupManagerStatefulDiskGetArgs>> statefulDisks;

    public Output<List<RegionInstanceGroupManagerStatefulDiskGetArgs>> getStatefulDisks() {
        return this.statefulDisks == null ? Output.empty() : this.statefulDisks;
    }

    /**
     * The status of this managed instance group.
     * 
     */
    @Import(name="statuses")
      private final @Nullable Output<List<RegionInstanceGroupManagerStatusGetArgs>> statuses;

    public Output<List<RegionInstanceGroupManagerStatusGetArgs>> getStatuses() {
        return this.statuses == null ? Output.empty() : this.statuses;
    }

    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    @Import(name="targetPools")
      private final @Nullable Output<List<String>> targetPools;

    public Output<List<String>> getTargetPools() {
        return this.targetPools == null ? Output.empty() : this.targetPools;
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Import(name="targetSize")
      private final @Nullable Output<Integer> targetSize;

    public Output<Integer> getTargetSize() {
        return this.targetSize == null ? Output.empty() : this.targetSize;
    }

    /**
     * The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     * 
     */
    @Import(name="updatePolicy")
      private final @Nullable Output<RegionInstanceGroupManagerUpdatePolicyGetArgs> updatePolicy;

    public Output<RegionInstanceGroupManagerUpdatePolicyGetArgs> getUpdatePolicy() {
        return this.updatePolicy == null ? Output.empty() : this.updatePolicy;
    }

    /**
     * Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    @Import(name="versions")
      private final @Nullable Output<List<RegionInstanceGroupManagerVersionGetArgs>> versions;

    public Output<List<RegionInstanceGroupManagerVersionGetArgs>> getVersions() {
        return this.versions == null ? Output.empty() : this.versions;
    }

    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, the provider will
     * continue trying until it times out.
     * 
     */
    @Import(name="waitForInstances")
      private final @Nullable Output<Boolean> waitForInstances;

    public Output<Boolean> getWaitForInstances() {
        return this.waitForInstances == null ? Output.empty() : this.waitForInstances;
    }

    /**
     * When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    @Import(name="waitForInstancesStatus")
      private final @Nullable Output<String> waitForInstancesStatus;

    public Output<String> getWaitForInstancesStatus() {
        return this.waitForInstancesStatus == null ? Output.empty() : this.waitForInstancesStatus;
    }

    public RegionInstanceGroupManagerState(
        @Nullable Output<RegionInstanceGroupManagerAutoHealingPoliciesGetArgs> autoHealingPolicies,
        @Nullable Output<String> baseInstanceName,
        @Nullable Output<String> description,
        @Nullable Output<String> distributionPolicyTargetShape,
        @Nullable Output<List<String>> distributionPolicyZones,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> instanceGroup,
        @Nullable Output<String> name,
        @Nullable Output<List<RegionInstanceGroupManagerNamedPortGetArgs>> namedPorts,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> selfLink,
        @Nullable Output<List<RegionInstanceGroupManagerStatefulDiskGetArgs>> statefulDisks,
        @Nullable Output<List<RegionInstanceGroupManagerStatusGetArgs>> statuses,
        @Nullable Output<List<String>> targetPools,
        @Nullable Output<Integer> targetSize,
        @Nullable Output<RegionInstanceGroupManagerUpdatePolicyGetArgs> updatePolicy,
        @Nullable Output<List<RegionInstanceGroupManagerVersionGetArgs>> versions,
        @Nullable Output<Boolean> waitForInstances,
        @Nullable Output<String> waitForInstancesStatus) {
        this.autoHealingPolicies = autoHealingPolicies;
        this.baseInstanceName = baseInstanceName;
        this.description = description;
        this.distributionPolicyTargetShape = distributionPolicyTargetShape;
        this.distributionPolicyZones = distributionPolicyZones;
        this.fingerprint = fingerprint;
        this.instanceGroup = instanceGroup;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.statefulDisks = statefulDisks;
        this.statuses = statuses;
        this.targetPools = targetPools;
        this.targetSize = targetSize;
        this.updatePolicy = updatePolicy;
        this.versions = versions;
        this.waitForInstances = waitForInstances;
        this.waitForInstancesStatus = waitForInstancesStatus;
    }

    private RegionInstanceGroupManagerState() {
        this.autoHealingPolicies = Output.empty();
        this.baseInstanceName = Output.empty();
        this.description = Output.empty();
        this.distributionPolicyTargetShape = Output.empty();
        this.distributionPolicyZones = Output.empty();
        this.fingerprint = Output.empty();
        this.instanceGroup = Output.empty();
        this.name = Output.empty();
        this.namedPorts = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.selfLink = Output.empty();
        this.statefulDisks = Output.empty();
        this.statuses = Output.empty();
        this.targetPools = Output.empty();
        this.targetSize = Output.empty();
        this.updatePolicy = Output.empty();
        this.versions = Output.empty();
        this.waitForInstances = Output.empty();
        this.waitForInstancesStatus = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionInstanceGroupManagerAutoHealingPoliciesGetArgs> autoHealingPolicies;
        private @Nullable Output<String> baseInstanceName;
        private @Nullable Output<String> description;
        private @Nullable Output<String> distributionPolicyTargetShape;
        private @Nullable Output<List<String>> distributionPolicyZones;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> instanceGroup;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RegionInstanceGroupManagerNamedPortGetArgs>> namedPorts;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<List<RegionInstanceGroupManagerStatefulDiskGetArgs>> statefulDisks;
        private @Nullable Output<List<RegionInstanceGroupManagerStatusGetArgs>> statuses;
        private @Nullable Output<List<String>> targetPools;
        private @Nullable Output<Integer> targetSize;
        private @Nullable Output<RegionInstanceGroupManagerUpdatePolicyGetArgs> updatePolicy;
        private @Nullable Output<List<RegionInstanceGroupManagerVersionGetArgs>> versions;
        private @Nullable Output<Boolean> waitForInstances;
        private @Nullable Output<String> waitForInstancesStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.description = defaults.description;
    	      this.distributionPolicyTargetShape = defaults.distributionPolicyTargetShape;
    	      this.distributionPolicyZones = defaults.distributionPolicyZones;
    	      this.fingerprint = defaults.fingerprint;
    	      this.instanceGroup = defaults.instanceGroup;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.statefulDisks = defaults.statefulDisks;
    	      this.statuses = defaults.statuses;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
    	      this.waitForInstances = defaults.waitForInstances;
    	      this.waitForInstancesStatus = defaults.waitForInstancesStatus;
        }

        public Builder autoHealingPolicies(@Nullable Output<RegionInstanceGroupManagerAutoHealingPoliciesGetArgs> autoHealingPolicies) {
            this.autoHealingPolicies = autoHealingPolicies;
            return this;
        }
        public Builder autoHealingPolicies(@Nullable RegionInstanceGroupManagerAutoHealingPoliciesGetArgs autoHealingPolicies) {
            this.autoHealingPolicies = Output.ofNullable(autoHealingPolicies);
            return this;
        }
        public Builder baseInstanceName(@Nullable Output<String> baseInstanceName) {
            this.baseInstanceName = baseInstanceName;
            return this;
        }
        public Builder baseInstanceName(@Nullable String baseInstanceName) {
            this.baseInstanceName = Output.ofNullable(baseInstanceName);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder distributionPolicyTargetShape(@Nullable Output<String> distributionPolicyTargetShape) {
            this.distributionPolicyTargetShape = distributionPolicyTargetShape;
            return this;
        }
        public Builder distributionPolicyTargetShape(@Nullable String distributionPolicyTargetShape) {
            this.distributionPolicyTargetShape = Output.ofNullable(distributionPolicyTargetShape);
            return this;
        }
        public Builder distributionPolicyZones(@Nullable Output<List<String>> distributionPolicyZones) {
            this.distributionPolicyZones = distributionPolicyZones;
            return this;
        }
        public Builder distributionPolicyZones(@Nullable List<String> distributionPolicyZones) {
            this.distributionPolicyZones = Output.ofNullable(distributionPolicyZones);
            return this;
        }
        public Builder distributionPolicyZones(String... distributionPolicyZones) {
            return distributionPolicyZones(List.of(distributionPolicyZones));
        }
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Output.ofNullable(fingerprint);
            return this;
        }
        public Builder instanceGroup(@Nullable Output<String> instanceGroup) {
            this.instanceGroup = instanceGroup;
            return this;
        }
        public Builder instanceGroup(@Nullable String instanceGroup) {
            this.instanceGroup = Output.ofNullable(instanceGroup);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder namedPorts(@Nullable Output<List<RegionInstanceGroupManagerNamedPortGetArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }
        public Builder namedPorts(@Nullable List<RegionInstanceGroupManagerNamedPortGetArgs> namedPorts) {
            this.namedPorts = Output.ofNullable(namedPorts);
            return this;
        }
        public Builder namedPorts(RegionInstanceGroupManagerNamedPortGetArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public Builder statefulDisks(@Nullable Output<List<RegionInstanceGroupManagerStatefulDiskGetArgs>> statefulDisks) {
            this.statefulDisks = statefulDisks;
            return this;
        }
        public Builder statefulDisks(@Nullable List<RegionInstanceGroupManagerStatefulDiskGetArgs> statefulDisks) {
            this.statefulDisks = Output.ofNullable(statefulDisks);
            return this;
        }
        public Builder statefulDisks(RegionInstanceGroupManagerStatefulDiskGetArgs... statefulDisks) {
            return statefulDisks(List.of(statefulDisks));
        }
        public Builder statuses(@Nullable Output<List<RegionInstanceGroupManagerStatusGetArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(@Nullable List<RegionInstanceGroupManagerStatusGetArgs> statuses) {
            this.statuses = Output.ofNullable(statuses);
            return this;
        }
        public Builder statuses(RegionInstanceGroupManagerStatusGetArgs... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder targetPools(@Nullable Output<List<String>> targetPools) {
            this.targetPools = targetPools;
            return this;
        }
        public Builder targetPools(@Nullable List<String> targetPools) {
            this.targetPools = Output.ofNullable(targetPools);
            return this;
        }
        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }
        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Builder targetSize(@Nullable Integer targetSize) {
            this.targetSize = Output.ofNullable(targetSize);
            return this;
        }
        public Builder updatePolicy(@Nullable Output<RegionInstanceGroupManagerUpdatePolicyGetArgs> updatePolicy) {
            this.updatePolicy = updatePolicy;
            return this;
        }
        public Builder updatePolicy(@Nullable RegionInstanceGroupManagerUpdatePolicyGetArgs updatePolicy) {
            this.updatePolicy = Output.ofNullable(updatePolicy);
            return this;
        }
        public Builder versions(@Nullable Output<List<RegionInstanceGroupManagerVersionGetArgs>> versions) {
            this.versions = versions;
            return this;
        }
        public Builder versions(@Nullable List<RegionInstanceGroupManagerVersionGetArgs> versions) {
            this.versions = Output.ofNullable(versions);
            return this;
        }
        public Builder versions(RegionInstanceGroupManagerVersionGetArgs... versions) {
            return versions(List.of(versions));
        }
        public Builder waitForInstances(@Nullable Output<Boolean> waitForInstances) {
            this.waitForInstances = waitForInstances;
            return this;
        }
        public Builder waitForInstances(@Nullable Boolean waitForInstances) {
            this.waitForInstances = Output.ofNullable(waitForInstances);
            return this;
        }
        public Builder waitForInstancesStatus(@Nullable Output<String> waitForInstancesStatus) {
            this.waitForInstancesStatus = waitForInstancesStatus;
            return this;
        }
        public Builder waitForInstancesStatus(@Nullable String waitForInstancesStatus) {
            this.waitForInstancesStatus = Output.ofNullable(waitForInstancesStatus);
            return this;
        }        public RegionInstanceGroupManagerState build() {
            return new RegionInstanceGroupManagerState(autoHealingPolicies, baseInstanceName, description, distributionPolicyTargetShape, distributionPolicyZones, fingerprint, instanceGroup, name, namedPorts, project, region, selfLink, statefulDisks, statuses, targetPools, targetSize, updatePolicy, versions, waitForInstances, waitForInstancesStatus);
        }
    }
}
