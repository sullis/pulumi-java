// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
 * 
 */
public final class OriginEndpointSpekeKeyProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointSpekeKeyProviderArgs Empty = new OriginEndpointSpekeKeyProviderArgs();

    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing secure end-to-end data transfer with the key provider service.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> certificateArn() {
        return this.certificateArn == null ? Codegen.empty() : this.certificateArn;
    }

    /**
     * The resource ID to include in key requests.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key provider service.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The system IDs to include in key requests.
     * 
     */
    @Import(name="systemIds", required=true)
      private final Output<List<String>> systemIds;

    public Output<List<String>> systemIds() {
        return this.systemIds;
    }

    /**
     * The URL of the external key provider service.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    public OriginEndpointSpekeKeyProviderArgs(
        @Nullable Output<String> certificateArn,
        Output<String> resourceId,
        Output<String> roleArn,
        Output<List<String>> systemIds,
        Output<String> url) {
        this.certificateArn = certificateArn;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.systemIds = Objects.requireNonNull(systemIds, "expected parameter 'systemIds' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private OriginEndpointSpekeKeyProviderArgs() {
        this.certificateArn = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.systemIds = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointSpekeKeyProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateArn;
        private Output<String> resourceId;
        private Output<String> roleArn;
        private Output<List<String>> systemIds;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointSpekeKeyProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.resourceId = defaults.resourceId;
    	      this.roleArn = defaults.roleArn;
    	      this.systemIds = defaults.systemIds;
    	      this.url = defaults.url;
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Codegen.ofNullable(certificateArn);
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder systemIds(Output<List<String>> systemIds) {
            this.systemIds = Objects.requireNonNull(systemIds);
            return this;
        }
        public Builder systemIds(List<String> systemIds) {
            this.systemIds = Output.of(Objects.requireNonNull(systemIds));
            return this;
        }
        public Builder systemIds(String... systemIds) {
            return systemIds(List.of(systemIds));
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public OriginEndpointSpekeKeyProviderArgs build() {
            return new OriginEndpointSpekeKeyProviderArgs(certificateArn, resourceId, roleArn, systemIds, url);
        }
    }
}
