// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReleaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReleaseArgs Empty = new GetReleaseArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="releaseId", required=true)
    private Output<String> releaseId;

    public Output<String> releaseId() {
        return this.releaseId;
    }

    private GetReleaseArgs() {}

    private GetReleaseArgs(GetReleaseArgs $) {
        this.project = $.project;
        this.releaseId = $.releaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReleaseArgs $;

        public Builder() {
            $ = new GetReleaseArgs();
        }

        public Builder(GetReleaseArgs defaults) {
            $ = new GetReleaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder releaseId(Output<String> releaseId) {
            $.releaseId = releaseId;
            return this;
        }

        public Builder releaseId(String releaseId) {
            return releaseId(Output.of(releaseId));
        }

        public GetReleaseArgs build() {
            $.releaseId = Objects.requireNonNull($.releaseId, "expected parameter 'releaseId' to be non-null");
            return $;
        }
    }

}
