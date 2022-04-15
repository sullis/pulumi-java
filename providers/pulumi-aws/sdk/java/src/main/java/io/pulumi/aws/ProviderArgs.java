// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.ProviderAssumeRoleArgs;
import io.pulumi.aws.inputs.ProviderDefaultTagsArgs;
import io.pulumi.aws.inputs.ProviderEndpointArgs;
import io.pulumi.aws.inputs.ProviderIgnoreTagsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    @Import(name="accessKey")
      private final @Nullable Output<String> accessKey;

    public Output<String> accessKey() {
        return this.accessKey == null ? Codegen.empty() : this.accessKey;
    }

    @Import(name="allowedAccountIds", json=true)
      private final @Nullable Output<List<String>> allowedAccountIds;

    public Output<List<String>> allowedAccountIds() {
        return this.allowedAccountIds == null ? Codegen.empty() : this.allowedAccountIds;
    }

    @Import(name="assumeRole", json=true)
      private final @Nullable Output<ProviderAssumeRoleArgs> assumeRole;

    public Output<ProviderAssumeRoleArgs> assumeRole() {
        return this.assumeRole == null ? Codegen.empty() : this.assumeRole;
    }

    /**
     * Configuration block with settings to default resource tags across all resources.
     * 
     */
    @Import(name="defaultTags", json=true)
      private final @Nullable Output<ProviderDefaultTagsArgs> defaultTags;

    public Output<ProviderDefaultTagsArgs> defaultTags() {
        return this.defaultTags == null ? Codegen.empty() : this.defaultTags;
    }

    @Import(name="endpoints", json=true)
      private final @Nullable Output<List<ProviderEndpointArgs>> endpoints;

    public Output<List<ProviderEndpointArgs>> endpoints() {
        return this.endpoints == null ? Codegen.empty() : this.endpoints;
    }

    @Import(name="forbiddenAccountIds", json=true)
      private final @Nullable Output<List<String>> forbiddenAccountIds;

    public Output<List<String>> forbiddenAccountIds() {
        return this.forbiddenAccountIds == null ? Codegen.empty() : this.forbiddenAccountIds;
    }

    /**
     * The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
     * `HTTPS_PROXY` environment variables.
     * 
     */
    @Import(name="httpProxy")
      private final @Nullable Output<String> httpProxy;

    public Output<String> httpProxy() {
        return this.httpProxy == null ? Codegen.empty() : this.httpProxy;
    }

    /**
     * Configuration block with settings to ignore resource tags across all resources.
     * 
     */
    @Import(name="ignoreTags", json=true)
      private final @Nullable Output<ProviderIgnoreTagsArgs> ignoreTags;

    public Output<ProviderIgnoreTagsArgs> ignoreTags() {
        return this.ignoreTags == null ? Codegen.empty() : this.ignoreTags;
    }

    /**
     * Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`
     * 
     */
    @Import(name="insecure", json=true)
      private final @Nullable Output<Boolean> insecure;

    public Output<Boolean> insecure() {
        return this.insecure == null ? Codegen.empty() : this.insecure;
    }

    /**
     * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
     * 
     */
    @Import(name="maxRetries", json=true)
      private final @Nullable Output<Integer> maxRetries;

    public Output<Integer> maxRetries() {
        return this.maxRetries == null ? Codegen.empty() : this.maxRetries;
    }

    /**
     * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    @Import(name="profile")
      private final @Nullable Output<String> profile;

    public Output<String> profile() {
        return this.profile == null ? Codegen.empty() : this.profile;
    }

    /**
     * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
     * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
     * Specific to the Amazon S3 service.
     * 
     */
    @Import(name="s3ForcePathStyle", json=true)
      private final @Nullable Output<Boolean> s3ForcePathStyle;

    public Output<Boolean> s3ForcePathStyle() {
        return this.s3ForcePathStyle == null ? Codegen.empty() : this.s3ForcePathStyle;
    }

    /**
     * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    @Import(name="secretKey")
      private final @Nullable Output<String> secretKey;

    public Output<String> secretKey() {
        return this.secretKey == null ? Codegen.empty() : this.secretKey;
    }

    /**
     * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
     * 
     */
    @Import(name="sharedCredentialsFile")
      private final @Nullable Output<String> sharedCredentialsFile;

    public Output<String> sharedCredentialsFile() {
        return this.sharedCredentialsFile == null ? Codegen.empty() : this.sharedCredentialsFile;
    }

    /**
     * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
     * available/implemented.
     * 
     */
    @Import(name="skipCredentialsValidation", json=true)
      private final @Nullable Output<Boolean> skipCredentialsValidation;

    public Output<Boolean> skipCredentialsValidation() {
        return this.skipCredentialsValidation == null ? Codegen.empty() : this.skipCredentialsValidation;
    }

    /**
     * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
     * 
     */
    @Import(name="skipGetEc2Platforms", json=true)
      private final @Nullable Output<Boolean> skipGetEc2Platforms;

    public Output<Boolean> skipGetEc2Platforms() {
        return this.skipGetEc2Platforms == null ? Codegen.empty() : this.skipGetEc2Platforms;
    }

    @Import(name="skipMetadataApiCheck", json=true)
      private final @Nullable Output<Boolean> skipMetadataApiCheck;

    public Output<Boolean> skipMetadataApiCheck() {
        return this.skipMetadataApiCheck == null ? Codegen.empty() : this.skipMetadataApiCheck;
    }

    /**
     * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
     * not public (yet).
     * 
     */
    @Import(name="skipRegionValidation", json=true)
      private final @Nullable Output<Boolean> skipRegionValidation;

    public Output<Boolean> skipRegionValidation() {
        return this.skipRegionValidation == null ? Codegen.empty() : this.skipRegionValidation;
    }

    /**
     * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
     * 
     */
    @Import(name="skipRequestingAccountId", json=true)
      private final @Nullable Output<Boolean> skipRequestingAccountId;

    public Output<Boolean> skipRequestingAccountId() {
        return this.skipRequestingAccountId == null ? Codegen.empty() : this.skipRequestingAccountId;
    }

    /**
     * session token. A session token is only required if you are using temporary security credentials.
     * 
     */
    @Import(name="token")
      private final @Nullable Output<String> token;

    public Output<String> token() {
        return this.token == null ? Codegen.empty() : this.token;
    }

    public ProviderArgs(
        @Nullable Output<String> accessKey,
        @Nullable Output<List<String>> allowedAccountIds,
        @Nullable Output<ProviderAssumeRoleArgs> assumeRole,
        @Nullable Output<ProviderDefaultTagsArgs> defaultTags,
        @Nullable Output<List<ProviderEndpointArgs>> endpoints,
        @Nullable Output<List<String>> forbiddenAccountIds,
        @Nullable Output<String> httpProxy,
        @Nullable Output<ProviderIgnoreTagsArgs> ignoreTags,
        @Nullable Output<Boolean> insecure,
        @Nullable Output<Integer> maxRetries,
        @Nullable Output<String> profile,
        @Nullable Output<String> region,
        @Nullable Output<Boolean> s3ForcePathStyle,
        @Nullable Output<String> secretKey,
        @Nullable Output<String> sharedCredentialsFile,
        @Nullable Output<Boolean> skipCredentialsValidation,
        @Nullable Output<Boolean> skipGetEc2Platforms,
        @Nullable Output<Boolean> skipMetadataApiCheck,
        @Nullable Output<Boolean> skipRegionValidation,
        @Nullable Output<Boolean> skipRequestingAccountId,
        @Nullable Output<String> token) {
        this.accessKey = accessKey;
        this.allowedAccountIds = allowedAccountIds;
        this.assumeRole = assumeRole;
        this.defaultTags = defaultTags;
        this.endpoints = endpoints;
        this.forbiddenAccountIds = forbiddenAccountIds;
        this.httpProxy = httpProxy;
        this.ignoreTags = ignoreTags;
        this.insecure = insecure;
        this.maxRetries = maxRetries;
        this.profile = profile == null ? Codegen.ofNullable(Utilities.getEnv("AWS_PROFILE").orElse(null)) : profile;
        this.region = region == null ? Codegen.ofNullable(Utilities.getEnv("AWS_REGION", "AWS_DEFAULT_REGION").orElse(null)) : region;
        this.s3ForcePathStyle = s3ForcePathStyle;
        this.secretKey = secretKey;
        this.sharedCredentialsFile = sharedCredentialsFile;
        this.skipCredentialsValidation = skipCredentialsValidation == null ? Codegen.ofNullable(true) : skipCredentialsValidation;
        this.skipGetEc2Platforms = skipGetEc2Platforms == null ? Codegen.ofNullable(true) : skipGetEc2Platforms;
        this.skipMetadataApiCheck = skipMetadataApiCheck == null ? Codegen.ofNullable(true) : skipMetadataApiCheck;
        this.skipRegionValidation = skipRegionValidation == null ? Codegen.ofNullable(true) : skipRegionValidation;
        this.skipRequestingAccountId = skipRequestingAccountId;
        this.token = token;
    }

    private ProviderArgs() {
        this.accessKey = Codegen.empty();
        this.allowedAccountIds = Codegen.empty();
        this.assumeRole = Codegen.empty();
        this.defaultTags = Codegen.empty();
        this.endpoints = Codegen.empty();
        this.forbiddenAccountIds = Codegen.empty();
        this.httpProxy = Codegen.empty();
        this.ignoreTags = Codegen.empty();
        this.insecure = Codegen.empty();
        this.maxRetries = Codegen.empty();
        this.profile = Codegen.empty();
        this.region = Codegen.empty();
        this.s3ForcePathStyle = Codegen.empty();
        this.secretKey = Codegen.empty();
        this.sharedCredentialsFile = Codegen.empty();
        this.skipCredentialsValidation = Codegen.empty();
        this.skipGetEc2Platforms = Codegen.empty();
        this.skipMetadataApiCheck = Codegen.empty();
        this.skipRegionValidation = Codegen.empty();
        this.skipRequestingAccountId = Codegen.empty();
        this.token = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessKey;
        private @Nullable Output<List<String>> allowedAccountIds;
        private @Nullable Output<ProviderAssumeRoleArgs> assumeRole;
        private @Nullable Output<ProviderDefaultTagsArgs> defaultTags;
        private @Nullable Output<List<ProviderEndpointArgs>> endpoints;
        private @Nullable Output<List<String>> forbiddenAccountIds;
        private @Nullable Output<String> httpProxy;
        private @Nullable Output<ProviderIgnoreTagsArgs> ignoreTags;
        private @Nullable Output<Boolean> insecure;
        private @Nullable Output<Integer> maxRetries;
        private @Nullable Output<String> profile;
        private @Nullable Output<String> region;
        private @Nullable Output<Boolean> s3ForcePathStyle;
        private @Nullable Output<String> secretKey;
        private @Nullable Output<String> sharedCredentialsFile;
        private @Nullable Output<Boolean> skipCredentialsValidation;
        private @Nullable Output<Boolean> skipGetEc2Platforms;
        private @Nullable Output<Boolean> skipMetadataApiCheck;
        private @Nullable Output<Boolean> skipRegionValidation;
        private @Nullable Output<Boolean> skipRequestingAccountId;
        private @Nullable Output<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.allowedAccountIds = defaults.allowedAccountIds;
    	      this.assumeRole = defaults.assumeRole;
    	      this.defaultTags = defaults.defaultTags;
    	      this.endpoints = defaults.endpoints;
    	      this.forbiddenAccountIds = defaults.forbiddenAccountIds;
    	      this.httpProxy = defaults.httpProxy;
    	      this.ignoreTags = defaults.ignoreTags;
    	      this.insecure = defaults.insecure;
    	      this.maxRetries = defaults.maxRetries;
    	      this.profile = defaults.profile;
    	      this.region = defaults.region;
    	      this.s3ForcePathStyle = defaults.s3ForcePathStyle;
    	      this.secretKey = defaults.secretKey;
    	      this.sharedCredentialsFile = defaults.sharedCredentialsFile;
    	      this.skipCredentialsValidation = defaults.skipCredentialsValidation;
    	      this.skipGetEc2Platforms = defaults.skipGetEc2Platforms;
    	      this.skipMetadataApiCheck = defaults.skipMetadataApiCheck;
    	      this.skipRegionValidation = defaults.skipRegionValidation;
    	      this.skipRequestingAccountId = defaults.skipRequestingAccountId;
    	      this.token = defaults.token;
        }

        public Builder accessKey(@Nullable Output<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = Codegen.ofNullable(accessKey);
            return this;
        }
        public Builder allowedAccountIds(@Nullable Output<List<String>> allowedAccountIds) {
            this.allowedAccountIds = allowedAccountIds;
            return this;
        }
        public Builder allowedAccountIds(@Nullable List<String> allowedAccountIds) {
            this.allowedAccountIds = Codegen.ofNullable(allowedAccountIds);
            return this;
        }
        public Builder allowedAccountIds(String... allowedAccountIds) {
            return allowedAccountIds(List.of(allowedAccountIds));
        }
        public Builder assumeRole(@Nullable Output<ProviderAssumeRoleArgs> assumeRole) {
            this.assumeRole = assumeRole;
            return this;
        }
        public Builder assumeRole(@Nullable ProviderAssumeRoleArgs assumeRole) {
            this.assumeRole = Codegen.ofNullable(assumeRole);
            return this;
        }
        public Builder defaultTags(@Nullable Output<ProviderDefaultTagsArgs> defaultTags) {
            this.defaultTags = defaultTags;
            return this;
        }
        public Builder defaultTags(@Nullable ProviderDefaultTagsArgs defaultTags) {
            this.defaultTags = Codegen.ofNullable(defaultTags);
            return this;
        }
        public Builder endpoints(@Nullable Output<List<ProviderEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<ProviderEndpointArgs> endpoints) {
            this.endpoints = Codegen.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(ProviderEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder forbiddenAccountIds(@Nullable Output<List<String>> forbiddenAccountIds) {
            this.forbiddenAccountIds = forbiddenAccountIds;
            return this;
        }
        public Builder forbiddenAccountIds(@Nullable List<String> forbiddenAccountIds) {
            this.forbiddenAccountIds = Codegen.ofNullable(forbiddenAccountIds);
            return this;
        }
        public Builder forbiddenAccountIds(String... forbiddenAccountIds) {
            return forbiddenAccountIds(List.of(forbiddenAccountIds));
        }
        public Builder httpProxy(@Nullable Output<String> httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }
        public Builder httpProxy(@Nullable String httpProxy) {
            this.httpProxy = Codegen.ofNullable(httpProxy);
            return this;
        }
        public Builder ignoreTags(@Nullable Output<ProviderIgnoreTagsArgs> ignoreTags) {
            this.ignoreTags = ignoreTags;
            return this;
        }
        public Builder ignoreTags(@Nullable ProviderIgnoreTagsArgs ignoreTags) {
            this.ignoreTags = Codegen.ofNullable(ignoreTags);
            return this;
        }
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            this.insecure = insecure;
            return this;
        }
        public Builder insecure(@Nullable Boolean insecure) {
            this.insecure = Codegen.ofNullable(insecure);
            return this;
        }
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Builder maxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Codegen.ofNullable(maxRetries);
            return this;
        }
        public Builder profile(@Nullable Output<String> profile) {
            this.profile = profile;
            return this;
        }
        public Builder profile(@Nullable String profile) {
            this.profile = Codegen.ofNullable(profile);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder s3ForcePathStyle(@Nullable Output<Boolean> s3ForcePathStyle) {
            this.s3ForcePathStyle = s3ForcePathStyle;
            return this;
        }
        public Builder s3ForcePathStyle(@Nullable Boolean s3ForcePathStyle) {
            this.s3ForcePathStyle = Codegen.ofNullable(s3ForcePathStyle);
            return this;
        }
        public Builder secretKey(@Nullable Output<String> secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = Codegen.ofNullable(secretKey);
            return this;
        }
        public Builder sharedCredentialsFile(@Nullable Output<String> sharedCredentialsFile) {
            this.sharedCredentialsFile = sharedCredentialsFile;
            return this;
        }
        public Builder sharedCredentialsFile(@Nullable String sharedCredentialsFile) {
            this.sharedCredentialsFile = Codegen.ofNullable(sharedCredentialsFile);
            return this;
        }
        public Builder skipCredentialsValidation(@Nullable Output<Boolean> skipCredentialsValidation) {
            this.skipCredentialsValidation = skipCredentialsValidation;
            return this;
        }
        public Builder skipCredentialsValidation(@Nullable Boolean skipCredentialsValidation) {
            this.skipCredentialsValidation = Codegen.ofNullable(skipCredentialsValidation);
            return this;
        }
        public Builder skipGetEc2Platforms(@Nullable Output<Boolean> skipGetEc2Platforms) {
            this.skipGetEc2Platforms = skipGetEc2Platforms;
            return this;
        }
        public Builder skipGetEc2Platforms(@Nullable Boolean skipGetEc2Platforms) {
            this.skipGetEc2Platforms = Codegen.ofNullable(skipGetEc2Platforms);
            return this;
        }
        public Builder skipMetadataApiCheck(@Nullable Output<Boolean> skipMetadataApiCheck) {
            this.skipMetadataApiCheck = skipMetadataApiCheck;
            return this;
        }
        public Builder skipMetadataApiCheck(@Nullable Boolean skipMetadataApiCheck) {
            this.skipMetadataApiCheck = Codegen.ofNullable(skipMetadataApiCheck);
            return this;
        }
        public Builder skipRegionValidation(@Nullable Output<Boolean> skipRegionValidation) {
            this.skipRegionValidation = skipRegionValidation;
            return this;
        }
        public Builder skipRegionValidation(@Nullable Boolean skipRegionValidation) {
            this.skipRegionValidation = Codegen.ofNullable(skipRegionValidation);
            return this;
        }
        public Builder skipRequestingAccountId(@Nullable Output<Boolean> skipRequestingAccountId) {
            this.skipRequestingAccountId = skipRequestingAccountId;
            return this;
        }
        public Builder skipRequestingAccountId(@Nullable Boolean skipRequestingAccountId) {
            this.skipRequestingAccountId = Codegen.ofNullable(skipRequestingAccountId);
            return this;
        }
        public Builder token(@Nullable Output<String> token) {
            this.token = token;
            return this;
        }
        public Builder token(@Nullable String token) {
            this.token = Codegen.ofNullable(token);
            return this;
        }        public ProviderArgs build() {
            return new ProviderArgs(accessKey, allowedAccountIds, assumeRole, defaultTags, endpoints, forbiddenAccountIds, httpProxy, ignoreTags, insecure, maxRetries, profile, region, s3ForcePathStyle, secretKey, sharedCredentialsFile, skipCredentialsValidation, skipGetEc2Platforms, skipMetadataApiCheck, skipRegionValidation, skipRequestingAccountId, token);
        }
    }
}
