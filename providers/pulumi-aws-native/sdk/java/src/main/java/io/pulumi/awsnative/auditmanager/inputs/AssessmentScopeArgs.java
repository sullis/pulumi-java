// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.inputs;

import io.pulumi.awsnative.auditmanager.inputs.AssessmentAWSAccountArgs;
import io.pulumi.awsnative.auditmanager.inputs.AssessmentAWSServiceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The wrapper that contains the AWS accounts and AWS services in scope for the assessment.
 * 
 */
public final class AssessmentScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentScopeArgs Empty = new AssessmentScopeArgs();

    /**
     * The AWS accounts included in scope.
     * 
     */
    @InputImport(name="awsAccounts")
      private final @Nullable Input<List<AssessmentAWSAccountArgs>> awsAccounts;

    public Input<List<AssessmentAWSAccountArgs>> getAwsAccounts() {
        return this.awsAccounts == null ? Input.empty() : this.awsAccounts;
    }

    /**
     * The AWS services included in scope.
     * 
     */
    @InputImport(name="awsServices")
      private final @Nullable Input<List<AssessmentAWSServiceArgs>> awsServices;

    public Input<List<AssessmentAWSServiceArgs>> getAwsServices() {
        return this.awsServices == null ? Input.empty() : this.awsServices;
    }

    public AssessmentScopeArgs(
        @Nullable Input<List<AssessmentAWSAccountArgs>> awsAccounts,
        @Nullable Input<List<AssessmentAWSServiceArgs>> awsServices) {
        this.awsAccounts = awsAccounts;
        this.awsServices = awsServices;
    }

    private AssessmentScopeArgs() {
        this.awsAccounts = Input.empty();
        this.awsServices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AssessmentAWSAccountArgs>> awsAccounts;
        private @Nullable Input<List<AssessmentAWSServiceArgs>> awsServices;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccounts = defaults.awsAccounts;
    	      this.awsServices = defaults.awsServices;
        }

        public Builder setAwsAccounts(@Nullable Input<List<AssessmentAWSAccountArgs>> awsAccounts) {
            this.awsAccounts = awsAccounts;
            return this;
        }

        public Builder setAwsAccounts(@Nullable List<AssessmentAWSAccountArgs> awsAccounts) {
            this.awsAccounts = Input.ofNullable(awsAccounts);
            return this;
        }

        public Builder setAwsServices(@Nullable Input<List<AssessmentAWSServiceArgs>> awsServices) {
            this.awsServices = awsServices;
            return this;
        }

        public Builder setAwsServices(@Nullable List<AssessmentAWSServiceArgs> awsServices) {
            this.awsServices = Input.ofNullable(awsServices);
            return this;
        }
        public AssessmentScopeArgs build() {
            return new AssessmentScopeArgs(awsAccounts, awsServices);
        }
    }
}