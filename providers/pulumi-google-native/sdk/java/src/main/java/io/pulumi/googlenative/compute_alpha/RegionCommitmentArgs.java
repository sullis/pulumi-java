// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RegionCommitmentCategory;
import io.pulumi.googlenative.compute_alpha.enums.RegionCommitmentPlan;
import io.pulumi.googlenative.compute_alpha.enums.RegionCommitmentType;
import io.pulumi.googlenative.compute_alpha.inputs.LicenseResourceCommitmentArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ReservationArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ResourceCommitmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionCommitmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionCommitmentArgs Empty = new RegionCommitmentArgs();

    /**
     * Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
     */
    @InputImport(name="autoRenew")
      private final @Nullable Input<Boolean> autoRenew;

    public Input<Boolean> getAutoRenew() {
        return this.autoRenew == null ? Input.empty() : this.autoRenew;
    }

    /**
     * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
     */
    @InputImport(name="category")
      private final @Nullable Input<RegionCommitmentCategory> category;

    public Input<RegionCommitmentCategory> getCategory() {
        return this.category == null ? Input.empty() : this.category;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The license specification required as part of a license commitment.
     * 
     */
    @InputImport(name="licenseResource")
      private final @Nullable Input<LicenseResourceCommitmentArgs> licenseResource;

    public Input<LicenseResourceCommitmentArgs> getLicenseResource() {
        return this.licenseResource == null ? Input.empty() : this.licenseResource;
    }

    /**
     * List of source commitments to be merged into a new commitment.
     * 
     */
    @InputImport(name="mergeSourceCommitments")
      private final @Nullable Input<List<String>> mergeSourceCommitments;

    public Input<List<String>> getMergeSourceCommitments() {
        return this.mergeSourceCommitments == null ? Input.empty() : this.mergeSourceCommitments;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    @InputImport(name="plan")
      private final @Nullable Input<RegionCommitmentPlan> plan;

    public Input<RegionCommitmentPlan> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * List of reservations in this commitment.
     * 
     */
    @InputImport(name="reservations")
      private final @Nullable Input<List<ReservationArgs>> reservations;

    public Input<List<ReservationArgs>> getReservations() {
        return this.reservations == null ? Input.empty() : this.reservations;
    }

    /**
     * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
     */
    @InputImport(name="resources")
      private final @Nullable Input<List<ResourceCommitmentArgs>> resources;

    public Input<List<ResourceCommitmentArgs>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    /**
     * Source commitment to be splitted into a new commitment.
     * 
     */
    @InputImport(name="splitSourceCommitment")
      private final @Nullable Input<String> splitSourceCommitment;

    public Input<String> getSplitSourceCommitment() {
        return this.splitSourceCommitment == null ? Input.empty() : this.splitSourceCommitment;
    }

    /**
     * The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<RegionCommitmentType> type;

    public Input<RegionCommitmentType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public RegionCommitmentArgs(
        @Nullable Input<Boolean> autoRenew,
        @Nullable Input<RegionCommitmentCategory> category,
        @Nullable Input<String> description,
        @Nullable Input<LicenseResourceCommitmentArgs> licenseResource,
        @Nullable Input<List<String>> mergeSourceCommitments,
        @Nullable Input<String> name,
        @Nullable Input<RegionCommitmentPlan> plan,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<List<ReservationArgs>> reservations,
        @Nullable Input<List<ResourceCommitmentArgs>> resources,
        @Nullable Input<String> splitSourceCommitment,
        @Nullable Input<RegionCommitmentType> type) {
        this.autoRenew = autoRenew;
        this.category = category;
        this.description = description;
        this.licenseResource = licenseResource;
        this.mergeSourceCommitments = mergeSourceCommitments;
        this.name = name;
        this.plan = plan;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.reservations = reservations;
        this.resources = resources;
        this.splitSourceCommitment = splitSourceCommitment;
        this.type = type;
    }

    private RegionCommitmentArgs() {
        this.autoRenew = Input.empty();
        this.category = Input.empty();
        this.description = Input.empty();
        this.licenseResource = Input.empty();
        this.mergeSourceCommitments = Input.empty();
        this.name = Input.empty();
        this.plan = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.reservations = Input.empty();
        this.resources = Input.empty();
        this.splitSourceCommitment = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoRenew;
        private @Nullable Input<RegionCommitmentCategory> category;
        private @Nullable Input<String> description;
        private @Nullable Input<LicenseResourceCommitmentArgs> licenseResource;
        private @Nullable Input<List<String>> mergeSourceCommitments;
        private @Nullable Input<String> name;
        private @Nullable Input<RegionCommitmentPlan> plan;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<ReservationArgs>> reservations;
        private @Nullable Input<List<ResourceCommitmentArgs>> resources;
        private @Nullable Input<String> splitSourceCommitment;
        private @Nullable Input<RegionCommitmentType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionCommitmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.category = defaults.category;
    	      this.description = defaults.description;
    	      this.licenseResource = defaults.licenseResource;
    	      this.mergeSourceCommitments = defaults.mergeSourceCommitments;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.reservations = defaults.reservations;
    	      this.resources = defaults.resources;
    	      this.splitSourceCommitment = defaults.splitSourceCommitment;
    	      this.type = defaults.type;
        }

        public Builder setAutoRenew(@Nullable Input<Boolean> autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        public Builder setAutoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = Input.ofNullable(autoRenew);
            return this;
        }

        public Builder setCategory(@Nullable Input<RegionCommitmentCategory> category) {
            this.category = category;
            return this;
        }

        public Builder setCategory(@Nullable RegionCommitmentCategory category) {
            this.category = Input.ofNullable(category);
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

        public Builder setLicenseResource(@Nullable Input<LicenseResourceCommitmentArgs> licenseResource) {
            this.licenseResource = licenseResource;
            return this;
        }

        public Builder setLicenseResource(@Nullable LicenseResourceCommitmentArgs licenseResource) {
            this.licenseResource = Input.ofNullable(licenseResource);
            return this;
        }

        public Builder setMergeSourceCommitments(@Nullable Input<List<String>> mergeSourceCommitments) {
            this.mergeSourceCommitments = mergeSourceCommitments;
            return this;
        }

        public Builder setMergeSourceCommitments(@Nullable List<String> mergeSourceCommitments) {
            this.mergeSourceCommitments = Input.ofNullable(mergeSourceCommitments);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPlan(@Nullable Input<RegionCommitmentPlan> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable RegionCommitmentPlan plan) {
            this.plan = Input.ofNullable(plan);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setReservations(@Nullable Input<List<ReservationArgs>> reservations) {
            this.reservations = reservations;
            return this;
        }

        public Builder setReservations(@Nullable List<ReservationArgs> reservations) {
            this.reservations = Input.ofNullable(reservations);
            return this;
        }

        public Builder setResources(@Nullable Input<List<ResourceCommitmentArgs>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable List<ResourceCommitmentArgs> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder setSplitSourceCommitment(@Nullable Input<String> splitSourceCommitment) {
            this.splitSourceCommitment = splitSourceCommitment;
            return this;
        }

        public Builder setSplitSourceCommitment(@Nullable String splitSourceCommitment) {
            this.splitSourceCommitment = Input.ofNullable(splitSourceCommitment);
            return this;
        }

        public Builder setType(@Nullable Input<RegionCommitmentType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable RegionCommitmentType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public RegionCommitmentArgs build() {
            return new RegionCommitmentArgs(autoRenew, category, description, licenseResource, mergeSourceCommitments, name, plan, project, region, requestId, reservations, resources, splitSourceCommitment, type);
        }
    }
}