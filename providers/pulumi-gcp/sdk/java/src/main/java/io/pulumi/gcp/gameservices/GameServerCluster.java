// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gameservices.GameServerClusterArgs;
import io.pulumi.gcp.gameservices.inputs.GameServerClusterState;
import io.pulumi.gcp.gameservices.outputs.GameServerClusterConnectionInfo;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A game server cluster resource.
 * 
 * To get more information about GameServerCluster, see:
 * 
 * * [API documentation](https://cloud.google.com/game-servers/docs/reference/rest/v1beta/projects.locations.realms.gameServerClusters)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/game-servers/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GameServerCluster can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerCluster:GameServerCluster default projects/{{project}}/locations/{{location}}/realms/{{realm_id}}/gameServerClusters/{{cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerCluster:GameServerCluster default {{project}}/{{location}}/{{realm_id}}/{{cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerCluster:GameServerCluster default {{location}}/{{realm_id}}/{{cluster_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gameservices/gameServerCluster:GameServerCluster")
public class GameServerCluster extends io.pulumi.resources.CustomResource {
    /**
     * Required. The resource name of the game server cluster
     * 
     */
    @OutputExport(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return Required. The resource name of the game server cluster
     * 
     */
    public Output<String> getClusterId() {
        return this.clusterId;
    }
    /**
     * Game server cluster connection information. This information is used to
     * manage game server clusters.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="connectionInfo", type=GameServerClusterConnectionInfo.class, parameters={})
    private Output<GameServerClusterConnectionInfo> connectionInfo;

    /**
     * @return Game server cluster connection information. This information is used to
     * manage game server clusters.
     * Structure is documented below.
     * 
     */
    public Output<GameServerClusterConnectionInfo> getConnectionInfo() {
        return this.connectionInfo;
    }
    /**
     * Human readable description of the cluster.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Human readable description of the cluster.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The labels associated with this game server cluster. Each label is a
     * key-value pair.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels associated with this game server cluster. Each label is a
     * key-value pair.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Location of the Cluster.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the Cluster.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The resource id of the game server cluster, eg:
     * 'projects/{project_id}/locations/{location}/realms/{realm_id}/gameServerClusters/{cluster_id}'. For example,
     * 'projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster'.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource id of the game server cluster, eg:
     * 'projects/{project_id}/locations/{location}/realms/{realm_id}/gameServerClusters/{cluster_id}'. For example,
     * 'projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster'.
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
     * The realm id of the game server realm.
     * 
     */
    @OutputExport(name="realmId", type=String.class, parameters={})
    private Output<String> realmId;

    /**
     * @return The realm id of the game server realm.
     * 
     */
    public Output<String> getRealmId() {
        return this.realmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameServerCluster(String name, GameServerClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerCluster:GameServerCluster", name, args == null ? GameServerClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GameServerCluster(String name, Input<String> id, @Nullable GameServerClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerCluster:GameServerCluster", name, state, makeResourceOptions(options, id));
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
    public static GameServerCluster get(String name, Input<String> id, @Nullable GameServerClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GameServerCluster(name, id, state, options);
    }
}
