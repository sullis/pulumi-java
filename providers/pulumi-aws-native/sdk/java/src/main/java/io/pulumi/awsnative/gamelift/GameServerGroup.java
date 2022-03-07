// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.gamelift.GameServerGroupArgs;
import io.pulumi.awsnative.gamelift.enums.GameServerGroupBalancingStrategy;
import io.pulumi.awsnative.gamelift.enums.GameServerGroupDeleteOption;
import io.pulumi.awsnative.gamelift.enums.GameServerGroupGameServerProtectionPolicy;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupAutoScalingPolicy;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupInstanceDefinition;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupLaunchTemplate;
import io.pulumi.awsnative.gamelift.outputs.GameServerGroupTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::GameLift::GameServerGroup resource creates an Amazon GameLift (GameLift) GameServerGroup.
 * 
 */
@ResourceType(type="aws-native:gamelift:GameServerGroup")
public class GameServerGroup extends io.pulumi.resources.CustomResource {
    /**
     * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * 
     */
    @OutputExport(name="autoScalingGroupArn", type=String.class, parameters={})
    private Output<String> autoScalingGroupArn;

    /**
     * @return A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * 
     */
    public Output<String> getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }
    /**
     * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting
     * 
     */
    @OutputExport(name="autoScalingPolicy", type=GameServerGroupAutoScalingPolicy.class, parameters={})
    private Output</* @Nullable */ GameServerGroupAutoScalingPolicy> autoScalingPolicy;

    /**
     * @return Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting
     * 
     */
    public Output</* @Nullable */ GameServerGroupAutoScalingPolicy> getAutoScalingPolicy() {
        return this.autoScalingPolicy;
    }
    /**
     * The fallback balancing method to use for the game server group when Spot Instances in a Region become unavailable or are not viable for game hosting.
     * 
     */
    @OutputExport(name="balancingStrategy", type=GameServerGroupBalancingStrategy.class, parameters={})
    private Output</* @Nullable */ GameServerGroupBalancingStrategy> balancingStrategy;

    /**
     * @return The fallback balancing method to use for the game server group when Spot Instances in a Region become unavailable or are not viable for game hosting.
     * 
     */
    public Output</* @Nullable */ GameServerGroupBalancingStrategy> getBalancingStrategy() {
        return this.balancingStrategy;
    }
    /**
     * The type of delete to perform.
     * 
     */
    @OutputExport(name="deleteOption", type=GameServerGroupDeleteOption.class, parameters={})
    private Output</* @Nullable */ GameServerGroupDeleteOption> deleteOption;

    /**
     * @return The type of delete to perform.
     * 
     */
    public Output</* @Nullable */ GameServerGroupDeleteOption> getDeleteOption() {
        return this.deleteOption;
    }
    /**
     * A generated unique ID for the game server group.
     * 
     */
    @OutputExport(name="gameServerGroupArn", type=String.class, parameters={})
    private Output<String> gameServerGroupArn;

    /**
     * @return A generated unique ID for the game server group.
     * 
     */
    public Output<String> getGameServerGroupArn() {
        return this.gameServerGroupArn;
    }
    /**
     * An identifier for the new game server group.
     * 
     */
    @OutputExport(name="gameServerGroupName", type=String.class, parameters={})
    private Output<String> gameServerGroupName;

    /**
     * @return An identifier for the new game server group.
     * 
     */
    public Output<String> getGameServerGroupName() {
        return this.gameServerGroupName;
    }
    /**
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * 
     */
    @OutputExport(name="gameServerProtectionPolicy", type=GameServerGroupGameServerProtectionPolicy.class, parameters={})
    private Output</* @Nullable */ GameServerGroupGameServerProtectionPolicy> gameServerProtectionPolicy;

    /**
     * @return A flag that indicates whether instances in the game server group are protected from early termination.
     * 
     */
    public Output</* @Nullable */ GameServerGroupGameServerProtectionPolicy> getGameServerProtectionPolicy() {
        return this.gameServerProtectionPolicy;
    }
    /**
     * A set of EC2 instance types to use when creating instances in the group.
     * 
     */
    @OutputExport(name="instanceDefinitions", type=List.class, parameters={GameServerGroupInstanceDefinition.class})
    private Output<List<GameServerGroupInstanceDefinition>> instanceDefinitions;

    /**
     * @return A set of EC2 instance types to use when creating instances in the group.
     * 
     */
    public Output<List<GameServerGroupInstanceDefinition>> getInstanceDefinitions() {
        return this.instanceDefinitions;
    }
    /**
     * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group.
     * 
     */
    @OutputExport(name="launchTemplate", type=GameServerGroupLaunchTemplate.class, parameters={})
    private Output<GameServerGroupLaunchTemplate> launchTemplate;

    /**
     * @return The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group.
     * 
     */
    public Output<GameServerGroupLaunchTemplate> getLaunchTemplate() {
        return this.launchTemplate;
    }
    /**
     * The maximum number of instances allowed in the EC2 Auto Scaling group.
     * 
     */
    @OutputExport(name="maxSize", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxSize;

    /**
     * @return The maximum number of instances allowed in the EC2 Auto Scaling group.
     * 
     */
    public Output</* @Nullable */ Double> getMaxSize() {
        return this.maxSize;
    }
    /**
     * The minimum number of instances allowed in the EC2 Auto Scaling group.
     * 
     */
    @OutputExport(name="minSize", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minSize;

    /**
     * @return The minimum number of instances allowed in the EC2 Auto Scaling group.
     * 
     */
    public Output</* @Nullable */ Double> getMinSize() {
        return this.minSize;
    }
    /**
     * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * A list of labels to assign to the new game server group resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={GameServerGroupTag.class})
    private Output</* @Nullable */ List<GameServerGroupTag>> tags;

    /**
     * @return A list of labels to assign to the new game server group resource.
     * 
     */
    public Output</* @Nullable */ List<GameServerGroupTag>> getTags() {
        return this.tags;
    }
    /**
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
     * 
     */
    @OutputExport(name="vpcSubnets", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vpcSubnets;

    /**
     * @return A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
     * 
     */
    public Output</* @Nullable */ List<String>> getVpcSubnets() {
        return this.vpcSubnets;
    }

    public interface BuilderApplicator {
        public void apply(GameServerGroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.gamelift.GameServerGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.gamelift.GameServerGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GameServerGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GameServerGroup(String name) {
        this(name, GameServerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GameServerGroup(String name, GameServerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameServerGroup(String name, GameServerGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:gamelift:GameServerGroup", name, args == null ? GameServerGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GameServerGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:gamelift:GameServerGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GameServerGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GameServerGroup(name, id, options);
    }
}