// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyMultiRegionConfigurationPrimaryKey extends io.pulumi.resources.InvokeArgs {

    public static final GetKeyMultiRegionConfigurationPrimaryKey Empty = new GetKeyMultiRegionConfigurationPrimaryKey();

    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetKeyMultiRegionConfigurationPrimaryKey(
        String arn,
        String region) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetKeyMultiRegionConfigurationPrimaryKey() {
        this.arn = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyMultiRegionConfigurationPrimaryKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyMultiRegionConfigurationPrimaryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.region = defaults.region;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetKeyMultiRegionConfigurationPrimaryKey build() {
            return new GetKeyMultiRegionConfigurationPrimaryKey(arn, region);
        }
    }
}
