// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiskIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskIamPolicyArgs Empty = new GetDiskIamPolicyArgs();

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="resource", required=true)
    private Output<String> resource;

    public Output<String> resource() {
        return this.resource;
    }

    @Import(name="zone", required=true)
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    private GetDiskIamPolicyArgs() {}

    private GetDiskIamPolicyArgs(GetDiskIamPolicyArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.resource = $.resource;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskIamPolicyArgs $;

        public Builder() {
            $ = new GetDiskIamPolicyArgs();
        }

        public Builder(GetDiskIamPolicyArgs defaults) {
            $ = new GetDiskIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetDiskIamPolicyArgs build() {
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
