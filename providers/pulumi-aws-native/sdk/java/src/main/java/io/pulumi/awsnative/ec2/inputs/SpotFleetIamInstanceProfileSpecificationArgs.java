// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetIamInstanceProfileSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetIamInstanceProfileSpecificationArgs Empty = new SpotFleetIamInstanceProfileSpecificationArgs();

    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    public SpotFleetIamInstanceProfileSpecificationArgs(@Nullable Output<String> arn) {
        this.arn = arn;
    }

    private SpotFleetIamInstanceProfileSpecificationArgs() {
        this.arn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetIamInstanceProfileSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetIamInstanceProfileSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }        public SpotFleetIamInstanceProfileSpecificationArgs build() {
            return new SpotFleetIamInstanceProfileSpecificationArgs(arn);
        }
    }
}
