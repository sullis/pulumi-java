// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.NonResourcePolicyRuleArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.ResourcePolicyRuleArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.SubjectArgs;
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
    @InputImport(name="nonResourceRules")
      private final @Nullable Input<List<NonResourcePolicyRuleArgs>> nonResourceRules;

    public Input<List<NonResourcePolicyRuleArgs>> getNonResourceRules() {
        return this.nonResourceRules == null ? Input.empty() : this.nonResourceRules;
    }

    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    @InputImport(name="resourceRules")
      private final @Nullable Input<List<ResourcePolicyRuleArgs>> resourceRules;

    public Input<List<ResourcePolicyRuleArgs>> getResourceRules() {
        return this.resourceRules == null ? Input.empty() : this.resourceRules;
    }

    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * 
     */
    @InputImport(name="subjects", required=true)
      private final Input<List<SubjectArgs>> subjects;

    public Input<List<SubjectArgs>> getSubjects() {
        return this.subjects;
    }

    public PolicyRulesWithSubjectsArgs(
        @Nullable Input<List<NonResourcePolicyRuleArgs>> nonResourceRules,
        @Nullable Input<List<ResourcePolicyRuleArgs>> resourceRules,
        Input<List<SubjectArgs>> subjects) {
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
        this.subjects = Objects.requireNonNull(subjects, "expected parameter 'subjects' to be non-null");
    }

    private PolicyRulesWithSubjectsArgs() {
        this.nonResourceRules = Input.empty();
        this.resourceRules = Input.empty();
        this.subjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRulesWithSubjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NonResourcePolicyRuleArgs>> nonResourceRules;
        private @Nullable Input<List<ResourcePolicyRuleArgs>> resourceRules;
        private Input<List<SubjectArgs>> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRulesWithSubjectsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
    	      this.subjects = defaults.subjects;
        }

        public Builder setNonResourceRules(@Nullable Input<List<NonResourcePolicyRuleArgs>> nonResourceRules) {
            this.nonResourceRules = nonResourceRules;
            return this;
        }

        public Builder setNonResourceRules(@Nullable List<NonResourcePolicyRuleArgs> nonResourceRules) {
            this.nonResourceRules = Input.ofNullable(nonResourceRules);
            return this;
        }

        public Builder setResourceRules(@Nullable Input<List<ResourcePolicyRuleArgs>> resourceRules) {
            this.resourceRules = resourceRules;
            return this;
        }

        public Builder setResourceRules(@Nullable List<ResourcePolicyRuleArgs> resourceRules) {
            this.resourceRules = Input.ofNullable(resourceRules);
            return this;
        }

        public Builder setSubjects(Input<List<SubjectArgs>> subjects) {
            this.subjects = Objects.requireNonNull(subjects);
            return this;
        }

        public Builder setSubjects(List<SubjectArgs> subjects) {
            this.subjects = Input.of(Objects.requireNonNull(subjects));
            return this;
        }
        public PolicyRulesWithSubjectsArgs build() {
            return new PolicyRulesWithSubjectsArgs(nonResourceRules, resourceRules, subjects);
        }
    }
}