// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CloudFormation resource for DevOps Guru to monitor
 * 
 */
public final class ResourceCollectionCloudFormationCollectionFilter extends io.pulumi.resources.InvokeArgs {

    public static final ResourceCollectionCloudFormationCollectionFilter Empty = new ResourceCollectionCloudFormationCollectionFilter();

    /**
     * An array of CloudFormation stack names.
     * 
     */
    @InputImport(name="stackNames")
      private final @Nullable List<String> stackNames;

    public List<String> getStackNames() {
        return this.stackNames == null ? List.of() : this.stackNames;
    }

    public ResourceCollectionCloudFormationCollectionFilter(@Nullable List<String> stackNames) {
        this.stackNames = stackNames;
    }

    private ResourceCollectionCloudFormationCollectionFilter() {
        this.stackNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCollectionCloudFormationCollectionFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> stackNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCollectionCloudFormationCollectionFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stackNames = defaults.stackNames;
        }

        public Builder setStackNames(@Nullable List<String> stackNames) {
            this.stackNames = stackNames;
            return this;
        }
        public ResourceCollectionCloudFormationCollectionFilter build() {
            return new ResourceCollectionCloudFormationCollectionFilter(stackNames);
        }
    }
}