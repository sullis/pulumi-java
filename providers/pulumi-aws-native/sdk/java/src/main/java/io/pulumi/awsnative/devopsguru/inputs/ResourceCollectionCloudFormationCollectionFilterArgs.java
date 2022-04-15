// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CloudFormation resource for DevOps Guru to monitor
 * 
 */
public final class ResourceCollectionCloudFormationCollectionFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceCollectionCloudFormationCollectionFilterArgs Empty = new ResourceCollectionCloudFormationCollectionFilterArgs();

    /**
     * An array of CloudFormation stack names.
     * 
     */
    @Import(name="stackNames")
      private final @Nullable Output<List<String>> stackNames;

    public Output<List<String>> stackNames() {
        return this.stackNames == null ? Codegen.empty() : this.stackNames;
    }

    public ResourceCollectionCloudFormationCollectionFilterArgs(@Nullable Output<List<String>> stackNames) {
        this.stackNames = stackNames;
    }

    private ResourceCollectionCloudFormationCollectionFilterArgs() {
        this.stackNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCollectionCloudFormationCollectionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> stackNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCollectionCloudFormationCollectionFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stackNames = defaults.stackNames;
        }

        public Builder stackNames(@Nullable Output<List<String>> stackNames) {
            this.stackNames = stackNames;
            return this;
        }
        public Builder stackNames(@Nullable List<String> stackNames) {
            this.stackNames = Codegen.ofNullable(stackNames);
            return this;
        }
        public Builder stackNames(String... stackNames) {
            return stackNames(List.of(stackNames));
        }        public ResourceCollectionCloudFormationCollectionFilterArgs build() {
            return new ResourceCollectionCloudFormationCollectionFilterArgs(stackNames);
        }
    }
}
