// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkflowTemplateIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkflowTemplateIamPolicyPlainArgs Empty = new GetWorkflowTemplateIamPolicyPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="workflowTemplateId", required=true)
    private String workflowTemplateId;

    public String workflowTemplateId() {
        return this.workflowTemplateId;
    }

    private GetWorkflowTemplateIamPolicyPlainArgs() {}

    private GetWorkflowTemplateIamPolicyPlainArgs(GetWorkflowTemplateIamPolicyPlainArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.workflowTemplateId = $.workflowTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkflowTemplateIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkflowTemplateIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetWorkflowTemplateIamPolicyPlainArgs();
        }

        public Builder(GetWorkflowTemplateIamPolicyPlainArgs defaults) {
            $ = new GetWorkflowTemplateIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder workflowTemplateId(String workflowTemplateId) {
            $.workflowTemplateId = workflowTemplateId;
            return this;
        }

        public GetWorkflowTemplateIamPolicyPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.workflowTemplateId = Objects.requireNonNull($.workflowTemplateId, "expected parameter 'workflowTemplateId' to be non-null");
            return $;
        }
    }

}
