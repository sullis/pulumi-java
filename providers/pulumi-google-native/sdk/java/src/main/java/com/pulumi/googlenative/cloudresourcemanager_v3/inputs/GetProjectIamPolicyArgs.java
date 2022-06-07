// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectIamPolicyArgs Empty = new GetProjectIamPolicyArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetProjectIamPolicyArgs() {}

    private GetProjectIamPolicyArgs(GetProjectIamPolicyArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectIamPolicyArgs $;

        public Builder() {
            $ = new GetProjectIamPolicyArgs();
        }

        public Builder(GetProjectIamPolicyArgs defaults) {
            $ = new GetProjectIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetProjectIamPolicyArgs build() {
            return $;
        }
    }

}
