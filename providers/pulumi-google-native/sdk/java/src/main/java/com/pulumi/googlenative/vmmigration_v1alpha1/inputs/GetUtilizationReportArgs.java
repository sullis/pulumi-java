// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUtilizationReportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUtilizationReportArgs Empty = new GetUtilizationReportArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    @Import(name="utilizationReportId", required=true)
    private Output<String> utilizationReportId;

    public Output<String> utilizationReportId() {
        return this.utilizationReportId;
    }

    @Import(name="view")
    private @Nullable Output<String> view;

    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    private GetUtilizationReportArgs() {}

    private GetUtilizationReportArgs(GetUtilizationReportArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.sourceId = $.sourceId;
        this.utilizationReportId = $.utilizationReportId;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUtilizationReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUtilizationReportArgs $;

        public Builder() {
            $ = new GetUtilizationReportArgs();
        }

        public Builder(GetUtilizationReportArgs defaults) {
            $ = new GetUtilizationReportArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public Builder utilizationReportId(Output<String> utilizationReportId) {
            $.utilizationReportId = utilizationReportId;
            return this;
        }

        public Builder utilizationReportId(String utilizationReportId) {
            return utilizationReportId(Output.of(utilizationReportId));
        }

        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        public Builder view(String view) {
            return view(Output.of(view));
        }

        public GetUtilizationReportArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            $.utilizationReportId = Objects.requireNonNull($.utilizationReportId, "expected parameter 'utilizationReportId' to be non-null");
            return $;
        }
    }

}
