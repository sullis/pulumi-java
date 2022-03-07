// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGameServerDeploymentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGameServerDeploymentArgs Empty = new GetGameServerDeploymentArgs();

    @InputImport(name="gameServerDeploymentId", required=true)
      private final String gameServerDeploymentId;

    public String getGameServerDeploymentId() {
        return this.gameServerDeploymentId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetGameServerDeploymentArgs(
        String gameServerDeploymentId,
        String location,
        @Nullable String project) {
        this.gameServerDeploymentId = Objects.requireNonNull(gameServerDeploymentId, "expected parameter 'gameServerDeploymentId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetGameServerDeploymentArgs() {
        this.gameServerDeploymentId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGameServerDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gameServerDeploymentId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGameServerDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gameServerDeploymentId = defaults.gameServerDeploymentId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setGameServerDeploymentId(String gameServerDeploymentId) {
            this.gameServerDeploymentId = Objects.requireNonNull(gameServerDeploymentId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetGameServerDeploymentArgs build() {
            return new GetGameServerDeploymentArgs(gameServerDeploymentId, location, project);
        }
    }
}