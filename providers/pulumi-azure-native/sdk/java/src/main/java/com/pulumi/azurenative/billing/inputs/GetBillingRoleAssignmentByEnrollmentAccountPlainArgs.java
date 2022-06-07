// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.billing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBillingRoleAssignmentByEnrollmentAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBillingRoleAssignmentByEnrollmentAccountPlainArgs Empty = new GetBillingRoleAssignmentByEnrollmentAccountPlainArgs();

    /**
     * The ID that uniquely identifies a billing account.
     * 
     */
    @Import(name="billingAccountName", required=true)
    private String billingAccountName;

    /**
     * @return The ID that uniquely identifies a billing account.
     * 
     */
    public String billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The ID that uniquely identifies a role assignment.
     * 
     */
    @Import(name="billingRoleAssignmentName", required=true)
    private String billingRoleAssignmentName;

    /**
     * @return The ID that uniquely identifies a role assignment.
     * 
     */
    public String billingRoleAssignmentName() {
        return this.billingRoleAssignmentName;
    }

    /**
     * The ID that uniquely identifies an enrollment account.
     * 
     */
    @Import(name="enrollmentAccountName", required=true)
    private String enrollmentAccountName;

    /**
     * @return The ID that uniquely identifies an enrollment account.
     * 
     */
    public String enrollmentAccountName() {
        return this.enrollmentAccountName;
    }

    private GetBillingRoleAssignmentByEnrollmentAccountPlainArgs() {}

    private GetBillingRoleAssignmentByEnrollmentAccountPlainArgs(GetBillingRoleAssignmentByEnrollmentAccountPlainArgs $) {
        this.billingAccountName = $.billingAccountName;
        this.billingRoleAssignmentName = $.billingRoleAssignmentName;
        this.enrollmentAccountName = $.enrollmentAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBillingRoleAssignmentByEnrollmentAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBillingRoleAssignmentByEnrollmentAccountPlainArgs $;

        public Builder() {
            $ = new GetBillingRoleAssignmentByEnrollmentAccountPlainArgs();
        }

        public Builder(GetBillingRoleAssignmentByEnrollmentAccountPlainArgs defaults) {
            $ = new GetBillingRoleAssignmentByEnrollmentAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountName The ID that uniquely identifies a billing account.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(String billingAccountName) {
            $.billingAccountName = billingAccountName;
            return this;
        }

        /**
         * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
         * 
         * @return builder
         * 
         */
        public Builder billingRoleAssignmentName(String billingRoleAssignmentName) {
            $.billingRoleAssignmentName = billingRoleAssignmentName;
            return this;
        }

        /**
         * @param enrollmentAccountName The ID that uniquely identifies an enrollment account.
         * 
         * @return builder
         * 
         */
        public Builder enrollmentAccountName(String enrollmentAccountName) {
            $.enrollmentAccountName = enrollmentAccountName;
            return this;
        }

        public GetBillingRoleAssignmentByEnrollmentAccountPlainArgs build() {
            $.billingAccountName = Objects.requireNonNull($.billingAccountName, "expected parameter 'billingAccountName' to be non-null");
            $.billingRoleAssignmentName = Objects.requireNonNull($.billingRoleAssignmentName, "expected parameter 'billingRoleAssignmentName' to be non-null");
            $.enrollmentAccountName = Objects.requireNonNull($.enrollmentAccountName, "expected parameter 'enrollmentAccountName' to be non-null");
            return $;
        }
    }

}
