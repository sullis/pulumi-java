// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGameServerDeploymentIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGameServerDeploymentIamPolicyPlainArgs Empty = new GetGameServerDeploymentIamPolicyPlainArgs();

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

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetGameServerDeploymentIamPolicyPlainArgs() {}

    private GetGameServerDeploymentIamPolicyPlainArgs(GetGameServerDeploymentIamPolicyPlainArgs $) {
        this.gameServerDeploymentId = $.gameServerDeploymentId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGameServerDeploymentIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGameServerDeploymentIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetGameServerDeploymentIamPolicyPlainArgs();
        }

        public Builder(GetGameServerDeploymentIamPolicyPlainArgs defaults) {
            $ = new GetGameServerDeploymentIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder gameServerDeploymentId(String gameServerDeploymentId) {
            $.gameServerDeploymentId = gameServerDeploymentId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetGameServerDeploymentIamPolicyPlainArgs build() {
            $.gameServerDeploymentId = Objects.requireNonNull($.gameServerDeploymentId, "expected parameter 'gameServerDeploymentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
