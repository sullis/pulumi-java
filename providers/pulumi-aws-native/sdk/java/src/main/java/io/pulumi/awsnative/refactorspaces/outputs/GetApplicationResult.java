// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.outputs;

import io.pulumi.awsnative.refactorspaces.outputs.ApplicationTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApplicationResult {
    private final @Nullable String apiGatewayId;
    private final @Nullable String applicationIdentifier;
    private final @Nullable String arn;
    private final @Nullable String nlbArn;
    private final @Nullable String nlbName;
    private final @Nullable String proxyUrl;
    private final @Nullable String stageName;
    private final @Nullable List<ApplicationTag> tags;
    private final @Nullable String vpcLinkId;

    @OutputCustomType.Constructor({"apiGatewayId","applicationIdentifier","arn","nlbArn","nlbName","proxyUrl","stageName","tags","vpcLinkId"})
    private GetApplicationResult(
        @Nullable String apiGatewayId,
        @Nullable String applicationIdentifier,
        @Nullable String arn,
        @Nullable String nlbArn,
        @Nullable String nlbName,
        @Nullable String proxyUrl,
        @Nullable String stageName,
        @Nullable List<ApplicationTag> tags,
        @Nullable String vpcLinkId) {
        this.apiGatewayId = apiGatewayId;
        this.applicationIdentifier = applicationIdentifier;
        this.arn = arn;
        this.nlbArn = nlbArn;
        this.nlbName = nlbName;
        this.proxyUrl = proxyUrl;
        this.stageName = stageName;
        this.tags = tags;
        this.vpcLinkId = vpcLinkId;
    }

    public Optional<String> getApiGatewayId() {
        return Optional.ofNullable(this.apiGatewayId);
    }
    public Optional<String> getApplicationIdentifier() {
        return Optional.ofNullable(this.applicationIdentifier);
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getNlbArn() {
        return Optional.ofNullable(this.nlbArn);
    }
    public Optional<String> getNlbName() {
        return Optional.ofNullable(this.nlbName);
    }
    public Optional<String> getProxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }
    public Optional<String> getStageName() {
        return Optional.ofNullable(this.stageName);
    }
    public List<ApplicationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getVpcLinkId() {
        return Optional.ofNullable(this.vpcLinkId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiGatewayId;
        private @Nullable String applicationIdentifier;
        private @Nullable String arn;
        private @Nullable String nlbArn;
        private @Nullable String nlbName;
        private @Nullable String proxyUrl;
        private @Nullable String stageName;
        private @Nullable List<ApplicationTag> tags;
        private @Nullable String vpcLinkId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGatewayId = defaults.apiGatewayId;
    	      this.applicationIdentifier = defaults.applicationIdentifier;
    	      this.arn = defaults.arn;
    	      this.nlbArn = defaults.nlbArn;
    	      this.nlbName = defaults.nlbName;
    	      this.proxyUrl = defaults.proxyUrl;
    	      this.stageName = defaults.stageName;
    	      this.tags = defaults.tags;
    	      this.vpcLinkId = defaults.vpcLinkId;
        }

        public Builder setApiGatewayId(@Nullable String apiGatewayId) {
            this.apiGatewayId = apiGatewayId;
            return this;
        }

        public Builder setApplicationIdentifier(@Nullable String applicationIdentifier) {
            this.applicationIdentifier = applicationIdentifier;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setNlbArn(@Nullable String nlbArn) {
            this.nlbArn = nlbArn;
            return this;
        }

        public Builder setNlbName(@Nullable String nlbName) {
            this.nlbName = nlbName;
            return this;
        }

        public Builder setProxyUrl(@Nullable String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }

        public Builder setStageName(@Nullable String stageName) {
            this.stageName = stageName;
            return this;
        }

        public Builder setTags(@Nullable List<ApplicationTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVpcLinkId(@Nullable String vpcLinkId) {
            this.vpcLinkId = vpcLinkId;
            return this;
        }

        public GetApplicationResult build() {
            return new GetApplicationResult(apiGatewayId, applicationIdentifier, arn, nlbArn, nlbName, proxyUrl, stageName, tags, vpcLinkId);
        }
    }
}
