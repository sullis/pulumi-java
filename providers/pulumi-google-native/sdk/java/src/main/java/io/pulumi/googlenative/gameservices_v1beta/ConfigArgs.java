// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.gameservices_v1beta.inputs.FleetConfigArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.ScalingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigArgs Empty = new ConfigArgs();

    @Import(name="configId", required=true)
      private final Output<String> configId;

    public Output<String> getConfigId() {
        return this.configId;
    }

    /**
     * The description of the game server config.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    @Import(name="fleetConfigs")
      private final @Nullable Output<List<FleetConfigArgs>> fleetConfigs;

    public Output<List<FleetConfigArgs>> getFleetConfigs() {
        return this.fleetConfigs == null ? Output.empty() : this.fleetConfigs;
    }

    @Import(name="gameServerDeploymentId", required=true)
      private final Output<String> gameServerDeploymentId;

    public Output<String> getGameServerDeploymentId() {
        return this.gameServerDeploymentId;
    }

    /**
     * The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The autoscaling settings.
     * 
     */
    @Import(name="scalingConfigs")
      private final @Nullable Output<List<ScalingConfigArgs>> scalingConfigs;

    public Output<List<ScalingConfigArgs>> getScalingConfigs() {
        return this.scalingConfigs == null ? Output.empty() : this.scalingConfigs;
    }

    public ConfigArgs(
        Output<String> configId,
        @Nullable Output<String> description,
        @Nullable Output<List<FleetConfigArgs>> fleetConfigs,
        Output<String> gameServerDeploymentId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<ScalingConfigArgs>> scalingConfigs) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.description = description;
        this.fleetConfigs = fleetConfigs;
        this.gameServerDeploymentId = Objects.requireNonNull(gameServerDeploymentId, "expected parameter 'gameServerDeploymentId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.scalingConfigs = scalingConfigs;
    }

    private ConfigArgs() {
        this.configId = Output.empty();
        this.description = Output.empty();
        this.fleetConfigs = Output.empty();
        this.gameServerDeploymentId = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.scalingConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configId;
        private @Nullable Output<String> description;
        private @Nullable Output<List<FleetConfigArgs>> fleetConfigs;
        private Output<String> gameServerDeploymentId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<ScalingConfigArgs>> scalingConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.description = defaults.description;
    	      this.fleetConfigs = defaults.fleetConfigs;
    	      this.gameServerDeploymentId = defaults.gameServerDeploymentId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.scalingConfigs = defaults.scalingConfigs;
        }

        public Builder configId(Output<String> configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }
        public Builder configId(String configId) {
            this.configId = Output.of(Objects.requireNonNull(configId));
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
        public Builder fleetConfigs(@Nullable Output<List<FleetConfigArgs>> fleetConfigs) {
            this.fleetConfigs = fleetConfigs;
            return this;
        }
        public Builder fleetConfigs(@Nullable List<FleetConfigArgs> fleetConfigs) {
            this.fleetConfigs = Output.ofNullable(fleetConfigs);
            return this;
        }
        public Builder fleetConfigs(FleetConfigArgs... fleetConfigs) {
            return fleetConfigs(List.of(fleetConfigs));
        }
        public Builder gameServerDeploymentId(Output<String> gameServerDeploymentId) {
            this.gameServerDeploymentId = Objects.requireNonNull(gameServerDeploymentId);
            return this;
        }
        public Builder gameServerDeploymentId(String gameServerDeploymentId) {
            this.gameServerDeploymentId = Output.of(Objects.requireNonNull(gameServerDeploymentId));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder scalingConfigs(@Nullable Output<List<ScalingConfigArgs>> scalingConfigs) {
            this.scalingConfigs = scalingConfigs;
            return this;
        }
        public Builder scalingConfigs(@Nullable List<ScalingConfigArgs> scalingConfigs) {
            this.scalingConfigs = Output.ofNullable(scalingConfigs);
            return this;
        }
        public Builder scalingConfigs(ScalingConfigArgs... scalingConfigs) {
            return scalingConfigs(List.of(scalingConfigs));
        }        public ConfigArgs build() {
            return new ConfigArgs(configId, description, fleetConfigs, gameServerDeploymentId, labels, location, name, project, scalingConfigs);
        }
    }
}
