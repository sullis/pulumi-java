// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEndpointPolicyIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointPolicyIamPolicyArgs Empty = new GetEndpointPolicyIamPolicyArgs();

    @Import(name="endpointPolicyId", required=true)
    private Output<String> endpointPolicyId;

    public Output<String> endpointPolicyId() {
        return this.endpointPolicyId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

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

    private GetEndpointPolicyIamPolicyArgs() {}

    private GetEndpointPolicyIamPolicyArgs(GetEndpointPolicyIamPolicyArgs $) {
        this.endpointPolicyId = $.endpointPolicyId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointPolicyIamPolicyArgs $;

        public Builder() {
            $ = new GetEndpointPolicyIamPolicyArgs();
        }

        public Builder(GetEndpointPolicyIamPolicyArgs defaults) {
            $ = new GetEndpointPolicyIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointPolicyId(Output<String> endpointPolicyId) {
            $.endpointPolicyId = endpointPolicyId;
            return this;
        }

        public Builder endpointPolicyId(String endpointPolicyId) {
            return endpointPolicyId(Output.of(endpointPolicyId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
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

        public GetEndpointPolicyIamPolicyArgs build() {
            $.endpointPolicyId = Objects.requireNonNull($.endpointPolicyId, "expected parameter 'endpointPolicyId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
