// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.enums.ProjectStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a project.
 * 
 */
public final class ProjectPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectPropertiesArgs Empty = new ProjectPropertiesArgs();

    /**
     * Assessment solution ARM id tracked by Microsoft.Migrate/migrateProjects.
     * 
     */
    @InputImport(name="assessmentSolutionId")
    private final @Nullable Input<String> assessmentSolutionId;

    public Input<String> getAssessmentSolutionId() {
        return this.assessmentSolutionId == null ? Input.empty() : this.assessmentSolutionId;
    }

    /**
     * The ARM id of the storage account used for interactions when public access is disabled.
     * 
     */
    @InputImport(name="customerStorageAccountArmId")
    private final @Nullable Input<String> customerStorageAccountArmId;

    public Input<String> getCustomerStorageAccountArmId() {
        return this.customerStorageAccountArmId == null ? Input.empty() : this.customerStorageAccountArmId;
    }

    /**
     * The ARM id of service map workspace created by customer.
     * 
     */
    @InputImport(name="customerWorkspaceId")
    private final @Nullable Input<String> customerWorkspaceId;

    public Input<String> getCustomerWorkspaceId() {
        return this.customerWorkspaceId == null ? Input.empty() : this.customerWorkspaceId;
    }

    /**
     * Location of service map workspace created by customer.
     * 
     */
    @InputImport(name="customerWorkspaceLocation")
    private final @Nullable Input<String> customerWorkspaceLocation;

    public Input<String> getCustomerWorkspaceLocation() {
        return this.customerWorkspaceLocation == null ? Input.empty() : this.customerWorkspaceLocation;
    }

    /**
     * Assessment project status.
     * 
     */
    @InputImport(name="projectStatus")
    private final @Nullable Input<Either<String,ProjectStatus>> projectStatus;

    public Input<Either<String,ProjectStatus>> getProjectStatus() {
        return this.projectStatus == null ? Input.empty() : this.projectStatus;
    }

    /**
     * This value can be set to 'enabled' to avoid breaking changes on existing customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method.
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<String> publicNetworkAccess;

    public Input<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    public ProjectPropertiesArgs(
        @Nullable Input<String> assessmentSolutionId,
        @Nullable Input<String> customerStorageAccountArmId,
        @Nullable Input<String> customerWorkspaceId,
        @Nullable Input<String> customerWorkspaceLocation,
        @Nullable Input<Either<String,ProjectStatus>> projectStatus,
        @Nullable Input<String> publicNetworkAccess) {
        this.assessmentSolutionId = assessmentSolutionId;
        this.customerStorageAccountArmId = customerStorageAccountArmId;
        this.customerWorkspaceId = customerWorkspaceId;
        this.customerWorkspaceLocation = customerWorkspaceLocation;
        this.projectStatus = projectStatus;
        this.publicNetworkAccess = publicNetworkAccess;
    }

    private ProjectPropertiesArgs() {
        this.assessmentSolutionId = Input.empty();
        this.customerStorageAccountArmId = Input.empty();
        this.customerWorkspaceId = Input.empty();
        this.customerWorkspaceLocation = Input.empty();
        this.projectStatus = Input.empty();
        this.publicNetworkAccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assessmentSolutionId;
        private @Nullable Input<String> customerStorageAccountArmId;
        private @Nullable Input<String> customerWorkspaceId;
        private @Nullable Input<String> customerWorkspaceLocation;
        private @Nullable Input<Either<String,ProjectStatus>> projectStatus;
        private @Nullable Input<String> publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentSolutionId = defaults.assessmentSolutionId;
    	      this.customerStorageAccountArmId = defaults.customerStorageAccountArmId;
    	      this.customerWorkspaceId = defaults.customerWorkspaceId;
    	      this.customerWorkspaceLocation = defaults.customerWorkspaceLocation;
    	      this.projectStatus = defaults.projectStatus;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder setAssessmentSolutionId(@Nullable Input<String> assessmentSolutionId) {
            this.assessmentSolutionId = assessmentSolutionId;
            return this;
        }

        public Builder setAssessmentSolutionId(@Nullable String assessmentSolutionId) {
            this.assessmentSolutionId = Input.ofNullable(assessmentSolutionId);
            return this;
        }

        public Builder setCustomerStorageAccountArmId(@Nullable Input<String> customerStorageAccountArmId) {
            this.customerStorageAccountArmId = customerStorageAccountArmId;
            return this;
        }

        public Builder setCustomerStorageAccountArmId(@Nullable String customerStorageAccountArmId) {
            this.customerStorageAccountArmId = Input.ofNullable(customerStorageAccountArmId);
            return this;
        }

        public Builder setCustomerWorkspaceId(@Nullable Input<String> customerWorkspaceId) {
            this.customerWorkspaceId = customerWorkspaceId;
            return this;
        }

        public Builder setCustomerWorkspaceId(@Nullable String customerWorkspaceId) {
            this.customerWorkspaceId = Input.ofNullable(customerWorkspaceId);
            return this;
        }

        public Builder setCustomerWorkspaceLocation(@Nullable Input<String> customerWorkspaceLocation) {
            this.customerWorkspaceLocation = customerWorkspaceLocation;
            return this;
        }

        public Builder setCustomerWorkspaceLocation(@Nullable String customerWorkspaceLocation) {
            this.customerWorkspaceLocation = Input.ofNullable(customerWorkspaceLocation);
            return this;
        }

        public Builder setProjectStatus(@Nullable Input<Either<String,ProjectStatus>> projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }

        public Builder setProjectStatus(@Nullable Either<String,ProjectStatus> projectStatus) {
            this.projectStatus = Input.ofNullable(projectStatus);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<String> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public ProjectPropertiesArgs build() {
            return new ProjectPropertiesArgs(assessmentSolutionId, customerStorageAccountArmId, customerWorkspaceId, customerWorkspaceLocation, projectStatus, publicNetworkAccess);
        }
    }
}
