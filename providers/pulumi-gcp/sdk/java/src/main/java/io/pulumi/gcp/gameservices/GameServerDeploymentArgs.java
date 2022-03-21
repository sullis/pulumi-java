// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentArgs Empty = new GameServerDeploymentArgs();

    /**
     * A unique id for the deployment.
     * 
     */
    @Import(name="deploymentId", required=true)
      private final Output<String> deploymentId;

    public Output<String> getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Human readable description of the game server deployment.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The labels associated with this game server deployment. Each label is a
     * key-value pair.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Location of the Deployment.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
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

    public GameServerDeploymentArgs(
        Output<String> deploymentId,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> project) {
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.project = project;
    }

    private GameServerDeploymentArgs() {
        this.deploymentId = Output.empty();
        this.description = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deploymentId;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder deploymentId(Output<String> deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Output.of(Objects.requireNonNull(deploymentId));
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public GameServerDeploymentArgs build() {
            return new GameServerDeploymentArgs(deploymentId, description, labels, location, project);
        }
    }
}
