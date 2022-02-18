// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.outputs;

import io.pulumi.awsnative.auditmanager.enums.AssessmentStatus;
import io.pulumi.awsnative.auditmanager.outputs.AssessmentDelegation;
import io.pulumi.awsnative.auditmanager.outputs.AssessmentReportsDestination;
import io.pulumi.awsnative.auditmanager.outputs.AssessmentRole;
import io.pulumi.awsnative.auditmanager.outputs.AssessmentScope;
import io.pulumi.awsnative.auditmanager.outputs.AssessmentTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAssessmentResult {
    private final @Nullable String arn;
    private final @Nullable String assessmentId;
    private final @Nullable AssessmentReportsDestination assessmentReportsDestination;
    private final @Nullable Double creationTime;
    /**
     * The list of delegations.
     * 
     */
    private final @Nullable List<AssessmentDelegation> delegations;
    /**
     * The list of roles for the specified assessment.
     * 
     */
    private final @Nullable List<AssessmentRole> roles;
    private final @Nullable AssessmentScope scope;
    private final @Nullable AssessmentStatus status;
    /**
     * The tags associated with the assessment.
     * 
     */
    private final @Nullable List<AssessmentTag> tags;

    @OutputCustomType.Constructor({"arn","assessmentId","assessmentReportsDestination","creationTime","delegations","roles","scope","status","tags"})
    private GetAssessmentResult(
        @Nullable String arn,
        @Nullable String assessmentId,
        @Nullable AssessmentReportsDestination assessmentReportsDestination,
        @Nullable Double creationTime,
        @Nullable List<AssessmentDelegation> delegations,
        @Nullable List<AssessmentRole> roles,
        @Nullable AssessmentScope scope,
        @Nullable AssessmentStatus status,
        @Nullable List<AssessmentTag> tags) {
        this.arn = arn;
        this.assessmentId = assessmentId;
        this.assessmentReportsDestination = assessmentReportsDestination;
        this.creationTime = creationTime;
        this.delegations = delegations;
        this.roles = roles;
        this.scope = scope;
        this.status = status;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getAssessmentId() {
        return Optional.ofNullable(this.assessmentId);
    }
    public Optional<AssessmentReportsDestination> getAssessmentReportsDestination() {
        return Optional.ofNullable(this.assessmentReportsDestination);
    }
    public Optional<Double> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The list of delegations.
     * 
     */
    public List<AssessmentDelegation> getDelegations() {
        return this.delegations == null ? List.of() : this.delegations;
    }
    /**
     * The list of roles for the specified assessment.
     * 
     */
    public List<AssessmentRole> getRoles() {
        return this.roles == null ? List.of() : this.roles;
    }
    public Optional<AssessmentScope> getScope() {
        return Optional.ofNullable(this.scope);
    }
    public Optional<AssessmentStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The tags associated with the assessment.
     * 
     */
    public List<AssessmentTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssessmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String assessmentId;
        private @Nullable AssessmentReportsDestination assessmentReportsDestination;
        private @Nullable Double creationTime;
        private @Nullable List<AssessmentDelegation> delegations;
        private @Nullable List<AssessmentRole> roles;
        private @Nullable AssessmentScope scope;
        private @Nullable AssessmentStatus status;
        private @Nullable List<AssessmentTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssessmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assessmentId = defaults.assessmentId;
    	      this.assessmentReportsDestination = defaults.assessmentReportsDestination;
    	      this.creationTime = defaults.creationTime;
    	      this.delegations = defaults.delegations;
    	      this.roles = defaults.roles;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAssessmentId(@Nullable String assessmentId) {
            this.assessmentId = assessmentId;
            return this;
        }

        public Builder setAssessmentReportsDestination(@Nullable AssessmentReportsDestination assessmentReportsDestination) {
            this.assessmentReportsDestination = assessmentReportsDestination;
            return this;
        }

        public Builder setCreationTime(@Nullable Double creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setDelegations(@Nullable List<AssessmentDelegation> delegations) {
            this.delegations = delegations;
            return this;
        }

        public Builder setRoles(@Nullable List<AssessmentRole> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setScope(@Nullable AssessmentScope scope) {
            this.scope = scope;
            return this;
        }

        public Builder setStatus(@Nullable AssessmentStatus status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable List<AssessmentTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetAssessmentResult build() {
            return new GetAssessmentResult(arn, assessmentId, assessmentReportsDestination, creationTime, delegations, roles, scope, status, tags);
        }
    }
}
