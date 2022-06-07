// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotArgs Empty = new GetSnapshotArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="snapshot", required=true)
    private Output<String> snapshot;

    public Output<String> snapshot() {
        return this.snapshot;
    }

    private GetSnapshotArgs() {}

    private GetSnapshotArgs(GetSnapshotArgs $) {
        this.project = $.project;
        this.snapshot = $.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotArgs $;

        public Builder() {
            $ = new GetSnapshotArgs();
        }

        public Builder(GetSnapshotArgs defaults) {
            $ = new GetSnapshotArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder snapshot(Output<String> snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        public Builder snapshot(String snapshot) {
            return snapshot(Output.of(snapshot));
        }

        public GetSnapshotArgs build() {
            $.snapshot = Objects.requireNonNull($.snapshot, "expected parameter 'snapshot' to be non-null");
            return $;
        }
    }

}
