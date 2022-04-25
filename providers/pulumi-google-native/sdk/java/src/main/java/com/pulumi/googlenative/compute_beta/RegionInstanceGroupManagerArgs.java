// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.RegionInstanceGroupManagerFailoverAction;
import com.pulumi.googlenative.compute_beta.inputs.DistributionPolicyArgs;
import com.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerAutoHealingPolicyArgs;
import com.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerUpdatePolicyArgs;
import com.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerVersionArgs;
import com.pulumi.googlenative.compute_beta.inputs.NamedPortArgs;
import com.pulumi.googlenative.compute_beta.inputs.StatefulPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerArgs Empty = new RegionInstanceGroupManagerArgs();

    /**
     * The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    @Import(name="autoHealingPolicies")
    private @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;

    /**
     * @return The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    public Optional<Output<List<InstanceGroupManagerAutoHealingPolicyArgs>>> autoHealingPolicies() {
        return Optional.ofNullable(this.autoHealingPolicies);
    }

    /**
     * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    @Import(name="baseInstanceName")
    private @Nullable Output<String> baseInstanceName;

    /**
     * @return The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    public Optional<Output<String>> baseInstanceName() {
        return Optional.ofNullable(this.baseInstanceName);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    @Import(name="distributionPolicy")
    private @Nullable Output<DistributionPolicyArgs> distributionPolicy;

    /**
     * @return Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    public Optional<Output<DistributionPolicyArgs>> distributionPolicy() {
        return Optional.ofNullable(this.distributionPolicy);
    }

    /**
     * The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    @Import(name="failoverAction")
    private @Nullable Output<RegionInstanceGroupManagerFailoverAction> failoverAction;

    /**
     * @return The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    public Optional<Output<RegionInstanceGroupManagerFailoverAction>> failoverAction() {
        return Optional.ofNullable(this.failoverAction);
    }

    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
     * 
     */
    @Import(name="instanceTemplate")
    private @Nullable Output<String> instanceTemplate;

    /**
     * @return The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
     * 
     */
    public Optional<Output<String>> instanceTemplate() {
        return Optional.ofNullable(this.instanceTemplate);
    }

    /**
     * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    @Import(name="namedPorts")
    private @Nullable Output<List<NamedPortArgs>> namedPorts;

    /**
     * @return Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    public Optional<Output<List<NamedPortArgs>>> namedPorts() {
        return Optional.ofNullable(this.namedPorts);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Stateful configuration for this Instanced Group Manager
     * 
     */
    @Import(name="statefulPolicy")
    private @Nullable Output<StatefulPolicyArgs> statefulPolicy;

    /**
     * @return Stateful configuration for this Instanced Group Manager
     * 
     */
    public Optional<Output<StatefulPolicyArgs>> statefulPolicy() {
        return Optional.ofNullable(this.statefulPolicy);
    }

    /**
     * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    @Import(name="targetPools")
    private @Nullable Output<List<String>> targetPools;

    /**
     * @return The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    public Optional<Output<List<String>>> targetPools() {
        return Optional.ofNullable(this.targetPools);
    }

    /**
     * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    @Import(name="targetSize")
    private @Nullable Output<Integer> targetSize;

    /**
     * @return The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    public Optional<Output<Integer>> targetSize() {
        return Optional.ofNullable(this.targetSize);
    }

    /**
     * The update policy for this managed instance group.
     * 
     */
    @Import(name="updatePolicy")
    private @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    /**
     * @return The update policy for this managed instance group.
     * 
     */
    public Optional<Output<InstanceGroupManagerUpdatePolicyArgs>> updatePolicy() {
        return Optional.ofNullable(this.updatePolicy);
    }

    /**
     * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    @Import(name="versions")
    private @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions;

    /**
     * @return Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    public Optional<Output<List<InstanceGroupManagerVersionArgs>>> versions() {
        return Optional.ofNullable(this.versions);
    }

    private RegionInstanceGroupManagerArgs() {}

    private RegionInstanceGroupManagerArgs(RegionInstanceGroupManagerArgs $) {
        this.autoHealingPolicies = $.autoHealingPolicies;
        this.baseInstanceName = $.baseInstanceName;
        this.description = $.description;
        this.distributionPolicy = $.distributionPolicy;
        this.failoverAction = $.failoverAction;
        this.instanceTemplate = $.instanceTemplate;
        this.name = $.name;
        this.namedPorts = $.namedPorts;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.serviceAccount = $.serviceAccount;
        this.statefulPolicy = $.statefulPolicy;
        this.targetPools = $.targetPools;
        this.targetSize = $.targetSize;
        this.updatePolicy = $.updatePolicy;
        this.versions = $.versions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceGroupManagerArgs $;

        public Builder() {
            $ = new RegionInstanceGroupManagerArgs();
        }

        public Builder(RegionInstanceGroupManagerArgs defaults) {
            $ = new RegionInstanceGroupManagerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoHealingPolicies The autohealing policy for this managed instance group. You can specify only one value.
         * 
         * @return builder
         * 
         */
        public Builder autoHealingPolicies(@Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies) {
            $.autoHealingPolicies = autoHealingPolicies;
            return this;
        }

        /**
         * @param autoHealingPolicies The autohealing policy for this managed instance group. You can specify only one value.
         * 
         * @return builder
         * 
         */
        public Builder autoHealingPolicies(List<InstanceGroupManagerAutoHealingPolicyArgs> autoHealingPolicies) {
            return autoHealingPolicies(Output.of(autoHealingPolicies));
        }

        /**
         * @param autoHealingPolicies The autohealing policy for this managed instance group. You can specify only one value.
         * 
         * @return builder
         * 
         */
        public Builder autoHealingPolicies(InstanceGroupManagerAutoHealingPolicyArgs... autoHealingPolicies) {
            return autoHealingPolicies(List.of(autoHealingPolicies));
        }

        /**
         * @param baseInstanceName The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder baseInstanceName(@Nullable Output<String> baseInstanceName) {
            $.baseInstanceName = baseInstanceName;
            return this;
        }

        /**
         * @param baseInstanceName The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder baseInstanceName(String baseInstanceName) {
            return baseInstanceName(Output.of(baseInstanceName));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param distributionPolicy Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder distributionPolicy(@Nullable Output<DistributionPolicyArgs> distributionPolicy) {
            $.distributionPolicy = distributionPolicy;
            return this;
        }

        /**
         * @param distributionPolicy Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder distributionPolicy(DistributionPolicyArgs distributionPolicy) {
            return distributionPolicy(Output.of(distributionPolicy));
        }

        /**
         * @param failoverAction The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
         * 
         * @return builder
         * 
         */
        public Builder failoverAction(@Nullable Output<RegionInstanceGroupManagerFailoverAction> failoverAction) {
            $.failoverAction = failoverAction;
            return this;
        }

        /**
         * @param failoverAction The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
         * 
         * @return builder
         * 
         */
        public Builder failoverAction(RegionInstanceGroupManagerFailoverAction failoverAction) {
            return failoverAction(Output.of(failoverAction));
        }

        /**
         * @param instanceTemplate The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
         * 
         * @return builder
         * 
         */
        public Builder instanceTemplate(@Nullable Output<String> instanceTemplate) {
            $.instanceTemplate = instanceTemplate;
            return this;
        }

        /**
         * @param instanceTemplate The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE.
         * 
         * @return builder
         * 
         */
        public Builder instanceTemplate(String instanceTemplate) {
            return instanceTemplate(Output.of(instanceTemplate));
        }

        /**
         * @param name The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namedPorts Named ports configured for the Instance Groups complementary to this Instance Group Manager.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(@Nullable Output<List<NamedPortArgs>> namedPorts) {
            $.namedPorts = namedPorts;
            return this;
        }

        /**
         * @param namedPorts Named ports configured for the Instance Groups complementary to this Instance Group Manager.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(List<NamedPortArgs> namedPorts) {
            return namedPorts(Output.of(namedPorts));
        }

        /**
         * @param namedPorts Named ports configured for the Instance Groups complementary to this Instance Group Manager.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(NamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param serviceAccount The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param statefulPolicy Stateful configuration for this Instanced Group Manager
         * 
         * @return builder
         * 
         */
        public Builder statefulPolicy(@Nullable Output<StatefulPolicyArgs> statefulPolicy) {
            $.statefulPolicy = statefulPolicy;
            return this;
        }

        /**
         * @param statefulPolicy Stateful configuration for this Instanced Group Manager
         * 
         * @return builder
         * 
         */
        public Builder statefulPolicy(StatefulPolicyArgs statefulPolicy) {
            return statefulPolicy(Output.of(statefulPolicy));
        }

        /**
         * @param targetPools The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder targetPools(@Nullable Output<List<String>> targetPools) {
            $.targetPools = targetPools;
            return this;
        }

        /**
         * @param targetPools The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder targetPools(List<String> targetPools) {
            return targetPools(Output.of(targetPools));
        }

        /**
         * @param targetPools The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }

        /**
         * @param targetSize The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
         * 
         * @return builder
         * 
         */
        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            $.targetSize = targetSize;
            return this;
        }

        /**
         * @param targetSize The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
         * 
         * @return builder
         * 
         */
        public Builder targetSize(Integer targetSize) {
            return targetSize(Output.of(targetSize));
        }

        /**
         * @param updatePolicy The update policy for this managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder updatePolicy(@Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            $.updatePolicy = updatePolicy;
            return this;
        }

        /**
         * @param updatePolicy The update policy for this managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder updatePolicy(InstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            return updatePolicy(Output.of(updatePolicy));
        }

        /**
         * @param versions Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
         * 
         * @return builder
         * 
         */
        public Builder versions(@Nullable Output<List<InstanceGroupManagerVersionArgs>> versions) {
            $.versions = versions;
            return this;
        }

        /**
         * @param versions Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
         * 
         * @return builder
         * 
         */
        public Builder versions(List<InstanceGroupManagerVersionArgs> versions) {
            return versions(Output.of(versions));
        }

        /**
         * @param versions Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
         * 
         * @return builder
         * 
         */
        public Builder versions(InstanceGroupManagerVersionArgs... versions) {
            return versions(List.of(versions));
        }

        public RegionInstanceGroupManagerArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
