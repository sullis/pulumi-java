// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudFrontOriginAccessIdentityConfig {
    private final String comment;

    @OutputCustomType.Constructor
    private CloudFrontOriginAccessIdentityConfig(@OutputCustomType.Parameter("comment") String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return this.comment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFrontOriginAccessIdentityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFrontOriginAccessIdentityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
        }

        public Builder setComment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public CloudFrontOriginAccessIdentityConfig build() {
            return new CloudFrontOriginAccessIdentityConfig(comment);
        }
    }
}
