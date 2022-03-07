// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsArgs Empty = new AccessApprovalSettingsArgs();

    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @InputImport(name="enrolledServices", required=true)
      private final Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;

    public Input<List<AccessApprovalSettingsEnrolledServiceArgs>> getEnrolledServices() {
        return this.enrolledServices;
    }

    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @InputImport(name="notificationEmails")
      private final @Nullable Input<List<String>> notificationEmails;

    public Input<List<String>> getNotificationEmails() {
        return this.notificationEmails == null ? Input.empty() : this.notificationEmails;
    }

    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    public AccessApprovalSettingsArgs(
        Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices,
        @Nullable Input<List<String>> notificationEmails,
        Input<String> organizationId) {
        this.enrolledServices = Objects.requireNonNull(enrolledServices, "expected parameter 'enrolledServices' to be non-null");
        this.notificationEmails = notificationEmails;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private AccessApprovalSettingsArgs() {
        this.enrolledServices = Input.empty();
        this.notificationEmails = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;
        private @Nullable Input<List<String>> notificationEmails;
        private Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrolledServices = defaults.enrolledServices;
    	      this.notificationEmails = defaults.notificationEmails;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setEnrolledServices(Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices) {
            this.enrolledServices = Objects.requireNonNull(enrolledServices);
            return this;
        }

        public Builder setEnrolledServices(List<AccessApprovalSettingsEnrolledServiceArgs> enrolledServices) {
            this.enrolledServices = Input.of(Objects.requireNonNull(enrolledServices));
            return this;
        }

        public Builder setNotificationEmails(@Nullable Input<List<String>> notificationEmails) {
            this.notificationEmails = notificationEmails;
            return this;
        }

        public Builder setNotificationEmails(@Nullable List<String> notificationEmails) {
            this.notificationEmails = Input.ofNullable(notificationEmails);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public AccessApprovalSettingsArgs build() {
            return new AccessApprovalSettingsArgs(enrolledServices, notificationEmails, organizationId);
        }
    }
}