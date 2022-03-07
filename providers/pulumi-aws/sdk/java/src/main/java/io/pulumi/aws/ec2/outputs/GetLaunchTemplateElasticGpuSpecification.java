// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchTemplateElasticGpuSpecification {
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private GetLaunchTemplateElasticGpuSpecification(String type) {
        this.type = Objects.requireNonNull(type);
    }

    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateElasticGpuSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateElasticGpuSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLaunchTemplateElasticGpuSpecification build() {
            return new GetLaunchTemplateElasticGpuSpecification(type);
        }
    }
}