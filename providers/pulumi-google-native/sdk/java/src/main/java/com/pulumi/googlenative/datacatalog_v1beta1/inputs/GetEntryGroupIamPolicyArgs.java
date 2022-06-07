// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntryGroupIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEntryGroupIamPolicyArgs Empty = new GetEntryGroupIamPolicyArgs();

    @Import(name="entryGroupId", required=true)
    private Output<String> entryGroupId;

    public Output<String> entryGroupId() {
        return this.entryGroupId;
    }

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

    private GetEntryGroupIamPolicyArgs() {}

    private GetEntryGroupIamPolicyArgs(GetEntryGroupIamPolicyArgs $) {
        this.entryGroupId = $.entryGroupId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntryGroupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntryGroupIamPolicyArgs $;

        public Builder() {
            $ = new GetEntryGroupIamPolicyArgs();
        }

        public Builder(GetEntryGroupIamPolicyArgs defaults) {
            $ = new GetEntryGroupIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder entryGroupId(Output<String> entryGroupId) {
            $.entryGroupId = entryGroupId;
            return this;
        }

        public Builder entryGroupId(String entryGroupId) {
            return entryGroupId(Output.of(entryGroupId));
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

        public GetEntryGroupIamPolicyArgs build() {
            $.entryGroupId = Objects.requireNonNull($.entryGroupId, "expected parameter 'entryGroupId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
