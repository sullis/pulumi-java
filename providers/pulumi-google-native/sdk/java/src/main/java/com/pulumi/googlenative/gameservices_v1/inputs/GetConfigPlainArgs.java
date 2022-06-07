// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigPlainArgs Empty = new GetConfigPlainArgs();

    @Import(name="configId", required=true)
    private String configId;

    public String configId() {
        return this.configId;
    }

    @Import(name="gameServerDeploymentId", required=true)
    private String gameServerDeploymentId;

    public String gameServerDeploymentId() {
        return this.gameServerDeploymentId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetConfigPlainArgs() {}

    private GetConfigPlainArgs(GetConfigPlainArgs $) {
        this.configId = $.configId;
        this.gameServerDeploymentId = $.gameServerDeploymentId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigPlainArgs $;

        public Builder() {
            $ = new GetConfigPlainArgs();
        }

        public Builder(GetConfigPlainArgs defaults) {
            $ = new GetConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(String configId) {
            $.configId = configId;
            return this;
        }

        public Builder gameServerDeploymentId(String gameServerDeploymentId) {
            $.gameServerDeploymentId = gameServerDeploymentId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetConfigPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.gameServerDeploymentId = Objects.requireNonNull($.gameServerDeploymentId, "expected parameter 'gameServerDeploymentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
