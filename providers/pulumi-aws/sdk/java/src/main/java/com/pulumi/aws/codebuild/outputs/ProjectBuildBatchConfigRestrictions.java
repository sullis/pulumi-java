// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectBuildBatchConfigRestrictions {
    /**
     * @return An array of strings that specify the compute types that are allowed for the batch build. See [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in the AWS CodeBuild User Guide for these values.
     * 
     */
    private final @Nullable List<String> computeTypesAlloweds;
    /**
     * @return Specifies the maximum number of builds allowed.
     * 
     */
    private final @Nullable Integer maximumBuildsAllowed;

    @CustomType.Constructor
    private ProjectBuildBatchConfigRestrictions(
        @CustomType.Parameter("computeTypesAlloweds") @Nullable List<String> computeTypesAlloweds,
        @CustomType.Parameter("maximumBuildsAllowed") @Nullable Integer maximumBuildsAllowed) {
        this.computeTypesAlloweds = computeTypesAlloweds;
        this.maximumBuildsAllowed = maximumBuildsAllowed;
    }

    /**
     * @return An array of strings that specify the compute types that are allowed for the batch build. See [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in the AWS CodeBuild User Guide for these values.
     * 
     */
    public List<String> computeTypesAlloweds() {
        return this.computeTypesAlloweds == null ? List.of() : this.computeTypesAlloweds;
    }
    /**
     * @return Specifies the maximum number of builds allowed.
     * 
     */
    public Optional<Integer> maximumBuildsAllowed() {
        return Optional.ofNullable(this.maximumBuildsAllowed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectBuildBatchConfigRestrictions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> computeTypesAlloweds;
        private @Nullable Integer maximumBuildsAllowed;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectBuildBatchConfigRestrictions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeTypesAlloweds = defaults.computeTypesAlloweds;
    	      this.maximumBuildsAllowed = defaults.maximumBuildsAllowed;
        }

        public Builder computeTypesAlloweds(@Nullable List<String> computeTypesAlloweds) {
            this.computeTypesAlloweds = computeTypesAlloweds;
            return this;
        }
        public Builder computeTypesAlloweds(String... computeTypesAlloweds) {
            return computeTypesAlloweds(List.of(computeTypesAlloweds));
        }
        public Builder maximumBuildsAllowed(@Nullable Integer maximumBuildsAllowed) {
            this.maximumBuildsAllowed = maximumBuildsAllowed;
            return this;
        }        public ProjectBuildBatchConfigRestrictions build() {
            return new ProjectBuildBatchConfigRestrictions(computeTypesAlloweds, maximumBuildsAllowed);
        }
    }
}
