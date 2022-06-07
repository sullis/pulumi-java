// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScheduleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduleArgs Empty = new GetScheduleArgs();

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

    @Import(name="scheduleId", required=true)
    private Output<String> scheduleId;

    public Output<String> scheduleId() {
        return this.scheduleId;
    }

    private GetScheduleArgs() {}

    private GetScheduleArgs(GetScheduleArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.scheduleId = $.scheduleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduleArgs $;

        public Builder() {
            $ = new GetScheduleArgs();
        }

        public Builder(GetScheduleArgs defaults) {
            $ = new GetScheduleArgs(Objects.requireNonNull(defaults));
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

        public Builder scheduleId(Output<String> scheduleId) {
            $.scheduleId = scheduleId;
            return this;
        }

        public Builder scheduleId(String scheduleId) {
            return scheduleId(Output.of(scheduleId));
        }

        public GetScheduleArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.scheduleId = Objects.requireNonNull($.scheduleId, "expected parameter 'scheduleId' to be non-null");
            return $;
        }
    }

}
