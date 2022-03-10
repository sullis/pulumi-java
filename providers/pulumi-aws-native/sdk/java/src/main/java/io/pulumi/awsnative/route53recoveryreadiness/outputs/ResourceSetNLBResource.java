// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSetNLBResource {
    /**
     * A Network Load Balancer resource Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable String arn;

    @OutputCustomType.Constructor
    private ResourceSetNLBResource(@OutputCustomType.Parameter("arn") @Nullable String arn) {
        this.arn = arn;
    }

    /**
     * A Network Load Balancer resource Amazon Resource Name (ARN).
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetNLBResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetNLBResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public ResourceSetNLBResource build() {
            return new ResourceSetNLBResource(arn);
        }
    }
}
