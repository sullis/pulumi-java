// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.ModelPackageGroupStatus;
import io.pulumi.awsnative.sagemaker.outputs.ModelPackageGroupTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetModelPackageGroupResult {
    /**
     * The time at which the model package group was created.
     * 
     */
    private final @Nullable String creationTime;
    private final @Nullable String modelPackageGroupArn;
    private final @Nullable Object modelPackageGroupPolicy;
    /**
     * The status of a modelpackage group job.
     * 
     */
    private final @Nullable ModelPackageGroupStatus modelPackageGroupStatus;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<ModelPackageGroupTag> tags;

    @OutputCustomType.Constructor({"creationTime","modelPackageGroupArn","modelPackageGroupPolicy","modelPackageGroupStatus","tags"})
    private GetModelPackageGroupResult(
        @Nullable String creationTime,
        @Nullable String modelPackageGroupArn,
        @Nullable Object modelPackageGroupPolicy,
        @Nullable ModelPackageGroupStatus modelPackageGroupStatus,
        @Nullable List<ModelPackageGroupTag> tags) {
        this.creationTime = creationTime;
        this.modelPackageGroupArn = modelPackageGroupArn;
        this.modelPackageGroupPolicy = modelPackageGroupPolicy;
        this.modelPackageGroupStatus = modelPackageGroupStatus;
        this.tags = tags;
    }

    /**
     * The time at which the model package group was created.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<String> getModelPackageGroupArn() {
        return Optional.ofNullable(this.modelPackageGroupArn);
    }
    public Optional<Object> getModelPackageGroupPolicy() {
        return Optional.ofNullable(this.modelPackageGroupPolicy);
    }
    /**
     * The status of a modelpackage group job.
     * 
    */
    public Optional<ModelPackageGroupStatus> getModelPackageGroupStatus() {
        return Optional.ofNullable(this.modelPackageGroupStatus);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<ModelPackageGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelPackageGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String modelPackageGroupArn;
        private @Nullable Object modelPackageGroupPolicy;
        private @Nullable ModelPackageGroupStatus modelPackageGroupStatus;
        private @Nullable List<ModelPackageGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelPackageGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.modelPackageGroupArn = defaults.modelPackageGroupArn;
    	      this.modelPackageGroupPolicy = defaults.modelPackageGroupPolicy;
    	      this.modelPackageGroupStatus = defaults.modelPackageGroupStatus;
    	      this.tags = defaults.tags;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setModelPackageGroupArn(@Nullable String modelPackageGroupArn) {
            this.modelPackageGroupArn = modelPackageGroupArn;
            return this;
        }

        public Builder setModelPackageGroupPolicy(@Nullable Object modelPackageGroupPolicy) {
            this.modelPackageGroupPolicy = modelPackageGroupPolicy;
            return this;
        }

        public Builder setModelPackageGroupStatus(@Nullable ModelPackageGroupStatus modelPackageGroupStatus) {
            this.modelPackageGroupStatus = modelPackageGroupStatus;
            return this;
        }

        public Builder setTags(@Nullable List<ModelPackageGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetModelPackageGroupResult build() {
            return new GetModelPackageGroupResult(creationTime, modelPackageGroupArn, modelPackageGroupPolicy, modelPackageGroupStatus, tags);
        }
    }
}