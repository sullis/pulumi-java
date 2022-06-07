// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryIamPolicyArgs Empty = new GetRegistryIamPolicyArgs();

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

    @Import(name="registryId", required=true)
    private Output<String> registryId;

    public Output<String> registryId() {
        return this.registryId;
    }

    private GetRegistryIamPolicyArgs() {}

    private GetRegistryIamPolicyArgs(GetRegistryIamPolicyArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryIamPolicyArgs $;

        public Builder() {
            $ = new GetRegistryIamPolicyArgs();
        }

        public Builder(GetRegistryIamPolicyArgs defaults) {
            $ = new GetRegistryIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder registryId(Output<String> registryId) {
            $.registryId = registryId;
            return this;
        }

        public Builder registryId(String registryId) {
            return registryId(Output.of(registryId));
        }

        public GetRegistryIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
