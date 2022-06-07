// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobPlainArgs Empty = new GetJobPlainArgs();

    @Import(name="jobId", required=true)
    private String jobId;

    public String jobId() {
        return this.jobId;
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

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetJobPlainArgs() {}

    private GetJobPlainArgs(GetJobPlainArgs $) {
        this.jobId = $.jobId;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobPlainArgs $;

        public Builder() {
            $ = new GetJobPlainArgs();
        }

        public Builder(GetJobPlainArgs defaults) {
            $ = new GetJobPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobId(String jobId) {
            $.jobId = jobId;
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

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetJobPlainArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
