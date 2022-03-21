// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.NonResourcePolicyRuleArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.ResourcePolicyRuleArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.SubjectArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 * 
 */
public final class PolicyRulesWithSubjectsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyRulesWithSubjectsArgs Empty = new PolicyRulesWithSubjectsArgs();

    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    @Import(name="nonResourceRules")
      private final @Nullable Output<List<NonResourcePolicyRuleArgs>> nonResourceRules;

    public Output<List<NonResourcePolicyRuleArgs>> getNonResourceRules() {
        return this.nonResourceRules == null ? Output.empty() : this.nonResourceRules;
    }

    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    @Import(name="resourceRules")
      private final @Nullable Output<List<ResourcePolicyRuleArgs>> resourceRules;

    public Output<List<ResourcePolicyRuleArgs>> getResourceRules() {
        return this.resourceRules == null ? Output.empty() : this.resourceRules;
    }

    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    @Import(name="subjects", required=true)
      private final Output<List<SubjectArgs>> subjects;

    public Output<List<SubjectArgs>> getSubjects() {
        return this.subjects;
    }

    public PolicyRulesWithSubjectsArgs(
        @Nullable Output<List<NonResourcePolicyRuleArgs>> nonResourceRules,
        @Nullable Output<List<ResourcePolicyRuleArgs>> resourceRules,
        Output<List<SubjectArgs>> subjects) {
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
        this.subjects = Objects.requireNonNull(subjects, "expected parameter 'subjects' to be non-null");
    }

    private PolicyRulesWithSubjectsArgs() {
        this.nonResourceRules = Output.empty();
        this.resourceRules = Output.empty();
        this.subjects = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRulesWithSubjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NonResourcePolicyRuleArgs>> nonResourceRules;
        private @Nullable Output<List<ResourcePolicyRuleArgs>> resourceRules;
        private Output<List<SubjectArgs>> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRulesWithSubjectsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
    	      this.subjects = defaults.subjects;
        }

        public Builder nonResourceRules(@Nullable Output<List<NonResourcePolicyRuleArgs>> nonResourceRules) {
            this.nonResourceRules = nonResourceRules;
            return this;
        }
        public Builder nonResourceRules(@Nullable List<NonResourcePolicyRuleArgs> nonResourceRules) {
            this.nonResourceRules = Output.ofNullable(nonResourceRules);
            return this;
        }
        public Builder nonResourceRules(NonResourcePolicyRuleArgs... nonResourceRules) {
            return nonResourceRules(List.of(nonResourceRules));
        }
        public Builder resourceRules(@Nullable Output<List<ResourcePolicyRuleArgs>> resourceRules) {
            this.resourceRules = resourceRules;
            return this;
        }
        public Builder resourceRules(@Nullable List<ResourcePolicyRuleArgs> resourceRules) {
            this.resourceRules = Output.ofNullable(resourceRules);
            return this;
        }
        public Builder resourceRules(ResourcePolicyRuleArgs... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }
        public Builder subjects(Output<List<SubjectArgs>> subjects) {
            this.subjects = Objects.requireNonNull(subjects);
            return this;
        }
        public Builder subjects(List<SubjectArgs> subjects) {
            this.subjects = Output.of(Objects.requireNonNull(subjects));
            return this;
        }
        public Builder subjects(SubjectArgs... subjects) {
            return subjects(List.of(subjects));
        }        public PolicyRulesWithSubjectsArgs build() {
            return new PolicyRulesWithSubjectsArgs(nonResourceRules, resourceRules, subjects);
        }
    }
}
