// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.enums.AssessmentType;
import io.pulumi.azurenative.security.enums.Categories;
import io.pulumi.azurenative.security.enums.ImplementationEffort;
import io.pulumi.azurenative.security.enums.Severity;
import io.pulumi.azurenative.security.enums.Threats;
import io.pulumi.azurenative.security.enums.UserImpact;
import io.pulumi.azurenative.security.inputs.SecurityAssessmentMetadataPartnerDataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentMetadataInSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentMetadataInSubscriptionArgs Empty = new AssessmentMetadataInSubscriptionArgs();

    /**
     * The Assessment Key - Unique key for the assessment type
     * 
     */
    @InputImport(name="assessmentMetadataName")
    private final @Nullable Input<String> assessmentMetadataName;

    public Input<String> getAssessmentMetadataName() {
        return this.assessmentMetadataName == null ? Input.empty() : this.assessmentMetadataName;
    }

    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
     */
    @InputImport(name="assessmentType", required=true)
    private final Input<Either<String,AssessmentType>> assessmentType;

    public Input<Either<String,AssessmentType>> getAssessmentType() {
        return this.assessmentType;
    }

    @InputImport(name="categories")
    private final @Nullable Input<List<Either<String,Categories>>> categories;

    public Input<List<Either<String,Categories>>> getCategories() {
        return this.categories == null ? Input.empty() : this.categories;
    }

    /**
     * Human readable description of the assessment
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User friendly display name of the assessment
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The implementation effort required to remediate this assessment
     * 
     */
    @InputImport(name="implementationEffort")
    private final @Nullable Input<Either<String,ImplementationEffort>> implementationEffort;

    public Input<Either<String,ImplementationEffort>> getImplementationEffort() {
        return this.implementationEffort == null ? Input.empty() : this.implementationEffort;
    }

    /**
     * Describes the partner that created the assessment
     * 
     */
    @InputImport(name="partnerData")
    private final @Nullable Input<SecurityAssessmentMetadataPartnerDataArgs> partnerData;

    public Input<SecurityAssessmentMetadataPartnerDataArgs> getPartnerData() {
        return this.partnerData == null ? Input.empty() : this.partnerData;
    }

    /**
     * True if this assessment is in preview release status
     * 
     */
    @InputImport(name="preview")
    private final @Nullable Input<Boolean> preview;

    public Input<Boolean> getPreview() {
        return this.preview == null ? Input.empty() : this.preview;
    }

    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
     */
    @InputImport(name="remediationDescription")
    private final @Nullable Input<String> remediationDescription;

    public Input<String> getRemediationDescription() {
        return this.remediationDescription == null ? Input.empty() : this.remediationDescription;
    }

    /**
     * The severity level of the assessment
     * 
     */
    @InputImport(name="severity", required=true)
    private final Input<Either<String,Severity>> severity;

    public Input<Either<String,Severity>> getSeverity() {
        return this.severity;
    }

    @InputImport(name="threats")
    private final @Nullable Input<List<Either<String,Threats>>> threats;

    public Input<List<Either<String,Threats>>> getThreats() {
        return this.threats == null ? Input.empty() : this.threats;
    }

    /**
     * The user impact of the assessment
     * 
     */
    @InputImport(name="userImpact")
    private final @Nullable Input<Either<String,UserImpact>> userImpact;

    public Input<Either<String,UserImpact>> getUserImpact() {
        return this.userImpact == null ? Input.empty() : this.userImpact;
    }

    public AssessmentMetadataInSubscriptionArgs(
        @Nullable Input<String> assessmentMetadataName,
        Input<Either<String,AssessmentType>> assessmentType,
        @Nullable Input<List<Either<String,Categories>>> categories,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<Either<String,ImplementationEffort>> implementationEffort,
        @Nullable Input<SecurityAssessmentMetadataPartnerDataArgs> partnerData,
        @Nullable Input<Boolean> preview,
        @Nullable Input<String> remediationDescription,
        Input<Either<String,Severity>> severity,
        @Nullable Input<List<Either<String,Threats>>> threats,
        @Nullable Input<Either<String,UserImpact>> userImpact) {
        this.assessmentMetadataName = assessmentMetadataName;
        this.assessmentType = Objects.requireNonNull(assessmentType, "expected parameter 'assessmentType' to be non-null");
        this.categories = categories;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.implementationEffort = implementationEffort;
        this.partnerData = partnerData;
        this.preview = preview;
        this.remediationDescription = remediationDescription;
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.threats = threats;
        this.userImpact = userImpact;
    }

    private AssessmentMetadataInSubscriptionArgs() {
        this.assessmentMetadataName = Input.empty();
        this.assessmentType = Input.empty();
        this.categories = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.implementationEffort = Input.empty();
        this.partnerData = Input.empty();
        this.preview = Input.empty();
        this.remediationDescription = Input.empty();
        this.severity = Input.empty();
        this.threats = Input.empty();
        this.userImpact = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentMetadataInSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assessmentMetadataName;
        private Input<Either<String,AssessmentType>> assessmentType;
        private @Nullable Input<List<Either<String,Categories>>> categories;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<Either<String,ImplementationEffort>> implementationEffort;
        private @Nullable Input<SecurityAssessmentMetadataPartnerDataArgs> partnerData;
        private @Nullable Input<Boolean> preview;
        private @Nullable Input<String> remediationDescription;
        private Input<Either<String,Severity>> severity;
        private @Nullable Input<List<Either<String,Threats>>> threats;
        private @Nullable Input<Either<String,UserImpact>> userImpact;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentMetadataInSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentMetadataName = defaults.assessmentMetadataName;
    	      this.assessmentType = defaults.assessmentType;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.implementationEffort = defaults.implementationEffort;
    	      this.partnerData = defaults.partnerData;
    	      this.preview = defaults.preview;
    	      this.remediationDescription = defaults.remediationDescription;
    	      this.severity = defaults.severity;
    	      this.threats = defaults.threats;
    	      this.userImpact = defaults.userImpact;
        }

        public Builder setAssessmentMetadataName(@Nullable Input<String> assessmentMetadataName) {
            this.assessmentMetadataName = assessmentMetadataName;
            return this;
        }

        public Builder setAssessmentMetadataName(@Nullable String assessmentMetadataName) {
            this.assessmentMetadataName = Input.ofNullable(assessmentMetadataName);
            return this;
        }

        public Builder setAssessmentType(Input<Either<String,AssessmentType>> assessmentType) {
            this.assessmentType = Objects.requireNonNull(assessmentType);
            return this;
        }

        public Builder setAssessmentType(Either<String,AssessmentType> assessmentType) {
            this.assessmentType = Input.of(Objects.requireNonNull(assessmentType));
            return this;
        }

        public Builder setCategories(@Nullable Input<List<Either<String,Categories>>> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setCategories(@Nullable List<Either<String,Categories>> categories) {
            this.categories = Input.ofNullable(categories);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setImplementationEffort(@Nullable Input<Either<String,ImplementationEffort>> implementationEffort) {
            this.implementationEffort = implementationEffort;
            return this;
        }

        public Builder setImplementationEffort(@Nullable Either<String,ImplementationEffort> implementationEffort) {
            this.implementationEffort = Input.ofNullable(implementationEffort);
            return this;
        }

        public Builder setPartnerData(@Nullable Input<SecurityAssessmentMetadataPartnerDataArgs> partnerData) {
            this.partnerData = partnerData;
            return this;
        }

        public Builder setPartnerData(@Nullable SecurityAssessmentMetadataPartnerDataArgs partnerData) {
            this.partnerData = Input.ofNullable(partnerData);
            return this;
        }

        public Builder setPreview(@Nullable Input<Boolean> preview) {
            this.preview = preview;
            return this;
        }

        public Builder setPreview(@Nullable Boolean preview) {
            this.preview = Input.ofNullable(preview);
            return this;
        }

        public Builder setRemediationDescription(@Nullable Input<String> remediationDescription) {
            this.remediationDescription = remediationDescription;
            return this;
        }

        public Builder setRemediationDescription(@Nullable String remediationDescription) {
            this.remediationDescription = Input.ofNullable(remediationDescription);
            return this;
        }

        public Builder setSeverity(Input<Either<String,Severity>> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setSeverity(Either<String,Severity> severity) {
            this.severity = Input.of(Objects.requireNonNull(severity));
            return this;
        }

        public Builder setThreats(@Nullable Input<List<Either<String,Threats>>> threats) {
            this.threats = threats;
            return this;
        }

        public Builder setThreats(@Nullable List<Either<String,Threats>> threats) {
            this.threats = Input.ofNullable(threats);
            return this;
        }

        public Builder setUserImpact(@Nullable Input<Either<String,UserImpact>> userImpact) {
            this.userImpact = userImpact;
            return this;
        }

        public Builder setUserImpact(@Nullable Either<String,UserImpact> userImpact) {
            this.userImpact = Input.ofNullable(userImpact);
            return this;
        }

        public AssessmentMetadataInSubscriptionArgs build() {
            return new AssessmentMetadataInSubscriptionArgs(assessmentMetadataName, assessmentType, categories, description, displayName, implementationEffort, partnerData, preview, remediationDescription, severity, threats, userImpact);
        }
    }
}
