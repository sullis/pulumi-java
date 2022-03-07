// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBucketResult {
    /**
     * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    private final String arn;
    private final String bucket;
    /**
     * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
     */
    private final String bucketDomainName;
    /**
     * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
     */
    private final String bucketRegionalDomainName;
    /**
     * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
     * 
     */
    private final String hostedZoneId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The AWS region this bucket resides in.
     * 
     */
    private final String region;
    /**
     * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    private final String websiteDomain;
    /**
     * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    private final String websiteEndpoint;

    @OutputCustomType.Constructor({"arn","bucket","bucketDomainName","bucketRegionalDomainName","hostedZoneId","id","region","websiteDomain","websiteEndpoint"})
    private GetBucketResult(
        String arn,
        String bucket,
        String bucketDomainName,
        String bucketRegionalDomainName,
        String hostedZoneId,
        String id,
        String region,
        String websiteDomain,
        String websiteEndpoint) {
        this.arn = Objects.requireNonNull(arn);
        this.bucket = Objects.requireNonNull(bucket);
        this.bucketDomainName = Objects.requireNonNull(bucketDomainName);
        this.bucketRegionalDomainName = Objects.requireNonNull(bucketRegionalDomainName);
        this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
        this.id = Objects.requireNonNull(id);
        this.region = Objects.requireNonNull(region);
        this.websiteDomain = Objects.requireNonNull(websiteDomain);
        this.websiteEndpoint = Objects.requireNonNull(websiteEndpoint);
    }

    /**
     * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    public String getBucket() {
        return this.bucket;
    }
    /**
     * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
    */
    public String getBucketDomainName() {
        return this.bucketDomainName;
    }
    /**
     * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
    */
    public String getBucketRegionalDomainName() {
        return this.bucketRegionalDomainName;
    }
    /**
     * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
     * 
    */
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The AWS region this bucket resides in.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
    */
    public String getWebsiteDomain() {
        return this.websiteDomain;
    }
    /**
     * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
    */
    public String getWebsiteEndpoint() {
        return this.websiteEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String bucket;
        private String bucketDomainName;
        private String bucketRegionalDomainName;
        private String hostedZoneId;
        private String id;
        private String region;
        private String websiteDomain;
        private String websiteEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bucket = defaults.bucket;
    	      this.bucketDomainName = defaults.bucketDomainName;
    	      this.bucketRegionalDomainName = defaults.bucketRegionalDomainName;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.websiteDomain = defaults.websiteDomain;
    	      this.websiteEndpoint = defaults.websiteEndpoint;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucketDomainName(String bucketDomainName) {
            this.bucketDomainName = Objects.requireNonNull(bucketDomainName);
            return this;
        }

        public Builder setBucketRegionalDomainName(String bucketRegionalDomainName) {
            this.bucketRegionalDomainName = Objects.requireNonNull(bucketRegionalDomainName);
            return this;
        }

        public Builder setHostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setWebsiteDomain(String websiteDomain) {
            this.websiteDomain = Objects.requireNonNull(websiteDomain);
            return this;
        }

        public Builder setWebsiteEndpoint(String websiteEndpoint) {
            this.websiteEndpoint = Objects.requireNonNull(websiteEndpoint);
            return this;
        }
        public GetBucketResult build() {
            return new GetBucketResult(arn, bucket, bucketDomainName, bucketRegionalDomainName, hostedZoneId, id, region, websiteDomain, websiteEndpoint);
        }
    }
}