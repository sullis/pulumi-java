// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOccurrenceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOccurrenceIamPolicyArgs Empty = new GetOccurrenceIamPolicyArgs();

    @Import(name="occurrenceId", required=true)
    private Output<String> occurrenceId;

    public Output<String> occurrenceId() {
        return this.occurrenceId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetOccurrenceIamPolicyArgs() {}

    private GetOccurrenceIamPolicyArgs(GetOccurrenceIamPolicyArgs $) {
        this.occurrenceId = $.occurrenceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOccurrenceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOccurrenceIamPolicyArgs $;

        public Builder() {
            $ = new GetOccurrenceIamPolicyArgs();
        }

        public Builder(GetOccurrenceIamPolicyArgs defaults) {
            $ = new GetOccurrenceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder occurrenceId(Output<String> occurrenceId) {
            $.occurrenceId = occurrenceId;
            return this;
        }

        public Builder occurrenceId(String occurrenceId) {
            return occurrenceId(Output.of(occurrenceId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetOccurrenceIamPolicyArgs build() {
            $.occurrenceId = Objects.requireNonNull($.occurrenceId, "expected parameter 'occurrenceId' to be non-null");
            return $;
        }
    }

}
