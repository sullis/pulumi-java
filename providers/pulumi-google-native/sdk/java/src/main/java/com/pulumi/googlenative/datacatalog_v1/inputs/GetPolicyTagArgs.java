// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyTagArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyTagArgs Empty = new GetPolicyTagArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="policyTagId", required=true)
    private Output<String> policyTagId;

    public Output<String> policyTagId() {
        return this.policyTagId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="taxonomyId", required=true)
    private Output<String> taxonomyId;

    public Output<String> taxonomyId() {
        return this.taxonomyId;
    }

    private GetPolicyTagArgs() {}

    private GetPolicyTagArgs(GetPolicyTagArgs $) {
        this.location = $.location;
        this.policyTagId = $.policyTagId;
        this.project = $.project;
        this.taxonomyId = $.taxonomyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyTagArgs $;

        public Builder() {
            $ = new GetPolicyTagArgs();
        }

        public Builder(GetPolicyTagArgs defaults) {
            $ = new GetPolicyTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder policyTagId(Output<String> policyTagId) {
            $.policyTagId = policyTagId;
            return this;
        }

        public Builder policyTagId(String policyTagId) {
            return policyTagId(Output.of(policyTagId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder taxonomyId(Output<String> taxonomyId) {
            $.taxonomyId = taxonomyId;
            return this;
        }

        public Builder taxonomyId(String taxonomyId) {
            return taxonomyId(Output.of(taxonomyId));
        }

        public GetPolicyTagArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.policyTagId = Objects.requireNonNull($.policyTagId, "expected parameter 'policyTagId' to be non-null");
            $.taxonomyId = Objects.requireNonNull($.taxonomyId, "expected parameter 'taxonomyId' to be non-null");
            return $;
        }
    }

}
