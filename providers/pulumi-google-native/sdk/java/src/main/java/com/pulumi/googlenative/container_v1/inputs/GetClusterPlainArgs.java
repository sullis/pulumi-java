// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterPlainArgs Empty = new GetClusterPlainArgs();

    @Import(name="clusterId", required=true)
    private String clusterId;

    public String clusterId() {
        return this.clusterId;
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

    @Import(name="projectId")
    private @Nullable String projectId;

    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    @Import(name="zone")
    private @Nullable String zone;

    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetClusterPlainArgs() {}

    private GetClusterPlainArgs(GetClusterPlainArgs $) {
        this.clusterId = $.clusterId;
        this.location = $.location;
        this.project = $.project;
        this.projectId = $.projectId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterPlainArgs $;

        public Builder() {
            $ = new GetClusterPlainArgs();
        }

        public Builder(GetClusterPlainArgs defaults) {
            $ = new GetClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
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

        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetClusterPlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
