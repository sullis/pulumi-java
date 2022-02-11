// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.ProjectTagArgs;
import io.pulumi.awsnative.sagemaker.inputs.ServiceCatalogProvisioningDetailsPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    @InputImport(name="projectDescription")
    private final @Nullable Input<String> projectDescription;

    public Input<String> getProjectDescription() {
        return this.projectDescription == null ? Input.empty() : this.projectDescription;
    }

    @InputImport(name="projectName")
    private final @Nullable Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName == null ? Input.empty() : this.projectName;
    }

    @InputImport(name="serviceCatalogProvisioningDetails", required=true)
    private final Input<ServiceCatalogProvisioningDetailsPropertiesArgs> serviceCatalogProvisioningDetails;

    public Input<ServiceCatalogProvisioningDetailsPropertiesArgs> getServiceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<ProjectTagArgs>> tags;

    public Input<List<ProjectTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ProjectArgs(
        @Nullable Input<String> projectDescription,
        @Nullable Input<String> projectName,
        Input<ServiceCatalogProvisioningDetailsPropertiesArgs> serviceCatalogProvisioningDetails,
        @Nullable Input<List<ProjectTagArgs>> tags) {
        this.projectDescription = projectDescription;
        this.projectName = projectName;
        this.serviceCatalogProvisioningDetails = Objects.requireNonNull(serviceCatalogProvisioningDetails, "expected parameter 'serviceCatalogProvisioningDetails' to be non-null");
        this.tags = tags;
    }

    private ProjectArgs() {
        this.projectDescription = Input.empty();
        this.projectName = Input.empty();
        this.serviceCatalogProvisioningDetails = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> projectDescription;
        private @Nullable Input<String> projectName;
        private Input<ServiceCatalogProvisioningDetailsPropertiesArgs> serviceCatalogProvisioningDetails;
        private @Nullable Input<List<ProjectTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectDescription = defaults.projectDescription;
    	      this.projectName = defaults.projectName;
    	      this.serviceCatalogProvisioningDetails = defaults.serviceCatalogProvisioningDetails;
    	      this.tags = defaults.tags;
        }

        public Builder setProjectDescription(@Nullable Input<String> projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }

        public Builder setProjectDescription(@Nullable String projectDescription) {
            this.projectDescription = Input.ofNullable(projectDescription);
            return this;
        }

        public Builder setProjectName(@Nullable Input<String> projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder setProjectName(@Nullable String projectName) {
            this.projectName = Input.ofNullable(projectName);
            return this;
        }

        public Builder setServiceCatalogProvisioningDetails(Input<ServiceCatalogProvisioningDetailsPropertiesArgs> serviceCatalogProvisioningDetails) {
            this.serviceCatalogProvisioningDetails = Objects.requireNonNull(serviceCatalogProvisioningDetails);
            return this;
        }

        public Builder setServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetailsPropertiesArgs serviceCatalogProvisioningDetails) {
            this.serviceCatalogProvisioningDetails = Input.of(Objects.requireNonNull(serviceCatalogProvisioningDetails));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ProjectTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ProjectTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ProjectArgs build() {
            return new ProjectArgs(projectDescription, projectName, serviceCatalogProvisioningDetails, tags);
        }
    }
}
