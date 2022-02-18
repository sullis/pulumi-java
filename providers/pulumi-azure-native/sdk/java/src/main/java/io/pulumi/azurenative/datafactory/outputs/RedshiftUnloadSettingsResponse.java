// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;

@OutputCustomType
public final class RedshiftUnloadSettingsResponse {
    /**
     * The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    private final Object bucketName;
    /**
     * The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon Redshift source.
     * 
     */
    private final LinkedServiceReferenceResponse s3LinkedServiceName;

    @OutputCustomType.Constructor({"bucketName","s3LinkedServiceName"})
    private RedshiftUnloadSettingsResponse(
        Object bucketName,
        LinkedServiceReferenceResponse s3LinkedServiceName) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.s3LinkedServiceName = Objects.requireNonNull(s3LinkedServiceName);
    }

    /**
     * The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    public Object getBucketName() {
        return this.bucketName;
    }
    /**
     * The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon Redshift source.
     * 
     */
    public LinkedServiceReferenceResponse getS3LinkedServiceName() {
        return this.s3LinkedServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedshiftUnloadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object bucketName;
        private LinkedServiceReferenceResponse s3LinkedServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RedshiftUnloadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.s3LinkedServiceName = defaults.s3LinkedServiceName;
        }

        public Builder setBucketName(Object bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setS3LinkedServiceName(LinkedServiceReferenceResponse s3LinkedServiceName) {
            this.s3LinkedServiceName = Objects.requireNonNull(s3LinkedServiceName);
            return this;
        }

        public RedshiftUnloadSettingsResponse build() {
            return new RedshiftUnloadSettingsResponse(bucketName, s3LinkedServiceName);
        }
    }
}
