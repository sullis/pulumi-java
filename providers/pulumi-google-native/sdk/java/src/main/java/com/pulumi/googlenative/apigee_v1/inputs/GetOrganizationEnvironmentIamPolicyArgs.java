// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationEnvironmentIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationEnvironmentIamPolicyArgs Empty = new GetOrganizationEnvironmentIamPolicyArgs();

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetOrganizationEnvironmentIamPolicyArgs() {}

    private GetOrganizationEnvironmentIamPolicyArgs(GetOrganizationEnvironmentIamPolicyArgs $) {
        this.environmentId = $.environmentId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationEnvironmentIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationEnvironmentIamPolicyArgs $;

        public Builder() {
            $ = new GetOrganizationEnvironmentIamPolicyArgs();
        }

        public Builder(GetOrganizationEnvironmentIamPolicyArgs defaults) {
            $ = new GetOrganizationEnvironmentIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetOrganizationEnvironmentIamPolicyArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
