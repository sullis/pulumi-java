// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v2alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeArgs Empty = new GetNodeArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="nodeId", required=true)
    private Output<String> nodeId;

    public Output<String> nodeId() {
        return this.nodeId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNodeArgs() {}

    private GetNodeArgs(GetNodeArgs $) {
        this.location = $.location;
        this.nodeId = $.nodeId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeArgs $;

        public Builder() {
            $ = new GetNodeArgs();
        }

        public Builder(GetNodeArgs defaults) {
            $ = new GetNodeArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder nodeId(Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetNodeArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.nodeId = Objects.requireNonNull($.nodeId, "expected parameter 'nodeId' to be non-null");
            return $;
        }
    }

}
