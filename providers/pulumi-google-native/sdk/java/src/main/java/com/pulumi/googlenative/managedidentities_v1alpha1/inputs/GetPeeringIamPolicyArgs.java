// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeeringIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringIamPolicyArgs Empty = new GetPeeringIamPolicyArgs();

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="peeringId", required=true)
    private Output<String> peeringId;

    public Output<String> peeringId() {
        return this.peeringId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetPeeringIamPolicyArgs() {}

    private GetPeeringIamPolicyArgs(GetPeeringIamPolicyArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.peeringId = $.peeringId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeeringIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeeringIamPolicyArgs $;

        public Builder() {
            $ = new GetPeeringIamPolicyArgs();
        }

        public Builder(GetPeeringIamPolicyArgs defaults) {
            $ = new GetPeeringIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder peeringId(Output<String> peeringId) {
            $.peeringId = peeringId;
            return this;
        }

        public Builder peeringId(String peeringId) {
            return peeringId(Output.of(peeringId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetPeeringIamPolicyArgs build() {
            $.peeringId = Objects.requireNonNull($.peeringId, "expected parameter 'peeringId' to be non-null");
            return $;
        }
    }

}
