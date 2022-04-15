// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentGroupAlarmConfigurationGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupAutoRollbackConfigurationGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupDeploymentStyleGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagFilterGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupEcsServiceGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupOnPremisesInstanceTagFilterGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupTriggerConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupState extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupState Empty = new DeploymentGroupState();

    /**
     * Configuration block of alarms associated with the deployment group (documented below).
     * 
     */
    @Import(name="alarmConfiguration")
      private final @Nullable Output<DeploymentGroupAlarmConfigurationGetArgs> alarmConfiguration;

    public Output<DeploymentGroupAlarmConfigurationGetArgs> alarmConfiguration() {
        return this.alarmConfiguration == null ? Codegen.empty() : this.alarmConfiguration;
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="appName")
      private final @Nullable Output<String> appName;

    public Output<String> appName() {
        return this.appName == null ? Codegen.empty() : this.appName;
    }

    /**
     * The ARN of the CodeDeploy deployment group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * 
     */
    @Import(name="autoRollbackConfiguration")
      private final @Nullable Output<DeploymentGroupAutoRollbackConfigurationGetArgs> autoRollbackConfiguration;

    public Output<DeploymentGroupAutoRollbackConfigurationGetArgs> autoRollbackConfiguration() {
        return this.autoRollbackConfiguration == null ? Codegen.empty() : this.autoRollbackConfiguration;
    }

    /**
     * Autoscaling groups associated with the deployment group.
     * 
     */
    @Import(name="autoscalingGroups")
      private final @Nullable Output<List<String>> autoscalingGroups;

    public Output<List<String>> autoscalingGroups() {
        return this.autoscalingGroups == null ? Codegen.empty() : this.autoscalingGroups;
    }

    /**
     * Configuration block of the blue/green deployment options for a deployment group (documented below).
     * 
     */
    @Import(name="blueGreenDeploymentConfig")
      private final @Nullable Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs> blueGreenDeploymentConfig;

    public Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs> blueGreenDeploymentConfig() {
        return this.blueGreenDeploymentConfig == null ? Codegen.empty() : this.blueGreenDeploymentConfig;
    }

    /**
     * The destination platform type for the deployment.
     * 
     */
    @Import(name="computePlatform")
      private final @Nullable Output<String> computePlatform;

    public Output<String> computePlatform() {
        return this.computePlatform == null ? Codegen.empty() : this.computePlatform;
    }

    /**
     * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
     * 
     */
    @Import(name="deploymentConfigName")
      private final @Nullable Output<String> deploymentConfigName;

    public Output<String> deploymentConfigName() {
        return this.deploymentConfigName == null ? Codegen.empty() : this.deploymentConfigName;
    }

    /**
     * The ID of the CodeDeploy deployment group.
     * 
     */
    @Import(name="deploymentGroupId")
      private final @Nullable Output<String> deploymentGroupId;

    public Output<String> deploymentGroupId() {
        return this.deploymentGroupId == null ? Codegen.empty() : this.deploymentGroupId;
    }

    /**
     * The name of the deployment group.
     * 
     */
    @Import(name="deploymentGroupName")
      private final @Nullable Output<String> deploymentGroupName;

    public Output<String> deploymentGroupName() {
        return this.deploymentGroupName == null ? Codegen.empty() : this.deploymentGroupName;
    }

    /**
     * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * 
     */
    @Import(name="deploymentStyle")
      private final @Nullable Output<DeploymentGroupDeploymentStyleGetArgs> deploymentStyle;

    public Output<DeploymentGroupDeploymentStyleGetArgs> deploymentStyle() {
        return this.deploymentStyle == null ? Codegen.empty() : this.deploymentStyle;
    }

    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    @Import(name="ec2TagFilters")
      private final @Nullable Output<List<DeploymentGroupEc2TagFilterGetArgs>> ec2TagFilters;

    public Output<List<DeploymentGroupEc2TagFilterGetArgs>> ec2TagFilters() {
        return this.ec2TagFilters == null ? Codegen.empty() : this.ec2TagFilters;
    }

    /**
     * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * 
     */
    @Import(name="ec2TagSets")
      private final @Nullable Output<List<DeploymentGroupEc2TagSetGetArgs>> ec2TagSets;

    public Output<List<DeploymentGroupEc2TagSetGetArgs>> ec2TagSets() {
        return this.ec2TagSets == null ? Codegen.empty() : this.ec2TagSets;
    }

    /**
     * Configuration block(s) of the ECS services for a deployment group (documented below).
     * 
     */
    @Import(name="ecsService")
      private final @Nullable Output<DeploymentGroupEcsServiceGetArgs> ecsService;

    public Output<DeploymentGroupEcsServiceGetArgs> ecsService() {
        return this.ecsService == null ? Codegen.empty() : this.ecsService;
    }

    /**
     * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * 
     */
    @Import(name="loadBalancerInfo")
      private final @Nullable Output<DeploymentGroupLoadBalancerInfoGetArgs> loadBalancerInfo;

    public Output<DeploymentGroupLoadBalancerInfoGetArgs> loadBalancerInfo() {
        return this.loadBalancerInfo == null ? Codegen.empty() : this.loadBalancerInfo;
    }

    /**
     * On premise tag filters associated with the group. See the AWS docs for details.
     * 
     */
    @Import(name="onPremisesInstanceTagFilters")
      private final @Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>> onPremisesInstanceTagFilters;

    public Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>> onPremisesInstanceTagFilters() {
        return this.onPremisesInstanceTagFilters == null ? Codegen.empty() : this.onPremisesInstanceTagFilters;
    }

    /**
     * The service role ARN that allows deployments.
     * 
     */
    @Import(name="serviceRoleArn")
      private final @Nullable Output<String> serviceRoleArn;

    public Output<String> serviceRoleArn() {
        return this.serviceRoleArn == null ? Codegen.empty() : this.serviceRoleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Configuration block(s) of the triggers for the deployment group (documented below).
     * 
     */
    @Import(name="triggerConfigurations")
      private final @Nullable Output<List<DeploymentGroupTriggerConfigurationGetArgs>> triggerConfigurations;

    public Output<List<DeploymentGroupTriggerConfigurationGetArgs>> triggerConfigurations() {
        return this.triggerConfigurations == null ? Codegen.empty() : this.triggerConfigurations;
    }

    public DeploymentGroupState(
        @Nullable Output<DeploymentGroupAlarmConfigurationGetArgs> alarmConfiguration,
        @Nullable Output<String> appName,
        @Nullable Output<String> arn,
        @Nullable Output<DeploymentGroupAutoRollbackConfigurationGetArgs> autoRollbackConfiguration,
        @Nullable Output<List<String>> autoscalingGroups,
        @Nullable Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs> blueGreenDeploymentConfig,
        @Nullable Output<String> computePlatform,
        @Nullable Output<String> deploymentConfigName,
        @Nullable Output<String> deploymentGroupId,
        @Nullable Output<String> deploymentGroupName,
        @Nullable Output<DeploymentGroupDeploymentStyleGetArgs> deploymentStyle,
        @Nullable Output<List<DeploymentGroupEc2TagFilterGetArgs>> ec2TagFilters,
        @Nullable Output<List<DeploymentGroupEc2TagSetGetArgs>> ec2TagSets,
        @Nullable Output<DeploymentGroupEcsServiceGetArgs> ecsService,
        @Nullable Output<DeploymentGroupLoadBalancerInfoGetArgs> loadBalancerInfo,
        @Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>> onPremisesInstanceTagFilters,
        @Nullable Output<String> serviceRoleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<DeploymentGroupTriggerConfigurationGetArgs>> triggerConfigurations) {
        this.alarmConfiguration = alarmConfiguration;
        this.appName = appName;
        this.arn = arn;
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        this.autoscalingGroups = autoscalingGroups;
        this.blueGreenDeploymentConfig = blueGreenDeploymentConfig;
        this.computePlatform = computePlatform;
        this.deploymentConfigName = deploymentConfigName;
        this.deploymentGroupId = deploymentGroupId;
        this.deploymentGroupName = deploymentGroupName;
        this.deploymentStyle = deploymentStyle;
        this.ec2TagFilters = ec2TagFilters;
        this.ec2TagSets = ec2TagSets;
        this.ecsService = ecsService;
        this.loadBalancerInfo = loadBalancerInfo;
        this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
        this.serviceRoleArn = serviceRoleArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.triggerConfigurations = triggerConfigurations;
    }

    private DeploymentGroupState() {
        this.alarmConfiguration = Codegen.empty();
        this.appName = Codegen.empty();
        this.arn = Codegen.empty();
        this.autoRollbackConfiguration = Codegen.empty();
        this.autoscalingGroups = Codegen.empty();
        this.blueGreenDeploymentConfig = Codegen.empty();
        this.computePlatform = Codegen.empty();
        this.deploymentConfigName = Codegen.empty();
        this.deploymentGroupId = Codegen.empty();
        this.deploymentGroupName = Codegen.empty();
        this.deploymentStyle = Codegen.empty();
        this.ec2TagFilters = Codegen.empty();
        this.ec2TagSets = Codegen.empty();
        this.ecsService = Codegen.empty();
        this.loadBalancerInfo = Codegen.empty();
        this.onPremisesInstanceTagFilters = Codegen.empty();
        this.serviceRoleArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.triggerConfigurations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeploymentGroupAlarmConfigurationGetArgs> alarmConfiguration;
        private @Nullable Output<String> appName;
        private @Nullable Output<String> arn;
        private @Nullable Output<DeploymentGroupAutoRollbackConfigurationGetArgs> autoRollbackConfiguration;
        private @Nullable Output<List<String>> autoscalingGroups;
        private @Nullable Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs> blueGreenDeploymentConfig;
        private @Nullable Output<String> computePlatform;
        private @Nullable Output<String> deploymentConfigName;
        private @Nullable Output<String> deploymentGroupId;
        private @Nullable Output<String> deploymentGroupName;
        private @Nullable Output<DeploymentGroupDeploymentStyleGetArgs> deploymentStyle;
        private @Nullable Output<List<DeploymentGroupEc2TagFilterGetArgs>> ec2TagFilters;
        private @Nullable Output<List<DeploymentGroupEc2TagSetGetArgs>> ec2TagSets;
        private @Nullable Output<DeploymentGroupEcsServiceGetArgs> ecsService;
        private @Nullable Output<DeploymentGroupLoadBalancerInfoGetArgs> loadBalancerInfo;
        private @Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>> onPremisesInstanceTagFilters;
        private @Nullable Output<String> serviceRoleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<DeploymentGroupTriggerConfigurationGetArgs>> triggerConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmConfiguration = defaults.alarmConfiguration;
    	      this.appName = defaults.appName;
    	      this.arn = defaults.arn;
    	      this.autoRollbackConfiguration = defaults.autoRollbackConfiguration;
    	      this.autoscalingGroups = defaults.autoscalingGroups;
    	      this.blueGreenDeploymentConfig = defaults.blueGreenDeploymentConfig;
    	      this.computePlatform = defaults.computePlatform;
    	      this.deploymentConfigName = defaults.deploymentConfigName;
    	      this.deploymentGroupId = defaults.deploymentGroupId;
    	      this.deploymentGroupName = defaults.deploymentGroupName;
    	      this.deploymentStyle = defaults.deploymentStyle;
    	      this.ec2TagFilters = defaults.ec2TagFilters;
    	      this.ec2TagSets = defaults.ec2TagSets;
    	      this.ecsService = defaults.ecsService;
    	      this.loadBalancerInfo = defaults.loadBalancerInfo;
    	      this.onPremisesInstanceTagFilters = defaults.onPremisesInstanceTagFilters;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.triggerConfigurations = defaults.triggerConfigurations;
        }

        public Builder alarmConfiguration(@Nullable Output<DeploymentGroupAlarmConfigurationGetArgs> alarmConfiguration) {
            this.alarmConfiguration = alarmConfiguration;
            return this;
        }
        public Builder alarmConfiguration(@Nullable DeploymentGroupAlarmConfigurationGetArgs alarmConfiguration) {
            this.alarmConfiguration = Codegen.ofNullable(alarmConfiguration);
            return this;
        }
        public Builder appName(@Nullable Output<String> appName) {
            this.appName = appName;
            return this;
        }
        public Builder appName(@Nullable String appName) {
            this.appName = Codegen.ofNullable(appName);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder autoRollbackConfiguration(@Nullable Output<DeploymentGroupAutoRollbackConfigurationGetArgs> autoRollbackConfiguration) {
            this.autoRollbackConfiguration = autoRollbackConfiguration;
            return this;
        }
        public Builder autoRollbackConfiguration(@Nullable DeploymentGroupAutoRollbackConfigurationGetArgs autoRollbackConfiguration) {
            this.autoRollbackConfiguration = Codegen.ofNullable(autoRollbackConfiguration);
            return this;
        }
        public Builder autoscalingGroups(@Nullable Output<List<String>> autoscalingGroups) {
            this.autoscalingGroups = autoscalingGroups;
            return this;
        }
        public Builder autoscalingGroups(@Nullable List<String> autoscalingGroups) {
            this.autoscalingGroups = Codegen.ofNullable(autoscalingGroups);
            return this;
        }
        public Builder autoscalingGroups(String... autoscalingGroups) {
            return autoscalingGroups(List.of(autoscalingGroups));
        }
        public Builder blueGreenDeploymentConfig(@Nullable Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs> blueGreenDeploymentConfig) {
            this.blueGreenDeploymentConfig = blueGreenDeploymentConfig;
            return this;
        }
        public Builder blueGreenDeploymentConfig(@Nullable DeploymentGroupBlueGreenDeploymentConfigGetArgs blueGreenDeploymentConfig) {
            this.blueGreenDeploymentConfig = Codegen.ofNullable(blueGreenDeploymentConfig);
            return this;
        }
        public Builder computePlatform(@Nullable Output<String> computePlatform) {
            this.computePlatform = computePlatform;
            return this;
        }
        public Builder computePlatform(@Nullable String computePlatform) {
            this.computePlatform = Codegen.ofNullable(computePlatform);
            return this;
        }
        public Builder deploymentConfigName(@Nullable Output<String> deploymentConfigName) {
            this.deploymentConfigName = deploymentConfigName;
            return this;
        }
        public Builder deploymentConfigName(@Nullable String deploymentConfigName) {
            this.deploymentConfigName = Codegen.ofNullable(deploymentConfigName);
            return this;
        }
        public Builder deploymentGroupId(@Nullable Output<String> deploymentGroupId) {
            this.deploymentGroupId = deploymentGroupId;
            return this;
        }
        public Builder deploymentGroupId(@Nullable String deploymentGroupId) {
            this.deploymentGroupId = Codegen.ofNullable(deploymentGroupId);
            return this;
        }
        public Builder deploymentGroupName(@Nullable Output<String> deploymentGroupName) {
            this.deploymentGroupName = deploymentGroupName;
            return this;
        }
        public Builder deploymentGroupName(@Nullable String deploymentGroupName) {
            this.deploymentGroupName = Codegen.ofNullable(deploymentGroupName);
            return this;
        }
        public Builder deploymentStyle(@Nullable Output<DeploymentGroupDeploymentStyleGetArgs> deploymentStyle) {
            this.deploymentStyle = deploymentStyle;
            return this;
        }
        public Builder deploymentStyle(@Nullable DeploymentGroupDeploymentStyleGetArgs deploymentStyle) {
            this.deploymentStyle = Codegen.ofNullable(deploymentStyle);
            return this;
        }
        public Builder ec2TagFilters(@Nullable Output<List<DeploymentGroupEc2TagFilterGetArgs>> ec2TagFilters) {
            this.ec2TagFilters = ec2TagFilters;
            return this;
        }
        public Builder ec2TagFilters(@Nullable List<DeploymentGroupEc2TagFilterGetArgs> ec2TagFilters) {
            this.ec2TagFilters = Codegen.ofNullable(ec2TagFilters);
            return this;
        }
        public Builder ec2TagFilters(DeploymentGroupEc2TagFilterGetArgs... ec2TagFilters) {
            return ec2TagFilters(List.of(ec2TagFilters));
        }
        public Builder ec2TagSets(@Nullable Output<List<DeploymentGroupEc2TagSetGetArgs>> ec2TagSets) {
            this.ec2TagSets = ec2TagSets;
            return this;
        }
        public Builder ec2TagSets(@Nullable List<DeploymentGroupEc2TagSetGetArgs> ec2TagSets) {
            this.ec2TagSets = Codegen.ofNullable(ec2TagSets);
            return this;
        }
        public Builder ec2TagSets(DeploymentGroupEc2TagSetGetArgs... ec2TagSets) {
            return ec2TagSets(List.of(ec2TagSets));
        }
        public Builder ecsService(@Nullable Output<DeploymentGroupEcsServiceGetArgs> ecsService) {
            this.ecsService = ecsService;
            return this;
        }
        public Builder ecsService(@Nullable DeploymentGroupEcsServiceGetArgs ecsService) {
            this.ecsService = Codegen.ofNullable(ecsService);
            return this;
        }
        public Builder loadBalancerInfo(@Nullable Output<DeploymentGroupLoadBalancerInfoGetArgs> loadBalancerInfo) {
            this.loadBalancerInfo = loadBalancerInfo;
            return this;
        }
        public Builder loadBalancerInfo(@Nullable DeploymentGroupLoadBalancerInfoGetArgs loadBalancerInfo) {
            this.loadBalancerInfo = Codegen.ofNullable(loadBalancerInfo);
            return this;
        }
        public Builder onPremisesInstanceTagFilters(@Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>> onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
            return this;
        }
        public Builder onPremisesInstanceTagFilters(@Nullable List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs> onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters = Codegen.ofNullable(onPremisesInstanceTagFilters);
            return this;
        }
        public Builder onPremisesInstanceTagFilters(DeploymentGroupOnPremisesInstanceTagFilterGetArgs... onPremisesInstanceTagFilters) {
            return onPremisesInstanceTagFilters(List.of(onPremisesInstanceTagFilters));
        }
        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }
        public Builder serviceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Codegen.ofNullable(serviceRoleArn);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder triggerConfigurations(@Nullable Output<List<DeploymentGroupTriggerConfigurationGetArgs>> triggerConfigurations) {
            this.triggerConfigurations = triggerConfigurations;
            return this;
        }
        public Builder triggerConfigurations(@Nullable List<DeploymentGroupTriggerConfigurationGetArgs> triggerConfigurations) {
            this.triggerConfigurations = Codegen.ofNullable(triggerConfigurations);
            return this;
        }
        public Builder triggerConfigurations(DeploymentGroupTriggerConfigurationGetArgs... triggerConfigurations) {
            return triggerConfigurations(List.of(triggerConfigurations));
        }        public DeploymentGroupState build() {
            return new DeploymentGroupState(alarmConfiguration, appName, arn, autoRollbackConfiguration, autoscalingGroups, blueGreenDeploymentConfig, computePlatform, deploymentConfigName, deploymentGroupId, deploymentGroupName, deploymentStyle, ec2TagFilters, ec2TagSets, ecsService, loadBalancerInfo, onPremisesInstanceTagFilters, serviceRoleArn, tags, tagsAll, triggerConfigurations);
        }
    }
}
