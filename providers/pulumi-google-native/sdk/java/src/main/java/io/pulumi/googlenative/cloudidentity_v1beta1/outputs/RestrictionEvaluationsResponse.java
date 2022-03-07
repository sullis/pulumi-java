// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudidentity_v1beta1.outputs.MembershipRoleRestrictionEvaluationResponse;
import java.util.Objects;

@OutputCustomType
public final class RestrictionEvaluationsResponse {
    /**
     * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
     */
    private final MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation;

    @OutputCustomType.Constructor({"memberRestrictionEvaluation"})
    private RestrictionEvaluationsResponse(MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation) {
        this.memberRestrictionEvaluation = Objects.requireNonNull(memberRestrictionEvaluation);
    }

    /**
     * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
    */
    public MembershipRoleRestrictionEvaluationResponse getMemberRestrictionEvaluation() {
        return this.memberRestrictionEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestrictionEvaluationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(RestrictionEvaluationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberRestrictionEvaluation = defaults.memberRestrictionEvaluation;
        }

        public Builder setMemberRestrictionEvaluation(MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation) {
            this.memberRestrictionEvaluation = Objects.requireNonNull(memberRestrictionEvaluation);
            return this;
        }
        public RestrictionEvaluationsResponse build() {
            return new RestrictionEvaluationsResponse(memberRestrictionEvaluation);
        }
    }
}