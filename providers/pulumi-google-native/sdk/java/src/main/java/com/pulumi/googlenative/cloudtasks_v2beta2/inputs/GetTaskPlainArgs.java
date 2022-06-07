// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaskPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaskPlainArgs Empty = new GetTaskPlainArgs();

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

    @Import(name="queueId", required=true)
    private String queueId;

    public String queueId() {
        return this.queueId;
    }

    @Import(name="responseView")
    private @Nullable String responseView;

    public Optional<String> responseView() {
        return Optional.ofNullable(this.responseView);
    }

    @Import(name="taskId", required=true)
    private String taskId;

    public String taskId() {
        return this.taskId;
    }

    private GetTaskPlainArgs() {}

    private GetTaskPlainArgs(GetTaskPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.queueId = $.queueId;
        this.responseView = $.responseView;
        this.taskId = $.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskPlainArgs $;

        public Builder() {
            $ = new GetTaskPlainArgs();
        }

        public Builder(GetTaskPlainArgs defaults) {
            $ = new GetTaskPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder queueId(String queueId) {
            $.queueId = queueId;
            return this;
        }

        public Builder responseView(@Nullable String responseView) {
            $.responseView = responseView;
            return this;
        }

        public Builder taskId(String taskId) {
            $.taskId = taskId;
            return this;
        }

        public GetTaskPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.queueId = Objects.requireNonNull($.queueId, "expected parameter 'queueId' to be non-null");
            $.taskId = Objects.requireNonNull($.taskId, "expected parameter 'taskId' to be non-null");
            return $;
        }
    }

}
