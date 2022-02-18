// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gameservices.GameServerDeploymentRolloutArgs;
import io.pulumi.gcp.gameservices.inputs.GameServerDeploymentRolloutState;
import io.pulumi.gcp.gameservices.outputs.GameServerDeploymentRolloutGameServerConfigOverride;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This represents the rollout state. This is part of the game server
 * deployment.
 * 
 * To get more information about GameServerDeploymentRollout, see:
 * 
 * * [API documentation](https://cloud.google.com/game-servers/docs/reference/rest/v1beta/GameServerDeploymentRollout)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/game-servers/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GameServerDeploymentRollout can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerDeploymentRollout:GameServerDeploymentRollout default projects/{{project}}/locations/global/gameServerDeployments/{{deployment_id}}/rollout
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerDeploymentRollout:GameServerDeploymentRollout default {{project}}/{{deployment_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerDeploymentRollout:GameServerDeploymentRollout default {{deployment_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gameservices/gameServerDeploymentRollout:GameServerDeploymentRollout")
public class GameServerDeploymentRollout extends io.pulumi.resources.CustomResource {
    /**
     * This field points to the game server config that is
     * applied by default to all realms and clusters. For example,
     * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @OutputExport(name="defaultGameServerConfig", type=String.class, parameters={})
    private Output<String> defaultGameServerConfig;

    /**
     * @return This field points to the game server config that is
     * applied by default to all realms and clusters. For example,
     * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    public Output<String> getDefaultGameServerConfig() {
        return this.defaultGameServerConfig;
    }
    /**
     * The deployment to rollout the new config to. Only 1 rollout must be associated with each deployment.
     * 
     */
    @OutputExport(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    /**
     * @return The deployment to rollout the new config to. Only 1 rollout must be associated with each deployment.
     * 
     */
    public Output<String> getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * The game_server_config_overrides contains the per game server config
     * overrides. The overrides are processed in the order they are listed. As
     * soon as a match is found for a cluster, the rest of the list is not
     * processed.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="gameServerConfigOverrides", type=List.class, parameters={GameServerDeploymentRolloutGameServerConfigOverride.class})
    private Output</* @Nullable */ List<GameServerDeploymentRolloutGameServerConfigOverride>> gameServerConfigOverrides;

    /**
     * @return The game_server_config_overrides contains the per game server config
     * overrides. The overrides are processed in the order they are listed. As
     * soon as a match is found for a cluster, the rest of the list is not
     * processed.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<GameServerDeploymentRolloutGameServerConfigOverride>> getGameServerConfigOverrides() {
        return this.gameServerConfigOverrides;
    }
    /**
     * The resource id of the game server deployment eg:
     * 'projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout'.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource id of the game server deployment eg:
     * 'projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout'.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameServerDeploymentRollout(String name, GameServerDeploymentRolloutArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerDeploymentRollout:GameServerDeploymentRollout", name, args == null ? GameServerDeploymentRolloutArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GameServerDeploymentRollout(String name, Input<String> id, @Nullable GameServerDeploymentRolloutState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerDeploymentRollout:GameServerDeploymentRollout", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GameServerDeploymentRollout get(String name, Input<String> id, @Nullable GameServerDeploymentRolloutState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GameServerDeploymentRollout(name, id, state, options);
    }
}
