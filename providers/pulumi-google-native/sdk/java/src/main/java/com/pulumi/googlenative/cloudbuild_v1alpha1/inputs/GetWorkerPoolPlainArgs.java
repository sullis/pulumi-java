// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkerPoolPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkerPoolPlainArgs Empty = new GetWorkerPoolPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="workerPoolId", required=true)
    private String workerPoolId;

    public String workerPoolId() {
        return this.workerPoolId;
    }

    private GetWorkerPoolPlainArgs() {}

    private GetWorkerPoolPlainArgs(GetWorkerPoolPlainArgs $) {
        this.project = $.project;
        this.workerPoolId = $.workerPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkerPoolPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkerPoolPlainArgs $;

        public Builder() {
            $ = new GetWorkerPoolPlainArgs();
        }

        public Builder(GetWorkerPoolPlainArgs defaults) {
            $ = new GetWorkerPoolPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder workerPoolId(String workerPoolId) {
            $.workerPoolId = workerPoolId;
            return this;
        }

        public GetWorkerPoolPlainArgs build() {
            $.workerPoolId = Objects.requireNonNull($.workerPoolId, "expected parameter 'workerPoolId' to be non-null");
            return $;
        }
    }

}
