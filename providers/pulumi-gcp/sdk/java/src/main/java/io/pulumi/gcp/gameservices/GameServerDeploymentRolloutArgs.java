// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.gameservices.inputs.GameServerDeploymentRolloutGameServerConfigOverrideArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerDeploymentRolloutArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentRolloutArgs Empty = new GameServerDeploymentRolloutArgs();

    /**
     * This field points to the game server config that is
     * applied by default to all realms and clusters. For example,
     * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @Import(name="defaultGameServerConfig", required=true)
      private final Output<String> defaultGameServerConfig;

    public Output<String> getDefaultGameServerConfig() {
        return this.defaultGameServerConfig;
    }

    /**
     * The deployment to rollout the new config to. Only 1 rollout must be associated with each deployment.
     * 
     */
    @Import(name="deploymentId", required=true)
      private final Output<String> deploymentId;

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
    @Import(name="gameServerConfigOverrides")
      private final @Nullable Output<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides;

    public Output<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> getGameServerConfigOverrides() {
        return this.gameServerConfigOverrides == null ? Output.empty() : this.gameServerConfigOverrides;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public GameServerDeploymentRolloutArgs(
        Output<String> defaultGameServerConfig,
        Output<String> deploymentId,
        @Nullable Output<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides,
        @Nullable Output<String> project) {
        this.defaultGameServerConfig = Objects.requireNonNull(defaultGameServerConfig, "expected parameter 'defaultGameServerConfig' to be non-null");
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
        this.gameServerConfigOverrides = gameServerConfigOverrides;
        this.project = project;
    }

    private GameServerDeploymentRolloutArgs() {
        this.defaultGameServerConfig = Output.empty();
        this.deploymentId = Output.empty();
        this.gameServerConfigOverrides = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> defaultGameServerConfig;
        private Output<String> deploymentId;
        private @Nullable Output<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultGameServerConfig = defaults.defaultGameServerConfig;
    	      this.deploymentId = defaults.deploymentId;
    	      this.gameServerConfigOverrides = defaults.gameServerConfigOverrides;
    	      this.project = defaults.project;
        }

        public Builder defaultGameServerConfig(Output<String> defaultGameServerConfig) {
            this.defaultGameServerConfig = Objects.requireNonNull(defaultGameServerConfig);
            return this;
        }
        public Builder defaultGameServerConfig(String defaultGameServerConfig) {
            this.defaultGameServerConfig = Output.of(Objects.requireNonNull(defaultGameServerConfig));
            return this;
        }
        public Builder deploymentId(Output<String> deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Output.of(Objects.requireNonNull(deploymentId));
            return this;
        }
        public Builder gameServerConfigOverrides(@Nullable Output<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides) {
            this.gameServerConfigOverrides = gameServerConfigOverrides;
            return this;
        }
        public Builder gameServerConfigOverrides(@Nullable List<GameServerDeploymentRolloutGameServerConfigOverrideArgs> gameServerConfigOverrides) {
            this.gameServerConfigOverrides = Output.ofNullable(gameServerConfigOverrides);
            return this;
        }
        public Builder gameServerConfigOverrides(GameServerDeploymentRolloutGameServerConfigOverrideArgs... gameServerConfigOverrides) {
            return gameServerConfigOverrides(List.of(gameServerConfigOverrides));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public GameServerDeploymentRolloutArgs build() {
            return new GameServerDeploymentRolloutArgs(defaultGameServerConfig, deploymentId, gameServerConfigOverrides, project);
        }
    }
}
