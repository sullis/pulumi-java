// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentTargetArgs Empty = new AssessmentTargetArgs();

    /**
     * The name of the assessment target.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
     * 
     */
    @Import(name="resourceGroupArn")
      private final @Nullable Output<String> resourceGroupArn;

    public Output<String> resourceGroupArn() {
        return this.resourceGroupArn == null ? Codegen.empty() : this.resourceGroupArn;
    }

    public AssessmentTargetArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> resourceGroupArn) {
        this.name = name;
        this.resourceGroupArn = resourceGroupArn;
    }

    private AssessmentTargetArgs() {
        this.name = Codegen.empty();
        this.resourceGroupArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> resourceGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupArn = defaults.resourceGroupArn;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder resourceGroupArn(@Nullable Output<String> resourceGroupArn) {
            this.resourceGroupArn = resourceGroupArn;
            return this;
        }
        public Builder resourceGroupArn(@Nullable String resourceGroupArn) {
            this.resourceGroupArn = Codegen.ofNullable(resourceGroupArn);
            return this;
        }        public AssessmentTargetArgs build() {
            return new AssessmentTargetArgs(name, resourceGroupArn);
        }
    }
}
