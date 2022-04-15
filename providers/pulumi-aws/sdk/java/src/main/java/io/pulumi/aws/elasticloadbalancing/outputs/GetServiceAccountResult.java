// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceAccountResult {
    /**
     * The ARN of the AWS ELB service account in the selected region.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String region;

    @CustomType.Constructor
    private GetServiceAccountResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("region") @Nullable String region) {
        this.arn = arn;
        this.id = id;
        this.region = region;
    }

    /**
     * The ARN of the AWS ELB service account in the selected region.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }        public GetServiceAccountResult build() {
            return new GetServiceAccountResult(arn, id, region);
        }
    }
}
