// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.auditmanager.inputs;

import com.pulumi.awsnative.auditmanager.inputs.AssessmentAWSAccount;
import com.pulumi.awsnative.auditmanager.inputs.AssessmentAWSService;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The wrapper that contains the AWS accounts and AWS services in scope for the assessment.
 * 
 */
public final class AssessmentScope extends com.pulumi.resources.InvokeArgs {

    public static final AssessmentScope Empty = new AssessmentScope();

    /**
     * The AWS accounts included in scope.
     * 
     */
    @Import(name="awsAccounts")
    private @Nullable List<AssessmentAWSAccount> awsAccounts;

    /**
     * @return The AWS accounts included in scope.
     * 
     */
    public Optional<List<AssessmentAWSAccount>> awsAccounts() {
        return Optional.ofNullable(this.awsAccounts);
    }

    /**
     * The AWS services included in scope.
     * 
     */
    @Import(name="awsServices")
    private @Nullable List<AssessmentAWSService> awsServices;

    /**
     * @return The AWS services included in scope.
     * 
     */
    public Optional<List<AssessmentAWSService>> awsServices() {
        return Optional.ofNullable(this.awsServices);
    }

    private AssessmentScope() {}

    private AssessmentScope(AssessmentScope $) {
        this.awsAccounts = $.awsAccounts;
        this.awsServices = $.awsServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentScope $;

        public Builder() {
            $ = new AssessmentScope();
        }

        public Builder(AssessmentScope defaults) {
            $ = new AssessmentScope(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccounts The AWS accounts included in scope.
         * 
         * @return builder
         * 
         */
        public Builder awsAccounts(@Nullable List<AssessmentAWSAccount> awsAccounts) {
            $.awsAccounts = awsAccounts;
            return this;
        }

        /**
         * @param awsAccounts The AWS accounts included in scope.
         * 
         * @return builder
         * 
         */
        public Builder awsAccounts(AssessmentAWSAccount... awsAccounts) {
            return awsAccounts(List.of(awsAccounts));
        }

        /**
         * @param awsServices The AWS services included in scope.
         * 
         * @return builder
         * 
         */
        public Builder awsServices(@Nullable List<AssessmentAWSService> awsServices) {
            $.awsServices = awsServices;
            return this;
        }

        /**
         * @param awsServices The AWS services included in scope.
         * 
         * @return builder
         * 
         */
        public Builder awsServices(AssessmentAWSService... awsServices) {
            return awsServices(List.of(awsServices));
        }

        public AssessmentScope build() {
            return $;
        }
    }

}
