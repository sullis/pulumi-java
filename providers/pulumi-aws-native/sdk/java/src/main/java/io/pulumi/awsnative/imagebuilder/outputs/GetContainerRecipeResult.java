// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContainerRecipeResult {
    private final @Nullable String arn;

    @OutputCustomType.Constructor({"arn"})
    private GetContainerRecipeResult(@Nullable String arn) {
        this.arn = arn;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerRecipeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerRecipeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public GetContainerRecipeResult build() {
            return new GetContainerRecipeResult(arn);
        }
    }
}
