// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueueIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueueIamPolicyArgs Empty = new GetQueueIamPolicyArgs();

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

    @Import(name="queueId", required=true)
    private Output<String> queueId;

    public Output<String> queueId() {
        return this.queueId;
    }

    private GetQueueIamPolicyArgs() {}

    private GetQueueIamPolicyArgs(GetQueueIamPolicyArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.queueId = $.queueId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueueIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueueIamPolicyArgs $;

        public Builder() {
            $ = new GetQueueIamPolicyArgs();
        }

        public Builder(GetQueueIamPolicyArgs defaults) {
            $ = new GetQueueIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder queueId(Output<String> queueId) {
            $.queueId = queueId;
            return this;
        }

        public Builder queueId(String queueId) {
            return queueId(Output.of(queueId));
        }

        public GetQueueIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.queueId = Objects.requireNonNull($.queueId, "expected parameter 'queueId' to be non-null");
            return $;
        }
    }

}
